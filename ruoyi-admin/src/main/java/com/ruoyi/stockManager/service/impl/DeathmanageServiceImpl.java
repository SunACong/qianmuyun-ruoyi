package com.ruoyi.stockManager.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.stockManager.mapper.DeathmanageMapper;
import com.ruoyi.stockManager.domain.Deathmanage;
import com.ruoyi.stockManager.service.IDeathmanageService;

/**
 * 死亡管理Service业务层处理
 * 
 * @author 孙少聪
 * @date 2022-04-22
 */
@Service
public class DeathmanageServiceImpl implements IDeathmanageService 
{
    @Autowired
    private DeathmanageMapper deathmanageMapper;

    /**
     * 查询死亡管理
     * 
     * @param id 死亡管理主键
     * @return 死亡管理
     */
    @Override
    public Deathmanage selectDeathmanageById(Long id)
    {
        return deathmanageMapper.selectDeathmanageById(id);
    }

    /**
     * 查询死亡管理列表
     * 
     * @param deathmanage 死亡管理
     * @return 死亡管理
     */
    @Override
    public List<Deathmanage> selectDeathmanageList(Deathmanage deathmanage)
    {
        return deathmanageMapper.selectDeathmanageList(deathmanage);
    }

    /**
     * 新增死亡管理
     * 
     * @param deathmanage 死亡管理
     * @return 结果
     */
    @Override
    public int insertDeathmanage(Deathmanage deathmanage)
    {
        return deathmanageMapper.insertDeathmanage(deathmanage);
    }

    /**
     * 修改死亡管理
     * 
     * @param deathmanage 死亡管理
     * @return 结果
     */
    @Override
    public int updateDeathmanage(Deathmanage deathmanage)
    {
        return deathmanageMapper.updateDeathmanage(deathmanage);
    }

    /**
     * 批量删除死亡管理
     * 
     * @param ids 需要删除的死亡管理主键
     * @return 结果
     */
    @Override
    public int deleteDeathmanageByIds(Long[] ids)
    {
        return deathmanageMapper.deleteDeathmanageByIds(ids);
    }

    /**
     * 删除死亡管理信息
     * 
     * @param id 死亡管理主键
     * @return 结果
     */
    @Override
    public int deleteDeathmanageById(Long id)
    {
        return deathmanageMapper.deleteDeathmanageById(id);
    }
}
