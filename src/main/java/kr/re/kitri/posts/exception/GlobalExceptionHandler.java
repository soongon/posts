package kr.re.kitri.posts.exception;

import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
@RestController
public class GlobalExceptionHandler {

    @ExceptionHandler(ArithmeticException.class)
    public String handleAE() {
        return "0으로 나눴네요.. 조심하세요..";
    }

    @ExceptionHandler(BadSqlGrammarException.class)
    public Map<String, String> handleBadSqlGrammarException() {
        Map<String, String> errorMsg = new HashMap<>();
        errorMsg.put("errorCode", "00001");
        errorMsg.put("description", "잠시 시스템 점검중입니다.");
        return errorMsg;
    }
}
