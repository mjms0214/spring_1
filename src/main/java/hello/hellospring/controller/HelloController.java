package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/hello")
    public String Hello(Model model){
        model.addAttribute("data", "hello!!");
        // templates 폴더 내에서 "hello"라는 이름을 find
        return "hello";
    }
}
