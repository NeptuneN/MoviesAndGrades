package ee.kool.kool.grades.controllers;

import ee.kool.kool.grades.dto.Student;
import ee.kool.kool.grades.services.GradeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class GradeController
{

    @Autowired
    GradeService gradeService;

    @GetMapping("/v1/students")
    List<Student> getStudents()
    {
        return gradeService.getStudents();
    }

    @DeleteMapping("v1/students/{id}")
    String delStudent(@PathVariable int id)
    {
        return "student deleted - ID: " + id;
    }

    @DeleteMapping("v1/grades/{id}")
    String delGrade(@PathVariable int id)
    {
        return "grade deleted - ID: " + id;
    }
}
