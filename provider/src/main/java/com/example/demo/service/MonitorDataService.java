package com.example.demo.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.MonitorData;
import com.example.demo.mapper.MonitorDataMapper;
import com.example.demo.maputils.MapUtils;

@Service
public class MonitorDataService {
	@Autowired
	private MonitorDataMapper monitorDaataMapper;
	/**
	 * 通过id查找数据
	 * @param id
	 * @return
	 */
	public MonitorData getMonitorData(String id)
	{
		return monitorDaataMapper.findMonitorDataById(id);
	}
	/**
	 * 通过MonitorData添加数据
	 * @param record
	 * @return
	 */
	public Integer addByMonitorData(MonitorData record)
	{
		return monitorDaataMapper.addByMonitorData(record);
	}
	/**
	 * 通过id删除数据
	 * @param id
	 * @return
	 */
	public Integer deleteById(String id)
	{
		return monitorDaataMapper.deleteById(id);
	}
	/**
	 * 通过MonitorData更新数据
	 * @param record
	 * @return
	 */
	public Integer updateByMonitorData(MonitorData record)
	{
		return monitorDaataMapper.updateByMonitorData(record);
	}
	

}
