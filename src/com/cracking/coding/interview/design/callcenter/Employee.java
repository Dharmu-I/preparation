package com.cracking.coding.interview.design.callcenter;

public abstract class Employee {

    private Call presentCall = null;

    protected Rank rank;

    protected String employeeId;

    public Employee(String employeeId){
        this.employeeId = employeeId;
    }

    public void receiveCall(Call call){
        this.presentCall = call;
    }

    public void  completeCall(Call call){
        CallHandler.getInstance().callQueue.get(call.getRank()).remove(call);
    }

    public void escalateCall(Call call){

    }

    public boolean assignCall(Call call){

        return true;
    }

    public boolean isFree(){
        return presentCall == null;
    }

    public Rank getRank(){

        return rank;
    }
}
