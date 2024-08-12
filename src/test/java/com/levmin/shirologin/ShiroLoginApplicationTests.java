package com.levmin.shirologin;

import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class ShiroLoginApplicationTests {

    @Test
    void contextLoads() {
    }

    /**
     * 身份认证流程
     * 1、首先调用Subject.login(token) 进行登录，委托给Security Manage，调用之前必须通过 SecurityUtils.setSecurityManager()设置。
     * 2、SecurityManager负责真正的身份验证逻辑，委托给Authenticator进行身份验证
     * 3、Authenticator 验证身份
     * 4、Authenticator 可能会委托给相应的 AuthenticationStrategy 进行多 Realm 身份验证，默认 ModularRealmAuthenticator 会调用 AuthenticationStrategy 进行多 Realm 身份验证
     * 5、Authenticator 会把相应的 token 传入 Realm，从 Realm 获取身份验证信息，如果没有返回 / 抛出异常表示身份验证成功了。此处可以配置多个 Realm，将按照相应的顺序及策略进行访问
     */
    @Test
    void shiroLogin() {
        //将shiro配置文件初始化到权限管理器中
        Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro-jdbc-realm.ini");
        SecurityManager securityManager = factory.getInstance();
        SecurityUtils.setSecurityManager(securityManager);
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken("zhangyue", "0119");
        try {
            subject.login(token);
            log.info("登录成功！！");
        }catch (AuthenticationException e) {
            log.error(e.getMessage());
            log.error("用户登录失败");
        }
        Assert.assertEquals(true,subject.isAuthenticated());
        //退出
        subject.logout();
    }

}
