package com.ruoyi.productManagement.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.productManagement.mapper.Sheep2InnocuityMapper;
import com.ruoyi.productManagement.domain.Sheep2Innocuity;
import com.ruoyi.productManagement.service.ISheep2InnocuityService;

/**
 * 无害化处理Service业务层处理
 * 
 * @author 孙少聪
 * @date 2022-05-20
 */
@Service
public class Sheep2InnocuityServiceImpl implements ISheep2InnocuityService 
{
    @Autowired
    private Sheep2InnocuityMapper sheep2InnocuityMapper;

    /**
     * 查询无害化处理
     * 
     * @param id 无害化处理主键
     * @return 无害化处理
     */
    @Override
    public Sheep2Innocuity selectSheep2InnocuityById(Long id)
    {
        return sheep2InnocuityMapper.selectSheep2InnocuityById(id);
    }

    /**
     * 查询无害化处理列表
     * 
     * @param sheep2Innocuity 无害化处理
     * @return 无害化处理
     */
    @Override
    public List<Sheep2Innocuity> selectSheep2InnocuityList(Sheep2Innocuity sheep2Innocuity)
    {
        return sheep2InnocuityMapper.selectSheep2InnocuityList(sheep2Innocuity);
    }

    /**
     * 新增无害化处理
     * 
     * @param sheep2Innocuity 无害化处理
     * @return 结果
     */
    @Override
    public int insertSheep2Innocuity(Sheep2Innocuity sheep2Innocuity)
    {
        return sheep2InnocuityMapper.insertSheep2Innocuity(sheep2Innocuity);
    }

    /**
     * 修改无害化处理
     * 
     * @param sheep2Innocuity 无害化处理
     * @return 结果
     */
    @Override
    public int updateSheep2Innocuity(Sheep2Innocuity sheep2Innocuity)
    {
        sheep2Innocuity.setUpdateTime(DateUtils.getNowDate());
        return sheep2InnocuityMapper.updateSheep2Innocuity(sheep2Innocuity);
    }

    /**
     * 批量删除无害化处理
     * 
     * @param ids 需要删除的无害化处理主键
     * @return 结果
     */
    @Override
    public int deleteSheep2InnocuityByIds(Long[] ids)
    {
        return sheep2InnocuityMapper.deleteSheep2InnocuityByIds(ids);
    }

    /**
     * 删除无害化处理信息
     * 
     * @param id 无害化处理主键
     * @return 结果
     */
    @Override
    public int deleteSheep2InnocuityById(Long id)
    {
        return sheep2InnocuityMapper.deleteSheep2InnocuityById(id);
    }
}
