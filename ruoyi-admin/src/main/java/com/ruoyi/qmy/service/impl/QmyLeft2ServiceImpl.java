package com.ruoyi.qmy.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.qmy.mapper.QmyLeft2Mapper;
import com.ruoyi.qmy.domain.QmyLeft2;
import com.ruoyi.qmy.service.IQmyLeft2Service;

/**
 * 生产统计Service业务层处理
 * 
 * @author 孙少聪
 * @date 2022-04-06
 */
@Service
public class QmyLeft2ServiceImpl implements IQmyLeft2Service 
{
    @Autowired
    private QmyLeft2Mapper qmyLeft2Mapper;

    /**
     * 查询生产统计
     * 
     * @param id 生产统计主键
     * @return 生产统计
     */
    @Override
    public QmyLeft2 selectQmyLeft2ById(Long id)
    {
        return qmyLeft2Mapper.selectQmyLeft2ById(id);
    }

    /**
     * 查询生产统计列表
     * 
     * @param qmyLeft2 生产统计
     * @return 生产统计
     */
    @Override
    public List<QmyLeft2> selectQmyLeft2List(QmyLeft2 qmyLeft2)
    {
        return qmyLeft2Mapper.selectQmyLeft2List(qmyLeft2);
    }

    /**
     * 新增生产统计
     * 
     * @param qmyLeft2 生产统计
     * @return 结果
     */
    @Override
    public int insertQmyLeft2(QmyLeft2 qmyLeft2)
    {
        return qmyLeft2Mapper.insertQmyLeft2(qmyLeft2);
    }

    /**
     * 修改生产统计
     * 
     * @param qmyLeft2 生产统计
     * @return 结果
     */
    @Override
    public int updateQmyLeft2(QmyLeft2 qmyLeft2)
    {
        return qmyLeft2Mapper.updateQmyLeft2(qmyLeft2);
    }

    /**
     * 批量删除生产统计
     * 
     * @param ids 需要删除的生产统计主键
     * @return 结果
     */
    @Override
    public int deleteQmyLeft2ByIds(Long[] ids)
    {
        return qmyLeft2Mapper.deleteQmyLeft2ByIds(ids);
    }

    /**
     * 删除生产统计信息
     * 
     * @param id 生产统计主键
     * @return 结果
     */
    @Override
    public int deleteQmyLeft2ById(Long id)
    {
        return qmyLeft2Mapper.deleteQmyLeft2ById(id);
    }
}
