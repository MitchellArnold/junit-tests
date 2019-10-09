import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CohortTest {

    Cohort emptyCohort;
    Cohort cohortWithOne;
    Cohort cohortWithMany;

    @Before
    public void setUp(){
        emptyCohort = new Cohort();

        Student student = new Student(4, "Jimmy Jones");
        cohortWithOne.addStudent(student);
//        cohortWithOne.addStudent(new Student(43, "Jones Joneswell"));

        Student student1 = new Student(5, "John Michael Smith");
        Student student2 = new Student(23, "James Johnson");
        Student student3 = new Student(7, "Patrick Wagner");
        cohortWithMany.addStudent(student1);
        cohortWithMany.addStudent(student2);
        cohortWithMany.addStudent(student3);

    }


    @Test
    public void testIfStudentListCanBeCreated(){
        Cohort cohort = new Cohort();
        assertNotNull(cohort);
    }


    @Test
    public void testIfStudentCanBeAddedToList(){
//        assertFalse(emptyCohort.contains("Johnson"));
        assertEquals(1, cohortWithOne.getStudents().size());
    }


    @Test
    public void testIfStudentAverageIsCorrect(){

    }

    @Test
    public void testToSeeIfCohortIsEmpty(){
//        assertEquals();

    }
}
