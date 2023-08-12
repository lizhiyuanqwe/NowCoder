package edu.bjtu;


import edu.bjtu.community.App;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.BoundValueOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = App.class)
public class RedisTest {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void testString1(){
        String redisKey = "test:cnt";
        redisTemplate.opsForValue().set(redisKey, 1);
        System.out.println(redisTemplate.opsForValue().get(redisKey));
    }

    @Test
    public void testBound(){
        String redisKey = "test:cnt";

        BoundValueOperations boundValueOps = redisTemplate.boundValueOps(redisKey);
        boundValueOps.increment();
        boundValueOps.increment();
        boundValueOps.increment();

        System.out.println(boundValueOps.get());
    }


}
