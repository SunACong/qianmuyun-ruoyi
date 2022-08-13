package com.ruoyi.productManagement.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.productManagement.mapper.SheepInsecticideMapper;
import com.ruoyi.productManagement.domain.SheepInsecticide;
import com.ruoyi.productManagement.service.ISheepInsecticideService;

/**
 * 驱虫档案Service业务层处理
 * 
 * @author 孙少聪
 * @date 2022-03-30
 */
@Service
public class SheepInsecticideServiceImpl implements ISheepInsecticideService 
{
    @Autowired
    private SheepInsecticideMapper sheepInsecticideMapper;

    /**
     * 查询驱虫档案
     * 
     * @param id 驱虫档案主键
     * @return 驱虫档案
     */
    @Override
    public SheepInsecticide selectSheepInsecticideById(Long id)
    {
        return sheepInsecticideMapper.selectSheepInsecticideById(id);
    }

    /**
     * 查询驱虫档案列表
     * 
     * @param sheepInsecticide 驱虫档案
     * @return 驱虫档案
     */
    @Override
    public List<SheepInsecticide> selectSheepInsecticideList(SheepInsecticide sheepInsecticide)
    {
        return sheepInsecticideMapper.selectSheepInsecticideList(sheepInsecticide);
    }

    /**
     * 新增驱虫档案
     * 
     * @param sheepInsecticide 驱虫档案
     * @return 结果
     */
    @Override
    public int insertSheepInsecticide(SheepInsecticide sheepInsecticide)
    {
        return sheepInsecticideMapper.insertSheepInsecticide(sheepInsecticide);
    }

    /**
     * 修改驱虫档案
     * 
     * @param sheepInsecticide 驱虫档案
     * @return 结果
     */
    @Override
    public int updateSheepInsecticide(SheepInsecticide sheepInsecticide)
    {
        return sheepInsecticideMapper.updateSheepInsecticide(sheepInsecticide);
    }

    /**
     * 批量删除驱虫档案
     * 
     * @param ids 需要删除的驱虫档案主键
     * @return 结果
     */
    @Override
    public int deleteSheepInsecticideByIds(Long[] ids)
    {
        return sheepInsecticideMapper.deleteSheepInsecticideByIds(ids);
    }

    /**
     * 删除驱虫档案信息
     * 
     * @param id 驱虫档案主键
     * @return 结果
     */
    @Override
    public int deleteSheepInsecticideById(Long id)
    {
        return sheepInsecticideMapper.deleteSheepInsecticideById(id);
    }
}
