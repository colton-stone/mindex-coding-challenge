package com.mindex.challenge.data;

import java.sql.Date;

/**
 * Compensation class
 * Class for getting the compensation and effective date of an employee.
 * For this and ReportingStructure I stopped here, I was a bit confused by 
 * some of the instructions but tried to do what I could. 
 * Having never worked on something like this, I did some research and found some others
 * doing it several ways online, but this was all that I knew how to do. 
 * I've writtten methods that I believe would give the values being asked for, but I 
 * do not think they are implemented correctly. I would love for someone to walk through this with me so 
 * I could see how to make them function effectively. 
 */
public class Compensation extends Employee{
    private Employee employee;
    private int salary;
    private Date effectiveDate;

    public Compensation(Employee e, int s, Date ED){
        this.employee = e;
        this.salary = s;
        this.effectiveDate = ED;
    }

    public String getEmployeeId(){
        return this.employee.getEmployeeId();
    }
    
    public int getCompensation(){
        return this.salary;
    }

    public Date getEffectiveDate(){
        return this.effectiveDate;
    }

    // return our compenstaion for said employee
    public void setCompensation(int comp){
        this.salary = comp;
    }

    
}
