package com.survey.constants;

public class SurveyConstants {

    private SurveyConstants() {
        throw new IllegalStateException("SurveyConstants class");
    }

    public static final String PATH_PARAM_QUESTION_ID = "question-id";
    public static final String PATH_PARAM_SURVEY_ID = "survey-id";
    public static final String PATH_PARAM_RESPONSE_ID = "response-id";
    
    public static final String NO_RECORD_FOUND = "msg.no.record.found";
    
    public static final String QUESTION_ID_IS_INVALID_UUID = "Invalid format for questionId";
    public static final String ERROR_QUESTION_ID_IS_NOT_FOUND = "NotFound.question.questionId";
    public static final String ERROR_ALREADY_THE_QUESTION_ID_IS_LINKED_WITH_SURVEY = "Already.survey.question.questionId";
    public static final String INVALID_QUESTION_OR_ANSWER_ID = "Invalid.questionId.answerId";
    public static final String SURVEY_ID_IS_INVALID_UUID_FORMAT = "Invalid Survey Id";
    public static final String ERROR_SURVEY_ID_IS_NOT_FOUND = "Could not find given Survey";
}
