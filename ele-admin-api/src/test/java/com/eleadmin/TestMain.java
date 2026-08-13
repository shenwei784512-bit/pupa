package com.eleadmin;

import org.junit.jupiter.api.Test;

import com.eleadmin.common.core.security.JwtUtil;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Created by EleAdmin on 2020-03-23 23:37
 */
public class TestMain {

    /**
     * 生成唯一的key用于jwt工具类
     */
    @Test
    public void testGenJwtKey() {
        System.out.println(JwtUtil.encodeKey(JwtUtil.randomKey()));
    }

    /**
     * 生成加密后的登录密码
     */
    @Test
    public void testEncodePassword() {
        System.out.println(new BCryptPasswordEncoder().encode(System.getenv("TEST_PASSWORD")));
    }

    /**
     * 校验密码
     */
    @Test
    public void testComparePassword() {
        System.out.println(new BCryptPasswordEncoder().matches(
                System.getenv("TEST_PASSWORD"),
                System.getenv("TEST_PASSWORD_HASH")
        ));
    }

    @Test
    public void test() {

    }

}
