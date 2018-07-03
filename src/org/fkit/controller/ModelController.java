package org.fkit.controller;

import org.fkit.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author:Siyu
 * @Date:Created in 下午3:40 2018/7/2
 */
@Controller
@RequestMapping(value ="/user")
public class ModelController {
    @RequestMapping(value="/modelTest")
    public String modelTest(Model model){
        System.out.println("modelTest");
        User user = new User();
        // 设置user对象的username属性
        user.setUsername("疯狂软件");
        // 将User对象添加到Model当中
        model.addAttribute("user", user);
        return "result1";
    }

    @RequestMapping(value="/ModelMapTest")
    public String ModelMapTest(ModelMap modelMap){
        System.out.println("ModelMapTest");
        User user = new User();
        // 设置user对象的username属性
        user.setUsername("疯狂软件");
        // 将User对象添加到ModelMap当中
        modelMap.addAttribute("user", user);
        return "result2";
    }

}
