package com.ruoyi.qmy.mapper;

import java.util.List;
import com.ruoyi.qmy.domain.QmyLeft3;

/**
 * 死亡统计Mapper接口
 * 
 * @author 孙少聪
 * @date 2022-04-06
 */
public interface QmyLeft3Mapper 
{
    /**
     * 查询死亡统计
     * 
     * @param id 死亡统计主键
     * @return 死亡统计
     */
    public QmyLeft3 selectQmyLeft3ById(Long id);

    /**
     * 查询死亡统计列表
     * 
     * @param qmyLeft3 死亡统计
     * @return 死亡统计集合
     */
    public List<QmyLeft3> selectQmyLeft3List(QmyLeft3 qmyLeft3);

    /**
     * 新增死亡统计
     * 
     * @param qmyLeft3 死亡统计
     * @return 结果
     */
    public int insertQmyLeft3(QmyLeft3 qmyLeft3);

    /**
     * 修改死亡统计
     * 
     * @param qmyLeft3 死亡统计
     * @return 结果
     */
    public int updateQmyLeft3(QmyLeft3 qmyLeft3);

    /**
     * 删除死亡统计
     * 
     * @param id 死亡统计主键
     * @return 结果
     */
    public int deleteQmyLeft3ById(Long id);

    /**
     * 批量删除死亡统计
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteQmyLeft3ByIds(Long[] ids);
}
