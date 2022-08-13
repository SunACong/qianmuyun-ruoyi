package com.ruoyi.deal.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.deal.mapper.DealLeft3Mapper;
import com.ruoyi.deal.domain.DealLeft3;
import com.ruoyi.deal.service.IDealLeft3Service;

/**
 * 左 3Service业务层处理
 * 
 * @author 孙少聪
 * @date 2022-03-30
 */
@Service
public class DealLeft3ServiceImpl implements IDealLeft3Service 
{
    @Autowired
    private DealLeft3Mapper dealLeft3Mapper;

    /**
     * 查询左 3
     * 
     * @param id 左 3主键
     * @return 左 3
     */
    @Override
    public DealLeft3 selectDealLeft3ById(Long id)
    {
        return dealLeft3Mapper.selectDealLeft3ById(id);
    }

    /**
     * 查询左 3列表
     * 
     * @param dealLeft3 左 3
     * @return 左 3
     */
    @Override
    public List<DealLeft3> selectDealLeft3List(DealLeft3 dealLeft3)
    {
        return dealLeft3Mapper.selectDealLeft3List(dealLeft3);
    }

    /**
     * 新增左 3
     * 
     * @param dealLeft3 左 3
     * @return 结果
     */
    @Override
    public int insertDealLeft3(DealLeft3 dealLeft3)
    {
        return dealLeft3Mapper.insertDealLeft3(dealLeft3);
    }

    /**
     * 修改左 3
     * 
     * @param dealLeft3 左 3
     * @return 结果
     */
    @Override
    public int updateDealLeft3(DealLeft3 dealLeft3)
    {
        return dealLeft3Mapper.updateDealLeft3(dealLeft3);
    }

    /**
     * 批量删除左 3
     * 
     * @param ids 需要删除的左 3主键
     * @return 结果
     */
    @Override
    public int deleteDealLeft3ByIds(Long[] ids)
    {
        return dealLeft3Mapper.deleteDealLeft3ByIds(ids);
    }

    /**
     * 删除左 3信息
     * 
     * @param id 左 3主键
     * @return 结果
     */
    @Override
    public int deleteDealLeft3ById(Long id)
    {
        return dealLeft3Mapper.deleteDealLeft3ById(id);
    }
}
