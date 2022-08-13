package com.ruoyi.qmy.service;

import java.util.List;
import com.ruoyi.qmy.domain.QmyLeft1;

/**
 * 存栏统计(一)Service接口
 * 
 * @author 孙少聪
 * @date 2022-04-06
 */
public interface IQmyLeft1Service 
{
    /**
     * 查询存栏统计(一)
     * 
     * @param id 存栏统计(一)主键
     * @return 存栏统计(一)
     */
    public QmyLeft1 selectQmyLeft1ById(Long id);

    /**
     * 查询存栏统计(一)列表
     * 
     * @param qmyLeft1 存栏统计(一)
     * @return 存栏统计(一)集合
     */
    public List<QmyLeft1> selectQmyLeft1List(QmyLeft1 qmyLeft1);

    /**
     * 新增存栏统计(一)
     * 
     * @param qmyLeft1 存栏统计(一)
     * @return 结果
     */
    public int insertQmyLeft1(QmyLeft1 qmyLeft1);

    /**
     * 修改存栏统计(一)
     * 
     * @param qmyLeft1 存栏统计(一)
     * @return 结果
     */
    public int updateQmyLeft1(QmyLeft1 qmyLeft1);

    /**
     * 批量删除存栏统计(一)
     * 
     * @param ids 需要删除的存栏统计(一)主键集合
     * @return 结果
     */
    public int deleteQmyLeft1ByIds(Long[] ids);

    /**
     * 删除存栏统计(一)信息
     * 
     * @param id 存栏统计(一)主键
     * @return 结果
     */
    public int deleteQmyLeft1ById(Long id);
}
