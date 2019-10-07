package test.java;

import java.util.ArrayList;

public class Student {
    /// represents the unique user
    long id;
    /// name of student
    String name;
    /// grades for app
    ArrayList<Integer> grades;

    /// Constructor
public Student(String name, long id){
    this.name = name;
    this.id = id;
}


    /// Getters and Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }
    /// Getters and Setters ( END ) ///

    public static void main(String[] args) {
        Student man = new Student("Mitchell", 1923L);
        System.out.println("man.getName() = " + man.getName());
        System.out.println("man.getId() = " + man.getId());

    }

}
