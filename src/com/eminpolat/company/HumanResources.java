package com.eminpolat.company;

import com.eminpolat.employee.Employee;

public class HumanResources {
    //...
    public void payInsurance(Employee employee)
    {
        System.out.println("------------------------------------------------------------------");
        System.out.printf("Citizen Id:%s%n", employee.getCitizenId());
        System.out.printf("Name:%s%n", employee.getName());
        System.out.printf("Insurance Payment:%f%n", employee.calculateInsurancePayment());
        //...
        System.out.println("...");
        System.out.println("------------------------------------------------------------------");
    }
}
