package com.CK.lesson013.School.utility;

import com.CK.lesson013.School.entity.Student;

public class DataBase {

    private static int countId = 0;
    public static Student[] studentList = new Student[20];

    public static int getCountId(){
        return countId++;
    }
}
