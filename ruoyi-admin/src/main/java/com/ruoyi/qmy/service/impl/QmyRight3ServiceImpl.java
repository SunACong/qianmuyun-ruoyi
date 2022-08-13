package com.ruoyi.qmy.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.qmy.mapper.QmyRight3Mapper;
import com.ruoyi.qmy.domain.QmyRight3;
import com.ruoyi.qmy.service.IQmyRight3Service;

/**
 * 检疫检测Service业务层处理
 * 
 * @author 孙少聪
 * @date 2022-04-06
 */
@Service
public class QmyRight3ServiceImpl implements IQmyRight3Service 
{
    @Autowired
    private QmyRight3Mapper qmyRight3Mapper;

    /**
     * 查询检疫检测
     * 
     * @param id 检疫检测主键
     * @return 检疫检测
     */
    @Override
    public QmyRight3 selectQmyRight3ById(Long id)
    {
        return qmyRight3Mapper.selectQmyRight3ById(id);
    }

    /**
     * 查询检疫检测列表
     * 
     * @param qmyRight3 检疫检测
     * @return 检疫检测
     */
    @Override
    public List<QmyRight3> selectQmyRight3List(QmyRight3 qmyRight3)
    {
        return qmyRight3Mapper.selectQmyRight3List(qmyRight3);
    }

    /**
     * 新增检疫检测
     * 
     * @param qmyRight3 检疫检测
     * @return 结果
     */
    @Override
    public int insertQmyRight3(QmyRight3 qmyRight3)
    {
        return qmyRight3Mapper.insertQmyRight3(qmyRight3);
    }

    /**
     * 修改检疫检测
     * 
     * @param qmyRight3 检疫检测
     * @return 结果
     */
    @Override
    public int updateQmyRight3(QmyRight3 qmyRight3)
    {
        return qmyRight3Mapper.updateQmyRight3(qmyRight3);
    }

    /**
     * 批量删除检疫检测
     * 
     * @param ids 需要删除的检疫检测主键
     * @return 结果
     */
    @Override
    public int deleteQmyRight3ByIds(Long[] ids)
    {
        return qmyRight3Mapper.deleteQmyRight3ByIds(ids);
    }

    /**
     * 删除检疫检测信息
     * 
     * @param id 检疫检测主键
     * @return 结果
     */
    @Override
    public int deleteQmyRight3ById(Long id)
    {
        return qmyRight3Mapper.deleteQmyRight3ById(id);
    }
}
