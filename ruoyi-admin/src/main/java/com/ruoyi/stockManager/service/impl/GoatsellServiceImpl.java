package com.ruoyi.stockManager.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.stockManager.mapper.GoatsellMapper;
import com.ruoyi.stockManager.domain.Goatsell;
import com.ruoyi.stockManager.service.IGoatsellService;

/**
 * 出售管理Service业务层处理
 * 
 * @author 孙少聪
 * @date 2022-05-20
 */
@Service
public class GoatsellServiceImpl implements IGoatsellService 
{
    @Autowired
    private GoatsellMapper goatsellMapper;

    /**
     * 查询出售管理
     * 
     * @param id 出售管理主键
     * @return 出售管理
     */
    @Override
    public Goatsell selectGoatsellById(Long id)
    {
        return goatsellMapper.selectGoatsellById(id);
    }

    /**
     * 查询出售管理列表
     * 
     * @param goatsell 出售管理
     * @return 出售管理
     */
    @Override
    public List<Goatsell> selectGoatsellList(Goatsell goatsell)
    {
        return goatsellMapper.selectGoatsellList(goatsell);
    }

    /**
     * 新增出售管理
     * 
     * @param goatsell 出售管理
     * @return 结果
     */
    @Override
    public int insertGoatsell(Goatsell goatsell)
    {
        return goatsellMapper.insertGoatsell(goatsell);
    }

    /**
     * 修改出售管理
     * 
     * @param goatsell 出售管理
     * @return 结果
     */
    @Override
    public int updateGoatsell(Goatsell goatsell)
    {
        return goatsellMapper.updateGoatsell(goatsell);
    }

    /**
     * 批量删除出售管理
     * 
     * @param ids 需要删除的出售管理主键
     * @return 结果
     */
    @Override
    public int deleteGoatsellByIds(Long[] ids)
    {
        return goatsellMapper.deleteGoatsellByIds(ids);
    }

    /**
     * 删除出售管理信息
     * 
     * @param id 出售管理主键
     * @return 结果
     */
    @Override
    public int deleteGoatsellById(Long id)
    {
        return goatsellMapper.deleteGoatsellById(id);
    }
}
