package com.genie.SpringMvcDemo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data                       // generates getters, setters, toString, equals, hashCode
@NoArgsConstructor          // generates a no-args constructor
@AllArgsConstructor         // generates an all-args constructor
public class Book {
    private String title;
    private String author;
}