package com.czz.api.boot.adminlogging.config.exclude;

/**
 * @author chengzhzh@datangmobile.com
 * @create 2019-10-21 12:58
 * api boot 默认 排除的 url 以支持
 * Swagger、Actuator
 */

public class ApiExcluDeUrls {
    /**
     * 默认的排除路径列表
     */
    public static final String[] DEFAULT_IGNORE_URLS = new String[]{
            "/v2/api-docs",
            "/swagger-ui.html",
            "/swagger-resources/configuration/security",
            "/META-INF/resources/webjars/**",
            "/webjars/**",
            "/swagger-resources",
            "/swagger-resources/configuration/ui",
            "/actuator/**"
    };
}

