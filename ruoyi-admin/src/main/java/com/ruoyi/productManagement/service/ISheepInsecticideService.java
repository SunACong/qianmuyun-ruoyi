package com.ruoyi.productManagement.service;

import java.util.List;
import com.ruoyi.productManagement.domain.SheepInsecticide;

/**
 * 驱虫档案Service接口
 * 
 * @author 孙少聪
 * @date 2022-03-30
 */
public interface ISheepInsecticideService 
{
    /**
     * 查询驱虫档案
     * 
     * @param id 驱虫档案主键
     * @return 驱虫档案
     */
    public SheepInsecticide selectSheepInsecticideById(Long id);

    /**
     * 查询驱虫档案列表
     * 
     * @param sheepInsecticide 驱虫档案
     * @return 驱虫档案集合
     */
    public List<SheepInsecticide> selectSheepInsecticideList(SheepInsecticide sheepInsecticide);

    /**
     * 新增驱虫档案
     * 
     * @param sheepInsecticide 驱虫档案
     * @return 结果
     */
    public int insertSheepInsecticide(SheepInsecticide sheepInsecticide);

    /**
     * 修改驱虫档案
     * 
     * @param sheepInsecticide 驱虫档案
     * @return 结果
     */
    public int updateSheepInsecticide(SheepInsecticide sheepInsecticide);

    /**
     * 批量删除驱虫档案
     * 
     * @param ids 需要删除的驱虫档案主键集合
     * @return 结果
     */
    public int deleteSheepInsecticideByIds(Long[] ids);

    /**
     * 删除驱虫档案信息
     * 
     * @param id 驱虫档案主键
     * @return 结果
     */
    public int deleteSheepInsecticideById(Long id);
}
