package school;

import classroom.Classroom;
import lombok.Data;

import java.io.Serializable;
import java.util.List;
@Data
public class School implements Serializable {
    List<Classroom> classrooms;
}
