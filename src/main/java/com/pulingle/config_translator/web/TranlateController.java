package com.pulingle.config_translator.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by 杨健 on 2018/3/31
 */

@RestController
public class TranlateController {
   @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/encrypt",method = RequestMethod.POST)
    public String encrypt(@RequestBody String text){
        String result=restTemplate.postForEntity("http://120.78.81.233:8762/encrypt",text,String.class).getBody();
        return result;
    }

    @RequestMapping(value = "/decrypt",method = RequestMethod.POST)
    public String decrypt(@RequestBody String text){
        String result=restTemplate.postForEntity("http://120.78.81.233:8762/decrypt",text,String.class).getBody();
        return result;
    }
}
