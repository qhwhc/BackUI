package com.ccc.auimodel.controller;

import com.ccc.auimodel.pojo.WebMenu;
import com.ccc.auimodel.service.WebMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class WebMenuController {
    @Autowired
    WebMenuService webMenuService;

    /*菜单跳转*/
    @RequestMapping("index")
    public String jumpTo(@RequestParam(required = false) String jumpto, Model model){
        /*菜单查询*/
        List<WebMenu> webMenuList = webMenuService.findAll();
        StringBuilder webMenu = new StringBuilder();
        for(com.ccc.auimodel.pojo.WebMenu WebMenu:webMenuList){
            webMenu.append(WebMenu);
    }
        model.addAttribute("webMenu",webMenu.toString());
        return jumpto;
    }

}
