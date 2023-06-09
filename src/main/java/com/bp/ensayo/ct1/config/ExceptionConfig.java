package com.bp.ensayo.ct1.config;

import com.bp.ensayo.ct1.exception.AccountException;
import com.bp.ensayo.ct1.exception.CustomerException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import java.util.NoSuchElementException;

@Slf4j
@ControllerAdvice(annotations = RestController.class)
public class ExceptionConfig {
    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<Object> noSuchElementException(NoSuchElementException e) {
        log.error(e.toString());
        return ResponseEntity.badRequest().body(e.getLocalizedMessage());
    }

    @ExceptionHandler({AccountException.class, CustomerException.class})
    public ResponseEntity<Object> accountException(RuntimeException e) {
        log.error(e.toString());
        return new ResponseEntity<>(e.getLocalizedMessage(), HttpStatus.CONFLICT);
    }
}
