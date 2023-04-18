package com.mapstruct.example.domin.dto;

import com.mapstruct.core.annotations.AutoMap;
import com.mapstruct.core.annotations.AutoMapField;
import com.mapstruct.example.domin.entity.Car;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: DaiLiYu
 * @Date: 2023/4/18 14:50
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@AutoMap(targetType = Car.class)
public class CarDto {

    @AutoMapField(target = "name",source = "nameS")
    private String nameS;

    @AutoMapField(target = "age",source = "ageS")
    private String ageS;
}
