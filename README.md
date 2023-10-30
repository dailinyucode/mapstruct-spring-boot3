# mapstruct-spring-boot3

这是一个 mapstruct 的springboot3 的一个扩展模块

### 使用方法
1. maven
   引入依赖
   ```xml
        <dependency>
            <groupId>io.github.dailinyucode</groupId>
            <artifactId>mapstruct-spring-boot3-starter</artifactId>
            <version>1.0.2</version>
        </dependency>
   
        <dependency>
            <groupId>org.mapstruct</groupId>
            <artifactId>mapstruct</artifactId>
            <version>1.5.3.Final</version>
        </dependency>
   
        <dependency>
            <groupId>javax.annotation</groupId>
            <artifactId>javax.annotation-api</artifactId>
            <version>1.3.2</version>
        </dependency>
   ```
   ```xml
      
     <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>3.8.1</version>
                <configuration>
                    <source>17</source>
                    <target>17</target>
                    <encoding>UTF-8</encoding>
                    <annotationProcessorPaths>
                        <path>
                            <groupId>org.mapstruct</groupId>
                            <artifactId>mapstruct-processor</artifactId>
                            <version>1.5.3.Final</version>
                        </path>

                        <path>
                            <groupId>io.github.dailinyucode</groupId>
                            <artifactId>mapstruct-spring-boot3-processor</artifactId>
                            <version>1.0.2</version>
                        </path>

                        <path>
                            <groupId>org.projectlombok</groupId>
                            <artifactId>lombok</artifactId>
                            <version>1.18.30</version>
                        </path>
                    </annotationProcessorPaths>
                </configuration>
            </plugin>
        </plugins>
    </build>
   ```
2. 编译
3. 使用
   ```java
   @Data
   @AllArgsConstructor
   @NoArgsConstructor
   @AutoMap(targetType = Car.class)
   public class CarDto {

        @AutoMapField(target = "name", source = "nameS")
        private String nameS;

        @AutoMapField(target = "age", source = "ageS")
        private String ageS;
   }
   ```
   ```java
   @Data
   @AllArgsConstructor
   @NoArgsConstructor
   public class Car {

      private String name;

      private String age;
   }
   ```
   ```java
   @SpringBootTest
   class MapstructDemoApplicationTests {

    @Resource
    private IObjectMapper iObjectMapper;

    @Test
    void contextLoads() {
        CarDto carDto = new CarDto();
        carDto.setNameS("你好");
        carDto.setAgeS("18");
        System.out.println(carDto);
        Car map = iObjectMapper.map(carDto, Car.class);
        System.out.println(map);
    }
   }
   ```