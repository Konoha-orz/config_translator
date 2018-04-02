package com.pulingle.config_translator.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 杨健 on 2018/3/31
 */
@Controller
public class PageController {
    @RequestMapping(value = "/page")
    public String page(){
        return "page";
    }
}
