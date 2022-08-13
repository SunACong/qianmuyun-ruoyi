package com.ruoyi.productManagement.service;

import java.util.List;
import com.ruoyi.productManagement.domain.SheepImmunization;

/**
 * 免疫档案Service接口
 * 
 * @author 孙少聪
 * @date 2022-03-30
 */
public interface ISheepImmunizationService 
{
    /**
     * 查询免疫档案
     * 
     * @param id 免疫档案主键
     * @return 免疫档案
     */
    public SheepImmunization selectSheepImmunizationById(Long id);

    /**
     * 查询免疫档案列表
     * 
     * @param sheepImmunization 免疫档案
     * @return 免疫档案集合
     */
    public List<SheepImmunization> selectSheepImmunizationList(SheepImmunization sheepImmunization);

    /**
     * 新增免疫档案
     * 
     * @param sheepImmunization 免疫档案
     * @return 结果
     */
    public int insertSheepImmunization(SheepImmunization sheepImmunization);

    /**
     * 修改免疫档案
     * 
     * @param sheepImmunization 免疫档案
     * @return 结果
     */
    public int updateSheepImmunization(SheepImmunization sheepImmunization);

    /**
     * 批量删除免疫档案
     * 
     * @param ids 需要删除的免疫档案主键集合
     * @return 结果
     */
    public int deleteSheepImmunizationByIds(Long[] ids);

    /**
     * 删除免疫档案信息
     * 
     * @param id 免疫档案主键
     * @return 结果
     */
    public int deleteSheepImmunizationById(Long id);
}
