package crud.CrudExceptions.content.persona.infrastucture.controller;

import crud.CrudExceptions.content.persona.Exceptions.CustomResponse;
import crud.CrudExceptions.content.persona.Exceptions.NotFoundException;
import crud.CrudExceptions.content.persona.Exceptions.UnprocesableException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@RestControllerAdvice
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(NotFoundException.class)
    public final ResponseEntity<CustomResponse> handleNotFoundException(NotFoundException ex, WebRequest request) {
        CustomResponse customResponse = new CustomResponse(new Date(), ex.getMessage(), HttpStatus.NOT_FOUND.value());
        return new ResponseEntity<CustomResponse>(customResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(UnprocesableException.class)
    public final ResponseEntity<CustomResponse> handleUnprocesableException(UnprocesableException ex, WebRequest request) {
        CustomResponse customResponse = new CustomResponse(new Date(), ex.getMessage(), HttpStatus.UNPROCESSABLE_ENTITY.value());
        return new ResponseEntity<CustomResponse>(customResponse, HttpStatus.UNPROCESSABLE_ENTITY);
    }

}
