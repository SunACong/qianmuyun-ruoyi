package com.ruoyi.productManagement.mapper;

import java.util.List;
import com.ruoyi.productManagement.domain.Sheep2Sampling;

/**
 * 采样记录Mapper接口
 * 
 * @author 孙少聪
 * @date 2022-05-20
 */
public interface Sheep2SamplingMapper 
{
    /**
     * 查询采样记录
     * 
     * @param id 采样记录主键
     * @return 采样记录
     */
    public Sheep2Sampling selectSheep2SamplingById(Long id);

    /**
     * 查询采样记录列表
     * 
     * @param sheep2Sampling 采样记录
     * @return 采样记录集合
     */
    public List<Sheep2Sampling> selectSheep2SamplingList(Sheep2Sampling sheep2Sampling);

    /**
     * 新增采样记录
     * 
     * @param sheep2Sampling 采样记录
     * @return 结果
     */
    public int insertSheep2Sampling(Sheep2Sampling sheep2Sampling);

    /**
     * 修改采样记录
     * 
     * @param sheep2Sampling 采样记录
     * @return 结果
     */
    public int updateSheep2Sampling(Sheep2Sampling sheep2Sampling);

    /**
     * 删除采样记录
     * 
     * @param id 采样记录主键
     * @return 结果
     */
    public int deleteSheep2SamplingById(Long id);

    /**
     * 批量删除采样记录
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSheep2SamplingByIds(Long[] ids);
}
