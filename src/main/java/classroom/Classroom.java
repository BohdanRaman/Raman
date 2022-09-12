package classroom;

import lombok.Data;
import student.Student;
import teacher.Teacher;

import java.util.List;
@Data
public class Classroom {
    private List<Teacher> teachers;
    private List<Student> students;
    private int countDesk;
    private int countWindow;
    private String formatClass;
}
