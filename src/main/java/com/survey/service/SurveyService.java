package com.survey.service;

import javax.validation.Valid;
import com.survey.datatransferobject.SurveyDTO;
import com.survey.datatransferobject.SurveyRequestDTO;
import com.survey.datatransferobject.SurveyResponseDTO;
import com.survey.datatransferobject.UserResponseToSurveyDTO;

public interface SurveyService {

  SurveyDTO createSurvey(@Valid SurveyRequestDTO surveyRequestDTO);

  void deleteSurveyById(String reqSurveyId);

  SurveyResponseDTO createSurveyResponses(String reqSurveyId,
      @Valid UserResponseToSurveyDTO userResponseToSurveyDTO);

}
