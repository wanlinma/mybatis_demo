package com.asiainfo.mybatis_demo.mapper;

import com.asiainfo.mybatis_demo.entity.IdCard;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IdCardMapper {
    IdCard findIdCardById(@Param("idCardId") Integer idCardId);
}
