import java.util.ArrayList;
import java.util.List;


public class Student {
    /// represents the unique user
    long id;
    String name;
    static ArrayList<Integer> grades;
    private List<String> names;



    /// Constructor
public Student(long id, String name){
    this.name = name;
    this.id = id;
    this.grades = new ArrayList<>();
}


    // returns the student info
public void addGrade(int grade){
    grades.add(grade);
}

public double getGradeAverage(){
    return 0;
}

//public double getGradeAverage(){
//    double sum = 0;
//    for (double grade : grades) {
//        sum += grade;
//    }

//    return sum / grades.size();
//}



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
//        Student man = new Student("Mitchell", 1923L);
//        System.out.println("man.getName() = " + man.getName());
//        System.out.println("man.getId() = " + man.getId());
        System.out.println("grades = " + grades);

    }

}
