package com.ruoyi.productManagement.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.productManagement.mapper.SheepBreedingMapper;
import com.ruoyi.productManagement.domain.SheepBreeding;
import com.ruoyi.productManagement.service.ISheepBreedingService;

/**
 * 育种选育档案Service业务层处理
 * 
 * @author 孙少聪
 * @date 2022-03-30
 */
@Service
public class SheepBreedingServiceImpl implements ISheepBreedingService 
{
    @Autowired
    private SheepBreedingMapper sheepBreedingMapper;

    /**
     * 查询育种选育档案
     * 
     * @param id 育种选育档案主键
     * @return 育种选育档案
     */
    @Override
    public SheepBreeding selectSheepBreedingById(Long id)
    {
        return sheepBreedingMapper.selectSheepBreedingById(id);
    }

    /**
     * 查询育种选育档案列表
     * 
     * @param sheepBreeding 育种选育档案
     * @return 育种选育档案
     */
    @Override
    public List<SheepBreeding> selectSheepBreedingList(SheepBreeding sheepBreeding)
    {
        return sheepBreedingMapper.selectSheepBreedingList(sheepBreeding);
    }

    /**
     * 新增育种选育档案
     * 
     * @param sheepBreeding 育种选育档案
     * @return 结果
     */
    @Override
    public int insertSheepBreeding(SheepBreeding sheepBreeding)
    {
        return sheepBreedingMapper.insertSheepBreeding(sheepBreeding);
    }

    /**
     * 修改育种选育档案
     * 
     * @param sheepBreeding 育种选育档案
     * @return 结果
     */
    @Override
    public int updateSheepBreeding(SheepBreeding sheepBreeding)
    {
        return sheepBreedingMapper.updateSheepBreeding(sheepBreeding);
    }

    /**
     * 批量删除育种选育档案
     * 
     * @param ids 需要删除的育种选育档案主键
     * @return 结果
     */
    @Override
    public int deleteSheepBreedingByIds(Long[] ids)
    {
        return sheepBreedingMapper.deleteSheepBreedingByIds(ids);
    }

    /**
     * 删除育种选育档案信息
     * 
     * @param id 育种选育档案主键
     * @return 结果
     */
    @Override
    public int deleteSheepBreedingById(Long id)
    {
        return sheepBreedingMapper.deleteSheepBreedingById(id);
    }
}
