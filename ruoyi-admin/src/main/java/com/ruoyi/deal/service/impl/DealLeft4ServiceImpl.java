package com.ruoyi.deal.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.deal.mapper.DealLeft4Mapper;
import com.ruoyi.deal.domain.DealLeft4;
import com.ruoyi.deal.service.IDealLeft4Service;

/**
 * 左 4Service业务层处理
 * 
 * @author 孙少聪
 * @date 2022-03-30
 */
@Service
public class DealLeft4ServiceImpl implements IDealLeft4Service 
{
    @Autowired
    private DealLeft4Mapper dealLeft4Mapper;

    /**
     * 查询左 4
     * 
     * @param id 左 4主键
     * @return 左 4
     */
    @Override
    public DealLeft4 selectDealLeft4ById(Long id)
    {
        return dealLeft4Mapper.selectDealLeft4ById(id);
    }

    /**
     * 查询左 4列表
     * 
     * @param dealLeft4 左 4
     * @return 左 4
     */
    @Override
    public List<DealLeft4> selectDealLeft4List(DealLeft4 dealLeft4)
    {
        return dealLeft4Mapper.selectDealLeft4List(dealLeft4);
    }

    /**
     * 新增左 4
     * 
     * @param dealLeft4 左 4
     * @return 结果
     */
    @Override
    public int insertDealLeft4(DealLeft4 dealLeft4)
    {
        return dealLeft4Mapper.insertDealLeft4(dealLeft4);
    }

    /**
     * 修改左 4
     * 
     * @param dealLeft4 左 4
     * @return 结果
     */
    @Override
    public int updateDealLeft4(DealLeft4 dealLeft4)
    {
        return dealLeft4Mapper.updateDealLeft4(dealLeft4);
    }

    /**
     * 批量删除左 4
     * 
     * @param ids 需要删除的左 4主键
     * @return 结果
     */
    @Override
    public int deleteDealLeft4ByIds(Long[] ids)
    {
        return dealLeft4Mapper.deleteDealLeft4ByIds(ids);
    }

    /**
     * 删除左 4信息
     * 
     * @param id 左 4主键
     * @return 结果
     */
    @Override
    public int deleteDealLeft4ById(Long id)
    {
        return dealLeft4Mapper.deleteDealLeft4ById(id);
    }
}
