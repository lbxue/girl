package com.example.girl.service;

import com.example.girl.domain.Girl;
import com.example.girl.enums.ResultEnum;
import com.example.girl.exception.GirlException;
import com.example.girl.repository.GirlRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GirlService {

    private final static Logger logger = LoggerFactory.getLogger(GirlService.class);

    @Autowired
    private GirlRepository girlRepository;

    public void getAge(Integer id) throws Exception{
        Girl girl = girlRepository.getOne(id);
        Integer age = girl.getAge();
        if(age <= 10) {
            //返回“你还在上小学吧”
            logger.info("你还在上小学吧");
            throw new GirlException(ResultEnum.PRIMARY_SCHOOL);
        } else if(age > 10 && age < 16) {
            //返回 “你在上÷中吧”
            logger.info("你在上÷中吧");
            throw new GirlException(ResultEnum.MIDDLE_SCHOOL);
        }
    }

    /**
     * 根据id获取一个女生信息
     * @param id
     * @return
     */
    public Girl findOne(Integer id) {
        return girlRepository.getOne(id);
    }
}
