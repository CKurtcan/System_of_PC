package com.CK.lesson013.LibaryApp.repository;

import com.CK.lesson013.LibaryApp.entity.Author;
import com.CK.lesson013.LibaryApp.entity.Book;
import com.CK.lesson013.LibaryApp.utility.Database;

public class BookRepository {

    public static void register(String name, int pageNum, String authorName){
        Book book = new Book();
        book.name = name;
        book.pageNum = pageNum;
        book.authorName = authorName;
        Database.bookList[Database.getBookCount()] = book;

        Author author = new Author();
        author.name = authorName;
        Database.authorList[Database.getAuthorCount()] = author;
    }
}
