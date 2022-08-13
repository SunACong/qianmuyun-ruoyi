package com.ruoyi.productManagement.mapper;

import java.util.List;
import com.ruoyi.productManagement.domain.Sheep2Genealogy;

/**
 * 系谱记录Mapper接口
 * 
 * @author 孙少聪
 * @date 2022-05-20
 */
public interface Sheep2GenealogyMapper 
{
    /**
     * 查询系谱记录
     * 
     * @param id 系谱记录主键
     * @return 系谱记录
     */
    public Sheep2Genealogy selectSheep2GenealogyById(Long id);

    /**
     * 查询系谱记录列表
     * 
     * @param sheep2Genealogy 系谱记录
     * @return 系谱记录集合
     */
    public List<Sheep2Genealogy> selectSheep2GenealogyList(Sheep2Genealogy sheep2Genealogy);

    /**
     * 新增系谱记录
     * 
     * @param sheep2Genealogy 系谱记录
     * @return 结果
     */
    public int insertSheep2Genealogy(Sheep2Genealogy sheep2Genealogy);

    /**
     * 修改系谱记录
     * 
     * @param sheep2Genealogy 系谱记录
     * @return 结果
     */
    public int updateSheep2Genealogy(Sheep2Genealogy sheep2Genealogy);

    /**
     * 删除系谱记录
     * 
     * @param id 系谱记录主键
     * @return 结果
     */
    public int deleteSheep2GenealogyById(Long id);

    /**
     * 批量删除系谱记录
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSheep2GenealogyByIds(Long[] ids);
}
