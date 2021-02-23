package demo.srammy.exceptionhandler.advice;

import demo.srammy.exceptionhandler.exception.CustomException;
import demo.srammy.exceptionhandler.exception.MissQueryParameterException;
import demo.srammy.exceptionhandler.vo.ResponseCode;
import demo.srammy.exceptionhandler.vo.ResponseVo;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestControllerAdvice
public class ExceptionControllerAdvice {
    @ExceptionHandler(Exception.class)
    public ResponseVo GlobalExceptionHandler(HttpServletRequest req, HttpServletResponse rsp, Exception e){
        ResponseVo rv = new ResponseVo();
        if (e instanceof CustomException) {
            rv = ((CustomException) e).getResponseVo();
        } else if (e instanceof MissQueryParameterException) {
            rv = ((MissQueryParameterException) e).getResponseVo();
        } else {
            rv = rv.setResponseCode(ResponseCode.NOT_FOUND.code()).setResponseMessage("不存在");
        }

        return rv;
    }
}
