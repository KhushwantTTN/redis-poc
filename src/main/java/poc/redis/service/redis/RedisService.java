package poc.redis.service.redis;

public interface RedisService {

    void set(String key, Object value);

    Object get(String key);
}
