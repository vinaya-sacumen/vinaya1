package com.vinaya.employeeapplication.Service;

import com.vinaya.employeeapplication.model.Employee;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
@Component
public class Employeeservice {
   private int empidcont=1;
    private List<Employee> employeeList=new CopyOnWriteArrayList<>();
    public Employee addEmployee(Employee employee)
    {
        employee.setEmpid(empidcont);

        employeeList.add(employee);
       empidcont++;
        return employee;
    }
    public List<Employee> getEmployees()
    {
        return employeeList;
    }
    public Employee getEmployee(int empid)
    {
        return employeeList
                .stream()
                .filter(c-> c.getEmpid()==empid)
                .findFirst()
                .get();
    }
    public Employee updateEmployee(int empid,Employee employee)
    {
         employeeList
                 .stream()
                 .forEach(c -> {
                     if(c.getEmpid()==empid){
                         c.setEmpno(employee.getEmpno());
                         c.setEmpEmailid(employee.getEmpEmailid());
                     }
    });
         return employeeList
                 .stream()
                 .filter(c-> c.getEmpid()==empid)
                 .findFirst()
                 .get();

    }
}
