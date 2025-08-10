package com.example.demo.exception;

import com.example.demo.pojo.ResponseMessage;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice  //用作统一处理
public class GlobalExceptionHandlerAdvice {
    Logger logger = LoggerFactory.getLogger(GlobalExceptionHandlerAdvice.class);
    @ExceptionHandler(value = Exception.class)  //指定处理的异常类型，value = Exception.class标识为所有的异常都做这个处理
    public ResponseMessage<Object> exceptionHandler(Exception e, HttpServletRequest request, HttpServletResponse response){
        logger.error(e.getMessage());
        // 提取所有错误的 defaultMessage
        return new ResponseMessage<>(500,e.getMessage(),null);
    }
}
