package com.ruoyi.productManagement.service;

import java.util.List;
import com.ruoyi.productManagement.domain.Sheep2Productrecord;

/**
 * 生产记录Service接口
 * 
 * @author 孙少聪
 * @date 2022-05-20
 */
public interface ISheep2ProductrecordService 
{
    /**
     * 查询生产记录
     * 
     * @param id 生产记录主键
     * @return 生产记录
     */
    public Sheep2Productrecord selectSheep2ProductrecordById(Long id);

    /**
     * 查询生产记录列表
     * 
     * @param sheep2Productrecord 生产记录
     * @return 生产记录集合
     */
    public List<Sheep2Productrecord> selectSheep2ProductrecordList(Sheep2Productrecord sheep2Productrecord);

    /**
     * 新增生产记录
     * 
     * @param sheep2Productrecord 生产记录
     * @return 结果
     */
    public int insertSheep2Productrecord(Sheep2Productrecord sheep2Productrecord);

    /**
     * 修改生产记录
     * 
     * @param sheep2Productrecord 生产记录
     * @return 结果
     */
    public int updateSheep2Productrecord(Sheep2Productrecord sheep2Productrecord);

    /**
     * 批量删除生产记录
     * 
     * @param ids 需要删除的生产记录主键集合
     * @return 结果
     */
    public int deleteSheep2ProductrecordByIds(Long[] ids);

    /**
     * 删除生产记录信息
     * 
     * @param id 生产记录主键
     * @return 结果
     */
    public int deleteSheep2ProductrecordById(Long id);
}
