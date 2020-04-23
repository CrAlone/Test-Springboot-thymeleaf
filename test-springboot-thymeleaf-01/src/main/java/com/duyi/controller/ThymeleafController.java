package com.duyi.controller;

import com.duyi.domian.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ThymeleafController {
    /**
     * 变量表达式
     */
    @RequestMapping("/tmf")
    public String demo(Model model){
        model.addAttribute("name","<p>陈大大</p>");
        return "/thymeleaf/index";
    }
    /**
     * 选择变量表达式
     */
    @RequestMapping("/person")
    public String demo2(Model model){
        Person p = new Person();
        p.setName("陈大大");
        p.setAge(18);
        p.setSex("男");
        model.addAttribute("p",p);
        return "/thymeleaf/person";
    }
    /**
     * url表达式
     */
    @RequestMapping("/welcome")
    public String demo3(){
        return "/thymeleaf/url";
    }
}
