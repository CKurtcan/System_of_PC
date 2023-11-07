package com.CK.lesson013.School;

import com.CK.lesson013.School.entity.Student;
import com.CK.lesson013.School.respository.StudentRespository;
import com.CK.lesson013.School.utility.DataBase;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();

        StudentRespository repository1 = new StudentRespository();

        Student student1 = repository1.register("Denizhan");
        Student student2 = repository1.register("Can");

    }
}
