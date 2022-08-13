package com.ruoyi.productManagement.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.productManagement.mapper.Sheep2CurerecordMapper;
import com.ruoyi.productManagement.domain.Sheep2Curerecord;
import com.ruoyi.productManagement.service.ISheep2CurerecordService;

/**
 * 诊疗记录Service业务层处理
 * 
 * @author 孙少聪
 * @date 2022-05-20
 */
@Service
public class Sheep2CurerecordServiceImpl implements ISheep2CurerecordService 
{
    @Autowired
    private Sheep2CurerecordMapper sheep2CurerecordMapper;

    /**
     * 查询诊疗记录
     * 
     * @param id 诊疗记录主键
     * @return 诊疗记录
     */
    @Override
    public Sheep2Curerecord selectSheep2CurerecordById(Long id)
    {
        return sheep2CurerecordMapper.selectSheep2CurerecordById(id);
    }

    /**
     * 查询诊疗记录列表
     * 
     * @param sheep2Curerecord 诊疗记录
     * @return 诊疗记录
     */
    @Override
    public List<Sheep2Curerecord> selectSheep2CurerecordList(Sheep2Curerecord sheep2Curerecord)
    {
        return sheep2CurerecordMapper.selectSheep2CurerecordList(sheep2Curerecord);
    }

    /**
     * 新增诊疗记录
     * 
     * @param sheep2Curerecord 诊疗记录
     * @return 结果
     */
    @Override
    public int insertSheep2Curerecord(Sheep2Curerecord sheep2Curerecord)
    {
        return sheep2CurerecordMapper.insertSheep2Curerecord(sheep2Curerecord);
    }

    /**
     * 修改诊疗记录
     * 
     * @param sheep2Curerecord 诊疗记录
     * @return 结果
     */
    @Override
    public int updateSheep2Curerecord(Sheep2Curerecord sheep2Curerecord)
    {
        sheep2Curerecord.setUpdateTime(DateUtils.getNowDate());
        return sheep2CurerecordMapper.updateSheep2Curerecord(sheep2Curerecord);
    }

    /**
     * 批量删除诊疗记录
     * 
     * @param ids 需要删除的诊疗记录主键
     * @return 结果
     */
    @Override
    public int deleteSheep2CurerecordByIds(Long[] ids)
    {
        return sheep2CurerecordMapper.deleteSheep2CurerecordByIds(ids);
    }

    /**
     * 删除诊疗记录信息
     * 
     * @param id 诊疗记录主键
     * @return 结果
     */
    @Override
    public int deleteSheep2CurerecordById(Long id)
    {
        return sheep2CurerecordMapper.deleteSheep2CurerecordById(id);
    }
}
