package com.example.hw6;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.Map;


@Controller
public class MyController {

    @GetMapping(value = "/myHeaders")
    public ResponseEntity<String> listAllHeader(@RequestHeader Map<String, String> headers) {
        return new ResponseEntity<>(headers.toString(), HttpStatus.OK);
    }
}
