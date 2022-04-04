package com.survey.datatransferobject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * SurveyQuestionsResponseDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-29T06:23:12.075+05:30[Asia/Calcutta]")

public class SurveyQuestionsResponseDTO  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("survey")
  private SurveyDTO survey;

  @JsonProperty("questionCount")
  private Integer questionCount;

  @JsonProperty("questions")
  @Valid
  private List<SurveyQuestionDTO> questions = null;

  public SurveyQuestionsResponseDTO survey(SurveyDTO survey) {
    this.survey = survey;
    return this;
  }

  /**
   * Get survey
   * @return survey
  */
  @ApiModelProperty(value = "")

  @Valid

  public SurveyDTO getSurvey() {
    return survey;
  }

  public void setSurvey(SurveyDTO survey) {
    this.survey = survey;
  }

  public SurveyQuestionsResponseDTO questionCount(Integer questionCount) {
    this.questionCount = questionCount;
    return this;
  }

  /**
   * Get questionCount
   * @return questionCount
  */
  @ApiModelProperty(example = "15", value = "")


  public Integer getQuestionCount() {
    return questionCount;
  }

  public void setQuestionCount(Integer questionCount) {
    this.questionCount = questionCount;
  }

  public SurveyQuestionsResponseDTO questions(List<SurveyQuestionDTO> questions) {
    this.questions = questions;
    return this;
  }

  public SurveyQuestionsResponseDTO addQuestionsItem(SurveyQuestionDTO questionsItem) {
    if (this.questions == null) {
      this.questions = new ArrayList<>();
    }
    this.questions.add(questionsItem);
    return this;
  }

  /**
   * Get questions
   * @return questions
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<SurveyQuestionDTO> getQuestions() {
    return questions;
  }

  public void setQuestions(List<SurveyQuestionDTO> questions) {
    this.questions = questions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SurveyQuestionsResponseDTO surveyQuestionsResponse = (SurveyQuestionsResponseDTO) o;
    return Objects.equals(this.survey, surveyQuestionsResponse.survey) &&
        Objects.equals(this.questionCount, surveyQuestionsResponse.questionCount) &&
        Objects.equals(this.questions, surveyQuestionsResponse.questions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(survey, questionCount, questions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SurveyQuestionsResponseDTO {\n");
    
    sb.append("    survey: ").append(toIndentedString(survey)).append("\n");
    sb.append("    questionCount: ").append(toIndentedString(questionCount)).append("\n");
    sb.append("    questions: ").append(toIndentedString(questions)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

