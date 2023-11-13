package org.example.lab6.LibraryInformationSystem;
//import org.apache.commons.lang3.StringUtils;


import java.util.ArrayList;
import java.util.Arrays;

public class Library {
    private ArrayList<Book> library;

    public Library(){
        this.library = new ArrayList<Book>();
    }

    public void addBook(Book newBook){
        this.library.add(newBook);
    }

    public void printBooks(){
        for (Book book : this.library){
            System.out.println(book);
        }
    }

    public ArrayList<Book> searchByTitle(String searchedTitle){
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book book : this.library){
            if (StringUtils.included(book.title(), searchedTitle)){
                found.add(book);
            }
        }
        return found;
    }

    public ArrayList<Book> searchByPublisher(String searchedPublisher){
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book book : this.library){
            if (StringUtils.included(book.publisher(), searchedPublisher)){
                found.add(book);
            }
        }
        return found;
    }

    public ArrayList<Book> searchByYear(int year){
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book book : this.library){
            if (book.year() == year){
                found.add(book);
            }
        }
        return found;
    }
}
