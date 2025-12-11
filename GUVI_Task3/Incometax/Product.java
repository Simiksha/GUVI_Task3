package GUVI_Task3.Incometax;

public class Product implements Taxable {

    //Attributes of Product class
    int pid, quantity;
    double price;

    //Constructor of product class
    public Product(int pid, int quantity, double price) {
        this.pid = pid;
        this.quantity = quantity;
        this.price = price;
    }

    //Implementing calTax method to claculate sales tax for a product
    public void calTax()
    {
        double totalPrice = price * quantity;
        double tax = totalPrice * (salexTax/100);
        System.out.println("----------------------------------------------");
        System.out.println("Sales tax for Product Id " + this.pid + " = " + tax);
        System.out.println("----------------------------------------------");
    }
}
