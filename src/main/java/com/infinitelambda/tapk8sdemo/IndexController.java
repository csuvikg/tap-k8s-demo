package com.infinitelambda.tapk8sdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.UUID;

@Controller
public class IndexController {
    private final String environment;

    public IndexController() {
        this.environment = UUID.randomUUID().toString();
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("environment", environment);

        return "index";
    }
}
