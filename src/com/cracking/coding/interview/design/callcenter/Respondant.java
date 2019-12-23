package com.cracking.coding.interview.design.callcenter;

class Respondent extends Employee {
    Respondent(String employeeId) {
        super(employeeId);
        rank = Rank.Respondent;
    }
}
