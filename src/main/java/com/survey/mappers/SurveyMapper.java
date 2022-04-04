package com.survey.mappers;


import java.util.UUID;
import com.survey.datatransferobject.SurveyResponseDTO;
import com.survey.datatransferobject.SurveyDTO;
import com.survey.datatransferobject.SurveyRequestDTO;
import com.survey.model.AuditMetadata;
import com.survey.model.Survey;
import com.survey.model.SurveyStatusEnum;

public final class SurveyMapper {
    private SurveyMapper () {
      
    }
    
    
    
    public static SurveyDTO mapSurveytoSurveyDTO(Survey survey) {
      final AuditMetadata auditMetadata = survey.getAuditMetadata();
     

      final SurveyDTO surveyDTO = new SurveyDTO();      
      surveyDTO.setSurveyId(survey.getSurveyId());
      surveyDTO.setCreationDate(auditMetadata.getCreationDate().toString());
      surveyDTO.setUpdatedDate(auditMetadata.getUpdatedDate().toString());
      return surveyDTO;
    }
    
    public static Survey mapSurveyDTOtoSurvey(SurveyRequestDTO surveyDTO) {
      SurveyStatusEnum status = SurveyStatusEnum.getSurveyStatus(surveyDTO.getStatus());
      final AuditMetadata auditMetadata = AuditMetadataMapper.mapToCreateAudit();

      final Survey survey = new Survey();
      survey.setSurveyId(UUID.randomUUID());
      survey.setTitle(surveyDTO.getTitle());
      survey.setDescription(surveyDTO.getDescription());
      survey.setStatus(status);
      survey.setAuditMetadata(auditMetadata);
      return survey;
     
    }
    
    
    
}
