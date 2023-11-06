package com.CK.lesson013.School.respository;

import com.CK.lesson013.School.entity.Student;
import com.CK.lesson013.School.utility.DataBase;

public class StudentRespository {

    public Student register(String name){

        Student student = new Student();
        student.name = name;
        student.schoolId = DataBase.getCountId();
        DataBase.studentList[student.schoolId] = student;
        System.out.println(name +" adlı öğreci başarı ile kayıt edildi öğrenci no ==> " +(student.schoolId+1));
        return student;
    }

}
