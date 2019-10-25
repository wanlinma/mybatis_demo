package com.asiainfo.mybatis_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Controller
public class ErrorController {

    @RequestMapping("not_fund")
    @ResponseBody
    public Map<String, String> getErrorStatus() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("code", "404");
        return map;
    }
}
