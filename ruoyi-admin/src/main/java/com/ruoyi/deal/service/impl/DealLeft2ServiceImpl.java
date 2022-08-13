package com.ruoyi.deal.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.deal.mapper.DealLeft2Mapper;
import com.ruoyi.deal.domain.DealLeft2;
import com.ruoyi.deal.service.IDealLeft2Service;

/**
 * 左 2Service业务层处理
 * 
 * @author 孙少聪
 * @date 2022-03-30
 */
@Service
public class DealLeft2ServiceImpl implements IDealLeft2Service 
{
    @Autowired
    private DealLeft2Mapper dealLeft2Mapper;

    /**
     * 查询左 2
     * 
     * @param id 左 2主键
     * @return 左 2
     */
    @Override
    public DealLeft2 selectDealLeft2ById(Long id)
    {
        return dealLeft2Mapper.selectDealLeft2ById(id);
    }

    /**
     * 查询左 2列表
     * 
     * @param dealLeft2 左 2
     * @return 左 2
     */
    @Override
    public List<DealLeft2> selectDealLeft2List(DealLeft2 dealLeft2)
    {
        return dealLeft2Mapper.selectDealLeft2List(dealLeft2);
    }

    /**
     * 新增左 2
     * 
     * @param dealLeft2 左 2
     * @return 结果
     */
    @Override
    public int insertDealLeft2(DealLeft2 dealLeft2)
    {
        return dealLeft2Mapper.insertDealLeft2(dealLeft2);
    }

    /**
     * 修改左 2
     * 
     * @param dealLeft2 左 2
     * @return 结果
     */
    @Override
    public int updateDealLeft2(DealLeft2 dealLeft2)
    {
        return dealLeft2Mapper.updateDealLeft2(dealLeft2);
    }

    /**
     * 批量删除左 2
     * 
     * @param ids 需要删除的左 2主键
     * @return 结果
     */
    @Override
    public int deleteDealLeft2ByIds(Long[] ids)
    {
        return dealLeft2Mapper.deleteDealLeft2ByIds(ids);
    }

    /**
     * 删除左 2信息
     * 
     * @param id 左 2主键
     * @return 结果
     */
    @Override
    public int deleteDealLeft2ById(Long id)
    {
        return dealLeft2Mapper.deleteDealLeft2ById(id);
    }
}
