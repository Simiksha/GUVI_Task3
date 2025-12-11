package GUVI_Task3.LibraryManagement;

import java.util.Scanner;

public class BookManagementSystem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //created object of the library class
        Library library = new Library();

        int option;
        String bookID, author, title;
        String repeatMenu = "Yes";

        //Menu-driven user interface to interact with the library system
        do{
            System.out.println("***Welcome to GUVI Library***");
            System.out.println("1. Add Book \n2. remove Book \n3. Display Book");
            System.out.print("Select one option: ");
            option = s.nextInt();
            s.nextLine();

            switch(option)
            {
                //case 1 allows user to add book
                case 1:
                    System.out.println("----------------------------------------------");
                    System.out.print("Enter Book Id: ");
                    bookID = s.nextLine();
                    System.out.print("Enter Title: ");
                    title = s.nextLine();
                    System.out.print("Enter Author Name: ");
                    author = s.nextLine();
                    Book book = new Book(bookID,title,author);
                    library.addBook(book);
                    break;

                //case 2 allows user to issue book    
                case 2:
                    System.out.println("----------------------------------------------");
                    System.out.print("Enter the Book Id that you want to remove: ");
                    bookID = s.next();
                    library.removeBook(bookID);
                    break;

                //case 3 allows user to display all the books
                case 3:
                    System.out.println("----------------------------------------------");
                    System.out.println();
                    System.out.println("Currently available books in library:");
                    library.displayBooks();
                    break;

                //default method when user enters a wrong option
                default:
                    System.out.println("----------------------------------------------");
                    System.out.println("Choose the right option");
                    System.out.println("----------------------------------------------");
                    break;    
            }
            System.out.println("Do you want to continue? (Yes/No)");
            repeatMenu = s.next();

        }while(repeatMenu.equalsIgnoreCase("Yes"));
        System.out.println("Thank you!");
    }
}
