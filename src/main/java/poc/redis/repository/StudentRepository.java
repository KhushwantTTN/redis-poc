package poc.redis.repository;

import org.springframework.data.repository.CrudRepository;
import poc.redis.model.Student;

public interface StudentRepository extends CrudRepository<Student,Integer> {
}
