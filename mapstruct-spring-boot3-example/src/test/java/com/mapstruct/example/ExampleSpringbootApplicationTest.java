package com.mapstruct.example;

import com.mapstruct.core.AutoMapObjectMapper;
import com.mapstruct.example.domin.dto.CarDto;
import com.mapstruct.example.domin.entity.Car;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author: DaiLiYu
 * @Date: 2023/4/18 14:49
 */
@SpringBootTest(classes = ExampleSpringBootApplication.class)
public class ExampleSpringbootApplicationTest {

    @Resource
    private AutoMapObjectMapper autoMapObjectMapper;

    @Test
    void test(){
        CarDto carDto = new CarDto();
        carDto.setNameS("哈哈哈");
        carDto.setAgeS("我的123");
        Car map = autoMapObjectMapper.map(carDto, Car.class);
        System.out.println(map);
    }
}
