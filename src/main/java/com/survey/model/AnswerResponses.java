package com.survey.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import org.hibernate.annotations.Type;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "answer_responses")
@Setter
@Getter
public class AnswerResponses implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Type(type="uuid-char")
    private UUID responsesAnswerId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "answer_id")
    private Answer answer;

    private Boolean isSelectedAnswer;
    

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "responses_question_id")
    private QuestionResponses questionResponses;

}
