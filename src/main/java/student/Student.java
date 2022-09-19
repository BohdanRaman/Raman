package student;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Student implements Serializable {
    public static final long serialVersionUID = 1L;
    private String studentName;
    private String studentSurname;
    private int studentAge;
    private int studentPhone;
    private String studentEmail;
    private int studentWeight;
    private int studentHeight;
    private int studentId;
    private String studentGender;
    private String studentSkinColor;
    private int studentIQ;
    private String studentNationality;
}

