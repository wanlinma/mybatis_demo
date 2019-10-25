package com.asiainfo.mybatis_demo.mapper;

import com.asiainfo.mybatis_demo.entity.IdCard;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IdCardMapper {
//    -----------------------一对一 关联的嵌套 Select 查询--------------------
//    IdCard findIdCardById(@Param("idCardId") Integer idCardId);

    //     传入一个对象，执行插入，返回生成的主键
    Integer insertIDcard(@Param("idCard") IdCard idCard);

}
