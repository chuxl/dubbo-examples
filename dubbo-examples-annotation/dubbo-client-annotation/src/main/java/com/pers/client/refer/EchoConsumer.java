package com.pers.client.refer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pers.server.AnnotationService;
import org.springframework.stereotype.Component;

/**
 * @author Carson Chu
 * @email 1965704869@qq.com
 * @date 2020/1/31 17:43
 * @description
 */
@Component
public class EchoConsumer {
    @Reference
    private AnnotationService annotationService;

    public String produceMsg(String msg) {
        return annotationService.productMsg(msg);
    }
}
