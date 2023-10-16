package dev.luuk.Web_Test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@RestController
public class TestController {

    @GetMapping
    public String test() {
        return "Hello, Render.";
    }

    @GetMapping("{name}")
    public String hello(@PathVariable String name) {
        return "Hello, " + name + ".";
    }

}
