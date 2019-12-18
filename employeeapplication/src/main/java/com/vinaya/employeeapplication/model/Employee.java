package com.vinaya.employeeapplication.model;

public class Employee {
    private int empid;
    private String empEmailid;
    private int empno;

    public int getEmpid() {
        return empid;
    }

    public int getEmpno() {
        return empno;
    }

    public String getEmpEmailid() {
        return empEmailid;
    }

    public void setEmpEmailid(String empEmailid) {
        this.empEmailid = empEmailid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }
}
