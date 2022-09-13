package school;

import classroom.Classroom;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
@Data
@AllArgsConstructor
public class School {
    List<Classroom> classrooms;
}
