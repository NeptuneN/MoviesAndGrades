package ee.kool.kool.grades.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.time.LocalDate;

@Data
public class Grade
{
    private int id;
    private int semester;
    private String subject;
    private int grade;
    private LocalDate dateTime = LocalDate.now();

    public Grade(int id, int semester, String subject, int grade)
    {
        this.id = id;
        this.semester = semester;
        this.subject = subject;
        this.grade = grade;
    }

    @JsonIgnoreProperties("grades")
    private Student student;
}