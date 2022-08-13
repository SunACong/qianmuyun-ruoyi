package com.ruoyi.deal.service;

import java.util.List;
import com.ruoyi.deal.domain.DealLeft4;

/**
 * 左 4Service接口
 * 
 * @author 孙少聪
 * @date 2022-03-30
 */
public interface IDealLeft4Service 
{
    /**
     * 查询左 4
     * 
     * @param id 左 4主键
     * @return 左 4
     */
    public DealLeft4 selectDealLeft4ById(Long id);

    /**
     * 查询左 4列表
     * 
     * @param dealLeft4 左 4
     * @return 左 4集合
     */
    public List<DealLeft4> selectDealLeft4List(DealLeft4 dealLeft4);

    /**
     * 新增左 4
     * 
     * @param dealLeft4 左 4
     * @return 结果
     */
    public int insertDealLeft4(DealLeft4 dealLeft4);

    /**
     * 修改左 4
     * 
     * @param dealLeft4 左 4
     * @return 结果
     */
    public int updateDealLeft4(DealLeft4 dealLeft4);

    /**
     * 批量删除左 4
     * 
     * @param ids 需要删除的左 4主键集合
     * @return 结果
     */
    public int deleteDealLeft4ByIds(Long[] ids);

    /**
     * 删除左 4信息
     * 
     * @param id 左 4主键
     * @return 结果
     */
    public int deleteDealLeft4ById(Long id);
}
