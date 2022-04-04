package com.survey.service;

import com.survey.datatransferobject.QuestionDTO;
import com.survey.datatransferobject.QuestionRequestDTO;
import com.survey.datatransferobject.QuestionSetDTO;

public interface QuestionService {

    /**
     * Creates a new Question.
     *
     * @param questionRequestDTO Question object
     * @return created Question
     */
    QuestionDTO createQuestion(final QuestionRequestDTO questionRequestDTO);

    /**
     * Delete a Question by the id.
     * If the id is not uuid format, a {@link com.chandranedu.api.error.exception.FieldValidationException} will be thrown.
     * If the id does not exist, a {@link com.chandranedu.api.error.exception.ResourceNotFoundException} will be thrown.
     *
     * @param reqQuestionId the unique id of the Question
     */
    void deleteQuestionById(final String reqQuestionId);
    
    
    /**
     * get a created Question.
     * If the no data, a {@link com.chandranedu.api.error.exception.NoRecordFoundException} will be thrown.
     *
     * @return created Question
     */
    QuestionSetDTO getQuestions();

    /**
     * get a created Question.
     * If the id is not uuid format, a {@link com.chandranedu.api.error.exception.FieldValidationException} will be thrown.
     * If the id does not exist, a {@link com.chandranedu.api.error.exception.ResourceNotFoundException} will be thrown.
     *
     * @param reqQuestionId Question Id
     * @return created Question
     */
    QuestionDTO getQuestionById(final String reqQuestionId);
}
