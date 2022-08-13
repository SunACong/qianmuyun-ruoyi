package com.ruoyi.appdemo.service;


import com.ruoyi.appdemo.domain.AnodeChangeInfoApp;
import com.ruoyi.appdemo.domain.InsertDemoApp;

import java.util.List;

public interface AppDemoService {
	public int addAnodeChangeInfo(AnodeChangeInfoApp anodeChangeInfo);
	public int updateAnodeChangeInfo(AnodeChangeInfoApp anodeChangeInfo);
	public int deleteAnodeChangeInfo(String sn);
	public List<Integer> selPotId(String factoryName, String areaName);
	public List<String> selFactoryName();
	public List<String> selAreaName();
	public List<String> selRodPos(Integer potId);
	public Integer selRodIdOutByRodIdIn(AnodeChangeInfoApp anodeChangeInfo);
	public List<InsertDemoApp> selectInsertDemoApp();
}
