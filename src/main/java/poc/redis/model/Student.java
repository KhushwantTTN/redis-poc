package poc.redis.model;

import lombok.Data;
import org.springframework.data.redis.core.RedisHash;

@RedisHash
@Data
public class Student  {

    private Integer id;
    private String name;
    private Integer age;
    private String email;
    private String phone;


}
