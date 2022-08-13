package com.ruoyi.deal.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.deal.mapper.DealRight3Mapper;
import com.ruoyi.deal.domain.DealRight3;
import com.ruoyi.deal.service.IDealRight3Service;

/**
 * 右 3Service业务层处理
 * 
 * @author 孙少聪
 * @date 2022-03-30
 */
@Service
public class DealRight3ServiceImpl implements IDealRight3Service 
{
    @Autowired
    private DealRight3Mapper dealRight3Mapper;

    /**
     * 查询右 3
     * 
     * @param id 右 3主键
     * @return 右 3
     */
    @Override
    public DealRight3 selectDealRight3ById(Long id)
    {
        return dealRight3Mapper.selectDealRight3ById(id);
    }

    /**
     * 查询右 3列表
     * 
     * @param dealRight3 右 3
     * @return 右 3
     */
    @Override
    public List<DealRight3> selectDealRight3List(DealRight3 dealRight3)
    {
        return dealRight3Mapper.selectDealRight3List(dealRight3);
    }

    /**
     * 新增右 3
     * 
     * @param dealRight3 右 3
     * @return 结果
     */
    @Override
    public int insertDealRight3(DealRight3 dealRight3)
    {
        return dealRight3Mapper.insertDealRight3(dealRight3);
    }

    /**
     * 修改右 3
     * 
     * @param dealRight3 右 3
     * @return 结果
     */
    @Override
    public int updateDealRight3(DealRight3 dealRight3)
    {
        return dealRight3Mapper.updateDealRight3(dealRight3);
    }

    /**
     * 批量删除右 3
     * 
     * @param ids 需要删除的右 3主键
     * @return 结果
     */
    @Override
    public int deleteDealRight3ByIds(Long[] ids)
    {
        return dealRight3Mapper.deleteDealRight3ByIds(ids);
    }

    /**
     * 删除右 3信息
     * 
     * @param id 右 3主键
     * @return 结果
     */
    @Override
    public int deleteDealRight3ById(Long id)
    {
        return dealRight3Mapper.deleteDealRight3ById(id);
    }
}
