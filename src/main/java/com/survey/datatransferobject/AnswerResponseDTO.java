package com.survey.datatransferobject;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * AnswerResponseDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-29T06:23:12.788+05:30[Asia/Calcutta]")

public class AnswerResponseDTO  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("answerId")
  private UUID answerId;

  @JsonProperty("isCorrectAnswer")
  private Boolean isCorrectAnswer;

  @JsonProperty("answerText")
  private String answerText;

  public AnswerResponseDTO answerId(UUID answerId) {
    this.answerId = answerId;
    return this;
  }

  /**
   * Get answerId
   * @return answerId
  */
  @ApiModelProperty(example = "e2a40b33-a11a-4938-8111-07acf5758977", value = "")

  @Valid

  public UUID getAnswerId() {
    return answerId;
  }

  public void setAnswerId(UUID answerId) {
    this.answerId = answerId;
  }

  public AnswerResponseDTO isCorrectAnswer(Boolean isCorrectAnswer) {
    this.isCorrectAnswer = isCorrectAnswer;
    return this;
  }

  /**
   * Get isCorrectAnswer
   * @return isCorrectAnswer
  */
  @ApiModelProperty(example = "false", value = "")


  public Boolean getIsCorrectAnswer() {
    return isCorrectAnswer;
  }

  public void setIsCorrectAnswer(Boolean isCorrectAnswer) {
    this.isCorrectAnswer = isCorrectAnswer;
  }

  public AnswerResponseDTO answerText(String answerText) {
    this.answerText = answerText;
    return this;
  }

  /**
   * Get answerText
   * @return answerText
  */
  @ApiModelProperty(example = "some answer", value = "")


  public String getAnswerText() {
    return answerText;
  }

  public void setAnswerText(String answerText) {
    this.answerText = answerText;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnswerResponseDTO answerResponse = (AnswerResponseDTO) o;
    return Objects.equals(this.answerId, answerResponse.answerId) &&
        Objects.equals(this.isCorrectAnswer, answerResponse.isCorrectAnswer) &&
        Objects.equals(this.answerText, answerResponse.answerText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(answerId, isCorrectAnswer, answerText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnswerResponseDTO {\n");
    
    sb.append("    answerId: ").append(toIndentedString(answerId)).append("\n");
    sb.append("    isCorrectAnswer: ").append(toIndentedString(isCorrectAnswer)).append("\n");
    sb.append("    answerText: ").append(toIndentedString(answerText)).append("\n");
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

