package com.survey.datatransferobject;

import java.util.Objects;
import com.survey.datatransferobject.*;
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
 * SurveyQuestionResponseDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-29T06:23:12.075+05:30[Asia/Calcutta]")

public class SurveyQuestionResponseDTO  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("text")
  private String text;

  @JsonProperty("answers")
  @Valid
  private List<SurveyAnswerResponseDTO> answers = null;

  public SurveyQuestionResponseDTO text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Get text
   * @return text
  */
  @ApiModelProperty(example = "some text", value = "")


  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public SurveyQuestionResponseDTO answers(List<SurveyAnswerResponseDTO> answers) {
    this.answers = answers;
    return this;
  }

  public SurveyQuestionResponseDTO addAnswersItem(SurveyAnswerResponseDTO answersItem) {
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

  public List<SurveyAnswerResponseDTO> getAnswers() {
    return answers;
  }

  public void setAnswers(List<SurveyAnswerResponseDTO> answers) {
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
    SurveyQuestionResponseDTO surveyQuestionResponse = (SurveyQuestionResponseDTO) o;
    return Objects.equals(this.text, surveyQuestionResponse.text) &&
        Objects.equals(this.answers, surveyQuestionResponse.answers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, answers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SurveyQuestionResponseDTO {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

