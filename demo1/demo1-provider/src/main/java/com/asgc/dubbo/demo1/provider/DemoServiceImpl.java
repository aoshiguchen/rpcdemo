package com.asgc.dubbo.demo1.provider;

import org.springframework.stereotype.Service;

import com.asgc.dubbo.demo1.api.DemoService;

@Service("demoService")
public class DemoServiceImpl implements DemoService{

	public String sayHello(String name) {

		return name + "...";
	}

}
