package com.example.demo;

import com.example.demo.config.ConfigInfo;
import com.example.demo.vehicles.Car;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyApplication{

    public static void main(String[] args) {
        var applicationContext = SpringApplication.run(MyApplication.class, args);
        Car myCar = applicationContext.getBean(Car.class);
        ConfigInfo config = applicationContext.getBean(ConfigInfo.class);
        System.out.println(config);
        System.out.printf("Wheels size is %s\n", myCar.getWheelsSize());
        System.out.printf("Steering wheel size is %s\n", myCar.getSteeringWheelSize());
        System.out.println(applicationContext.getBean("isNotDefault"));
        myCar.work();
    }
}
