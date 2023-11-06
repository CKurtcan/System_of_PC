package com.CK.lesson012.HW;

public class Movie {

    String name;
    double rate;
    double yourRate;
    String[] labels;
    String[] actors;
    String director;
    String language;
    String country;
    int time;
    double[] points = new double[30];

    public void  addLabels(String label, int index){
        labels[index] = label;
    }

    public void addPoint(double point, int index){
        points[index] = point;
    }

    public void showInformation(Movie movie){
        System.out.println("Film Adı: " + movie.name);
        System.out.println("IMDb Puanı: " + movie.rate);
        System.out.println("Türler: " + String.join(", ", movie.labels));
        System.out.println("Dil: " + movie.language);
        System.out.println("Süre: " + movie.time + " dakika");
        System.out.println("Ülke: " + movie.country);
        System.out.println("Yönetmen: " + movie.director);
        System.out.println("Oyuncular: " + String.join(", ", movie.actors));
        System.out.println();
    }
}


