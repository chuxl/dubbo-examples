package com.pers.server.impl;


import com.alibaba.dubbo.rpc.RpcContext;
import com.pers.server.EchoService;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Carson Chu
 * @email 1965704869@qq.com
 * @date 2020/1/31 13:53
 * @description
 */
public class EchoServiceImpl implements EchoService {
    @Override
    public String productMsg(String msg) {
        String curTime = new SimpleDateFormat("HH:mm:ss").format(new Date());
        System.out.println("[" + curTime + "] Hello " + msg
                + ", request from client: " + RpcContext.getContext().getRemoteAddress());
        return msg;
    }
}
