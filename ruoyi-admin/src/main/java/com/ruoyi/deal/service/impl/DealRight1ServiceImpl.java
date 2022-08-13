package com.ruoyi.deal.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.deal.mapper.DealRight1Mapper;
import com.ruoyi.deal.domain.DealRight1;
import com.ruoyi.deal.service.IDealRight1Service;

/**
 * 右 1Service业务层处理
 * 
 * @author 孙少聪
 * @date 2022-03-30
 */
@Service
public class DealRight1ServiceImpl implements IDealRight1Service 
{
    @Autowired
    private DealRight1Mapper dealRight1Mapper;

    /**
     * 查询右 1
     * 
     * @param id 右 1主键
     * @return 右 1
     */
    @Override
    public DealRight1 selectDealRight1ById(Long id)
    {
        return dealRight1Mapper.selectDealRight1ById(id);
    }

    /**
     * 查询右 1列表
     * 
     * @param dealRight1 右 1
     * @return 右 1
     */
    @Override
    public List<DealRight1> selectDealRight1List(DealRight1 dealRight1)
    {
        return dealRight1Mapper.selectDealRight1List(dealRight1);
    }

    /**
     * 新增右 1
     * 
     * @param dealRight1 右 1
     * @return 结果
     */
    @Override
    public int insertDealRight1(DealRight1 dealRight1)
    {
        return dealRight1Mapper.insertDealRight1(dealRight1);
    }

    /**
     * 修改右 1
     * 
     * @param dealRight1 右 1
     * @return 结果
     */
    @Override
    public int updateDealRight1(DealRight1 dealRight1)
    {
        return dealRight1Mapper.updateDealRight1(dealRight1);
    }

    /**
     * 批量删除右 1
     * 
     * @param ids 需要删除的右 1主键
     * @return 结果
     */
    @Override
    public int deleteDealRight1ByIds(Long[] ids)
    {
        return dealRight1Mapper.deleteDealRight1ByIds(ids);
    }

    /**
     * 删除右 1信息
     * 
     * @param id 右 1主键
     * @return 结果
     */
    @Override
    public int deleteDealRight1ById(Long id)
    {
        return dealRight1Mapper.deleteDealRight1ById(id);
    }
}
