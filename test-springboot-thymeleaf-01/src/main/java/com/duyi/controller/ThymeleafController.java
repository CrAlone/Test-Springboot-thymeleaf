package com.duyi.controller;

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
    @ResponseBody
    public String demo(Model model){
        model.addAttribute("name","陈大大");
        return "/thymeleaf/index.html";
    }
}
