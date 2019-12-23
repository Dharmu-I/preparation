package com.cracking.coding.interview.design.callcenter;

public enum Rank {

    Respondent(0),
    Manager(1),
    Director(2);

    private Integer value;

    Rank(int value) {
        this.value = value;
    }
}
