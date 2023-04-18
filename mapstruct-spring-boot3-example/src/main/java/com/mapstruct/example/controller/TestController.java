package com.mapstruct.example.controller;

import com.mapstruct.core.AutoMapObjectMapper;
import com.mapstruct.core.IObjectMapper;
import com.mapstruct.example.domin.dto.CarDto;
import com.mapstruct.example.domin.entity.Car;
import com.mapstruct.starter.config.MapstructAutoConfig;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

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
