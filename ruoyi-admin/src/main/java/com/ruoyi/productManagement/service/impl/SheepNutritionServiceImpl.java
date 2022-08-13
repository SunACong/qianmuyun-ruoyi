package com.ruoyi.productManagement.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.productManagement.mapper.SheepNutritionMapper;
import com.ruoyi.productManagement.domain.SheepNutrition;
import com.ruoyi.productManagement.service.ISheepNutritionService;

/**
 * 阶段营养档案Service业务层处理
 * 
 * @author 孙少聪
 * @date 2022-03-30
 */
@Service
public class SheepNutritionServiceImpl implements ISheepNutritionService 
{
    @Autowired
    private SheepNutritionMapper sheepNutritionMapper;

    /**
     * 查询阶段营养档案
     * 
     * @param id 阶段营养档案主键
     * @return 阶段营养档案
     */
    @Override
    public SheepNutrition selectSheepNutritionById(Long id)
    {
        return sheepNutritionMapper.selectSheepNutritionById(id);
    }

    /**
     * 查询阶段营养档案列表
     * 
     * @param sheepNutrition 阶段营养档案
     * @return 阶段营养档案
     */
    @Override
    public List<SheepNutrition> selectSheepNutritionList(SheepNutrition sheepNutrition)
    {
        return sheepNutritionMapper.selectSheepNutritionList(sheepNutrition);
    }

    /**
     * 新增阶段营养档案
     * 
     * @param sheepNutrition 阶段营养档案
     * @return 结果
     */
    @Override
    public int insertSheepNutrition(SheepNutrition sheepNutrition)
    {
        return sheepNutritionMapper.insertSheepNutrition(sheepNutrition);
    }

    /**
     * 修改阶段营养档案
     * 
     * @param sheepNutrition 阶段营养档案
     * @return 结果
     */
    @Override
    public int updateSheepNutrition(SheepNutrition sheepNutrition)
    {
        return sheepNutritionMapper.updateSheepNutrition(sheepNutrition);
    }

    /**
     * 批量删除阶段营养档案
     * 
     * @param ids 需要删除的阶段营养档案主键
     * @return 结果
     */
    @Override
    public int deleteSheepNutritionByIds(Long[] ids)
    {
        return sheepNutritionMapper.deleteSheepNutritionByIds(ids);
    }

    /**
     * 删除阶段营养档案信息
     * 
     * @param id 阶段营养档案主键
     * @return 结果
     */
    @Override
    public int deleteSheepNutritionById(Long id)
    {
        return sheepNutritionMapper.deleteSheepNutritionById(id);
    }
}
