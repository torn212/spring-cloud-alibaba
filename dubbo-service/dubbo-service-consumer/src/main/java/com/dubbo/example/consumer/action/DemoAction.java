package com.dubbo.example.consumer.action;

import com.dubbo.example.DemoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoAction {

    @Reference(version = "1.0.0")
    private DemoService demoService;

    @GetMapping("getName")
    public String getName() {
        String li = demoService.sayHello("li");
        return li;
    }
}
