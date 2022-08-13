package com.ruoyi.qmy.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.qmy.mapper.QmyMidMapper;
import com.ruoyi.qmy.domain.QmyMid;
import com.ruoyi.qmy.service.IQmyMidService;

/**
 * 完成率Service业务层处理
 * 
 * @author 孙少聪
 * @date 2022-04-06
 */
@Service
public class QmyMidServiceImpl implements IQmyMidService 
{
    @Autowired
    private QmyMidMapper qmyMidMapper;

    /**
     * 查询完成率
     * 
     * @param id 完成率主键
     * @return 完成率
     */
    @Override
    public QmyMid selectQmyMidById(Long id)
    {
        return qmyMidMapper.selectQmyMidById(id);
    }

    /**
     * 查询完成率列表
     * 
     * @param qmyMid 完成率
     * @return 完成率
     */
    @Override
    public List<QmyMid> selectQmyMidList(QmyMid qmyMid)
    {
        return qmyMidMapper.selectQmyMidList(qmyMid);
    }

    /**
     * 新增完成率
     * 
     * @param qmyMid 完成率
     * @return 结果
     */
    @Override
    public int insertQmyMid(QmyMid qmyMid)
    {
        return qmyMidMapper.insertQmyMid(qmyMid);
    }

    /**
     * 修改完成率
     * 
     * @param qmyMid 完成率
     * @return 结果
     */
    @Override
    public int updateQmyMid(QmyMid qmyMid)
    {
        return qmyMidMapper.updateQmyMid(qmyMid);
    }

    /**
     * 批量删除完成率
     * 
     * @param ids 需要删除的完成率主键
     * @return 结果
     */
    @Override
    public int deleteQmyMidByIds(Long[] ids)
    {
        return qmyMidMapper.deleteQmyMidByIds(ids);
    }

    /**
     * 删除完成率信息
     * 
     * @param id 完成率主键
     * @return 结果
     */
    @Override
    public int deleteQmyMidById(Long id)
    {
        return qmyMidMapper.deleteQmyMidById(id);
    }
}
