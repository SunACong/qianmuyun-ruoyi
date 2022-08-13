package com.ruoyi.productManagement.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.productManagement.mapper.SheepDiseasecontrolMapper;
import com.ruoyi.productManagement.domain.SheepDiseasecontrol;
import com.ruoyi.productManagement.service.ISheepDiseasecontrolService;

/**
 * 疾病防治Service业务层处理
 * 
 * @author 孙少聪
 * @date 2022-03-30
 */
@Service
public class SheepDiseasecontrolServiceImpl implements ISheepDiseasecontrolService 
{
    @Autowired
    private SheepDiseasecontrolMapper sheepDiseasecontrolMapper;

    /**
     * 查询疾病防治
     * 
     * @param id 疾病防治主键
     * @return 疾病防治
     */
    @Override
    public SheepDiseasecontrol selectSheepDiseasecontrolById(Long id)
    {
        return sheepDiseasecontrolMapper.selectSheepDiseasecontrolById(id);
    }

    /**
     * 查询疾病防治列表
     * 
     * @param sheepDiseasecontrol 疾病防治
     * @return 疾病防治
     */
    @Override
    public List<SheepDiseasecontrol> selectSheepDiseasecontrolList(SheepDiseasecontrol sheepDiseasecontrol)
    {
        return sheepDiseasecontrolMapper.selectSheepDiseasecontrolList(sheepDiseasecontrol);
    }

    /**
     * 新增疾病防治
     * 
     * @param sheepDiseasecontrol 疾病防治
     * @return 结果
     */
    @Override
    public int insertSheepDiseasecontrol(SheepDiseasecontrol sheepDiseasecontrol)
    {
        return sheepDiseasecontrolMapper.insertSheepDiseasecontrol(sheepDiseasecontrol);
    }

    /**
     * 修改疾病防治
     * 
     * @param sheepDiseasecontrol 疾病防治
     * @return 结果
     */
    @Override
    public int updateSheepDiseasecontrol(SheepDiseasecontrol sheepDiseasecontrol)
    {
        return sheepDiseasecontrolMapper.updateSheepDiseasecontrol(sheepDiseasecontrol);
    }

    /**
     * 批量删除疾病防治
     * 
     * @param ids 需要删除的疾病防治主键
     * @return 结果
     */
    @Override
    public int deleteSheepDiseasecontrolByIds(Long[] ids)
    {
        return sheepDiseasecontrolMapper.deleteSheepDiseasecontrolByIds(ids);
    }

    /**
     * 删除疾病防治信息
     * 
     * @param id 疾病防治主键
     * @return 结果
     */
    @Override
    public int deleteSheepDiseasecontrolById(Long id)
    {
        return sheepDiseasecontrolMapper.deleteSheepDiseasecontrolById(id);
    }
}
