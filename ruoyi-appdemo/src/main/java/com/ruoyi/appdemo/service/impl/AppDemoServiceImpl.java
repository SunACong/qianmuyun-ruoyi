package com.ruoyi.appdemo.service.impl;

import com.ruoyi.appdemo.domain.AnodeChangeInfoApp;
import com.ruoyi.appdemo.domain.InsertDemoApp;
import com.ruoyi.appdemo.mapper.AppDemoMapper;
import com.ruoyi.appdemo.service.AppDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AppDemoServiceImpl implements AppDemoService {
	@Autowired
	private AppDemoMapper appDemoMapper;

	@Override
	public int addAnodeChangeInfo(AnodeChangeInfoApp anodeChangeInfo) {
		return this.appDemoMapper.insertAnodeChangeInfo(anodeChangeInfo);
	}

	@Override
	public int updateAnodeChangeInfo(AnodeChangeInfoApp anodeChangeInfo) {
		return this.appDemoMapper.updateAnodeChangeInfo(anodeChangeInfo);
	}

	@Override
	public int deleteAnodeChangeInfo(String sn) {
		return this.appDemoMapper.deleteAnodeChangeInfo(sn);
	}

	@Override
	public List<Integer> selPotId(String factoryName, String areaName) {
		return this.appDemoMapper.selectPotId(factoryName, areaName);
	}

	@Override
	public List<String> selFactoryName() {
		return this.appDemoMapper.selectFactoryName();
	}

	@Override
	public List<String> selAreaName() {
		return this.appDemoMapper.selectAreaName();
	}

	@Override
	public List<String> selRodPos(Integer potId) {
		String potType = appDemoMapper.selPotTypeByPotId(potId);
		return this.appDemoMapper.selectRodPos(potType);
	}

	@Override
	public Integer selRodIdOutByRodIdIn(AnodeChangeInfoApp anodeChangeInfo) {
		return this.appDemoMapper.selRodIdOutByRodIdIn(anodeChangeInfo);
	}

	@Override
	public List<InsertDemoApp> selectInsertDemoApp() {
		return this.appDemoMapper.selectInsertDemoApp();
	}
}
