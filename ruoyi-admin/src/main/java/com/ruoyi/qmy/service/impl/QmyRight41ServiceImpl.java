package com.ruoyi.qmy.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.qmy.mapper.QmyRight41Mapper;
import com.ruoyi.qmy.domain.QmyRight41;
import com.ruoyi.qmy.service.IQmyRight41Service;

/**
 * 销售统计Service业务层处理
 * 
 * @author 孙少聪
 * @date 2022-04-06
 */
@Service
public class QmyRight41ServiceImpl implements IQmyRight41Service 
{
    @Autowired
    private QmyRight41Mapper qmyRight41Mapper;

    /**
     * 查询销售统计
     * 
     * @param id 销售统计主键
     * @return 销售统计
     */
    @Override
    public QmyRight41 selectQmyRight41ById(Long id)
    {
        return qmyRight41Mapper.selectQmyRight41ById(id);
    }

    /**
     * 查询销售统计列表
     * 
     * @param qmyRight41 销售统计
     * @return 销售统计
     */
    @Override
    public List<QmyRight41> selectQmyRight41List(QmyRight41 qmyRight41)
    {
        return qmyRight41Mapper.selectQmyRight41List(qmyRight41);
    }

    /**
     * 新增销售统计
     * 
     * @param qmyRight41 销售统计
     * @return 结果
     */
    @Override
    public int insertQmyRight41(QmyRight41 qmyRight41)
    {
        return qmyRight41Mapper.insertQmyRight41(qmyRight41);
    }

    /**
     * 修改销售统计
     * 
     * @param qmyRight41 销售统计
     * @return 结果
     */
    @Override
    public int updateQmyRight41(QmyRight41 qmyRight41)
    {
        return qmyRight41Mapper.updateQmyRight41(qmyRight41);
    }

    /**
     * 批量删除销售统计
     * 
     * @param ids 需要删除的销售统计主键
     * @return 结果
     */
    @Override
    public int deleteQmyRight41ByIds(Long[] ids)
    {
        return qmyRight41Mapper.deleteQmyRight41ByIds(ids);
    }

    /**
     * 删除销售统计信息
     * 
     * @param id 销售统计主键
     * @return 结果
     */
    @Override
    public int deleteQmyRight41ById(Long id)
    {
        return qmyRight41Mapper.deleteQmyRight41ById(id);
    }
}
