package GUVI_Task3.Incometax;

import java.util.Scanner;

public class DriverMain {
    public static void main(String[] args) {

        String empId;
        String name;
        double salary;
        int pid, quantity;
        double price;
        String con = "yes";

        Scanner s = new Scanner(System.in);

        //Create a menu driven program using do while loop
        do {
            System.out.println("=====Tax calculation System=====");
            System.out.println();
            System.out.println("1. Calculate income tax");
            System.out.println("2. Calculate Sales tax");
            System.out.print("Choose an option: ");
            System.out.println();

            int choice = s.nextInt();
            s.nextLine();

            switch (choice) {
                //get the information from the user about an employee
                case 1:
                    System.out.println("****Enter Employee Details****");
                    System.out.print("Enter Id: ");
                    empId = s.next();
                    s.nextLine();
                    System.out.print("Enter Name: ");
                    name = s.nextLine();
                    System.out.print("Enter Salary: ");
                    salary = s.nextDouble();

                    //Object creation
                    Employee employee = new Employee(empId, name, salary);

                    //Method calling
                    employee.calTax();
                    break;

                //get the information from the user about a product
                case 2:
                    System.out.println("****Enter Product Details****");
                    System.out.print("Enter Id: ");
                    pid = s.nextInt();
                    System.out.print("Enter Price: ");
                    price = s.nextDouble();
                    System.out.print("Enter quantity: ");
                    quantity = s.nextInt();
                    
                    //Object creation
                    Product product = new Product(pid, quantity, price);
                    
                    //Method calling
                    product.calTax();
                    break;
            }
            System.out.println("Do you want to continue:(Yes/No)");
            con = s.next();
        } while (con.equalsIgnoreCase("Yes"));

    }
}
