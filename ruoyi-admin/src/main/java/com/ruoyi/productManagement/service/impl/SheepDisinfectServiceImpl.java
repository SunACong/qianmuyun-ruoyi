package com.ruoyi.productManagement.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.productManagement.mapper.SheepDisinfectMapper;
import com.ruoyi.productManagement.domain.SheepDisinfect;
import com.ruoyi.productManagement.service.ISheepDisinfectService;

/**
 * 消毒档案Service业务层处理
 * 
 * @author 孙少聪
 * @date 2022-03-30
 */
@Service
public class SheepDisinfectServiceImpl implements ISheepDisinfectService 
{
    @Autowired
    private SheepDisinfectMapper sheepDisinfectMapper;

    /**
     * 查询消毒档案
     * 
     * @param id 消毒档案主键
     * @return 消毒档案
     */
    @Override
    public SheepDisinfect selectSheepDisinfectById(Long id)
    {
        return sheepDisinfectMapper.selectSheepDisinfectById(id);
    }

    /**
     * 查询消毒档案列表
     * 
     * @param sheepDisinfect 消毒档案
     * @return 消毒档案
     */
    @Override
    public List<SheepDisinfect> selectSheepDisinfectList(SheepDisinfect sheepDisinfect)
    {
        return sheepDisinfectMapper.selectSheepDisinfectList(sheepDisinfect);
    }

    /**
     * 新增消毒档案
     * 
     * @param sheepDisinfect 消毒档案
     * @return 结果
     */
    @Override
    public int insertSheepDisinfect(SheepDisinfect sheepDisinfect)
    {
        return sheepDisinfectMapper.insertSheepDisinfect(sheepDisinfect);
    }

    /**
     * 修改消毒档案
     * 
     * @param sheepDisinfect 消毒档案
     * @return 结果
     */
    @Override
    public int updateSheepDisinfect(SheepDisinfect sheepDisinfect)
    {
        return sheepDisinfectMapper.updateSheepDisinfect(sheepDisinfect);
    }

    /**
     * 批量删除消毒档案
     * 
     * @param ids 需要删除的消毒档案主键
     * @return 结果
     */
    @Override
    public int deleteSheepDisinfectByIds(Long[] ids)
    {
        return sheepDisinfectMapper.deleteSheepDisinfectByIds(ids);
    }

    /**
     * 删除消毒档案信息
     * 
     * @param id 消毒档案主键
     * @return 结果
     */
    @Override
    public int deleteSheepDisinfectById(Long id)
    {
        return sheepDisinfectMapper.deleteSheepDisinfectById(id);
    }
}
