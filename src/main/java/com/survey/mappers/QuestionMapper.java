package com.survey.mappers;

import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.survey.datatransferobject.AnswerResponseDTO;
import com.survey.datatransferobject.QuestionDTO;
import com.survey.datatransferobject.QuestionRequestDTO;
import com.survey.datatransferobject.QuestionResponseDTO;
import com.survey.datatransferobject.QuestionSetDTO;
import com.survey.model.Answer;
import com.survey.model.AuditMetadata;
import com.survey.model.Question;

@Component
public class QuestionMapper {

	public Question mapToCreateQuestion(QuestionRequestDTO questionRequestDTO) {

		AuditMetadata auditMetadata = AuditMetadataMapper.mapToCreateAudit();
		UUID questionId = UUID.randomUUID();

		Question question = new Question();
		Set<Answer> answers = AnswerMapper.getAnswers(questionRequestDTO.getAnswers(), question);
		question.setAuditMetadata(auditMetadata);
		question.setQuestionId(questionId);
		question.setQuestionTitle(questionRequestDTO.getQuestionTitle());
		question.setAnswers(answers);

		return question;
	}

	public QuestionDTO mapToQuestionDTO(Question savedQuestion) {
		final AuditMetadata auditMetadata = savedQuestion.getAuditMetadata();

		final QuestionDTO questionDTO = new QuestionDTO();
		final QuestionResponseDTO data = mapToQuestionResponseDTO(savedQuestion);

		questionDTO.setData(data);
		questionDTO.setQuestionId(savedQuestion.getQuestionId());
		questionDTO.setCreationDate(auditMetadata.getCreationDate().toString());
		questionDTO.setUpdatedDate(auditMetadata.getUpdatedDate().toString());
		return questionDTO;
	}

	public QuestionResponseDTO mapToQuestionResponseDTO(final Question question) {

		final List<AnswerResponseDTO> answersRequestDTO = AnswerMapper.getAnswerResponseDTO(question.getAnswers());

		final QuestionResponseDTO data = new QuestionResponseDTO();
		data.setQuestionTitle(question.getQuestionTitle());
		data.setAnswers(answersRequestDTO);
		return data;
	}

	public QuestionSetDTO mapToQuestionSetDTO(List<Question> questions) {

		List<QuestionDTO> questionAnswerUpdated = questions.stream().map(quest -> mapToQuestionDTO(quest))
				.collect(Collectors.toList());

		QuestionSetDTO questionsResponseDTO = new QuestionSetDTO();
		questionsResponseDTO.setQuestions(questionAnswerUpdated);
		questionsResponseDTO.setCount(questionAnswerUpdated.size());
		return questionsResponseDTO;

	}

}
