package com.ruoyi.qmy.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.qmy.mapper.QmyLeft1Mapper;
import com.ruoyi.qmy.domain.QmyLeft1;
import com.ruoyi.qmy.service.IQmyLeft1Service;

/**
 * 存栏统计(一)Service业务层处理
 * 
 * @author 孙少聪
 * @date 2022-04-06
 */
@Service
public class QmyLeft1ServiceImpl implements IQmyLeft1Service 
{
    @Autowired
    private QmyLeft1Mapper qmyLeft1Mapper;

    /**
     * 查询存栏统计(一)
     * 
     * @param id 存栏统计(一)主键
     * @return 存栏统计(一)
     */
    @Override
    public QmyLeft1 selectQmyLeft1ById(Long id)
    {
        return qmyLeft1Mapper.selectQmyLeft1ById(id);
    }

    /**
     * 查询存栏统计(一)列表
     * 
     * @param qmyLeft1 存栏统计(一)
     * @return 存栏统计(一)
     */
    @Override
    public List<QmyLeft1> selectQmyLeft1List(QmyLeft1 qmyLeft1)
    {
        return qmyLeft1Mapper.selectQmyLeft1List(qmyLeft1);
    }

    /**
     * 新增存栏统计(一)
     * 
     * @param qmyLeft1 存栏统计(一)
     * @return 结果
     */
    @Override
    public int insertQmyLeft1(QmyLeft1 qmyLeft1)
    {
        return qmyLeft1Mapper.insertQmyLeft1(qmyLeft1);
    }

    /**
     * 修改存栏统计(一)
     * 
     * @param qmyLeft1 存栏统计(一)
     * @return 结果
     */
    @Override
    public int updateQmyLeft1(QmyLeft1 qmyLeft1)
    {
        return qmyLeft1Mapper.updateQmyLeft1(qmyLeft1);
    }

    /**
     * 批量删除存栏统计(一)
     * 
     * @param ids 需要删除的存栏统计(一)主键
     * @return 结果
     */
    @Override
    public int deleteQmyLeft1ByIds(Long[] ids)
    {
        return qmyLeft1Mapper.deleteQmyLeft1ByIds(ids);
    }

    /**
     * 删除存栏统计(一)信息
     * 
     * @param id 存栏统计(一)主键
     * @return 结果
     */
    @Override
    public int deleteQmyLeft1ById(Long id)
    {
        return qmyLeft1Mapper.deleteQmyLeft1ById(id);
    }
}
