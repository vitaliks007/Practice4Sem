package ru.vitaliy.task11;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/HelloWorld")
public class HelloController {
    @GetMapping
    public String printHW() {
        return "HelloWorld";
    }
}
