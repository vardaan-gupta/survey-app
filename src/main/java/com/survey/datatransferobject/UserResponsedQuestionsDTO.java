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
 * UserResponsedQuestionsDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-02T16:18:00.031+05:30[Asia/Calcutta]")

public class UserResponsedQuestionsDTO  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("questionId")
  private String questionId;

  @JsonProperty("answers")
  @Valid
  private List<UserSelectedAnswersForQuestionDTO> answers = null;

  public UserResponsedQuestionsDTO questionId(String questionId) {
    this.questionId = questionId;
    return this;
  }

  /**
   * Get questionId
   * @return questionId
  */
  @ApiModelProperty(example = "e2a40b33-a11a-4938-8111-07acf5758977", value = "")


  public String getQuestionId() {
    return questionId;
  }

  public void setQuestionId(String questionId) {
    this.questionId = questionId;
  }

  public UserResponsedQuestionsDTO answers(List<UserSelectedAnswersForQuestionDTO> answers) {
    this.answers = answers;
    return this;
  }

  public UserResponsedQuestionsDTO addAnswersItem(UserSelectedAnswersForQuestionDTO answersItem) {
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
@Size(min=1) 
  public List<UserSelectedAnswersForQuestionDTO> getAnswers() {
    return answers;
  }

  public void setAnswers(List<UserSelectedAnswersForQuestionDTO> answers) {
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
    UserResponsedQuestionsDTO responsesQuestionRequest = (UserResponsedQuestionsDTO) o;
    return Objects.equals(this.questionId, responsesQuestionRequest.questionId) &&
        Objects.equals(this.answers, responsesQuestionRequest.answers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(questionId, answers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserResponsedQuestionsDTO {\n");
    
    sb.append("    questionId: ").append(toIndentedString(questionId)).append("\n");
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

