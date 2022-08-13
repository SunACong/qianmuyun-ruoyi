package com.ruoyi.qmy.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.qmy.mapper.QmyLeft3Mapper;
import com.ruoyi.qmy.domain.QmyLeft3;
import com.ruoyi.qmy.service.IQmyLeft3Service;

/**
 * 死亡统计Service业务层处理
 * 
 * @author 孙少聪
 * @date 2022-04-06
 */
@Service
public class QmyLeft3ServiceImpl implements IQmyLeft3Service 
{
    @Autowired
    private QmyLeft3Mapper qmyLeft3Mapper;

    /**
     * 查询死亡统计
     * 
     * @param id 死亡统计主键
     * @return 死亡统计
     */
    @Override
    public QmyLeft3 selectQmyLeft3ById(Long id)
    {
        return qmyLeft3Mapper.selectQmyLeft3ById(id);
    }

    /**
     * 查询死亡统计列表
     * 
     * @param qmyLeft3 死亡统计
     * @return 死亡统计
     */
    @Override
    public List<QmyLeft3> selectQmyLeft3List(QmyLeft3 qmyLeft3)
    {
        return qmyLeft3Mapper.selectQmyLeft3List(qmyLeft3);
    }

    /**
     * 新增死亡统计
     * 
     * @param qmyLeft3 死亡统计
     * @return 结果
     */
    @Override
    public int insertQmyLeft3(QmyLeft3 qmyLeft3)
    {
        return qmyLeft3Mapper.insertQmyLeft3(qmyLeft3);
    }

    /**
     * 修改死亡统计
     * 
     * @param qmyLeft3 死亡统计
     * @return 结果
     */
    @Override
    public int updateQmyLeft3(QmyLeft3 qmyLeft3)
    {
        return qmyLeft3Mapper.updateQmyLeft3(qmyLeft3);
    }

    /**
     * 批量删除死亡统计
     * 
     * @param ids 需要删除的死亡统计主键
     * @return 结果
     */
    @Override
    public int deleteQmyLeft3ByIds(Long[] ids)
    {
        return qmyLeft3Mapper.deleteQmyLeft3ByIds(ids);
    }

    /**
     * 删除死亡统计信息
     * 
     * @param id 死亡统计主键
     * @return 结果
     */
    @Override
    public int deleteQmyLeft3ById(Long id)
    {
        return qmyLeft3Mapper.deleteQmyLeft3ById(id);
    }
}
