package com.cracking.coding.interview.design.callcenter;

class Manager extends Employee {
    Manager(String employeeId) {
        super(employeeId);
        rank = Rank.Manager;
    }
}
