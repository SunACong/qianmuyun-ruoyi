package com.ruoyi.qmy.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.qmy.mapper.QmyLeft42Mapper;
import com.ruoyi.qmy.domain.QmyLeft42;
import com.ruoyi.qmy.service.IQmyLeft42Service;

/**
 * 兽药统计Service业务层处理
 * 
 * @author 孙少聪
 * @date 2022-04-06
 */
@Service
public class QmyLeft42ServiceImpl implements IQmyLeft42Service 
{
    @Autowired
    private QmyLeft42Mapper qmyLeft42Mapper;

    /**
     * 查询兽药统计
     * 
     * @param id 兽药统计主键
     * @return 兽药统计
     */
    @Override
    public QmyLeft42 selectQmyLeft42ById(Long id)
    {
        return qmyLeft42Mapper.selectQmyLeft42ById(id);
    }

    /**
     * 查询兽药统计列表
     * 
     * @param qmyLeft42 兽药统计
     * @return 兽药统计
     */
    @Override
    public List<QmyLeft42> selectQmyLeft42List(QmyLeft42 qmyLeft42)
    {
        return qmyLeft42Mapper.selectQmyLeft42List(qmyLeft42);
    }

    /**
     * 新增兽药统计
     * 
     * @param qmyLeft42 兽药统计
     * @return 结果
     */
    @Override
    public int insertQmyLeft42(QmyLeft42 qmyLeft42)
    {
        return qmyLeft42Mapper.insertQmyLeft42(qmyLeft42);
    }

    /**
     * 修改兽药统计
     * 
     * @param qmyLeft42 兽药统计
     * @return 结果
     */
    @Override
    public int updateQmyLeft42(QmyLeft42 qmyLeft42)
    {
        return qmyLeft42Mapper.updateQmyLeft42(qmyLeft42);
    }

    /**
     * 批量删除兽药统计
     * 
     * @param ids 需要删除的兽药统计主键
     * @return 结果
     */
    @Override
    public int deleteQmyLeft42ByIds(Long[] ids)
    {
        return qmyLeft42Mapper.deleteQmyLeft42ByIds(ids);
    }

    /**
     * 删除兽药统计信息
     * 
     * @param id 兽药统计主键
     * @return 结果
     */
    @Override
    public int deleteQmyLeft42ById(Long id)
    {
        return qmyLeft42Mapper.deleteQmyLeft42ById(id);
    }
}
