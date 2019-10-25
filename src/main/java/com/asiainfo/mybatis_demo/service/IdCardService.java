package com.asiainfo.mybatis_demo.service;

import com.asiainfo.mybatis_demo.entity.IdCard;
import com.asiainfo.mybatis_demo.mapper.IdCardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IdCardService implements IdCardMapper {

    @Autowired
    private IdCardMapper idCardMapper;

    @Override
    public Integer insertIDcard(IdCard idCard) {
        return idCardMapper.insertIDcard(idCard);
    }
}
