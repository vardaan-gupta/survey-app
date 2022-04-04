package com.survey.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import org.hibernate.annotations.Type;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "survey")
@Setter
@Getter
public class Survey implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Type(type = "uuid-char")
	private UUID surveyId;

	private String title;
	private String description;
	@Enumerated(EnumType.STRING)
	private SurveyStatusEnum status;

	@OneToMany(mappedBy = "survey", cascade = CascadeType.ALL)
	private Set<SurveyQuestion> surveyQuestion;

	@OneToMany(mappedBy = "survey", cascade = CascadeType.ALL)
	private Set<Responses> responses = new HashSet<>();
	
	@Embedded
    private AuditMetadata auditMetadata;
}
