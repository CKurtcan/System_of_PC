package com.CK.lesson013.LibaryApp.utility;

import com.CK.lesson013.LibaryApp.entity.Author;
import com.CK.lesson013.LibaryApp.entity.Book;

public class Database {

    public static int bookCount = 0;

    public static int authorCount = 0;

    public static Book[] bookList = new Book[120];

    public static Author[] authorList = new Author[20];

    public static int getBookCount(){
        return bookCount++;
    }

    public static int getAuthorCount(){
        return authorCount++;
    }

}
