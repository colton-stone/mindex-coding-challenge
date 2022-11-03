package com.mindex.challenge.data;

import java.util.List;

/**
 * Reporting Structure Class
 * Class for the reporting structure, has methods for number of reports and employee ID
 * Again, wasn't entirely sure on full implementation but tried to write a method that would still
 * do what was being asked. I was having some issues with the Gradle so this has not been 
 * tested and I'm sure there are errors, but I wanted to have something to show either way. 
 */
public class ReportingStructure extends Employee{
    private int numberOfReports;
    private Employee employee;

    public ReportingStructure(Employee e, int reportNums){
        this.numberOfReports = reportNums;
    }

    public int getNumberOfReports(){
        return this.numberOfReports;
    }
    public String getEmployeeId(){
        return employee.getEmployeeId();
    }

        // Set reports according to number of people who report underneath given employee. 
        // Doesn't currently check if they are disctinct but could be implimented.
    public void setNumberOfReports(Employee id){
        List<Employee> directReports = id.getDirectReports();
        int numberDirectReports = directReports.size();
        for(int i = 0; i < numberDirectReports; i++){
            this.numberOfReports++;
            if(directReports.get(i).getDirectReports().size() != 0){
                setNumberOfReports(id);
            }
        }
    }
}
