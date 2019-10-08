package test.java;


import org.junit.Before;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.*;


public class Student {
    /// represents the unique user
    long id;
    /// name of student
    String name;
    /// grades for app
    ArrayList<Integer> grades;

    private List<String> names;

    /// Constructor
public Student(String name, long id){
    this.name = name;
    this.id = id;
}

    // returns the student info
public void addGrade(int grade){

}

public double getGradeAverage(){
    for(Integer finGrade : grades){

    }
    return 0;
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




    @Test
    public void testIfCompanyNameIsEquals() {
        String expected = "Codeup";
        String actual = "Codeup";

//        assertEquals(expected, actual);
        assertNotEquals(1,3);
    }

    public static void main(String[] args) {
        Student man = new Student("Mitchell", 1923L);
        System.out.println("man.getName() = " + man.getName());
        System.out.println("man.getId() = " + man.getId());
    }

}
