import org.example.Student;
import org.example.StudentService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StudentServiceUT {
    private StudentService studentService;
    private Student existStudent;
    private Student nonExistStudent;

    private String correctName;
    private String incorrectName;

    private int correctNumberOfStudent = 2;

    @Before
    public void initService() {
        studentService = new StudentService();
        existStudent = new Student("SV001", "Hieu", true);
        nonExistStudent = new Student("SV003", "Thanh", true);
        correctName = "Hieu";
        incorrectName = "Thanh";
    }

    @Test
    public void isStudentExistUT() {
        Assert.assertTrue(studentService.isStudentExist(existStudent));
    }

    @Test
    public void isStudentNonExist() {
        Assert.assertFalse(studentService.isStudentExist(nonExistStudent));
    }

    @Test
    public void getStudentByCorrectNameUT() {
        Assert.assertTrue(studentService.getStudentByName("Thang") != null);
    }

    @Test
    public void getStudentByNonCorrectNameUT() {
        Assert.assertTrue(studentService.getStudentByName(incorrectName) == null);
    }

    @Test
    public void countAllStudentUT() {
        Assert.assertTrue(studentService.countAllStudent() == correctNumberOfStudent);
        Assert.assertEquals(studentService.countAllStudent(), correctNumberOfStudent);
    }
}
