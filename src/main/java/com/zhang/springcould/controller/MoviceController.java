package com.zhang.springcould.controller;

import com.zhang.springcould.entity.Teacher;
import com.zhang.springcould.service.MoviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by YJ on 2018/1/18.
 */
@RestController
public class MoviceController {


    @Autowired
    private MoviceService moviceService;

    /**
     * 查询信息
     * @return
     */
    @RequestMapping("/movice/{id}")
    public Teacher queryUserInfo(@PathVariable String id){
        Teacher name = moviceService.queryMovice(id);
        return name;
    }
}
