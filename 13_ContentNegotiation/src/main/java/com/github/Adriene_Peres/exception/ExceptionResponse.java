package com.github.Adriene_Peres.exception;

import java.util.Date;

public record ExceptionResponse(Date timestamp, String message, String details) {}
