package com.asiainfo.mybatis_demo.controller;

import com.asiainfo.mybatis_demo.entity.IdCard;
import com.asiainfo.mybatis_demo.service.IdCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/id_card")
public class IdCardController {
    @Autowired
    private IdCardService idCardService;

    @GetMapping("/add")
    public ResponseEntity add(@RequestBody  IdCard idCard){
//        添加身份证，然后返回自增主键
        idCardService.insertIDcard(idCard);
        return ResponseEntity.ok().body(idCard.getIdCardId());
    }
}
