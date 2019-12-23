package com.cracking.coding.interview.design.callcenter;

import java.util.*;

public class CallHandler {

    private static CallHandler callHandler = null;

    private final int LEVELS = 3;

    private final int NUMBER_OF_RESPONDANTS = 10;

    private final int NUMBER_OF_MANAGERS = 4;

    private final int NUMBER_OF_DIRECTORS = 2;

    Map<Rank,List<Employee>> employeeLevels;

    Map<Rank,List<Call>> callQueue;

    public static CallHandler getInstance(){
        if (callHandler == null){
            callHandler = new CallHandler();
        }

        return callHandler;
    }

    private CallHandler(){
        loadAllEmployeeDetails();
    }

    private void loadAllEmployeeDetails() {
        List<Employee> directorList = new ArrayList<>();
        List<Employee> managerList = new ArrayList<>();
        List<Employee> respondentList = new ArrayList<>();

        int incrementer = 1;
        while (incrementer <=  NUMBER_OF_DIRECTORS){
            directorList.add(new Director("Director-"+incrementer));
            incrementer++;
        }

        incrementer = 1;
        while (incrementer <=  NUMBER_OF_MANAGERS){
            managerList.add(new Manager("Manager-"+incrementer));
            incrementer++;
        }

        incrementer = 1;
        while (incrementer <=  NUMBER_OF_RESPONDANTS){
            respondentList.add(new Respondent("Respondent-"+incrementer));
            incrementer++;
        }

        employeeLevels.put(Rank.Director, directorList);
        employeeLevels.put(Rank.Manager, managerList);
        employeeLevels.put(Rank.Respondent, respondentList);
    }

    public Employee getHandlerForCall(){

        return null;
    }

    /* Route a call to minimal rank employee */
    public void dispatchCall(Call call){
        List<Employee> respondentList = employeeLevels.get(Rank.Respondent);
        for (Employee employee: respondentList){
            if (employee.isFree()){
                employee.assignCall(call);
                break;
            }
        }
    }

    public void assignCall(Employee employee){

    }

    public static void main(String[] args) {

    }
}
