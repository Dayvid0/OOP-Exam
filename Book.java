/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Matrix Computer Accs
 */
package balextranit;

public class Book {
    
    String title = ""; // Empty string for title

 
    String author = new String(); // Empty string for author

    public Book() {
       
}
    public static void main(String[] args) {
    Book book = new Book();
    System.out.println("Title: " + book.title);
    System.out.println("Author: " + book.author);
}
}
