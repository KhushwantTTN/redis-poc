package poc.redis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import poc.redis.model.Student;
import poc.redis.service.student.StudentService;

import java.util.Optional;

@RestController
@RequestMapping("/student")

public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping(path = "/create")
    public void createStudent(@RequestBody Student student) {
        studentService.createStudent(student);
    }

    @GetMapping(path = "/find")
    public Optional<Student> getStudent(@RequestParam("id") Integer id) {
        return studentService.getStudent(id);
    }
}
