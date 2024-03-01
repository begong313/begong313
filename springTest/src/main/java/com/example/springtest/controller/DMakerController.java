package com.example.springtest.controller;

import com.example.springtest.dto.CreateDeveloper;
import com.example.springtest.service.DMakerService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class DMakerController {
    private final DMakerService dMakerService;

    @GetMapping("/developers")
    public List<String> getAllDevelopers() {
        log.info("GET /developers http/1.1");

        return Arrays.asList("a", "e", "s");
    }

    @PostMapping("/create-developers")
    public List<String> createDevelopers(@Valid @RequestBody CreateDeveloper.Request request) {
        log.info("GET /create-developers http/1.1");
        log.info("request : {}", request);


        dMakerService.createdDeveloper(request);
        return List.of("olaf");
    }
}
