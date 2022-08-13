package com.ruoyi.productManagement.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.productManagement.mapper.SheepMatingMapper;
import com.ruoyi.productManagement.domain.SheepMating;
import com.ruoyi.productManagement.service.ISheepMatingService;

/**
 * 配种档案Service业务层处理
 * 
 * @author 孙少聪
 * @date 2022-03-30
 */
@Service
public class SheepMatingServiceImpl implements ISheepMatingService 
{
    @Autowired
    private SheepMatingMapper sheepMatingMapper;

    /**
     * 查询配种档案
     * 
     * @param id 配种档案主键
     * @return 配种档案
     */
    @Override
    public SheepMating selectSheepMatingById(Long id)
    {
        return sheepMatingMapper.selectSheepMatingById(id);
    }

    /**
     * 查询配种档案列表
     * 
     * @param sheepMating 配种档案
     * @return 配种档案
     */
    @Override
    public List<SheepMating> selectSheepMatingList(SheepMating sheepMating)
    {
        return sheepMatingMapper.selectSheepMatingList(sheepMating);
    }

    /**
     * 新增配种档案
     * 
     * @param sheepMating 配种档案
     * @return 结果
     */
    @Override
    public int insertSheepMating(SheepMating sheepMating)
    {
        return sheepMatingMapper.insertSheepMating(sheepMating);
    }

    /**
     * 修改配种档案
     * 
     * @param sheepMating 配种档案
     * @return 结果
     */
    @Override
    public int updateSheepMating(SheepMating sheepMating)
    {
        return sheepMatingMapper.updateSheepMating(sheepMating);
    }

    /**
     * 批量删除配种档案
     * 
     * @param ids 需要删除的配种档案主键
     * @return 结果
     */
    @Override
    public int deleteSheepMatingByIds(Long[] ids)
    {
        return sheepMatingMapper.deleteSheepMatingByIds(ids);
    }

    /**
     * 删除配种档案信息
     * 
     * @param id 配种档案主键
     * @return 结果
     */
    @Override
    public int deleteSheepMatingById(Long id)
    {
        return sheepMatingMapper.deleteSheepMatingById(id);
    }
}
