package com.zhang.springcould.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/**
 * Created by YJ on 2018/1/18.
 */
@Component
public interface UserInfoMapper {

    @Select(value = "select tname from teacher where tId = #{tId}")
    public String selectUserInfo(@Param("tId") String id);
}
