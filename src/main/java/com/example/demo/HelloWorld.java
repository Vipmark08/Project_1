package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;
import java.util.*;

@RestController
@RequestMapping("/test")
public class HelloWorld {

    // 1) current time
    @GetMapping("/time")
    public String getCurrentTime() {

        return LocalDateTime.now().toString();


    }

    // 2) from 1 to n
    @GetMapping("/numbers")
    public List<Integer> getNumbers(@RequestParam int n) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }
        return numbers;
    }

    // 3) random
    @GetMapping("/random")
    public int getRandomNumber() {
        return new Random().nextInt(500) + 1;
    }

    // 4) fibonacci
    @GetMapping("/fibonacci")
    public long getFibonacci(@RequestParam int n) {
        return fibonacci(n);
    }

    private long fibonacci(int n) {
        if (n <= 1) return n;
        long prev = 0, current = 1;
        for (int i = 2; i <= n; i++) {
            long next = prev + current;
            prev = current;
            current = next;
        }
        return current;
    }

    // 5) reverse
    @GetMapping("/reverse")
    public String reverseString(@RequestParam String input) {
        return new StringBuilder(input).reverse().toString();
    }
}

