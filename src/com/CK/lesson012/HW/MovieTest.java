package com.CK.lesson012.HW;

import com.CK.lesson012.HW.Movie;

/*
Filmin bilgilerini gösteren metot
 */
public class MovieTest {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.name = "Mr Nobody";
        movie.rate = 8.5;
        String[] arrayL = {"Düşündürücü", "Bilim Kurgu", "Fantastik"};
        String[] arrayA = {"Jared Leto", "Sarah Polley"};
        movie.language = "İngilizce";
        movie.time = 141;
        movie.country = "Belçika";
        movie.director = "Jaco Van Dormael";
        movie.addPoint(9,0);
        movie.addPoint(10,1);
        movie.labels = arrayL;
        movie.actors = arrayA;
        System.out.println();


        Movie movie1 = new Movie();
        movie1.name = "The Big Labowski";
        movie1.rate = 7.9;
        String[] array = {"Kült", "Komik", "Aksiyon"};
        movie1.language = "İngilizce";
        movie1.time = 117;
        movie1.country = "ABD";
        movie1.director = "";
        movie1.addPoint(6.5,0);
        movie1.addPoint(8.5,1);
    }
}
