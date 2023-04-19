package io.github.dailinyu.example.controller;

import io.github.dailinyucode.core.IObjectMapper;
import io.github.dailinyu.example.domin.dto.CarDto;
import io.github.dailinyu.example.domin.entity.Car;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: DaiLiYu
 * @Date: 2023/4/18 15:19
 */
@RestController
public class TestController {

    @Resource
    private IObjectMapper iObjectMapper;

    @GetMapping("/get")
    public Car getCarDto(){
        CarDto carDto = new CarDto();
        carDto.setNameS("哈哈哈");
        carDto.setAgeS("我的123");
        Car map = iObjectMapper.map(carDto, Car.class);
        return map;
    }
}
