package com.cracking.coding.interview.design.callcenter;

public class Call {

    private Rank rank;

    private Caller caller;

    private Employee hadler;

    public Call(Caller caller){
        rank = Rank.Respondent;
        this.caller = caller;
    }

    public void setHadler(Employee employee){
        this.hadler = employee;
    }

    public Rank getRank(){
        return this.rank;
    }

    public void setRank(Rank rank){
        this.rank = rank;
    }

    public void disconnect(){

    }
}
