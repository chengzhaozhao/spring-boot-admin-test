package com.czz.api.boot.adminlogging;

import org.minbox.framework.logging.spring.context.annotation.client.EnableLoggingClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableLoggingClient// 开启日志客户端
public class ApibootUnifiedManageRequestLogsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApibootUnifiedManageRequestLogsApplication.class, args);
    }

}
