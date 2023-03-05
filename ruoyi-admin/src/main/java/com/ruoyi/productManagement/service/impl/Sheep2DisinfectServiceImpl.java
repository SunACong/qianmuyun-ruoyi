package com.ruoyi.productManagement.service.impl;

import java.util.List;

import com.ruoyi.common.annotation.DataScope;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.productManagement.mapper.Sheep2DisinfectMapper;
import com.ruoyi.productManagement.domain.Sheep2Disinfect;
import com.ruoyi.productManagement.service.ISheep2DisinfectService;

/**
 * 消毒记录Service业务层处理
 *
 * @author 孙少聪
 * @date 2022-05-20
 */
@Service
public class Sheep2DisinfectServiceImpl implements ISheep2DisinfectService
{
    @Autowired
    private Sheep2DisinfectMapper sheep2DisinfectMapper;

    /**
     * 查询消毒记录
     *
     * @param id 消毒记录主键
     * @return 消毒记录
     */
    @Override
    public Sheep2Disinfect selectSheep2DisinfectById(Long id)
    {
        return sheep2DisinfectMapper.selectSheep2DisinfectById(id);
    }

    /**
     * 查询消毒记录列表
     *
     * @param sheep2Disinfect 消毒记录
     * @return 消毒记录
     */
    @Override
    @DataScope(deptAlias = "sheep2Disinfect" , userAlias = "sheep2Disinfect")
    public List<Sheep2Disinfect> selectSheep2DisinfectList(Sheep2Disinfect sheep2Disinfect)
    {
        return sheep2DisinfectMapper.selectSheep2DisinfectList(sheep2Disinfect);
    }

    /**
     * 新增消毒记录
     *
     * @param sheep2Disinfect 消毒记录
     * @return 结果
     */
    @Override
    public int insertSheep2Disinfect(Sheep2Disinfect sheep2Disinfect)
    {
        return sheep2DisinfectMapper.insertSheep2Disinfect(sheep2Disinfect);
    }

    /**
     * 修改消毒记录
     *
     * @param sheep2Disinfect 消毒记录
     * @return 结果
     */
    @Override
    public int updateSheep2Disinfect(Sheep2Disinfect sheep2Disinfect)
    {
        sheep2Disinfect.setUpdateTime(DateUtils.getNowDate());
        return sheep2DisinfectMapper.updateSheep2Disinfect(sheep2Disinfect);
    }

    /**
     * 批量删除消毒记录
     *
     * @param ids 需要删除的消毒记录主键
     * @return 结果
     */
    @Override
    public int deleteSheep2DisinfectByIds(Long[] ids)
    {
        return sheep2DisinfectMapper.deleteSheep2DisinfectByIds(ids);
    }

    /**
     * 删除消毒记录信息
     *
     * @param id 消毒记录主键
     * @return 结果
     */
    @Override
    public int deleteSheep2DisinfectById(Long id)
    {
        return sheep2DisinfectMapper.deleteSheep2DisinfectById(id);
    }
}
