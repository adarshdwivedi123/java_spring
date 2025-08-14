package com.genie.RestApp.service;

import com.genie.RestApp.dto.Person;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PersonService {
    List<Person> getAllPersondata();
    List<Person>filterDataBasedOnGen(List<Person>personList);
}
