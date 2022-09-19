package teacher;

import lombok.Data;
import student.Student;

import java.io.Serializable;
import java.util.List;

@Data
public class Teacher implements Serializable {
    public static final long serialVersionUID = 1L;
    private List<Student> students;
    private String teacherName;
    private String teacherSurname;
    private int teacherId;
    private String teacherGender;
    private int teacherAge;
    private int teacherPhone;
    private String teacherQualificationLevel;
    private String teacherEmail;
    private String teacherNationality;
    private int teacherWorkExperience;
    private int teacherIQ;
    private int teacherNumberOfItems;
}

