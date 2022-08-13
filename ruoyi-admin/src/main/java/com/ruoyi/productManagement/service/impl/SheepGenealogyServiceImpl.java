package com.ruoyi.productManagement.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.productManagement.mapper.SheepGenealogyMapper;
import com.ruoyi.productManagement.domain.SheepGenealogy;
import com.ruoyi.productManagement.service.ISheepGenealogyService;

/**
 * 系谱档案Service业务层处理
 *
 * @author 孙少聪
 * @date 2022-03-30
 */
@Service
public class SheepGenealogyServiceImpl implements ISheepGenealogyService
{
    @Autowired
    private SheepGenealogyMapper sheepGenealogyMapper;

    /**
     * 查询每种羊的数量
     * 孙少聪
     * @return 根据羊只种类分组查询个数
     */
    @Override
    public List<Map<String, Object>> selectSheepGenealogysheepSpecies() {
        System.out.println(sheepGenealogyMapper.selectSheepGenealogysheepSpecies());
        return sheepGenealogyMapper.selectSheepGenealogysheepSpecies();
    }

    /**
     * 查询养殖场的个数
     * 孙少聪
     */
    @Override
    public List<SheepGenealogy> selectSheepGenealogyFaemlocList() {
        return sheepGenealogyMapper.selectSheepGenealogyFaemlocList();
    }

    /**
     * 查询系谱档案
     *
     * @param id 系谱档案主键
     * @return 系谱档案
     */
    @Override
    public SheepGenealogy selectSheepGenealogyById(Long id)
    {
        return sheepGenealogyMapper.selectSheepGenealogyById(id);
    }

    /**
     * 查询系谱档案列表
     *
     * @param sheepGenealogy 系谱档案
     * @return 系谱档案
     */
    @Override
    public List<SheepGenealogy> selectSheepGenealogyList(SheepGenealogy sheepGenealogy)
    {
//        System.out.println(sheepGenealogyMapper.selectSheepGenealogyList(sheepGenealogy));
        return sheepGenealogyMapper.selectSheepGenealogyList(sheepGenealogy);
    }

    /**
     * 新增系谱档案
     *
     * @param sheepGenealogy 系谱档案
     * @return 结果
     */
    @Override
    public int insertSheepGenealogy(SheepGenealogy sheepGenealogy)
    {
        return sheepGenealogyMapper.insertSheepGenealogy(sheepGenealogy);
    }

    /**
     * 修改系谱档案
     *
     * @param sheepGenealogy 系谱档案
     * @return 结果
     */
    @Override
    public int updateSheepGenealogy(SheepGenealogy sheepGenealogy)
    {
        return sheepGenealogyMapper.updateSheepGenealogy(sheepGenealogy);
    }

    /**
     * 批量删除系谱档案
     *
     * @param ids 需要删除的系谱档案主键
     * @return 结果
     */
    @Override
    public int deleteSheepGenealogyByIds(Long[] ids)
    {
        return sheepGenealogyMapper.deleteSheepGenealogyByIds(ids);
    }

    /**
     * 删除系谱档案信息
     *
     * @param id 系谱档案主键
     * @return 结果
     */
    @Override
    public int deleteSheepGenealogyById(Long id)
    {
        return sheepGenealogyMapper.deleteSheepGenealogyById(id);
    }
}
