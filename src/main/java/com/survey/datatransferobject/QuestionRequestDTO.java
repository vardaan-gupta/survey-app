package com.survey.datatransferobject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * QuestionRequestDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-29T06:23:12.788+05:30[Asia/Calcutta]")

public class QuestionRequestDTO  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("questionTitle")
  private String questionTitle;

  @JsonProperty("answers")
  @Valid
  private List<AnswerRequestDTO> answers = null;

  public QuestionRequestDTO questionTitle(String questionTitle) {
    this.questionTitle = questionTitle;
    return this;
  }

  /**
   * Get questionTitle
   * @return questionTitle
  */
  @ApiModelProperty(example = "some question text", value = "")

@Size(min=1) 
  public String getQuestionTitle() {
    return questionTitle;
  }

  public void setQuestionTitle(String questionTitle) {
    this.questionTitle = questionTitle;
  }

  public QuestionRequestDTO answers(List<AnswerRequestDTO> answers) {
    this.answers = answers;
    return this;
  }

  public QuestionRequestDTO addAnswersItem(AnswerRequestDTO answersItem) {
    if (this.answers == null) {
      this.answers = new ArrayList<>();
    }
    this.answers.add(answersItem);
    return this;
  }

  /**
   * Get answers
   * @return answers
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<AnswerRequestDTO> getAnswers() {
    return answers;
  }

  public void setAnswers(List<AnswerRequestDTO> answers) {
    this.answers = answers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuestionRequestDTO questionRequest = (QuestionRequestDTO) o;
    return Objects.equals(this.questionTitle, questionRequest.questionTitle) &&
        Objects.equals(this.answers, questionRequest.answers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(questionTitle, answers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuestionRequestDTO {\n");
    
    sb.append("    questionTitle: ").append(toIndentedString(questionTitle)).append("\n");
    sb.append("    answers: ").append(toIndentedString(answers)).append("\n");
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

