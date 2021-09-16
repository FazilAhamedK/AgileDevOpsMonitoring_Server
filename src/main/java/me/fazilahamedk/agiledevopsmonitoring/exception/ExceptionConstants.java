package me.fazilahamedk.agiledevopsmonitoring.exception;

import lombok.Getter;

public enum ExceptionConstants
{
    PROJECT_NOT_FOUND_FOR_ID("No project is found for the given ID!"),
    NO_PROJECT_FOUND("No project is found!");

    @Getter
    private String errorMessage;

    ExceptionConstants(String errorMessage)
    {
        this.errorMessage = errorMessage;
    }
}