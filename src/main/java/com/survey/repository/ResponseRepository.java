package com.survey.repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.survey.model.Responses;


@Repository
public interface ResponseRepository extends JpaRepository<Responses, UUID>{

}
