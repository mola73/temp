/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
Make a display method 

/**
 *
 * @author muham
 */
public class EmployeeTest {
    public static void main(String[]args){
        Employee A= new Employee("Mark", "Evan", 1000);
        Employee B= new Employee("Kevin", "Sanders", 2000);
        
        System.out.printf("This is %s %s's yearly salary : $%3f %n", A.getFirstName(),A.getLastName(),A.YearlySalary(A.getSalary()));
        System.out.printf("This is %s %s's yearly salary : $%3f %n", B.getFirstName(),B.getLastName(),B.YearlySalary(B.getSalary()));
        
       A.setSalary(A.getSalary()+(0.1*A.getSalary()));// set the monthy salary to 10% greater of Employee A
       B.setSalary(B.getSalary()+(0.1*B.getSalary()));// set the monthy salary to 10% greater of Employee B
       
       System.out.println();
               
       
       System.out.printf("This is %s %s's yearly salary : $%3f %n", A.getFirstName(),A.getLastName(),A.YearlySalary(A.getSalary()));
        System.out.printf("This is %s %s's yearly salary : $%3f %n", B.getFirstName(),B.getLastName(),B.YearlySalary(B.getSalary()));
    }
}
