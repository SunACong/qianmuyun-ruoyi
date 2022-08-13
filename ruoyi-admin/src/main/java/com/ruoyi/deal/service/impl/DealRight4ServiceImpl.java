package com.ruoyi.deal.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.deal.mapper.DealRight4Mapper;
import com.ruoyi.deal.domain.DealRight4;
import com.ruoyi.deal.service.IDealRight4Service;

/**
 * 右 4Service业务层处理
 * 
 * @author 孙少聪
 * @date 2022-03-30
 */
@Service
public class DealRight4ServiceImpl implements IDealRight4Service 
{
    @Autowired
    private DealRight4Mapper dealRight4Mapper;

    /**
     * 查询右 4
     * 
     * @param id 右 4主键
     * @return 右 4
     */
    @Override
    public DealRight4 selectDealRight4ById(Long id)
    {
        return dealRight4Mapper.selectDealRight4ById(id);
    }

    /**
     * 查询右 4列表
     * 
     * @param dealRight4 右 4
     * @return 右 4
     */
    @Override
    public List<DealRight4> selectDealRight4List(DealRight4 dealRight4)
    {
        return dealRight4Mapper.selectDealRight4List(dealRight4);
    }

    /**
     * 新增右 4
     * 
     * @param dealRight4 右 4
     * @return 结果
     */
    @Override
    public int insertDealRight4(DealRight4 dealRight4)
    {
        return dealRight4Mapper.insertDealRight4(dealRight4);
    }

    /**
     * 修改右 4
     * 
     * @param dealRight4 右 4
     * @return 结果
     */
    @Override
    public int updateDealRight4(DealRight4 dealRight4)
    {
        return dealRight4Mapper.updateDealRight4(dealRight4);
    }

    /**
     * 批量删除右 4
     * 
     * @param ids 需要删除的右 4主键
     * @return 结果
     */
    @Override
    public int deleteDealRight4ByIds(Long[] ids)
    {
        return dealRight4Mapper.deleteDealRight4ByIds(ids);
    }

    /**
     * 删除右 4信息
     * 
     * @param id 右 4主键
     * @return 结果
     */
    @Override
    public int deleteDealRight4ById(Long id)
    {
        return dealRight4Mapper.deleteDealRight4ById(id);
    }
}
