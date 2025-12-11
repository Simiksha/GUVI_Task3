package GUVI_Task3.Incometax;

public class Employee implements Taxable {

    //Attributes of Employee class
    String empId;
    String name;
    double salary;

   //Constructor of Employee class 
    public Employee(String empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    //Implementing calTax method to claculate income tax on an employee
    public void calTax()
    {
        double tax = salary * (incomeTax/100);
        System.out.println("-----------------------------------------");
        System.out.println("Income Tax for " + this.name + " = " + tax);
        System.out.println("-----------------------------------------");
    }
}
