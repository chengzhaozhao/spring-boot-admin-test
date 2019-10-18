package com.czz.api.boot.adminlogging.config;

import org.minbox.framework.logging.client.notice.LoggingNotice;
import org.minbox.framework.logging.core.MinBoxLog;
import org.springframework.stereotype.Component;

/**
 * @author chengzhzh@datangmobile.com
 * @create 2019-10-18 11:08
 */
@Component
public class AddHeaderLoggingNotice implements LoggingNotice {
    /**
     * 区域头信息key
     */
    private static final String SERVER_REGION = "server-region";

    @Override
    public void notice(MinBoxLog minBoxLog) {
        minBoxLog.getRequestHeaders().put(SERVER_REGION, "JiNan");
    }

    @Override
    public int getOrder() {
        return HIGHEST_PRECEDENCE;
    }
}
