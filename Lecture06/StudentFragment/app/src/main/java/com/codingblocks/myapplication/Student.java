package com.codingblocks.myapplication;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by harshit on 24/09/17.
 */
@Getter
@Setter
public class Student {
    private String name,number,city,batch,course;

    public Student(String name, String number, String city, String batch, String course) {
        this.name = name;
        this.number = number;
        this.city = city;
        this.batch = batch;
        this.course = course;
    }

    public static ArrayList<Student> getStudents(){

        ArrayList<Student> arrayList = new ArrayList<>();

        arrayList.add(new Student("Test","12345678","Delhi","Pandora","Blah"));
        arrayList.add(new Student("Test2","12345678","Delhi","Pandora","Blah"));
        arrayList.add(new Student("Test3","12345678","Delhi","Pandora","Blah"));
        arrayList.add(new Student("Test4","12345678","Delhi","Pandora","Blah"));
        arrayList.add(new Student("Test5","12345678","Delhi","Pandora","Blah"));
        arrayList.add(new Student("Test6","12345678","Delhi","Pandora","Blah"));
        arrayList.add(new Student("Test7","12345678","Delhi","Pandora","Blah"));
        arrayList.add(new Student("Test8","12345678","Delhi","Pandora","Blah"));
        arrayList.add(new Student("Test9","12345678","Delhi","Pandora","Blah"));
        arrayList.add(new Student("Test10","12345678","Delhi","Pandora","Blah"));
        arrayList.add(new Student("Test11","12345678","Delhi","Pandora","Blah"));
        arrayList.add(new Student("Test12","12345678","Delhi","Pandora","Blah"));
        arrayList.add(new Student("Test13","12345678","Delhi","Pandora","Blah"));
        arrayList.add(new Student("Test14","12345678","Delhi","Pandora","Blah"));
        arrayList.add(new Student("Test15","12345678","Delhi","Pandora","Blah"));

        return arrayList;

    }

}
