package com.ruoyi.productManagement.mapper;

import java.util.List;
import java.util.Map;

import com.ruoyi.productManagement.domain.SheepGenealogy;

/**
 * 系谱档案Mapper接口
 *
 * @author 孙少聪
 * @date 2022-03-30
 */
public interface SheepGenealogyMapper
{
    /**
     * 查询系谱档案
     *
     * @param id 系谱档案主键
     * @return 系谱档案
     */
    public SheepGenealogy selectSheepGenealogyById(Long id);

    /**
     * 查询系谱档案列表
     *
     * @param sheepGenealogy 系谱档案
     * @return 系谱档案集合
     */
    public List<SheepGenealogy> selectSheepGenealogyList(SheepGenealogy sheepGenealogy);

    /**
     * 新增系谱档案
     *
     * @param sheepGenealogy 系谱档案
     * @return 结果
     */
    public int insertSheepGenealogy(SheepGenealogy sheepGenealogy);

    /**
     * 修改系谱档案
     *
     * @param sheepGenealogy 系谱档案
     * @return 结果
     */
    public int updateSheepGenealogy(SheepGenealogy sheepGenealogy);

    /**
     * 删除系谱档案
     *
     * @param id 系谱档案主键
     * @return 结果
     */
    public int deleteSheepGenealogyById(Long id);

    /**
     * 批量删除系谱档案
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSheepGenealogyByIds(Long[] ids);


    /**
     * 查询养殖场的个数
     * @return 返回的是根据养殖场的分组数据
     * 孙少聪
     */
    public List<SheepGenealogy> selectSheepGenealogyFaemlocList();

    /**
     * 查询每种羊的数量
     * 孙少聪
     * @return 根据羊只种类分组查询个数
     */
    public List<Map<String, Object>> selectSheepGenealogysheepSpecies();
}
