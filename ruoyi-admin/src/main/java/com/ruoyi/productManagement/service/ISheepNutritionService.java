package com.ruoyi.productManagement.service;

import java.util.List;
import com.ruoyi.productManagement.domain.SheepNutrition;

/**
 * 阶段营养档案Service接口
 * 
 * @author 孙少聪
 * @date 2022-03-30
 */
public interface ISheepNutritionService 
{
    /**
     * 查询阶段营养档案
     * 
     * @param id 阶段营养档案主键
     * @return 阶段营养档案
     */
    public SheepNutrition selectSheepNutritionById(Long id);

    /**
     * 查询阶段营养档案列表
     * 
     * @param sheepNutrition 阶段营养档案
     * @return 阶段营养档案集合
     */
    public List<SheepNutrition> selectSheepNutritionList(SheepNutrition sheepNutrition);

    /**
     * 新增阶段营养档案
     * 
     * @param sheepNutrition 阶段营养档案
     * @return 结果
     */
    public int insertSheepNutrition(SheepNutrition sheepNutrition);

    /**
     * 修改阶段营养档案
     * 
     * @param sheepNutrition 阶段营养档案
     * @return 结果
     */
    public int updateSheepNutrition(SheepNutrition sheepNutrition);

    /**
     * 批量删除阶段营养档案
     * 
     * @param ids 需要删除的阶段营养档案主键集合
     * @return 结果
     */
    public int deleteSheepNutritionByIds(Long[] ids);

    /**
     * 删除阶段营养档案信息
     * 
     * @param id 阶段营养档案主键
     * @return 结果
     */
    public int deleteSheepNutritionById(Long id);
}
