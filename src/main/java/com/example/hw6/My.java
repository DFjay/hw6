package com.example.hw6;

import com.google.gson.annotations.Expose;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class My {
    double price;
    Info info;
}

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
class Info {
    @Expose(serialize = false)
    int id;
    String date;
}

