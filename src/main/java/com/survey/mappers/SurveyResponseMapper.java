package com.survey.mappers;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.function.Function;
import java.util.stream.Collectors;
import com.survey.datatransferobject.UserResponseToSurveyDTO;
import com.survey.datatransferobject.UserResponsedQuestionsDTO;
import com.survey.datatransferobject.UserSelectedAnswersForQuestionDTO;
import com.survey.model.Answer;
import com.survey.model.AnswerResponses;
import com.survey.model.Question;
import com.survey.model.QuestionResponses;
import com.survey.model.Responses;
import com.survey.model.Survey;


public final class SurveyResponseMapper {
  private SurveyResponseMapper() {

  }

  public static Responses mapUserSurveyResponseForSave(Survey reqSurveyId,
      Map<UUID, Question> questionsMap, final UserResponseToSurveyDTO userResponseToSurveyDTO) {

    Set<QuestionResponses> questionResponses =
        mapUserSelectedSurveyQuestions(questionsMap, userResponseToSurveyDTO);

    Responses responses = new Responses();
    responses.setSurvey(reqSurveyId);
    responses.getQuestionResponses().addAll(questionResponses);

    return responses;

  }

  private static Set<QuestionResponses> mapUserSelectedSurveyQuestions(
      Map<UUID, Question> questionsMap, UserResponseToSurveyDTO userResponseToSurveyDTO) {

    List<UserResponsedQuestionsDTO> questRespondedByUserDTO =
        userResponseToSurveyDTO.getQuestions();

    Set<QuestionResponses> questionResponsesSet = questRespondedByUserDTO.stream()
        .map(question -> mapQuestionDTOtoQuestionResponses(questionsMap, question))
        .collect(Collectors.toSet());

    return questionResponsesSet;
  }



  private static QuestionResponses mapQuestionDTOtoQuestionResponses(
      Map<UUID, Question> questionsMap, UserResponsedQuestionsDTO userResponsedQuestionsDTO) {

    QuestionResponses questionResponse = new QuestionResponses();


    Question question =
        questionsMap.get(UUID.fromString(userResponsedQuestionsDTO.getQuestionId()));
    if (null == question) {
      // throw error TODO
    }
    Set<Answer> answers = question.getAnswers();

    Map<UUID, Answer> answerMapping =
        answers.stream().collect(Collectors.toMap(Answer::getAnswerId, Function.identity()));

    List<UserSelectedAnswersForQuestionDTO> userRespondedAnswers =
        userResponsedQuestionsDTO.getAnswers();
    Set<AnswerResponses> answerResponses = userRespondedAnswers.stream()
        .map(selectedAnswers -> mapToSurveyResponsesAnswer(answerMapping, selectedAnswers,
            questionResponse))
        .collect(Collectors.toSet());


    questionResponse.setResponsesQuestionId(UUID.randomUUID());
    questionResponse.setQuestion(question);
    questionResponse.setAnswerResponses(answerResponses);
    return questionResponse;
  }


  private static AnswerResponses mapToSurveyResponsesAnswer(Map<UUID, Answer> answerMapping,
      UserSelectedAnswersForQuestionDTO answerRequestDTO, QuestionResponses questionResponse) {

    Boolean isSelectedAnswer = answerRequestDTO.getIsSelectedAnswer();

    Answer answer = answerMapping.get(UUID.fromString(answerRequestDTO.getAnswerId()));
    final AnswerResponses answerResponses = new AnswerResponses();
    answerResponses.setResponsesAnswerId(UUID.randomUUID());
    answerResponses.setAnswer(answer);
    answerResponses.setQuestionResponses(questionResponse);
    answerResponses.setIsSelectedAnswer(isSelectedAnswer);

    return answerResponses;
  }



}
