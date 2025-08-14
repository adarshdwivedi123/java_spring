package com.genie.RestApp.dto;

public class Person {
    private String name;
    private String city;
    private String gender;
    private String age;
    private  String education;

    public Person(String name, String city, String gender, String age, String education) {
        this.name = name;
        this.city = city;
        this.gender = gender;
        this.age = age;
        this.education = education;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", gender='" + gender + '\'' +
                ", age='" + age + '\'' +
                ", education='" + education + '\'' +
                '}';
    }
}
