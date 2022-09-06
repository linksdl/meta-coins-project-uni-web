package com.meta.web.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class DemoController {

    @Autowired
    JdbcTemplate jct;

    @GetMapping("/userlist")
    public List<Map<String, Object>> userList(){
        String sql = "select * from student";
        List<Map<String, Object>> map = jct.queryForList(sql);
        return map;
    }

}
