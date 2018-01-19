package com.zhang.springcould.mapper;

import com.zhang.springcould.entity.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/**
 * Created by YJ on 2018/1/18.
 */
@Component
public interface UserInfoMapper {

    @Select(value = "select tname from teacher where tId = #{tId}")
    public Teacher selectUserInfo(@Param("tId") String id);
}
