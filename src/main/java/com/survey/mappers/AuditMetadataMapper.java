package com.survey.mappers;

import com.survey.model.AuditMetadata;

import java.time.LocalDateTime;

public class AuditMetadataMapper {

    private AuditMetadataMapper() {
        throw new IllegalStateException("AuditMetadataMapper class");
    }

    public static AuditMetadata mapToCreateAudit() {

        final AuditMetadata auditMetadata = new AuditMetadata();
        auditMetadata.setCreationDate(LocalDateTime.now());
        auditMetadata.setUpdatedDate(LocalDateTime.now());
        return auditMetadata;
    }
}
