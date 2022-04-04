package com.survey.controller;

import static com.survey.constants.SurveyConstants.PATH_PARAM_SURVEY_ID;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.survey.datatransferobject.UserResponseToSurveyDTO;
import com.survey.datatransferobject.SurveyDTO;
import com.survey.datatransferobject.SurveyRequestDTO;
import com.survey.datatransferobject.SurveyResponseDTO;
import com.survey.service.SurveyService;

@RestController
public class SurveyController {

  @Autowired
  private SurveyService surveyService;

  @PostMapping(value = "/v1/surveys")
  public ResponseEntity<SurveyDTO> createSurvey(
      @RequestBody @Valid final SurveyRequestDTO surveyRequestDTO) {

    final SurveyDTO surveyDTO = surveyService.createSurvey(surveyRequestDTO);
    return new ResponseEntity<>(surveyDTO, HttpStatus.CREATED);
  }

  @DeleteMapping(value = "/v1/surveys/{survey-id}")
  public ResponseEntity<Void> deleteSurveyById(
      @PathVariable(value = PATH_PARAM_SURVEY_ID) final String reqSurveyId) {

    surveyService.deleteSurveyById(reqSurveyId);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }


  @PostMapping(value = "/v1/surveys/{survey-id}/responses")
  public ResponseEntity<SurveyResponseDTO> createSurveyResponsesById(
      @PathVariable(value = PATH_PARAM_SURVEY_ID) final String reqSurveyId,
      @RequestBody @Valid final UserResponseToSurveyDTO userResponseToSurveyDTO) {

    final SurveyResponseDTO surveyResponseDTO =
        surveyService.createSurveyResponses(reqSurveyId, userResponseToSurveyDTO);
    return new ResponseEntity<>(surveyResponseDTO, HttpStatus.CREATED);
  }
}
