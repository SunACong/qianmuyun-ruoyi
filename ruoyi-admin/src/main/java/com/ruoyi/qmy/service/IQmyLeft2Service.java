package com.ruoyi.qmy.service;

import java.util.List;
import com.ruoyi.qmy.domain.QmyLeft2;

/**
 * 生产统计Service接口
 * 
 * @author 孙少聪
 * @date 2022-04-06
 */
public interface IQmyLeft2Service 
{
    /**
     * 查询生产统计
     * 
     * @param id 生产统计主键
     * @return 生产统计
     */
    public QmyLeft2 selectQmyLeft2ById(Long id);

    /**
     * 查询生产统计列表
     * 
     * @param qmyLeft2 生产统计
     * @return 生产统计集合
     */
    public List<QmyLeft2> selectQmyLeft2List(QmyLeft2 qmyLeft2);

    /**
     * 新增生产统计
     * 
     * @param qmyLeft2 生产统计
     * @return 结果
     */
    public int insertQmyLeft2(QmyLeft2 qmyLeft2);

    /**
     * 修改生产统计
     * 
     * @param qmyLeft2 生产统计
     * @return 结果
     */
    public int updateQmyLeft2(QmyLeft2 qmyLeft2);

    /**
     * 批量删除生产统计
     * 
     * @param ids 需要删除的生产统计主键集合
     * @return 结果
     */
    public int deleteQmyLeft2ByIds(Long[] ids);

    /**
     * 删除生产统计信息
     * 
     * @param id 生产统计主键
     * @return 结果
     */
    public int deleteQmyLeft2ById(Long id);
}
