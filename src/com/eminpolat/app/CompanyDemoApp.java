package com.eminpolat.app;

import com.eminpolat.company.EmployeeFactory;
import com.eminpolat.company.HumanResources;
import com.eminpolat.employee.Employee;
import com.eminpolat.util.ThreadUtil;

public class CompanyDemoApp {
    private static void run()
    {
        HumanResources humanResources = new HumanResources();
        EmployeeFactory factory = new EmployeeFactory();

        for (;;) {
            Employee employee = factory.getRandomEmployee();

            humanResources.payInsurance(employee);
            ThreadUtil.sleep(4000);
        }
    }

    public static void main(String[] args)
    {
        run();
    }
}