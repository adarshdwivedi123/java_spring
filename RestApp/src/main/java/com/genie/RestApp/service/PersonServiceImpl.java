package com.genie.RestApp.service;

import com.genie.RestApp.dto.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonServiceImpl implements  PersonService{
    Person Amit =new Person("amit","delhi","m","23","betech");
    Person sumit =new Person("amit","delhi","F","23","betech");
    Person neha =new Person("amit","delhi","m","23","betech");

     List<Person>personList =new ArrayList<>();

     @Value("${user.gender}")
     String userGender;
    @Override
    public List<Person> getAllPersondata() {
        personList.add(Amit);
        personList.add(sumit);
        personList.add(neha);
        return  personList;


    }

    @Override
    public List<Person> filterDataBasedOnGen(List<Person> personList) {
        List<Person>per =new ArrayList<>();
        for(Person  obj :personList)
        {
            if(!userGender.equalsIgnoreCase((obj.getGender())))
            {
                per.add(obj);
            }
        }
        return per;
    }
}
