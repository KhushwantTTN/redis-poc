package poc.redis.service.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import poc.redis.model.Student;
import poc.redis.repository.StudentRepository;

import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;
    @Override
    public void createStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public Optional<Student> getStudent(Integer id) {
        return studentRepository.findById(id);
    }
}
