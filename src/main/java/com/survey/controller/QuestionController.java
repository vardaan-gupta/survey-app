package com.survey.controller;

import com.survey.datatransferobject.*;
import com.survey.service.QuestionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import com.survey.constants.SurveyConstants;

@RestController
public class QuestionController {

	@Autowired
	private QuestionService questionService;

	@PostMapping(value = "/v1/questions")
	public ResponseEntity<QuestionDTO> createQuestion(@RequestBody @Valid final QuestionRequestDTO questionRequestDTO) {

		final QuestionDTO questionDTO = questionService.createQuestion(questionRequestDTO);
		return new ResponseEntity<>(questionDTO, HttpStatus.CREATED);
	}

	@DeleteMapping(value = "/v1/questions/{question-id}")
	public ResponseEntity<Void> deleteQuestionById(
			@PathVariable(value = SurveyConstants.PATH_PARAM_QUESTION_ID) final String reqQuestionId) {

		questionService.deleteQuestionById(reqQuestionId);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
	 @PutMapping(value = "/v1/questions/{question-id}")
	 public ResponseEntity<QuestionDTO> updateQuestion(@RequestBody @Valid final QuestionRequestDTO questionRequestDTO) {
		// TODO
		 return null;
		 
	 }

	@GetMapping(value = "/v1/questions")
	public ResponseEntity<QuestionSetDTO> getQuestions() {

		final QuestionSetDTO questionResponseDTO = questionService.getQuestions();
		return new ResponseEntity<>(questionResponseDTO, HttpStatus.OK);
	}

	@GetMapping(value = "/v1/questions/{question-id}")
	public ResponseEntity<QuestionDTO> getQuestionById(
			@PathVariable(value = SurveyConstants.PATH_PARAM_QUESTION_ID) final String reqQuestionId) {

		final QuestionDTO questionDTO = questionService.getQuestionById(reqQuestionId);
		return new ResponseEntity<>(questionDTO, HttpStatus.OK);
	}
}
