package com.ruoyi.productManagement.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.productManagement.mapper.Sheep2GenealogyMapper;
import com.ruoyi.productManagement.domain.Sheep2Genealogy;
import com.ruoyi.productManagement.service.ISheep2GenealogyService;

/**
 * 系谱记录Service业务层处理
 * 
 * @author 孙少聪
 * @date 2022-05-20
 */
@Service
public class Sheep2GenealogyServiceImpl implements ISheep2GenealogyService 
{
    @Autowired
    private Sheep2GenealogyMapper sheep2GenealogyMapper;

    /**
     * 查询系谱记录
     * 
     * @param id 系谱记录主键
     * @return 系谱记录
     */
    @Override
    public Sheep2Genealogy selectSheep2GenealogyById(Long id)
    {
        return sheep2GenealogyMapper.selectSheep2GenealogyById(id);
    }

    /**
     * 查询系谱记录列表
     * 
     * @param sheep2Genealogy 系谱记录
     * @return 系谱记录
     */
    @Override
    public List<Sheep2Genealogy> selectSheep2GenealogyList(Sheep2Genealogy sheep2Genealogy)
    {
        return sheep2GenealogyMapper.selectSheep2GenealogyList(sheep2Genealogy);
    }

    /**
     * 新增系谱记录
     * 
     * @param sheep2Genealogy 系谱记录
     * @return 结果
     */
    @Override
    public int insertSheep2Genealogy(Sheep2Genealogy sheep2Genealogy)
    {
        return sheep2GenealogyMapper.insertSheep2Genealogy(sheep2Genealogy);
    }

    /**
     * 修改系谱记录
     * 
     * @param sheep2Genealogy 系谱记录
     * @return 结果
     */
    @Override
    public int updateSheep2Genealogy(Sheep2Genealogy sheep2Genealogy)
    {
        sheep2Genealogy.setUpdateTime(DateUtils.getNowDate());
        return sheep2GenealogyMapper.updateSheep2Genealogy(sheep2Genealogy);
    }

    /**
     * 批量删除系谱记录
     * 
     * @param ids 需要删除的系谱记录主键
     * @return 结果
     */
    @Override
    public int deleteSheep2GenealogyByIds(Long[] ids)
    {
        return sheep2GenealogyMapper.deleteSheep2GenealogyByIds(ids);
    }

    /**
     * 删除系谱记录信息
     * 
     * @param id 系谱记录主键
     * @return 结果
     */
    @Override
    public int deleteSheep2GenealogyById(Long id)
    {
        return sheep2GenealogyMapper.deleteSheep2GenealogyById(id);
    }
}
