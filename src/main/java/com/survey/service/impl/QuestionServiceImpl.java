package com.survey.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.survey.constants.SurveyConstants;
import com.survey.datatransferobject.*;
import com.survey.exceptions.*;
import com.survey.mappers.QuestionMapper;
import com.survey.model.Question;
import com.survey.repository.QuestionRepository;
import com.survey.repository.SurveyQuestionRepository;
import com.survey.service.QuestionService;
import com.survey.util.SurveyValidationUtils;

@Service
public class QuestionServiceImpl implements QuestionService {

	@Autowired
	private QuestionRepository questionRepository;
	private SurveyQuestionRepository surveyQuestionRepository;
	@Autowired
	private QuestionMapper questionMapper;

	@Override
	public QuestionDTO createQuestion(final QuestionRequestDTO questionRequestDTO) {

		Question question = questionMapper.mapToCreateQuestion(questionRequestDTO);
		Question savedQuestion = questionRepository.save(question);
		return questionMapper.mapToQuestionDTO(savedQuestion);
	}

	@Override
	public void deleteQuestionById(final String reqQuestionId) {

		UUID questionId = SurveyValidationUtils.validateAndConvertUUIDOrElseThrown(reqQuestionId,	SurveyConstants.QUESTION_ID_IS_INVALID_UUID);
		
		Optional<Question> question = questionRepository.findById(questionId);	
		if (!question.isPresent()) {
			ResourceNotFoundException.throwResourceNotFoundException(SurveyConstants.ERROR_QUESTION_ID_IS_NOT_FOUND);
		}
			
		/*if(isQuestionAssignedToSomeSurvey(questionId)) {
			ResourceAlreadyExistsException.throwResourceAlreadyExistsException(SurveyConstants.ERROR_ALREADY_THE_QUESTION_ID_IS_LINKED_WITH_SURVEY);
		}*/
		questionRepository.deleteById(questionId);
	}

	

	@Override
	public QuestionSetDTO getQuestions() {
		List<Question> questions = questionRepository.findAll();
		if (questions.isEmpty()) {
			NoRecordFoundException.throwNoRecordFoundException(SurveyConstants.NO_RECORD_FOUND);
		}
		return questionMapper.mapToQuestionSetDTO(questions);

	}

	@Override
	public QuestionDTO getQuestionById(String reqQuestionId) {
		UUID questionId = SurveyValidationUtils.validateAndConvertUUIDOrElseThrown(reqQuestionId,	SurveyConstants.QUESTION_ID_IS_INVALID_UUID);
		Optional<Question> question = questionRepository.findById(questionId);	
		if (!question.isPresent()) {
			ResourceNotFoundException.throwResourceNotFoundException(SurveyConstants.ERROR_QUESTION_ID_IS_NOT_FOUND);
		}
		return questionMapper.mapToQuestionDTO(question.get());
	}

}
