package com.ruoyi.productManagement.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.productManagement.mapper.SheepImmunizationMapper;
import com.ruoyi.productManagement.domain.SheepImmunization;
import com.ruoyi.productManagement.service.ISheepImmunizationService;

/**
 * 免疫档案Service业务层处理
 * 
 * @author 孙少聪
 * @date 2022-03-30
 */
@Service
public class SheepImmunizationServiceImpl implements ISheepImmunizationService 
{
    @Autowired
    private SheepImmunizationMapper sheepImmunizationMapper;

    /**
     * 查询免疫档案
     * 
     * @param id 免疫档案主键
     * @return 免疫档案
     */
    @Override
    public SheepImmunization selectSheepImmunizationById(Long id)
    {
        return sheepImmunizationMapper.selectSheepImmunizationById(id);
    }

    /**
     * 查询免疫档案列表
     * 
     * @param sheepImmunization 免疫档案
     * @return 免疫档案
     */
    @Override
    public List<SheepImmunization> selectSheepImmunizationList(SheepImmunization sheepImmunization)
    {
        return sheepImmunizationMapper.selectSheepImmunizationList(sheepImmunization);
    }

    /**
     * 新增免疫档案
     * 
     * @param sheepImmunization 免疫档案
     * @return 结果
     */
    @Override
    public int insertSheepImmunization(SheepImmunization sheepImmunization)
    {
        return sheepImmunizationMapper.insertSheepImmunization(sheepImmunization);
    }

    /**
     * 修改免疫档案
     * 
     * @param sheepImmunization 免疫档案
     * @return 结果
     */
    @Override
    public int updateSheepImmunization(SheepImmunization sheepImmunization)
    {
        return sheepImmunizationMapper.updateSheepImmunization(sheepImmunization);
    }

    /**
     * 批量删除免疫档案
     * 
     * @param ids 需要删除的免疫档案主键
     * @return 结果
     */
    @Override
    public int deleteSheepImmunizationByIds(Long[] ids)
    {
        return sheepImmunizationMapper.deleteSheepImmunizationByIds(ids);
    }

    /**
     * 删除免疫档案信息
     * 
     * @param id 免疫档案主键
     * @return 结果
     */
    @Override
    public int deleteSheepImmunizationById(Long id)
    {
        return sheepImmunizationMapper.deleteSheepImmunizationById(id);
    }
}
