package com.levmin.shiro;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
@MapperScan("com.levmin.shiro.mapper")
public class ShiroLoginApplication {

    public static void main(String[] args) {
        log.info("shiro login application started");
        SpringApplication.run(ShiroLoginApplication.class, args);
        log.info("Shiro 帮助我们完成认证，授权，加密，会话管理，与web继承，缓存等");
    }

}
