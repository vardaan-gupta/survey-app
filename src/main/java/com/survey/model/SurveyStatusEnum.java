package com.survey.model;

import java.util.Arrays;

import org.springframework.util.StringUtils;



public enum SurveyStatusEnum {

    ACTIVE,
    INACTIVE;

    public static final String INVALID_STATUS = "Survey status Could only be ACTIVE and INACTIVE";

    public static void checkSurveyStatusValidOrElseThrown(final String status) {
        if (validate(status)) {
            return;
        }
      //  throwFieldValidationException(INVALID_STATUS);
    }

    private static boolean validate(final String value) {
        return !StringUtils.isEmpty(value) && isSurveyStatus(value);
    }

    private static boolean isSurveyStatus(final String value) {
        return Arrays.stream(SurveyStatusEnum.values())
                .anyMatch(status -> status.name().equals(value));
    }

    public static SurveyStatusEnum getSurveyStatus(final String status) {
        return SurveyStatusEnum.valueOf(status);
    }
}