package com.ruoyi.qmy.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.qmy.mapper.QmyRight2Mapper;
import com.ruoyi.qmy.domain.QmyRight2;
import com.ruoyi.qmy.service.IQmyRight2Service;

/**
 * 疫病监测Service业务层处理
 * 
 * @author 孙少聪
 * @date 2022-04-06
 */
@Service
public class QmyRight2ServiceImpl implements IQmyRight2Service 
{
    @Autowired
    private QmyRight2Mapper qmyRight2Mapper;

    /**
     * 查询疫病监测
     * 
     * @param id 疫病监测主键
     * @return 疫病监测
     */
    @Override
    public QmyRight2 selectQmyRight2ById(Long id)
    {
        return qmyRight2Mapper.selectQmyRight2ById(id);
    }

    /**
     * 查询疫病监测列表
     * 
     * @param qmyRight2 疫病监测
     * @return 疫病监测
     */
    @Override
    public List<QmyRight2> selectQmyRight2List(QmyRight2 qmyRight2)
    {
        return qmyRight2Mapper.selectQmyRight2List(qmyRight2);
    }

    /**
     * 新增疫病监测
     * 
     * @param qmyRight2 疫病监测
     * @return 结果
     */
    @Override
    public int insertQmyRight2(QmyRight2 qmyRight2)
    {
        return qmyRight2Mapper.insertQmyRight2(qmyRight2);
    }

    /**
     * 修改疫病监测
     * 
     * @param qmyRight2 疫病监测
     * @return 结果
     */
    @Override
    public int updateQmyRight2(QmyRight2 qmyRight2)
    {
        return qmyRight2Mapper.updateQmyRight2(qmyRight2);
    }

    /**
     * 批量删除疫病监测
     * 
     * @param ids 需要删除的疫病监测主键
     * @return 结果
     */
    @Override
    public int deleteQmyRight2ByIds(Long[] ids)
    {
        return qmyRight2Mapper.deleteQmyRight2ByIds(ids);
    }

    /**
     * 删除疫病监测信息
     * 
     * @param id 疫病监测主键
     * @return 结果
     */
    @Override
    public int deleteQmyRight2ById(Long id)
    {
        return qmyRight2Mapper.deleteQmyRight2ById(id);
    }
}
