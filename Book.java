

package com.trimindtech.training1.Day8Day9;

public class Book {

    private String booktitle;
    private String bookname;
    private boolean isacodomic;
    private int isbn;
    private int totalbooks;

    public Book() {
    }

    public Book(String booktitle, boolean isacodomic, String bookname, int isbn, int totalbooks) {
        this.booktitle = booktitle;
        this.isacodomic = isacodomic;
        this.bookname = bookname;
        this.isbn = isbn;
        this.totalbooks = totalbooks;
    }

    public String getBooktitle() {
        return booktitle;
    }

    public void setBooktitle(String booktitle) {
        this.booktitle = booktitle;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public boolean isIsacodomic() {
        return isacodomic;
    }

    public void setIsacodomic(boolean isacodomic) {
        this.isacodomic = isacodomic;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getTotalbooks() {
        return totalbooks;
    }

    public void setTotalbooks(int totalbooks) {
        this.totalbooks = totalbooks;
    }

    @Override
    public String toString() {
        return "Book{" +
                "booktitle='" + booktitle + '\'' +
                ", bookname='" + bookname + '\'' +
                ", isacodomic=" + isacodomic +
                ", isbn=" + isbn +
                ", totalbooks=" + totalbooks +
                '}';
    }

}
