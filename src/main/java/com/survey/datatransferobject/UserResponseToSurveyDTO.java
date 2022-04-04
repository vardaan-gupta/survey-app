package com.survey.datatransferobject;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;

/**
 * UserResponseToSurveyDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-02T16:18:00.031+05:30[Asia/Calcutta]")

public class UserResponseToSurveyDTO  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("questions")
  @Valid
  private List<UserResponsedQuestionsDTO> questions = new ArrayList<>();

  public UserResponseToSurveyDTO questions(List<UserResponsedQuestionsDTO> questions) {
    this.questions = questions;
    return this;
  }

  public UserResponseToSurveyDTO addQuestionsItem(UserResponsedQuestionsDTO questionsItem) {
    this.questions.add(questionsItem);
    return this;
  }

  /**
   * Get questions
   * @return questions
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
@Size(min=1) 
  public List<UserResponsedQuestionsDTO> getQuestions() {
    return questions;
  }

  public void setQuestions(List<UserResponsedQuestionsDTO> questions) {
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
    UserResponseToSurveyDTO surveyResponsesRequest = (UserResponseToSurveyDTO) o;
    return Objects.equals(this.questions, surveyResponsesRequest.questions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(questions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserResponseToSurveyDTO {\n");
    
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

