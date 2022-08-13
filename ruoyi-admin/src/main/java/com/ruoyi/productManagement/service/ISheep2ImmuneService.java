package com.ruoyi.productManagement.service;

import java.util.List;
import com.ruoyi.productManagement.domain.Sheep2Immune;

/**
 * 免疫记录Service接口
 * 
 * @author 孙少聪
 * @date 2022-05-20
 */
public interface ISheep2ImmuneService 
{
    /**
     * 查询免疫记录
     * 
     * @param id 免疫记录主键
     * @return 免疫记录
     */
    public Sheep2Immune selectSheep2ImmuneById(Long id);

    /**
     * 查询免疫记录列表
     * 
     * @param sheep2Immune 免疫记录
     * @return 免疫记录集合
     */
    public List<Sheep2Immune> selectSheep2ImmuneList(Sheep2Immune sheep2Immune);

    /**
     * 新增免疫记录
     * 
     * @param sheep2Immune 免疫记录
     * @return 结果
     */
    public int insertSheep2Immune(Sheep2Immune sheep2Immune);

    /**
     * 修改免疫记录
     * 
     * @param sheep2Immune 免疫记录
     * @return 结果
     */
    public int updateSheep2Immune(Sheep2Immune sheep2Immune);

    /**
     * 批量删除免疫记录
     * 
     * @param ids 需要删除的免疫记录主键集合
     * @return 结果
     */
    public int deleteSheep2ImmuneByIds(Long[] ids);

    /**
     * 删除免疫记录信息
     * 
     * @param id 免疫记录主键
     * @return 结果
     */
    public int deleteSheep2ImmuneById(Long id);
}
