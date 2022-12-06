/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//Name: Muhammad Alfatih Olaniyan
//Class: CPSC 100
//UNBC ID:230148724
/**
 *
 * @author muham
 */
public class Employee {
    private String FirstName;
    private String LastName;
    private double Salary;
    
    //constructor
   

    public  Employee(String FirstName, String LastName, double Salary){
    this.FirstName= FirstName;
    this.LastName= LastName;
    if(Salary > 0){
    this.Salary=Salary;
}else
        Salary=0;
    }
    //Setters and Getters
    public String getFirstName(){
        return FirstName;
    }
    public String getLastName(){
        return LastName;
        
    }
    public double getSalary(){
        return Salary;
        
    }
    public void setLastName(String LastName){
        this.LastName=LastName;
    }
    public void setFirstName(String FirstName){
        this.FirstName= FirstName;
    }
    public void setSalary(double Salary){
        if(Salary>=0){
        this.Salary= Salary; // if the new salary is not negative then set it else do nothing.
        
    }     
    }
    //get the Yearly salary
    public double YearlySalary(double Salary){
        double YSalary= 12 * Salary;
        return YSalary;
    }
    //Raise the monnthly salary by a certin percentage
    public double Raise(double percentageraise, double Salary ){
        this.Salary= Salary + ((percentageraise/100)* Salary);
        return Salary;
    }
}
