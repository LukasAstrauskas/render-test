package dev.luuk.Web_Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class TestController {

    @Autowired
    private KadaneService kadaneService;

    @GetMapping
    public String test() {
        return "Hello, Render.";
    }

    @GetMapping("{name}")
    public String hello(@PathVariable String name) {
        return "Hello, " + name + ".";
    }

    @PostMapping("sum")
    public int[] countMaxSum(@RequestParam List<Integer> array) {
        return kadaneService.findMaxSum(array);
    }

}
