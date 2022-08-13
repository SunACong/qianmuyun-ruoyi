package com.ruoyi.productManagement.mapper;

import java.util.List;
import com.ruoyi.productManagement.domain.SheepNutrition;

/**
 * 阶段营养档案Mapper接口
 * 
 * @author 孙少聪
 * @date 2022-03-30
 */
public interface SheepNutritionMapper 
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
     * 删除阶段营养档案
     * 
     * @param id 阶段营养档案主键
     * @return 结果
     */
    public int deleteSheepNutritionById(Long id);

    /**
     * 批量删除阶段营养档案
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSheepNutritionByIds(Long[] ids);
}
