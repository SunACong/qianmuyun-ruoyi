package com.ruoyi.deal.mapper;

import java.util.List;
import com.ruoyi.deal.domain.DealLeft2;

/**
 * 左 2Mapper接口
 * 
 * @author 孙少聪
 * @date 2022-03-30
 */
public interface DealLeft2Mapper 
{
    /**
     * 查询左 2
     * 
     * @param id 左 2主键
     * @return 左 2
     */
    public DealLeft2 selectDealLeft2ById(Long id);

    /**
     * 查询左 2列表
     * 
     * @param dealLeft2 左 2
     * @return 左 2集合
     */
    public List<DealLeft2> selectDealLeft2List(DealLeft2 dealLeft2);

    /**
     * 新增左 2
     * 
     * @param dealLeft2 左 2
     * @return 结果
     */
    public int insertDealLeft2(DealLeft2 dealLeft2);

    /**
     * 修改左 2
     * 
     * @param dealLeft2 左 2
     * @return 结果
     */
    public int updateDealLeft2(DealLeft2 dealLeft2);

    /**
     * 删除左 2
     * 
     * @param id 左 2主键
     * @return 结果
     */
    public int deleteDealLeft2ById(Long id);

    /**
     * 批量删除左 2
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDealLeft2ByIds(Long[] ids);
}
