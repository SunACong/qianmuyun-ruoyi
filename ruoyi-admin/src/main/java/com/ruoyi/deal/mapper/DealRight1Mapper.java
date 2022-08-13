package com.ruoyi.deal.mapper;

import java.util.List;
import com.ruoyi.deal.domain.DealRight1;

/**
 * 右 1Mapper接口
 *
 * @author 孙少聪
 * @date 2022-03-30
 */
public interface DealRight1Mapper
{
    /**
     * 查询右 1
     *
     * @param id 右 1主键
     * @return 右 1
     */
    public DealRight1 selectDealRight1ById(Long id);

    /**
     *      * 查询右 1列表
     *      *
     * @param dealRight1 右 1
     * @return 右 1集合
     */
    public List<DealRight1> selectDealRight1List(DealRight1 dealRight1);

    /**
     * 新增右 1
     *
     * @param dealRight1 右 1
     * @return 结果
     */
    public int insertDealRight1(DealRight1 dealRight1);

    /**
     * 修改右 1
     *
     * @param dealRight1 右 1
     * @return 结果
     */
    public int updateDealRight1(DealRight1 dealRight1);

    /**
     * 删除右 1
     *
     * @param id 右 1主键
     * @return 结果
     */
    public int deleteDealRight1ById(Long id);

    /**
     * 批量删除右 1
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDealRight1ByIds(Long[] ids);
}
