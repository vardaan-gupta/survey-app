package com.survey.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.survey.model.Question;


@Repository
public interface QuestionRepository extends JpaRepository<Question, UUID>{

}
