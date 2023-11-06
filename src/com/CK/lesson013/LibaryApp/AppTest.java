package com.CK.lesson013.LibaryApp;

import com.CK.lesson013.LibaryApp.entity.Author;
import com.CK.lesson013.LibaryApp.entity.Book;
import com.CK.lesson013.LibaryApp.utility.Database;

import java.util.Arrays;
import java.util.Scanner;

/*
1- Kütüphanemiz olacak kutuphaneyi (database gibi düşüneceğiz)
2- Kitaplarımız olacak
3- Yazarlarımız olacak
 */
public class AppTest {
    public static void main(String[] args) {
        System.out.println("*************************");
        System.out.println("LIBARY APP'A HOŞ GELDINIZ");
        System.out.println("*************************");
        System.out.println("Lütfen yapmak istediğiniz işlemi seçin...: ");
        System.out.println("1- Kitap Ekle");
        System.out.println("2- Kitap Çıkar");
        System.out.println("3- Kitapları Listele");
        System.out.println("4- Kitap Bul");
        System.out.println("5- Yazar İsmine Göre Kitap Bul");
        System.out.println("0- Çıkış");
        int secim = new Scanner(System.in).nextInt();
        switch (secim){
            case 1:  break;
            case 2:  break;
            case 3:  break;
            case 4: showBook(); break;
            case 5: showBook(); break;
            case 0:
                System.out.println("Çıkıkş Yapıldı"); break;
            default: break;
        }
    }

    public static void showAuthor(String authorName){
        for (int i = 0; i < Database.authorList.length; i++){
            if (authorName.equals(Database.authorList[i])){
                Author author = new Author();
                System.out.println(author.name);
                System.out.println(author.birthDate);
                System.out.println(author.nation);
                System.out.println(Arrays.toString(author.book));
            }
        }
    }

    public static void showBook(String bookName){
        for (int i = 0; i < Database.bookList.length; i++){
            if (bookName.equals(Database.bookList[i])){
                Book book = new Book();
                System.out.println(book.name);
                System.out.println(book.authorName);
                System.out.println(book.pageNum);
            }
        }
    }
}
