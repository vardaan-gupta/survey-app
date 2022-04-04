package com.survey.datatransferobject;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * SurveyQuestionDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-29T06:23:12.075+05:30[Asia/Calcutta]")

public class SurveyQuestionDTO  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("questionId")
  private UUID questionId;

  @JsonProperty("data")
  private SurveyQuestionResponseDTO data;

  public SurveyQuestionDTO questionId(UUID questionId) {
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

  public SurveyQuestionDTO data(SurveyQuestionResponseDTO data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
  */
  @ApiModelProperty(value = "")

  @Valid

  public SurveyQuestionResponseDTO getData() {
    return data;
  }

  public void setData(SurveyQuestionResponseDTO data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SurveyQuestionDTO surveyQuestion = (SurveyQuestionDTO) o;
    return Objects.equals(this.questionId, surveyQuestion.questionId) &&
        Objects.equals(this.data, surveyQuestion.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(questionId, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SurveyQuestionDTO {\n");
    
    sb.append("    questionId: ").append(toIndentedString(questionId)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

