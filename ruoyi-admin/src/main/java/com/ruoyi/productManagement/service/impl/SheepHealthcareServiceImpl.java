package com.ruoyi.productManagement.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.productManagement.mapper.SheepHealthcareMapper;
import com.ruoyi.productManagement.domain.SheepHealthcare;
import com.ruoyi.productManagement.service.ISheepHealthcareService;

/**
 * 保健档案Service业务层处理
 * 
 * @author 孙少聪
 * @date 2022-06-09
 */
@Service
public class SheepHealthcareServiceImpl implements ISheepHealthcareService 
{
    @Autowired
    private SheepHealthcareMapper sheepHealthcareMapper;

    /**
     * 查询保健档案
     * 
     * @param id 保健档案主键
     * @return 保健档案
     */
    @Override
    public SheepHealthcare selectSheepHealthcareById(Long id)
    {
        return sheepHealthcareMapper.selectSheepHealthcareById(id);
    }

    /**
     * 查询保健档案列表
     * 
     * @param sheepHealthcare 保健档案
     * @return 保健档案
     */
    @Override
    public List<SheepHealthcare> selectSheepHealthcareList(SheepHealthcare sheepHealthcare)
    {
        return sheepHealthcareMapper.selectSheepHealthcareList(sheepHealthcare);
    }

    /**
     * 新增保健档案
     * 
     * @param sheepHealthcare 保健档案
     * @return 结果
     */
    @Override
    public int insertSheepHealthcare(SheepHealthcare sheepHealthcare)
    {
        return sheepHealthcareMapper.insertSheepHealthcare(sheepHealthcare);
    }

    /**
     * 修改保健档案
     * 
     * @param sheepHealthcare 保健档案
     * @return 结果
     */
    @Override
    public int updateSheepHealthcare(SheepHealthcare sheepHealthcare)
    {
        return sheepHealthcareMapper.updateSheepHealthcare(sheepHealthcare);
    }

    /**
     * 批量删除保健档案
     * 
     * @param ids 需要删除的保健档案主键
     * @return 结果
     */
    @Override
    public int deleteSheepHealthcareByIds(Long[] ids)
    {
        return sheepHealthcareMapper.deleteSheepHealthcareByIds(ids);
    }

    /**
     * 删除保健档案信息
     * 
     * @param id 保健档案主键
     * @return 结果
     */
    @Override
    public int deleteSheepHealthcareById(Long id)
    {
        return sheepHealthcareMapper.deleteSheepHealthcareById(id);
    }
}
