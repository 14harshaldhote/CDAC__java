/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignments.One;

class Library {

    private String LName;

    public Library(String LName) {
        this.LName = LName;
    }

    public class Book {
        private String title;

        public Book(String title) {
            this.title = title;
        }

        public void display() {
            System.out.println("Book '" + title + "' in " + LName + " library.");
        }
    }

    public class reader {
        private String name;

        public reader(String name) {
            this.name = name;
        }

        public void borrowBook(String bTitle) {
            Book borrowedBook = new Book(bTitle);
            borrowedBook.display();
            System.out.println(name + " borrowed the book '" + bTitle + "' from " + LName + " library.");
        }
    }

    public void displayBooks() {
        System.out.println("No books displayed, as this library doesn't maintain a list of books.");
    }
}



public class q7 {
    public static void main(String[] args) {
        Library myLibrary = new Library("My Library");

        
        
        Library.reader r1 = myLibrary.new reader("Abhaya");
        Library.reader r2 = myLibrary.new reader("Gione");

        r1.borrowBook("Java Programming");
        r2.borrowBook("Python for Beginners");
    }
}
    

