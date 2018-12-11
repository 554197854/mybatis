package com.mybatis;

import com.mybatis.bean.Employee;
import com.mybatis.mapper.EmployeeMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisApplicationTests {

    @Autowired
    StringRedisTemplate template;

    @Autowired
    RedisTemplate myRedisTemplate;
    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    EmployeeMapper mapper;
    @Test
    public void contextLoads() {
        Employee emp = mapper.getEmp(1);
        myRedisTemplate.opsForValue().set("emp", emp);


    }

}
