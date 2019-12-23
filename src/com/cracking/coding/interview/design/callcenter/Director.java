package com.cracking.coding.interview.design.callcenter;

class Director extends Employee {
    Director(String employeeId) {
        super(employeeId);
        rank = Rank.Director;
    }
}
