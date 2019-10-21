package com.czz.api.boot.adminlogging.config.security;

import org.minbox.framework.api.boot.plugin.security.delegate.ApiBootStoreDelegate;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * @author chengzhzh@datangmobile.com
 * @create 2019-10-21 12:56
 * 根据用户名查询用户的信息
 */
public class CustomUserStoreDelegate implements ApiBootStoreDelegate {
    /**
     * 返回根据username查询的用户详情对象
     * UserDetails是SpringSecurity提供的用户详情接口
     * 返回的自定义用户对象需实现UserDetails接口
     * @param username 用户名
     * @return
     * @throws UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}
