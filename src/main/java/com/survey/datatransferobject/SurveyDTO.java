package com.survey.datatransferobject;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * SurveyDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-29T06:23:12.075+05:30[Asia/Calcutta]")

public class SurveyDTO  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("surveyId")
  private UUID surveyId;

  @JsonProperty("data")
  private SurveyResponseDTO data;

  @JsonProperty("creationDate")
  private String creationDate;

  @JsonProperty("updatedDate")
  private String updatedDate;

  public SurveyDTO surveyId(UUID surveyId) {
    this.surveyId = surveyId;
    return this;
  }

  /**
   * Get surveyId
   * @return surveyId
  */
  @ApiModelProperty(example = "e2a40b33-a11a-4938-8111-07acf5758977", value = "")

  @Valid

  public UUID getSurveyId() {
    return surveyId;
  }

  public void setSurveyId(UUID surveyId) {
    this.surveyId = surveyId;
  }

  public SurveyDTO data(SurveyResponseDTO data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
  */
  @ApiModelProperty(value = "")

  @Valid

  public SurveyResponseDTO getData() {
    return data;
  }

  public void setData(SurveyResponseDTO data) {
    this.data = data;
  }

  public SurveyDTO creationDate(String creationDate) {
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

  public SurveyDTO updatedDate(String updatedDate) {
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
    SurveyDTO survey = (SurveyDTO) o;
    return Objects.equals(this.surveyId, survey.surveyId) &&
        Objects.equals(this.data, survey.data) &&
        Objects.equals(this.creationDate, survey.creationDate) &&
        Objects.equals(this.updatedDate, survey.updatedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(surveyId, data, creationDate, updatedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SurveyDTO {\n");
    
    sb.append("    surveyId: ").append(toIndentedString(surveyId)).append("\n");
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

