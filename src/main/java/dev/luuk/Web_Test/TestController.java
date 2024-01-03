package dev.luuk.Web_Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
        int[] answer = kadaneService.findMaxSum(array);
//        int sum = array.stream().reduce(0, Integer::sum);
        return answer;
    }

}
