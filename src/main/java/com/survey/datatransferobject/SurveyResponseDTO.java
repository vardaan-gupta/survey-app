package com.survey.datatransferobject;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * SurveyResponseDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-29T06:23:12.075+05:30[Asia/Calcutta]")

public class SurveyResponseDTO  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("surveyTitle")
  private String surveyTitle;

  @JsonProperty("description")
  private String description;

  @JsonProperty("status")
  private String status;

  public SurveyResponseDTO surveyTitle(String surveyTitle) {
    this.surveyTitle = surveyTitle;
    return this;
  }

  /**
   * Get surveyTitle
   * @return surveyTitle
  */
  @ApiModelProperty(example = "some title", value = "")


  public String getSurveyTitle() {
    return surveyTitle;
  }

  public void setSurveyTitle(String surveyTitle) {
    this.surveyTitle = surveyTitle;
  }

  public SurveyResponseDTO description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  @ApiModelProperty(example = "some description", value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SurveyResponseDTO status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @ApiModelProperty(example = "ACTIVE - ACTIVE INACTIVE - INACTIVE", value = "")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SurveyResponseDTO surveyResponse = (SurveyResponseDTO) o;
    return Objects.equals(this.surveyTitle, surveyResponse.surveyTitle) &&
        Objects.equals(this.description, surveyResponse.description) &&
        Objects.equals(this.status, surveyResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(surveyTitle, description, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SurveyResponseDTO {\n");
    
    sb.append("    surveyTitle: ").append(toIndentedString(surveyTitle)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

