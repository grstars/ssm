package orange.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @RequestMapping("/save")
    //只跳转,无数据
    public String save(){
        System.out.println("UserController");
        return "success";
    }
}
