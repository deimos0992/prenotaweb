package com.project.prenotazione.exception;

import com.project.prenotazione.model.ErrorMessage;
import com.project.prenotazione.model.ErrorResponse;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {


//    @ExceptionHandler(UtenteException.class)
//    public final ResponseEntity<ErrorResponse> handleUserNotFoundException(UtenteException ex, WebRequest request){
//
//        List<String> details = new ArrayList<>();
//        details.add(ex.getLocalizedMessage());
//        ErrorResponse error = new ErrorResponse(INCORRECT_REQUEST, details);
//        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
//    }
    
    @ExceptionHandler(value = {Exception.class})
    public ResponseEntity<Object> handleExceptionUtente(Exception ex, WebRequest request){

        String errorMessageDescription = ex.getLocalizedMessage();
        
        if(errorMessageDescription == null) errorMessageDescription = ex.toString();
        
        ErrorMessage errorMessage = new ErrorMessage(new Date(), errorMessageDescription);
        
        return new ResponseEntity<>(
        		errorMessage, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
    }



}
