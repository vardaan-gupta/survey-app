package com.survey.repository;

import com.survey.model.Survey;
import com.survey.model.SurveyStatusEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;


@Repository
public interface SurveyRepository extends JpaRepository<Survey, UUID> {

    @Query(value = "from #{#entityName} s where s.status=:status and s.surveyId=:surveyId")
    Optional<Survey> findBySurveyStatus(
            @Param("surveyId") final UUID surveyId,
            @Param("status") final SurveyStatusEnum status
    );
}