package com.survey.datatransferobject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * QuestionSetDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-29T06:23:12.788+05:30[Asia/Calcutta]")

public class QuestionSetDTO  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("count")
  private Integer count;

  @JsonProperty("questions")
  @Valid
  private List<QuestionDTO> questions = null;

  public QuestionSetDTO count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Get count
   * @return count
  */
  @ApiModelProperty(example = "15", value = "")


  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public QuestionSetDTO questions(List<QuestionDTO> questions) {
    this.questions = questions;
    return this;
  }

  public QuestionSetDTO addQuestionsItem(QuestionDTO questionsItem) {
    if (this.questions == null) {
      this.questions = new ArrayList<>();
    }
    this.questions.add(questionsItem);
    return this;
  }

  /**
   * Get questions
   * @return questions
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<QuestionDTO> getQuestions() {
    return questions;
  }

  public void setQuestions(List<QuestionDTO> questions) {
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
    QuestionSetDTO questionsResponse = (QuestionSetDTO) o;
    return Objects.equals(this.count, questionsResponse.count) &&
        Objects.equals(this.questions, questionsResponse.questions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, questions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuestionSetDTO {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

