package com.ruoyi.productManagement.service.impl;

import java.util.List;

import com.ruoyi.common.annotation.DataScope;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.productManagement.mapper.SheepSheepbirthMapper;
import com.ruoyi.productManagement.domain.SheepSheepbirth;
import com.ruoyi.productManagement.service.ISheepSheepbirthService;

/**
 * 产子档案Service业务层处理
 *
 * @author 孙少聪
 * @date 2022-06-09
 */
@Service
public class SheepSheepbirthServiceImpl implements ISheepSheepbirthService
{
    @Autowired
    private SheepSheepbirthMapper sheepSheepbirthMapper;

    /**
     * 查询产子档案
     *
     * @param id 产子档案主键
     * @return 产子档案
     */
    @Override
    public SheepSheepbirth selectSheepSheepbirthById(Long id)
    {
        return sheepSheepbirthMapper.selectSheepSheepbirthById(id);
    }

    /**
     * 查询产子档案列表
     *
     * @param sheepSheepbirth 产子档案
     * @return 产子档案
     */
    @Override
    @DataScope(deptAlias = "sheepSheepbirth", userAlias = "sheepSheepbirth")
    public List<SheepSheepbirth> selectSheepSheepbirthList(SheepSheepbirth sheepSheepbirth)
    {
        return sheepSheepbirthMapper.selectSheepSheepbirthList(sheepSheepbirth);
    }

    /**
     * 新增产子档案
     *
     * @param sheepSheepbirth 产子档案
     * @return 结果
     */
    @Override
    public int insertSheepSheepbirth(SheepSheepbirth sheepSheepbirth)
    {
        return sheepSheepbirthMapper.insertSheepSheepbirth(sheepSheepbirth);
    }

    /**
     * 修改产子档案
     *
     * @param sheepSheepbirth 产子档案
     * @return 结果
     */
    @Override
    public int updateSheepSheepbirth(SheepSheepbirth sheepSheepbirth)
    {
        return sheepSheepbirthMapper.updateSheepSheepbirth(sheepSheepbirth);
    }

    /**
     * 批量删除产子档案
     *
     * @param ids 需要删除的产子档案主键
     * @return 结果
     */
    @Override
    public int deleteSheepSheepbirthByIds(Long[] ids)
    {
        return sheepSheepbirthMapper.deleteSheepSheepbirthByIds(ids);
    }

    /**
     * 删除产子档案信息
     *
     * @param id 产子档案主键
     * @return 结果
     */
    @Override
    public int deleteSheepSheepbirthById(Long id)
    {
        return sheepSheepbirthMapper.deleteSheepSheepbirthById(id);
    }
}
