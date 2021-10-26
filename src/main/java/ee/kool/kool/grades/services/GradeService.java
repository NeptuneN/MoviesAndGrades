package ee.kool.kool.grades.services;

import ee.kool.kool.grades.dto.Grade;
import ee.kool.kool.grades.dto.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GradeService
{
    // GET METHODS
    public List<Student> getStudents()
    {

        List<Student> students = new ArrayList<>();
        List<Grade> grades = new ArrayList<>();

        Student student1 = new Student(1, "Marco Kangur");
        Grade grade1 = new Grade(1, 2, "Mathematics", 5);

        grades.add(grade1);
        student1.setGrades(grades);
        students.add(student1);
        return students;
    }

    public Student getStudentFilter(int id, String subject)
    {

        List<Grade> grades = new ArrayList<>();

        Student student1 = new Student(id, "Marco Kangur");
        Grade grade1 = new Grade(1, 1, subject, 2);
        Grade grade2 = new Grade(2, 2, subject,3);

        // Nullable is fine, just redo the whole grade
        // Objects.requireNonNullElse(subject, "None")

        grades.add(grade1);
        grades.add(grade2);
        student1.setGrades(grades);
        return student1;
    }

    public List<Grade> getGradesFilter(String studentName, String subject)
    {
        List<Grade> grades = new ArrayList<>();

        Student student1 = new Student(1, "Marco Kangur"); // studentName
        Grade grade1 = new Grade(1, 2, subject, 4);

        grade1.setStudent(student1);

        grades.add(grade1);
        student1.setGrades(grades);
        return grades;
    }

    // POST METHODS
    public Student postStudent(Student newStudent)
    {
        return newStudent;
    }

    public Grade postGrade(Grade newGrade)
    {
        return newGrade;
    }

    // PUT METHODS
    public Student updateStudent(int id, Student newStudent)
    {

        List<Grade> grades = new ArrayList<>();

        Student student1 = new Student(id, "Marco Kangur");
        Grade grade1 = new Grade(1, 2, "Mathematics", 5);

        student1.setName(newStudent.getName());
        student1.setGrades(newStudent.getGrades());

        grades.add(grade1);
        student1.setGrades(grades);
        return student1;
    }

    public Grade updateGrade(int id, Grade newGrade)
    {
        Student student1 = new Student(1, "Marco Kangur");
        Grade grade1 = new Grade(id, 2, "Mathematics", 5);

        grade1.setSubject(newGrade.getSubject());
        grade1.setGrade(newGrade.getGrade());
        grade1.setStudent(newGrade.getStudent());
        grade1.setStudent(student1);

        return grade1;
    }
}

