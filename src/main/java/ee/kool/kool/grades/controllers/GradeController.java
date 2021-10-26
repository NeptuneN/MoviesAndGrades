package ee.kool.kool.grades.controllers;

import ee.kool.kool.grades.dto.Grade;
import ee.kool.kool.grades.dto.Student;
import ee.kool.kool.grades.services.GradeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class GradeController
{

    @Autowired
    GradeService gradeService;

    // GET METHODS
    @GetMapping("/v1/students")
    List<Student> getStudents()
    {
        return gradeService.getStudents();
    }

    @GetMapping("v1/students/{id}")
    Student getStudentFilter(@PathVariable int id, @RequestParam String subject)
    {
        return gradeService.getStudentFilter(id, subject);
    }
    @GetMapping("v1/grades")
    List<Grade> getGradesFilter(@RequestParam(required = false) String studentName, @RequestParam(required = false) String subject)
    {
        return gradeService.getGradesFilter(studentName, subject);
    }

    // POST METHODS
    @PostMapping("v1/students")
    Student postStudent(@RequestBody Student newStudent)
    {
        return gradeService.postStudent(newStudent);
    }

    @PostMapping("v1/grades")
    Grade postGrade(@RequestBody Grade newGrade)
    {
        return gradeService.postGrade(newGrade);
    }

    // PUT METHODS
    @PutMapping("v1/students/{id}")
    Student updateStudent(@PathVariable int id, @RequestBody Student newStudent)
    {
        return gradeService.updateStudent(id, newStudent);
    }

    @PutMapping("v1/grades/{id}")
    Grade updateGrade(@PathVariable int id, @RequestBody Grade newGrade)
    {
        return gradeService.updateGrade(id, newGrade);
    }

    // DELETE METHODS
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
