package org.maogogo.apm.common.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
//@Slf4j
public class ExceptionControllerAdvice {

//    @ExceptionHandler(Throwable.class)
//    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
//    public ErrorResult handleOtherException(Throwable e) {
//        RestControllerAdvice
//        return new ErrorResult(ErrorCode.UNKNOWN, e.getMessage());
//    }
//
//    @ExceptionHandler(ResourceAccessException.class)
//    @ResponseStatus(HttpStatus.NOT_FOUND)
//    public ErrorResult handleResourceNotFoundException(ResourceAccessException e) {
//        logger.error(e.getMessage(), e);
//        return new ErrorResult(ErrorCode.RESOURCE_NOT_FOUND, e.getMessage());
//    }

}
