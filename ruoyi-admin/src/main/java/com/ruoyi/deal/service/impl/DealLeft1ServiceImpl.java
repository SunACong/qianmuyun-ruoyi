package com.ruoyi.deal.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.deal.mapper.DealLeft1Mapper;
import com.ruoyi.deal.domain.DealLeft1;
import com.ruoyi.deal.service.IDealLeft1Service;

/**
 * 左 1Service业务层处理
 * 
 * @author 孙少聪
 * @date 2022-03-30
 */
@Service
public class DealLeft1ServiceImpl implements IDealLeft1Service 
{
    @Autowired
    private DealLeft1Mapper dealLeft1Mapper;

    /**
     * 查询左 1
     * 
     * @param id 左 1主键
     * @return 左 1
     */
    @Override
    public DealLeft1 selectDealLeft1ById(Long id)
    {
        return dealLeft1Mapper.selectDealLeft1ById(id);
    }

    /**
     * 查询左 1列表
     * 
     * @param dealLeft1 左 1
     * @return 左 1
     */
    @Override
    public List<DealLeft1> selectDealLeft1List(DealLeft1 dealLeft1)
    {
        return dealLeft1Mapper.selectDealLeft1List(dealLeft1);
    }

    /**
     * 新增左 1
     * 
     * @param dealLeft1 左 1
     * @return 结果
     */
    @Override
    public int insertDealLeft1(DealLeft1 dealLeft1)
    {
        return dealLeft1Mapper.insertDealLeft1(dealLeft1);
    }

    /**
     * 修改左 1
     * 
     * @param dealLeft1 左 1
     * @return 结果
     */
    @Override
    public int updateDealLeft1(DealLeft1 dealLeft1)
    {
        return dealLeft1Mapper.updateDealLeft1(dealLeft1);
    }

    /**
     * 批量删除左 1
     * 
     * @param ids 需要删除的左 1主键
     * @return 结果
     */
    @Override
    public int deleteDealLeft1ByIds(Long[] ids)
    {
        return dealLeft1Mapper.deleteDealLeft1ByIds(ids);
    }

    /**
     * 删除左 1信息
     * 
     * @param id 左 1主键
     * @return 结果
     */
    @Override
    public int deleteDealLeft1ById(Long id)
    {
        return dealLeft1Mapper.deleteDealLeft1ById(id);
    }
}
