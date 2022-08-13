package com.ruoyi.qmy.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.qmy.mapper.QmyLeft41Mapper;
import com.ruoyi.qmy.domain.QmyLeft41;
import com.ruoyi.qmy.service.IQmyLeft41Service;

/**
 * 饲料统计Service业务层处理
 * 
 * @author 孙少聪
 * @date 2022-04-06
 */
@Service
public class QmyLeft41ServiceImpl implements IQmyLeft41Service 
{
    @Autowired
    private QmyLeft41Mapper qmyLeft41Mapper;

    /**
     * 查询饲料统计
     * 
     * @param id 饲料统计主键
     * @return 饲料统计
     */
    @Override
    public QmyLeft41 selectQmyLeft41ById(Long id)
    {
        return qmyLeft41Mapper.selectQmyLeft41ById(id);
    }

    /**
     * 查询饲料统计列表
     * 
     * @param qmyLeft41 饲料统计
     * @return 饲料统计
     */
    @Override
    public List<QmyLeft41> selectQmyLeft41List(QmyLeft41 qmyLeft41)
    {
        return qmyLeft41Mapper.selectQmyLeft41List(qmyLeft41);
    }

    /**
     * 新增饲料统计
     * 
     * @param qmyLeft41 饲料统计
     * @return 结果
     */
    @Override
    public int insertQmyLeft41(QmyLeft41 qmyLeft41)
    {
        return qmyLeft41Mapper.insertQmyLeft41(qmyLeft41);
    }

    /**
     * 修改饲料统计
     * 
     * @param qmyLeft41 饲料统计
     * @return 结果
     */
    @Override
    public int updateQmyLeft41(QmyLeft41 qmyLeft41)
    {
        return qmyLeft41Mapper.updateQmyLeft41(qmyLeft41);
    }

    /**
     * 批量删除饲料统计
     * 
     * @param ids 需要删除的饲料统计主键
     * @return 结果
     */
    @Override
    public int deleteQmyLeft41ByIds(Long[] ids)
    {
        return qmyLeft41Mapper.deleteQmyLeft41ByIds(ids);
    }

    /**
     * 删除饲料统计信息
     * 
     * @param id 饲料统计主键
     * @return 结果
     */
    @Override
    public int deleteQmyLeft41ById(Long id)
    {
        return qmyLeft41Mapper.deleteQmyLeft41ById(id);
    }
}
