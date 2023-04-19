package io.github.dailinyu.example.domin.dto;

import io.github.dailinyucode.core.annotations.AutoMap;
import io.github.dailinyucode.core.annotations.AutoMapField;
import io.github.dailinyu.example.domin.entity.Car;
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
