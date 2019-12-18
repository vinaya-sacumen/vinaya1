package com.vinaya.employeeapplication.api;

import com.vinaya.employeeapplication.Service.Employeeservice;
import com.vinaya.employeeapplication.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/employee")
public class employeeResource {
    @Autowired
    private Employeeservice employeeService;
    @RequestMapping
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }
    @RequestMapping("/hell")
    public List<Employee> getEmployees(){
        return employeeService.getEmployees();
    }
    @GetMapping(value="/(empid)")
    public Employee getEmployee(@PathVariable("empid") int empid){
        return employeeService.getEmployee(empid);
    }



}
