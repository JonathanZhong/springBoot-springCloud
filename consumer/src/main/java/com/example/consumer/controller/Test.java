package com.example.consumer.controller;

import javax.annotation.Resource;

import jdk.nashorn.internal.ir.annotations.Reference;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.MonitorData;
import com.example.demo.mapper.MonitorDataMapper;
import com.example.demo.service.MonitorDataService;

@RestController

@RequestMapping("/test")
public class Test {
	
	@Autowired
    private RestTemplate restTemplate;
	
	@Value("${provider.url}")
	private String providerUrl;
	
	
	@RequestMapping(value="/hello/{id}",method= RequestMethod.GET)
	public String getSelectData(@PathVariable("id")String id)
	{
		
		String url=providerUrl+"test/findById/"+id;
	    MonitorData m=restTemplate.getForObject(url, MonitorData.class);
		return m.toString();
		
	}
	
	
		
}
