package com.ruoyi.deal.mapper;

import java.util.List;
import com.ruoyi.deal.domain.DealLeft1;

/**
 * 左 1Mapper接口
 *
 * @author 孙少聪
 * @date 2022-03-30
 */
public interface DealLeft1Mapper
{
    /**
     * 查询左 1
     *
     * @param id 左 1主键
     * @return 左 1
     */
    public DealLeft1 selectDealLeft1ById(Long id);

    /**
     * 查询左 1列表
     *
     * @param dealLeft1 左 1
     * @return 左 1集合
     */
    public List<DealLeft1> selectDealLeft1List(DealLeft1 dealLeft1);

    /**
     * 新增左 1
     *
     * @param dealLeft1 左 1
     * @return 结果
     */
    public int insertDealLeft1(DealLeft1 dealLeft1);

    /**
     * 修改左 1
     *
     * @param dealLeft1 左 1
     * @return 结果
     */
    public int updateDealLeft1(DealLeft1 dealLeft1);

    /**
     * 删除左 1
     *
     * @param id 左 1主键
     * @return 结果
     */
    public int deleteDealLeft1ById(Long id);

    /**
     * 批量删除左 1
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDealLeft1ByIds(Long[] ids);
}
