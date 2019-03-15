package net.cc.demo_springboot_webtemplate.web;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @classname HelloController
 * @author: zhonghua.zhi
 * @date: 2019-03-15 11:04
 * @version: 1.0
 * @description: TODO
 */
public class HelloController {

    @RequestMapping("/")
    public String sayHello(ModelMap modelMap) {

        modelMap.addAttribute("host", "http://www.google.com");
        return "index";
    }
}