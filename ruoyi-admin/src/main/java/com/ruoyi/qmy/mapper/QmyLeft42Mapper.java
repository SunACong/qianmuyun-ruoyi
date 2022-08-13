package com.ruoyi.qmy.mapper;

import java.util.List;
import com.ruoyi.qmy.domain.QmyLeft42;

/**
 * 兽药统计Mapper接口
 * 
 * @author 孙少聪
 * @date 2022-04-06
 */
public interface QmyLeft42Mapper 
{
    /**
     * 查询兽药统计
     * 
     * @param id 兽药统计主键
     * @return 兽药统计
     */
    public QmyLeft42 selectQmyLeft42ById(Long id);

    /**
     * 查询兽药统计列表
     * 
     * @param qmyLeft42 兽药统计
     * @return 兽药统计集合
     */
    public List<QmyLeft42> selectQmyLeft42List(QmyLeft42 qmyLeft42);

    /**
     * 新增兽药统计
     * 
     * @param qmyLeft42 兽药统计
     * @return 结果
     */
    public int insertQmyLeft42(QmyLeft42 qmyLeft42);

    /**
     * 修改兽药统计
     * 
     * @param qmyLeft42 兽药统计
     * @return 结果
     */
    public int updateQmyLeft42(QmyLeft42 qmyLeft42);

    /**
     * 删除兽药统计
     * 
     * @param id 兽药统计主键
     * @return 结果
     */
    public int deleteQmyLeft42ById(Long id);

    /**
     * 批量删除兽药统计
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteQmyLeft42ByIds(Long[] ids);
}
