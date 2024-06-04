package com.anotherdine.back.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/odinue")
@Slf4j
public class OdinueTest {

    @PostMapping("/success")
    public ResponseEntity success() {
        return ResponseEntity.ok().build();
    }

    @PostMapping("/fail")
    public ResponseEntity fail() {
        return ResponseEntity.internalServerError().build();
    }
}
