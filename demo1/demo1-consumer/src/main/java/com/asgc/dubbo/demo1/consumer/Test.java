package com.asgc.dubbo.demo1.consumer;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.asgc.dubbo.demo1.api.DemoService;

public class Test {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "classpath:springmvc.xml" });

        context.start();
        DemoService demoService = (DemoService) context.getBean("demoService");
                
        System.out.println(demoService.sayHello("哈哈哈"));

        
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
}
