package com.ruoyi.appdemo.mapper;

import com.ruoyi.appdemo.domain.AnodeChangeInfoApp;
import com.ruoyi.appdemo.domain.InsertDemoApp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AppDemoMapper {
	public int insertAnodeChangeInfo(AnodeChangeInfoApp anodeChangeInfo);//阳极换级信息
	public int updateAnodeChangeInfo(AnodeChangeInfoApp anodeChangeInfo);
	public int deleteAnodeChangeInfo(String sn);
	public List<Integer> selectPotId(@Param("factoryName")String factoryName, @Param("areaName")String areaName);//获取电解槽号
	public List<String> selectFactoryName();
	public List<String> selectAreaName();
	public List<String> selectRodPos(String potType);//获取导杆位置
	public String selPotTypeByPotId(Integer potId);//获取槽类型
	public Integer selRodIdOutByRodIdIn(AnodeChangeInfoApp anodeChangeInfo);
	public List<InsertDemoApp> selectInsertDemoApp();
}