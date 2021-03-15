
package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class HelloController {
    @RequestMapping("/login")
    @ResponseBody
    public String login() {
        return "Hello, SpringBoot With Docker";
    }
    @RequestMapping("/test")
    @ResponseBody
    public String getData(){
        System.out.println("xuxiao");
        System.out.println("laopo");
        return "test branch";
    }
}


