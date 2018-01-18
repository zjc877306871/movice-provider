package com.zhang.springcould.service.impl;

import com.zhang.springcould.mapper.UserInfoMapper;
import com.zhang.springcould.service.MoviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by YJ on 2018/1/18.
 */
@Service
public class MoviceServiceImpl implements MoviceService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public String queryMovice(String id) {
        String name = userInfoMapper.selectUserInfo(id);
        return name;
    }
}
