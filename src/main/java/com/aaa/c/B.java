package com.aaa.c;

import com.aaa.service.Demo;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class B {
    @Reference
    private Demo demo;

    @RequestMapping("/a")
    @ResponseBody
    public String a(){
        return demo.aa();
    }
}
