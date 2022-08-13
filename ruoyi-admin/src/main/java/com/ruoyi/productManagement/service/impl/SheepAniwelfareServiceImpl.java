package com.ruoyi.productManagement.service.impl;

import java.util.List;

import com.ruoyi.common.annotation.AddUserIdDeptId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.productManagement.mapper.SheepAniwelfareMapper;
import com.ruoyi.productManagement.domain.SheepAniwelfare;
import com.ruoyi.productManagement.service.ISheepAniwelfareService;

/**
 * 动物福利Service业务层处理
 *
 * @author 孙少聪
 * @date 2022-03-30
 */
@Service
public class SheepAniwelfareServiceImpl implements ISheepAniwelfareService
{
    @Autowired
    private SheepAniwelfareMapper sheepAniwelfareMapper;

    /**
     * 查询动物福利
     *
     * @param id 动物福利主键
     * @return 动物福利
     */
    @Override
    public SheepAniwelfare selectSheepAniwelfareById(Long id)
    {
        return sheepAniwelfareMapper.selectSheepAniwelfareById(id);
    }

    /**
     * 查询动物福利列表
     *
     * @param sheepAniwelfare 动物福利
     * @return 动物福利
     */
    @Override
    public List<SheepAniwelfare> selectSheepAniwelfareList(SheepAniwelfare sheepAniwelfare)
    {
        return sheepAniwelfareMapper.selectSheepAniwelfareList(sheepAniwelfare);
    }

    /**
     * 新增动物福利
     *
     * @param sheepAniwelfare 动物福利
     * @return 结果
     */
    @Override
    public int insertSheepAniwelfare(SheepAniwelfare sheepAniwelfare)
    {
        System.out.println(sheepAniwelfare.getUserId());
        System.out.println(sheepAniwelfare.getDeptId());
        System.out.println("===============================");
        return sheepAniwelfareMapper.insertSheepAniwelfare(sheepAniwelfare);
    }

    /**
     * 修改动物福利
     *
     * @param sheepAniwelfare 动物福利
     * @return 结果
     */
    @Override
    public int updateSheepAniwelfare(SheepAniwelfare sheepAniwelfare)
    {
        return sheepAniwelfareMapper.updateSheepAniwelfare(sheepAniwelfare);
    }

    /**
     * 批量删除动物福利
     *
     * @param ids 需要删除的动物福利主键
     * @return 结果
     */
    @Override
    public int deleteSheepAniwelfareByIds(Long[] ids)
    {
        return sheepAniwelfareMapper.deleteSheepAniwelfareByIds(ids);
    }

    /**
     * 删除动物福利信息
     *
     * @param id 动物福利主键
     * @return 结果
     */
    @Override
    public int deleteSheepAniwelfareById(Long id)
    {
        return sheepAniwelfareMapper.deleteSheepAniwelfareById(id);
    }
}
