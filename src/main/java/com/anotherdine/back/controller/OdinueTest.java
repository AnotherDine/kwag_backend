package com.anotherdine.back.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/odinue")
public class OdinueTest {

    @PostMapping("/success")
    public ResponseEntity success() {
        return ResponseEntity.ok().build();
    }

    @PostMapping("/fail")
    public ResponseEntity fail() {
        return ResponseEntity.ok().build();
    }
}
