package com.duyi.controller;

import com.duyi.domain.Guest;
import com.duyi.service.GuestServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class GuestController {
    @Autowired
    private GuestServiceImp serviceImp;

    /**
     * 查询所有人员及其职称
     * @param model 返回给前端的内容
     * @return 返回index.html
     */
    @RequestMapping("/guest/index")
    public String index(Model model){
        List<Guest> guests = serviceImp.queryGuest();
        model.addAttribute("guests",guests);
        return "index";
    }

    /**
     * 添加一行信息
     * @return 返回一个add.html字符串
     */
    @RequestMapping("/guest/toAdd")
    public String toAdd(){
        return "add";
    }

    /**
     * 执行添加一行信息
     * @param guest 浏览器输入过来的信息
     * @return 重定向 添加后返回到index页面
     */
    @RequestMapping("/guest/add")
    public String add(Guest guest){
        //添加一行对象
        serviceImp.add(guest);
        return "redirect:/guest/index";
    }

    /**
     * 跳转到修改页面
     * @return 修改页面
     */
    @RequestMapping("/guest/toUpdate")
    public String toUpdate(Model model,String name){
        //通过dao找寻对应的对象
        Guest guest = serviceImp.guestFindByName(name);
        model.addAttribute("guest",guest);
        return "update";
    }
    @RequestMapping("/guest/update")
    public String update(Guest guest){
        serviceImp.update(guest);
        return "redirect:/guest/index";
    }
    @RequestMapping("/guest/delete")
    public String delete(String name){
        serviceImp.delete(name);
        return "redirect:/guest/index";
    }
}
