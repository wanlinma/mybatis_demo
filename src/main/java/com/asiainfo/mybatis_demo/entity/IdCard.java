package com.asiainfo.mybatis_demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IdCard {
    private Integer idCardId;
    private String idCardNumber;
}
