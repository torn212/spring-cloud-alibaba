package com.dubbo.example.provider;

import org.apache.dubbo.config.annotation.Service;
import com.dubbo.example.DemoService;
import org.apache.dubbo.rpc.RpcContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service(version = "1.0.0")
public class DemoServiceImpl implements DemoService {
    private static final Logger logger = LoggerFactory.getLogger(DemoServiceImpl.class);

    @Override
    public String sayHello(String name) {
        return "lk";// + name + ", response from provider: " + RpcContext.getContext().getLocalAddress();
    }

}
