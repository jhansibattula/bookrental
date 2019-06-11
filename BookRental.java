package com.trimindtech.training1.Day8Day9;

//import com.trimindtech.training.day5.Employee;

import java.util.Scanner;


public class BookRental {

    private static Catalog catalog = new Catalog();
    private static Borrower borrower = new Borrower();
    private static Scanner scannar = new Scanner(System.in);
    private static   fileUtil fu =new FileUtil();
    private  static   connection con =DBconnect.getCon();

    public static void printoptions() {

        System.out.println("welcome to the book rental system");
        System.out.println("enter 1 for adding book to the catalog");

        System.out.println("enter 2 for list of books in catalog ");

        System.out.println("enter 3 for searching book in  the catalog");

        System.out.println("enter 4 for deleting the book in catalog");

        System.out.println("enter 5 for the rental book");

        System.out.println("enter 6 for the returning a book");

        System.out.println("enter 7 for the print out brouser list");

        System.out.println(" enter 8 exit the program");

        System.out.println("enter any option that u want");

    }

    public static void main(String[] args) {

        printoptions();
        int enterOption = 0;
        enterOption = scannar.nextInt();

        do {

            switch (enterOption) {

                case 1:
                    addBooks();

                    break;

                case 2:
                    System.out.println(catalog.getAllBooks().toString());

                    break;

                case 3:
                    searchBook();

                    break;
                case 4:
                    deleteBook();

                default:
                    System.out.println("enter a valid bookname");
            }
            printoptions();
            enterOption = scannar.nextInt();

        } while (enterOption <= 9);

    }

    public static void printbookdatails(){
        System.out.println("data from collection");
        System.out.println(catalog.getAllBooks().toString());



        }






     //private static void printDetailsOfBook() {
    //ystem.out.println(Catalog.getallbooks().toString());
    //}

    //public static void printBorrowerList() {
    //System.out.println(borrower.getAllBorrowerList().toString());
    //}

    private static void addBooks() {
        Book b = new Book();
        System.out.println("enter the author name");
        String authourName = scannar.next();
        b.setBookname(authourName);

        System.out.println("enter the book title");
        String booktitle = scannar.next();
        b.setBooktitle(booktitle);

        System.out.println("enter the isbn");
        int isbn = scannar.nextInt();
        b.setIsbn(isbn);

        System.out.println("enter the iscaodomic or not");
        boolean isacodomic = scannar.nextBoolean();
        b.setIsacodomic(isacodomic);

        System.out.println("enter the totel no of books");
        int totlanumbr = scannar.nextInt();
        b.setTotalbooks(totlanumbr);
        scannar.nextLine();


        catalog.addingBook(b);
        System.out.println("the book has been added");
        System.out.println("the book details are \n" + b.toString());

    }

    public static Book searchBook() {
        System.out.println("enter the bookname that you want to search");
        String bookname = scannar.next();
        Book b = Catalog.searchBook(bookname);
        return b;

    }

    public static void deleteBook() {
        Book b = searchBook();
        if (b == null) {
            System.out.println("the book is not in the store");

        } else {
            Catalog.deleteBook(b);
            System.out.println("the book is deleted");
        }
    }

    public static void borrowerList() {
        BorrowerFile borrowerFile = new BorrowerFile();
        Scanner scannner = new Scanner(System.in);
        System.out.println("enter the book that you want to rent");
        String bookName = scannner.next();
        borrowerFile.setBookName(bookName);

        System.out.println("enter the first name");
        String firstName = scannner.next();
        borrowerFile.setFirstName(firstName);

        System.out.println("enter the last name");
        String lastName = scannner.next();
        borrowerFile.setLastName(lastName);

        System.out.println("entr the email id");
        String email = scannner.next();
        borrowerFile.setEmail(email);

        System.out.println("enter the n of rentaln days");
        int loanDays = scannner.nextInt();
        borrowerFile.setLoanDays(loanDays);

        System.out.println("enter the book isbn");
        int isbn = scannner.nextInt();
        borrowerFile.setIsbn(isbn);
        //borrower.addBorrower(borrowerFile);
    }
}

