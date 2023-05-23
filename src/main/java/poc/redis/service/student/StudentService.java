package poc.redis.service.student;

import poc.redis.model.Student;

import java.util.Optional;

public interface StudentService {
    void createStudent(Student student);

    Optional<Student> getStudent(Integer id);
}
