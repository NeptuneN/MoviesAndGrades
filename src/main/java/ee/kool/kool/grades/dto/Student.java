package ee.kool.kool.grades.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
public class Student
{
    private int id;
    private String name;

    public Student(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    @JsonIgnoreProperties("student")
    private List<Grade> grades;
}
