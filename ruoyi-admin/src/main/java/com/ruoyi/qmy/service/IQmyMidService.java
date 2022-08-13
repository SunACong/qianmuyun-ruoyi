package com.ruoyi.qmy.service;

import java.util.List;
import com.ruoyi.qmy.domain.QmyMid;

/**
 * 完成率Service接口
 * 
 * @author 孙少聪
 * @date 2022-04-06
 */
public interface IQmyMidService 
{
    /**
     * 查询完成率
     * 
     * @param id 完成率主键
     * @return 完成率
     */
    public QmyMid selectQmyMidById(Long id);

    /**
     * 查询完成率列表
     * 
     * @param qmyMid 完成率
     * @return 完成率集合
     */
    public List<QmyMid> selectQmyMidList(QmyMid qmyMid);

    /**
     * 新增完成率
     * 
     * @param qmyMid 完成率
     * @return 结果
     */
    public int insertQmyMid(QmyMid qmyMid);

    /**
     * 修改完成率
     * 
     * @param qmyMid 完成率
     * @return 结果
     */
    public int updateQmyMid(QmyMid qmyMid);

    /**
     * 批量删除完成率
     * 
     * @param ids 需要删除的完成率主键集合
     * @return 结果
     */
    public int deleteQmyMidByIds(Long[] ids);

    /**
     * 删除完成率信息
     * 
     * @param id 完成率主键
     * @return 结果
     */
    public int deleteQmyMidById(Long id);
}
