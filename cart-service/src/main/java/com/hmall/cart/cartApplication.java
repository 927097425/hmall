package com.hmall.cart;



import com.hmall.api.config.DefalutFeignConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


@EnableFeignClients(basePackages = "com.hmall.api.client",defaultConfiguration = DefalutFeignConfiguration.class)
@MapperScan("com.hmall.cart.mapper")
@SpringBootApplication
public class cartApplication {
    public static void main(String[] args) {
        SpringApplication.run(cartApplication.class);
    }
}
