package se.lexicon.java_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String getToIndex() {
        System.out.println("navigate to index");
        return "index";
    }

    @GetMapping("/store")
    public String getToStore() {
        System.out.println("navigate to store");
        return "store";
    }
}
