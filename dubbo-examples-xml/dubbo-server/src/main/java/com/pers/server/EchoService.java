package com.pers.server;

/**
 * @author Carson Chu
 * @email 1965704869@qq.com
 * @date 2020/1/31 13:53
 * @description
 */
public interface EchoService {

    /**
     * @description 发送给客户端的信息
     * @params [msg]
     * @returns java.lang.String
     */
    String productMsg(String msg);
}
