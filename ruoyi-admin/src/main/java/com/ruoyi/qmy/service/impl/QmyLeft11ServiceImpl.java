package com.ruoyi.qmy.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.qmy.mapper.QmyLeft11Mapper;
import com.ruoyi.qmy.domain.QmyLeft11;
import com.ruoyi.qmy.service.IQmyLeft11Service;

/**
 * 存栏统计(二)Service业务层处理
 * 
 * @author 孙少聪
 * @date 2022-04-06
 */
@Service
public class QmyLeft11ServiceImpl implements IQmyLeft11Service 
{
    @Autowired
    private QmyLeft11Mapper qmyLeft11Mapper;

    /**
     * 查询存栏统计(二)
     * 
     * @param id 存栏统计(二)主键
     * @return 存栏统计(二)
     */
    @Override
    public QmyLeft11 selectQmyLeft11ById(Long id)
    {
        return qmyLeft11Mapper.selectQmyLeft11ById(id);
    }

    /**
     * 查询存栏统计(二)列表
     * 
     * @param qmyLeft11 存栏统计(二)
     * @return 存栏统计(二)
     */
    @Override
    public List<QmyLeft11> selectQmyLeft11List(QmyLeft11 qmyLeft11)
    {
        return qmyLeft11Mapper.selectQmyLeft11List(qmyLeft11);
    }

    /**
     * 新增存栏统计(二)
     * 
     * @param qmyLeft11 存栏统计(二)
     * @return 结果
     */
    @Override
    public int insertQmyLeft11(QmyLeft11 qmyLeft11)
    {
        return qmyLeft11Mapper.insertQmyLeft11(qmyLeft11);
    }

    /**
     * 修改存栏统计(二)
     * 
     * @param qmyLeft11 存栏统计(二)
     * @return 结果
     */
    @Override
    public int updateQmyLeft11(QmyLeft11 qmyLeft11)
    {
        return qmyLeft11Mapper.updateQmyLeft11(qmyLeft11);
    }

    /**
     * 批量删除存栏统计(二)
     * 
     * @param ids 需要删除的存栏统计(二)主键
     * @return 结果
     */
    @Override
    public int deleteQmyLeft11ByIds(Long[] ids)
    {
        return qmyLeft11Mapper.deleteQmyLeft11ByIds(ids);
    }

    /**
     * 删除存栏统计(二)信息
     * 
     * @param id 存栏统计(二)主键
     * @return 结果
     */
    @Override
    public int deleteQmyLeft11ById(Long id)
    {
        return qmyLeft11Mapper.deleteQmyLeft11ById(id);
    }
}
