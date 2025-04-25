package com.example.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class RecommendController {

    @GetMapping("/recommend")
    public Map<String, String> recommend() {
        Map<String, String> result = new HashMap<>();
        result.put("상품", "우리은행 신용대출");
        result.put("금리", "3.2%");
        return result;
    }
}
