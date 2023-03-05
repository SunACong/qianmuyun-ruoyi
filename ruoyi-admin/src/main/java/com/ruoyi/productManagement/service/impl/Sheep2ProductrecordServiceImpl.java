package com.ruoyi.productManagement.service.impl;

import java.util.List;

import com.ruoyi.common.annotation.DataScope;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.productManagement.mapper.Sheep2ProductrecordMapper;
import com.ruoyi.productManagement.domain.Sheep2Productrecord;
import com.ruoyi.productManagement.service.ISheep2ProductrecordService;

/**
 * 生产记录Service业务层处理
 *
 * @author 孙少聪
 * @date 2022-05-20
 */
@Service
public class Sheep2ProductrecordServiceImpl implements ISheep2ProductrecordService
{
    @Autowired
    private Sheep2ProductrecordMapper sheep2ProductrecordMapper;

    /**
     * 查询生产记录
     *
     * @param id 生产记录主键
     * @return 生产记录
     */
    @Override
    public Sheep2Productrecord selectSheep2ProductrecordById(Long id)
    {
        return sheep2ProductrecordMapper.selectSheep2ProductrecordById(id);
    }

    /**
     * 查询生产记录列表
     *
     * @param sheep2Productrecord 生产记录
     * @return 生产记录
     */
    @Override
    @DataScope(deptAlias = "sheep2Productrecord" , userAlias = "sheep2Productrecord")
    public List<Sheep2Productrecord> selectSheep2ProductrecordList(Sheep2Productrecord sheep2Productrecord)
    {
        return sheep2ProductrecordMapper.selectSheep2ProductrecordList(sheep2Productrecord);
    }

    /**
     * 新增生产记录
     *
     * @param sheep2Productrecord 生产记录
     * @return 结果
     */
    @Override
    public int insertSheep2Productrecord(Sheep2Productrecord sheep2Productrecord)
    {
        return sheep2ProductrecordMapper.insertSheep2Productrecord(sheep2Productrecord);
    }

    /**
     * 修改生产记录
     *
     * @param sheep2Productrecord 生产记录
     * @return 结果
     */
    @Override
    public int updateSheep2Productrecord(Sheep2Productrecord sheep2Productrecord)
    {
        sheep2Productrecord.setUpdateTime(DateUtils.getNowDate());
        return sheep2ProductrecordMapper.updateSheep2Productrecord(sheep2Productrecord);
    }

    /**
     * 批量删除生产记录
     *
     * @param ids 需要删除的生产记录主键
     * @return 结果
     */
    @Override
    public int deleteSheep2ProductrecordByIds(Long[] ids)
    {
        return sheep2ProductrecordMapper.deleteSheep2ProductrecordByIds(ids);
    }

    /**
     * 删除生产记录信息
     *
     * @param id 生产记录主键
     * @return 结果
     */
    @Override
    public int deleteSheep2ProductrecordById(Long id)
    {
        return sheep2ProductrecordMapper.deleteSheep2ProductrecordById(id);
    }
}
