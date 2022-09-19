package school;

import classroom.Classroom;
import lombok.Data;

import java.io.Serializable;
import java.util.List;
@Data
public class School implements Serializable {
    public static final long serialVersionUID = 1L;
    List<Classroom> classrooms;
}
