package com.survey.datatransferobject;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;

/**
 * UserSelectedAnswersForQuestionDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-02T16:18:00.031+05:30[Asia/Calcutta]")

public class UserSelectedAnswersForQuestionDTO  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("answerId")
  private String answerId;

  @JsonProperty("isSelectedAnswer")
  private Boolean isSelectedAnswer;

  public UserSelectedAnswersForQuestionDTO answerId(String answerId) {
    this.answerId = answerId;
    return this;
  }

  /**
   * Get answerId
   * @return answerId
  */
  @ApiModelProperty(example = "e2a40b33-a11a-4938-8111-07acf5758977", required = true, value = "")
  @NotNull


  public String getAnswerId() {
    return answerId;
  }

  public void setAnswerId(String answerId) {
    this.answerId = answerId;
  }

  public UserSelectedAnswersForQuestionDTO isSelectedAnswer(Boolean isSelectedAnswer) {
    this.isSelectedAnswer = isSelectedAnswer;
    return this;
  }

  /**
   * Get isSelectedAnswer
   * @return isSelectedAnswer
  */
  @ApiModelProperty(example = "false", required = true, value = "")
  @NotNull


  public Boolean getIsSelectedAnswer() {
    return isSelectedAnswer;
  }

  public void setIsSelectedAnswer(Boolean isSelectedAnswer) {
    this.isSelectedAnswer = isSelectedAnswer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserSelectedAnswersForQuestionDTO responsesAnswerRequest = (UserSelectedAnswersForQuestionDTO) o;
    return Objects.equals(this.answerId, responsesAnswerRequest.answerId) &&
        Objects.equals(this.isSelectedAnswer, responsesAnswerRequest.isSelectedAnswer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(answerId, isSelectedAnswer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserSelectedAnswersForQuestionDTO {\n");
    
    sb.append("    answerId: ").append(toIndentedString(answerId)).append("\n");
    sb.append("    isSelectedAnswer: ").append(toIndentedString(isSelectedAnswer)).append("\n");
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

