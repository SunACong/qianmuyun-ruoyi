package com.ruoyi.deal.mapper;

import java.util.List;
import com.ruoyi.deal.domain.DealLeft3;

/**
 * 左 3Mapper接口
 * 
 * @author 孙少聪
 * @date 2022-03-30
 */
public interface DealLeft3Mapper 
{
    /**
     * 查询左 3
     * 
     * @param id 左 3主键
     * @return 左 3
     */
    public DealLeft3 selectDealLeft3ById(Long id);

    /**
     * 查询左 3列表
     * 
     * @param dealLeft3 左 3
     * @return 左 3集合
     */
    public List<DealLeft3> selectDealLeft3List(DealLeft3 dealLeft3);

    /**
     * 新增左 3
     * 
     * @param dealLeft3 左 3
     * @return 结果
     */
    public int insertDealLeft3(DealLeft3 dealLeft3);

    /**
     * 修改左 3
     * 
     * @param dealLeft3 左 3
     * @return 结果
     */
    public int updateDealLeft3(DealLeft3 dealLeft3);

    /**
     * 删除左 3
     * 
     * @param id 左 3主键
     * @return 结果
     */
    public int deleteDealLeft3ById(Long id);

    /**
     * 批量删除左 3
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDealLeft3ByIds(Long[] ids);
}
