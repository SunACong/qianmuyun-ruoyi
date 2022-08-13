package com.ruoyi.productManagement.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.productManagement.mapper.Sheep2SamplingMapper;
import com.ruoyi.productManagement.domain.Sheep2Sampling;
import com.ruoyi.productManagement.service.ISheep2SamplingService;

/**
 * 采样记录Service业务层处理
 * 
 * @author 孙少聪
 * @date 2022-05-20
 */
@Service
public class Sheep2SamplingServiceImpl implements ISheep2SamplingService 
{
    @Autowired
    private Sheep2SamplingMapper sheep2SamplingMapper;

    /**
     * 查询采样记录
     * 
     * @param id 采样记录主键
     * @return 采样记录
     */
    @Override
    public Sheep2Sampling selectSheep2SamplingById(Long id)
    {
        return sheep2SamplingMapper.selectSheep2SamplingById(id);
    }

    /**
     * 查询采样记录列表
     * 
     * @param sheep2Sampling 采样记录
     * @return 采样记录
     */
    @Override
    public List<Sheep2Sampling> selectSheep2SamplingList(Sheep2Sampling sheep2Sampling)
    {
        return sheep2SamplingMapper.selectSheep2SamplingList(sheep2Sampling);
    }

    /**
     * 新增采样记录
     * 
     * @param sheep2Sampling 采样记录
     * @return 结果
     */
    @Override
    public int insertSheep2Sampling(Sheep2Sampling sheep2Sampling)
    {
        return sheep2SamplingMapper.insertSheep2Sampling(sheep2Sampling);
    }

    /**
     * 修改采样记录
     * 
     * @param sheep2Sampling 采样记录
     * @return 结果
     */
    @Override
    public int updateSheep2Sampling(Sheep2Sampling sheep2Sampling)
    {
        sheep2Sampling.setUpdateTime(DateUtils.getNowDate());
        return sheep2SamplingMapper.updateSheep2Sampling(sheep2Sampling);
    }

    /**
     * 批量删除采样记录
     * 
     * @param ids 需要删除的采样记录主键
     * @return 结果
     */
    @Override
    public int deleteSheep2SamplingByIds(Long[] ids)
    {
        return sheep2SamplingMapper.deleteSheep2SamplingByIds(ids);
    }

    /**
     * 删除采样记录信息
     * 
     * @param id 采样记录主键
     * @return 结果
     */
    @Override
    public int deleteSheep2SamplingById(Long id)
    {
        return sheep2SamplingMapper.deleteSheep2SamplingById(id);
    }
}
