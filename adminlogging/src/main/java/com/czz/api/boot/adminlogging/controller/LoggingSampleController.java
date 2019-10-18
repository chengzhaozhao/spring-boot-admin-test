package com.czz.api.boot.adminlogging.controller;

import lombok.Data;
import org.springframework.web.bind.annotation.*;

/**
 * @author chengzhzh@datangmobile.com
 * @create 2019-10-18 10:33
 */
@RestController
@RequestMapping(value = "/test")
public class LoggingSampleController {
    /**
     * 验证请求参数以及相应内容
     *
     * @param name
     * @return
     */
    @GetMapping
    public String hello(@RequestParam("name") String name) {
        return "你好：" + name;
    }

    /**
     * 验证主体请求内容以及相应内容
     *
     * @param user
     * @return
     */
    @PostMapping
    public String bodyHello(@RequestBody User user) {
        return "你好：" + user.getName();
    }

    /**
     * RequestBody 示例类
     */
    @Data
    public static class User {
        private String name;
    }
}
