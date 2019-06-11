package com.trimindtech.training1.Day8Day9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;




public class Catalog extends Book  {
    public static ArrayList<Book> books1 = new ArrayList<Book>();
    static Map<String,Book> bookMap= new HashMap<>();
    Scanner scanner = new Scanner(System.in);


   public  void addingBook(Book books){
       books1.add(books);
       System.out.println("enter the book name again");
       String bookName= scanner.next();
       bookMap.put(bookName,books);

        }




    /* public void AddingBook(Book b) {
        books1.add(b);
        System.out.println("books have been already added");
        System.out.println("enter the bookname");
        String bookname = scanner.next();
        bookMap.put(bookname, b);
    }*/
    public Map<String,Book>getAllBooks() {
        return bookMap;

    }
    public static void deleteBook(Book book){
        String name = book.getBooktitle();
        bookMap.remove(name);

    }
    public static Book searchBook(String bookname){
        if(!bookMap.containsKey(bookname)){
            System.out.println("the book  is not in the store");
        }else{
            Book b =bookMap.get(bookname);
            System.out.println("the book details are\n" + bookname.toString());
            return b;
        }
        return null;
    }



    @Override
    public String toString() {
        return "Catalog{" +
                "noOfBooksInCatalog=" +
                ", booktitle='" + getBooktitle() + '\'' +
                ", bookname='" + getBookname() + '\'' +
                ", isacodomic=" + isIsacodomic() +
                ", isbn=" + getIsbn() +
                ", totalbooks=" + getTotalbooks() +
                '}';
    }
}

