package poc.redis.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@RedisHash("student")
@Data
public class Student implements Serializable {

    @Id
    private Integer id;
    private String name;
    private Integer age;
    private String email;
    private String phone;


}
