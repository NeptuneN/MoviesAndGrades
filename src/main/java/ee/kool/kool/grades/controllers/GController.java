package ee.kool.kool.grades.controllers;

import ee.kool.kool.grades.dto.Student;
import ee.kool.kool.grades.services.GService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GController
{

    @Autowired
    GService gService;

    @GetMapping("/v1/students")
    List<Student> getStudents()
    {
        return gService.getStudents();
    }
}
