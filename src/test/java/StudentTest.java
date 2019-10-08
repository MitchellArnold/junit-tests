import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {
//     public static Student grade;
    Student student;
    Student studentWithTwoGrades;
    Student studentWithOneGrade;

    @Before
    public void setUp(){
        student = new Student(1, "Fer");
    }

    @Test
    public void testIfStudentCanBeCreated(){
        Student student = new Student(3, "Fer");
//        Student student = new Student();
//        assertNotNull(student); // only to check object instance
        Student justin = null;
        assertNull(justin);
    }

    @Test
    public void testIfFieldsGetOrSet(){
        /// name and id
        Student student = new Student(1, "Fer");
        assertEquals(1, student.getId());
        assertEquals("Fer", student.getName());

        /// grades
        assertNotNull(student.getGrades());
    }

    @Test
    public void testIfAddGradeWorks(){
        student.addGrade(80);
        assertSame(80, student.getGrades().get(0));
        assertSame(1, student.getGrades().size());
        student.addGrade(92);
        assertSame(2, student.getGrades().size());
    }

    @Test
    public void testIfGradeAverageIsCorrect(){
        studentWithTwoGrades.addGrade(90);
        studentWithTwoGrades.addGrade(80);

        assertEquals(85, studentWithTwoGrades.getGradeAverage(), 0);

        studentWithOneGrade.addGrade(90);

        assertEquals(90, studentWithOneGrade.getGradeAverage(), 0);
    }



//    @Test
//    public void testAddStudentGrade(){
//        Student kid = new Student();
//
//    }

}
