package poc.redis.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import poc.redis.service.RedisService;

@RestController
@RequestMapping("/redis")
@RequiredArgsConstructor
public class RedisController {

    @Autowired
    RedisService redisService;

    @GetMapping(path = "/set")
    public void set(
            @RequestParam(name = "key") String key,
            @RequestParam(name = "value") String value
    ) {
        redisService.set(key, value);
    }

    @GetMapping(path = "/get")
    public String get(@RequestParam(name = "key") String key) {
        return (String) redisService.get(key);
    }

}
