package com.ruoyi.deal.service;

import java.util.List;
import com.ruoyi.deal.domain.DealRight3;

/**
 * 右 3Service接口
 * 
 * @author 孙少聪
 * @date 2022-03-30
 */
public interface IDealRight3Service 
{
    /**
     * 查询右 3
     * 
     * @param id 右 3主键
     * @return 右 3
     */
    public DealRight3 selectDealRight3ById(Long id);

    /**
     * 查询右 3列表
     * 
     * @param dealRight3 右 3
     * @return 右 3集合
     */
    public List<DealRight3> selectDealRight3List(DealRight3 dealRight3);

    /**
     * 新增右 3
     * 
     * @param dealRight3 右 3
     * @return 结果
     */
    public int insertDealRight3(DealRight3 dealRight3);

    /**
     * 修改右 3
     * 
     * @param dealRight3 右 3
     * @return 结果
     */
    public int updateDealRight3(DealRight3 dealRight3);

    /**
     * 批量删除右 3
     * 
     * @param ids 需要删除的右 3主键集合
     * @return 结果
     */
    public int deleteDealRight3ByIds(Long[] ids);

    /**
     * 删除右 3信息
     * 
     * @param id 右 3主键
     * @return 结果
     */
    public int deleteDealRight3ById(Long id);
}
