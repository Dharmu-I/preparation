package com.preparation.design.kingdom.core;

import com.preparation.design.kingdom.enums.Gender;

public class Person {

    private String name;

    public Person(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    private Gender gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
