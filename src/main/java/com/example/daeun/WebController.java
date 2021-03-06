package com.example.daeun;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebController {
    @GetMapping("/")
    @ResponseBody
    public String main(){
        return "<a href=\"https://github.com/\">github.com</a>";
    }

    @PostMapping("/")
    @ResponseBody
    public String mainPost() {
        return "<a href=\"https://github.com/\">github.com</a>";
    }
}
