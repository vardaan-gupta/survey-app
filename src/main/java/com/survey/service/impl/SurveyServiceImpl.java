package com.survey.service.impl;

import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.survey.constants.SurveyConstants;
import com.survey.datatransferobject.SurveyDTO;
import com.survey.datatransferobject.SurveyRequestDTO;
import com.survey.datatransferobject.SurveyResponseDTO;
import com.survey.datatransferobject.UserResponseToSurveyDTO;
import com.survey.exceptions.ResourceNotFoundException;
import com.survey.mappers.SurveyMapper;
import com.survey.mappers.SurveyResponseMapper;
import com.survey.model.Question;
import com.survey.model.Responses;
import com.survey.model.Survey;
import com.survey.model.SurveyQuestion;
import com.survey.repository.ResponseRepository;
import com.survey.repository.SurveyRepository;
import com.survey.service.SurveyService;
import com.survey.util.SurveyValidationUtils;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;


@Service
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Slf4j
@Transactional
public class SurveyServiceImpl implements SurveyService {

  @Autowired
  SurveyRepository surveyRepository;
  
  @Autowired
  ResponseRepository responseRepository;
  
  
   

  @Override
  public SurveyDTO createSurvey(final SurveyRequestDTO surveyRequestDTO) {

    /*
     * checkSurveyStatusValidOrElseThrown(surveyRequestDTO.getStatus()); */
     Survey survey =   SurveyMapper.mapSurveyDTOtoSurvey(surveyRequestDTO);     
     Survey savedSurvey = saveSurvey(survey);
    return  SurveyMapper.mapSurveytoSurveyDTO(savedSurvey); 
  }

  private Survey saveSurvey(final Survey survey) {
    return surveyRepository.save(survey);
  }

  @Override
  public void deleteSurveyById(final String reqSurveyId) {

    final UUID surveyId = SurveyValidationUtils.validateAndConvertUUIDOrElseThrown(reqSurveyId,
        SurveyConstants.SURVEY_ID_IS_INVALID_UUID_FORMAT);
    checkSurveyExistsOrElseThrown(surveyId);
    deleteSurveyById(surveyId);
  }

  private void checkSurveyExistsOrElseThrown(final UUID surveyId) {
    final Optional<Survey> surveyOptional = getSurveyById(surveyId);
    if (!surveyOptional.isPresent()) {
      ResourceNotFoundException
          .throwResourceNotFoundException(SurveyConstants.ERROR_SURVEY_ID_IS_NOT_FOUND);
    }
  }

  private Optional<Survey> getSurveyById(final UUID surveyId) {
    return surveyRepository.findById(surveyId);
  }

  private void deleteSurveyById(final UUID surveyId) {
    surveyRepository.deleteById(surveyId);
  }

  @Override
  public SurveyResponseDTO createSurveyResponses(String reqSurveyId,
      @Valid UserResponseToSurveyDTO userResponseToSurveyDTO) {
    
    final UUID surveyId = SurveyValidationUtils.validateAndConvertUUIDOrElseThrown(reqSurveyId,
        SurveyConstants.SURVEY_ID_IS_INVALID_UUID_FORMAT);
    //map getSurveyResponsesDTO to surveyResponses 
    Optional<Survey> survey = surveyRepository.findById(surveyId);
    if (!survey.isPresent()) {
       ResourceNotFoundException.throwResourceNotFoundException(SurveyConstants.SURVEY_ID_IS_INVALID_UUID_FORMAT);
    }
    
    Set<SurveyQuestion> surveyLinkedQuestions = survey.get().getSurveyQuestion();
    
    
    Map<UUID, Question>  questionsMap = 
        surveyLinkedQuestions
        .stream()
        .map(SurveyQuestion::getQuestion)
        .collect(Collectors.toMap(Question::getQuestionId, Function.identity()));
    
    
    Responses responses =  SurveyResponseMapper.mapUserSurveyResponseForSave(survey.get(), questionsMap, userResponseToSurveyDTO);
     
   
    responseRepository.save(responses);
     
        
        
      
    // save surveyResposnse
    
    //
    return new SurveyResponseDTO();
  }
}
