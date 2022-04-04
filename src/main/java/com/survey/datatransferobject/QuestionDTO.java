package com.survey.datatransferobject;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * QuestionDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-29T06:23:12.788+05:30[Asia/Calcutta]")

public class QuestionDTO  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("questionId")
  private UUID questionId;

  @JsonProperty("data")
  private QuestionResponseDTO data;

  @JsonProperty("creationDate")
  private String creationDate;

  @JsonProperty("updatedDate")
  private String updatedDate;

  public QuestionDTO questionId(UUID questionId) {
    this.questionId = questionId;
    return this;
  }

  /**
   * Get questionId
   * @return questionId
  */
  @ApiModelProperty(example = "e2a40b33-a11a-4938-8111-07acf5758977", value = "")

  @Valid

  public UUID getQuestionId() {
    return questionId;
  }

  public void setQuestionId(UUID questionId) {
    this.questionId = questionId;
  }

  public QuestionDTO data(QuestionResponseDTO data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
  */
  @ApiModelProperty(value = "")

  @Valid

  public QuestionResponseDTO getData() {
    return data;
  }

  public void setData(QuestionResponseDTO data) {
    this.data = data;
  }

  public QuestionDTO creationDate(String creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Get creationDate
   * @return creationDate
  */
  @ApiModelProperty(value = "")


  public String getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(String creationDate) {
    this.creationDate = creationDate;
  }

  public QuestionDTO updatedDate(String updatedDate) {
    this.updatedDate = updatedDate;
    return this;
  }

  /**
   * Get updatedDate
   * @return updatedDate
  */
  @ApiModelProperty(value = "")


  public String getUpdatedDate() {
    return updatedDate;
  }

  public void setUpdatedDate(String updatedDate) {
    this.updatedDate = updatedDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuestionDTO question = (QuestionDTO) o;
    return Objects.equals(this.questionId, question.questionId) &&
        Objects.equals(this.data, question.data) &&
        Objects.equals(this.creationDate, question.creationDate) &&
        Objects.equals(this.updatedDate, question.updatedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(questionId, data, creationDate, updatedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuestionDTO {\n");
    
    sb.append("    questionId: ").append(toIndentedString(questionId)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    updatedDate: ").append(toIndentedString(updatedDate)).append("\n");
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

