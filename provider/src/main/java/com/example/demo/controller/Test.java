package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.MonitorData;
import com.example.demo.mapper.MonitorDataMapper;
import com.example.demo.service.MonitorDataService;

@RestController
@RequestMapping("/test")
public class Test {
	
	@Autowired
	private MonitorDataService monitorDataService;
	
	@GetMapping(value="/findById/{id}")
    public MonitorData getMonitorData(@PathVariable("id")String id) 
	{
		return  monitorDataService.getMonitorData(id);
	}
	
	@GetMapping(value="/deleteById/{id}")
	public Integer getDeleteById(@PathVariable("id")String id) 
	{ 
		return monitorDataService.deleteById(id);
	}
	
	@RequestMapping("/addByMonitorData")
	public Integer addByMonitorData(@RequestBody MonitorData record)
	{
		return monitorDataService.addByMonitorData(record);
		
	}
	
	@RequestMapping("/updateByMonitorData")
	public Integer updateByMonitorData(@RequestBody MonitorData record)
	{
		return monitorDataService.updateByMonitorData(record);
		
	}
	
	
	

}
