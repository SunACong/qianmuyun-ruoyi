package com.ruoyi.productManagement.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.productManagement.mapper.Sheep2ImmuneMapper;
import com.ruoyi.productManagement.domain.Sheep2Immune;
import com.ruoyi.productManagement.service.ISheep2ImmuneService;

/**
 * 免疫记录Service业务层处理
 * 
 * @author 孙少聪
 * @date 2022-05-20
 */
@Service
public class Sheep2ImmuneServiceImpl implements ISheep2ImmuneService 
{
    @Autowired
    private Sheep2ImmuneMapper sheep2ImmuneMapper;

    /**
     * 查询免疫记录
     * 
     * @param id 免疫记录主键
     * @return 免疫记录
     */
    @Override
    public Sheep2Immune selectSheep2ImmuneById(Long id)
    {
        return sheep2ImmuneMapper.selectSheep2ImmuneById(id);
    }

    /**
     * 查询免疫记录列表
     * 
     * @param sheep2Immune 免疫记录
     * @return 免疫记录
     */
    @Override
    public List<Sheep2Immune> selectSheep2ImmuneList(Sheep2Immune sheep2Immune)
    {
        return sheep2ImmuneMapper.selectSheep2ImmuneList(sheep2Immune);
    }

    /**
     * 新增免疫记录
     * 
     * @param sheep2Immune 免疫记录
     * @return 结果
     */
    @Override
    public int insertSheep2Immune(Sheep2Immune sheep2Immune)
    {
        return sheep2ImmuneMapper.insertSheep2Immune(sheep2Immune);
    }

    /**
     * 修改免疫记录
     * 
     * @param sheep2Immune 免疫记录
     * @return 结果
     */
    @Override
    public int updateSheep2Immune(Sheep2Immune sheep2Immune)
    {
        sheep2Immune.setUpdateTime(DateUtils.getNowDate());
        return sheep2ImmuneMapper.updateSheep2Immune(sheep2Immune);
    }

    /**
     * 批量删除免疫记录
     * 
     * @param ids 需要删除的免疫记录主键
     * @return 结果
     */
    @Override
    public int deleteSheep2ImmuneByIds(Long[] ids)
    {
        return sheep2ImmuneMapper.deleteSheep2ImmuneByIds(ids);
    }

    /**
     * 删除免疫记录信息
     * 
     * @param id 免疫记录主键
     * @return 结果
     */
    @Override
    public int deleteSheep2ImmuneById(Long id)
    {
        return sheep2ImmuneMapper.deleteSheep2ImmuneById(id);
    }
}
