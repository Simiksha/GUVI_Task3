package GUVI_Task3.LibraryManagement;

public class Library {

    private Book[] books;

    public Library() {
        this.books = new Book[5];
    }

    //Methos to add book to the library
    public void addBook(Book book)
    {
        boolean added = false;
        for(int i=0; i<books.length; i++)
        {
            if(books[i] == null)
            {
                books[i] = book;
                System.out.println("----------------------------------------------");
                System.out.println("Book added successfully");
                System.out.println("----------------------------------------------");
                added = true;
                break;
            }
        }
        if(!added)
        {
            System.out.println("----------------------------------------------");
            System.out.println("Library is full");
            System.out.println("----------------------------------------------");
        }
    }

    //Method to issue book form the library
    public void removeBook(String bookID)
    {
        for(int i=0; i<books.length; i++)
        {
            if(books[i] != null && books[i].getBookID().equals(bookID))
            {
                if(books[i].isAvailable())
                {
                    books[i].setAvailable(false);
                    System.out.println("----------------------------------------------");
                    System.out.println("Book issued successfully");
                    System.out.println("----------------------------------------------");
                }
                else{
                    System.out.println("----------------------------------------------");
                    System.out.println("Book not available");
                    System.out.println("----------------------------------------------");
                }
                return;
            }
        }
        System.out.println("----------------------------------------------");
        System.out.println("Book not found");
        System.out.println("----------------------------------------------");
    }

    //methos to display all the available books in the library
    public void displayBooks()
    {
        boolean available = false;
        for(int i=0; i<books.length; i++)
        {
            if(books[i] != null && books[i].isAvailable())
            {
                System.out.println("Book Id : " + books[i].getBookID());
                System.out.println("Title : " + books[i].getTitle());
                System.out.println("Author : " + books[i].getAuthor());
                System.out.println();
                available = true;
            }
        }
        if(!available)
        {
            System.out.println("----------------------------------------------");
            System.out.println("No books in the library");
            System.out.println("----------------------------------------------");
        }
    }
    
}
