package com.example.girl.handle;

import com.example.girl.domain.Result;
import com.example.girl.exception.GirlException;
import com.example.girl.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionHandler {

    private final static Logger logger = LoggerFactory.getLogger(ExceptionHandler.class);

    @org.springframework.web.bind.annotation.ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e) {
        if(e instanceof GirlException) {
            return ResultUtil.error(((GirlException) e).getCode(), e.getMessage());
        } else {
            logger.error("系统错误 {}", e);
            return ResultUtil.error(-1, "未知错误");
        }
    }

}
