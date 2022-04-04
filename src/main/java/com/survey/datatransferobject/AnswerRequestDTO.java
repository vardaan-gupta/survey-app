package com.survey.datatransferobject;

import java.io.Serializable;
import java.util.Objects;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * AnswerRequestDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-29T06:23:12.788+05:30[Asia/Calcutta]")

public class AnswerRequestDTO  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("markCorrectAnswer")
  private Boolean markCorrectAnswer;

  @JsonProperty("answer")
  private String answer;

  public AnswerRequestDTO markCorrectAnswer(Boolean markCorrectAnswer) {
    this.markCorrectAnswer = markCorrectAnswer;
    return this;
  }

  /**
   * Get markCorrectAnswer
   * @return markCorrectAnswer
  */
  @ApiModelProperty(example = "false", required = true, value = "")
  @NotNull


  public Boolean getMarkCorrectAnswer() {
    return markCorrectAnswer;
  }

  public void setMarkCorrectAnswer(Boolean markCorrectAnswer) {
    this.markCorrectAnswer = markCorrectAnswer;
  }

  public AnswerRequestDTO answer(String answer) {
    this.answer = answer;
    return this;
  }

  /**
   * Get answer
   * @return answer
  */
  @ApiModelProperty(example = "some answer", required = true, value = "")
  @NotNull


  public String getAnswer() {
    return answer;
  }

  public void setAnswer(String answer) {
    this.answer = answer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnswerRequestDTO answerRequest = (AnswerRequestDTO) o;
    return Objects.equals(this.markCorrectAnswer, answerRequest.markCorrectAnswer) &&
        Objects.equals(this.answer, answerRequest.answer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(markCorrectAnswer, answer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnswerRequestDTO {\n");
    
    sb.append("    markCorrectAnswer: ").append(toIndentedString(markCorrectAnswer)).append("\n");
    sb.append("    answer: ").append(toIndentedString(answer)).append("\n");
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

