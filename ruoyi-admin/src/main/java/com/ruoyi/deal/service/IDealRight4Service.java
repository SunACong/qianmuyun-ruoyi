package com.ruoyi.deal.service;

import java.util.List;
import com.ruoyi.deal.domain.DealRight4;

/**
 * 右 4Service接口
 * 
 * @author 孙少聪
 * @date 2022-03-30
 */
public interface IDealRight4Service 
{
    /**
     * 查询右 4
     * 
     * @param id 右 4主键
     * @return 右 4
     */
    public DealRight4 selectDealRight4ById(Long id);

    /**
     * 查询右 4列表
     * 
     * @param dealRight4 右 4
     * @return 右 4集合
     */
    public List<DealRight4> selectDealRight4List(DealRight4 dealRight4);

    /**
     * 新增右 4
     * 
     * @param dealRight4 右 4
     * @return 结果
     */
    public int insertDealRight4(DealRight4 dealRight4);

    /**
     * 修改右 4
     * 
     * @param dealRight4 右 4
     * @return 结果
     */
    public int updateDealRight4(DealRight4 dealRight4);

    /**
     * 批量删除右 4
     * 
     * @param ids 需要删除的右 4主键集合
     * @return 结果
     */
    public int deleteDealRight4ByIds(Long[] ids);

    /**
     * 删除右 4信息
     * 
     * @param id 右 4主键
     * @return 结果
     */
    public int deleteDealRight4ById(Long id);
}
