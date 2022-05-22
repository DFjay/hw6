package com.example.hw6;

import com.google.gson.Gson;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class MySecondController {

    @PostMapping(value = "/createPerson", consumes = "application/json", produces = "application/json")
    public ResponseEntity<String> createPerson(@RequestBody String body) {
        Gson g = new Gson();
        My my = g.fromJson(body, My.class);
        Info info = my.getInfo();
        info.setId(123);
        my.setInfo(info);
        return new ResponseEntity<>(g.toJson(my), HttpStatus.OK);
    }
}
