package com.example.demo.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.MonitorData;

@Repository
@Mapper
public interface MonitorDataMapper {
	
	MonitorData findMonitorDataById(@Param("id")String id);
	
	Integer addByMonitorData(MonitorData record);
	
	Integer deleteById(String id);
	
	Integer updateByMonitorData(MonitorData record);
	

}
