package me.valkyrja.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ResponseBodyController {
//    Simple method, returns String
    @RequestMapping(value = "/saveResult")
    @ResponseBody
    public String authorInfo(Model model){
        return "saved";
    }
}
