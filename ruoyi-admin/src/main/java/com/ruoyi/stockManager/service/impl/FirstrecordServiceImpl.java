package com.ruoyi.stockManager.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.stockManager.mapper.FirstrecordMapper;
import com.ruoyi.stockManager.domain.Firstrecord;
import com.ruoyi.stockManager.service.IFirstrecordService;

/**
 * 初次录入Service业务层处理
 *
 * @author 孙少聪
 * @date 2022-04-22
 */
@Service
public class FirstrecordServiceImpl implements IFirstrecordService
{
    @Autowired
    private FirstrecordMapper firstrecordMapper;

    /**
     * 养殖场数目
     * @return
     */
    @Override
    public List<Map<String ,Object>> selectFirstrecordFarmNum() {
        return firstrecordMapper.selectFirstrecordFarmNum();
    }

    /**
     * 每种羊只数目
     * @return
     */
    @Override
    public List<Map<String, Object>> selectFirstrecordSheepTypeNum() {
        return firstrecordMapper.selectFirstrecordSheepTypeNum();
    }

    /**
     * 查询初次录入
     *
     * @param id 初次录入主键
     * @return 初次录入
     */
    @Override
    public Firstrecord selectFirstrecordById(Long id)
    {
        return firstrecordMapper.selectFirstrecordById(id);
    }

    /**
     * 查询初次录入列表
     *
     * @param firstrecord 初次录入
     * @return 初次录入
     */
    @Override
    public List<Firstrecord> selectFirstrecordList(Firstrecord firstrecord)
    {
        return firstrecordMapper.selectFirstrecordList(firstrecord);
    }

    /**
     * 新增初次录入
     *
     * @param firstrecord 初次录入
     * @return 结果
     */
    @Override
    public int insertFirstrecord(Firstrecord firstrecord)
    {
        return firstrecordMapper.insertFirstrecord(firstrecord);
    }

    /**
     * 修改初次录入
     *
     * @param firstrecord 初次录入
     * @return 结果
     */
    @Override
    public int updateFirstrecord(Firstrecord firstrecord)
    {
        return firstrecordMapper.updateFirstrecord(firstrecord);
    }

    /**
     * 批量删除初次录入
     *
     * @param ids 需要删除的初次录入主键
     * @return 结果
     */
    @Override
    public int deleteFirstrecordByIds(Long[] ids)
    {
        return firstrecordMapper.deleteFirstrecordByIds(ids);
    }

    /**
     * 删除初次录入信息
     *
     * @param id 初次录入主键
     * @return 结果
     */
    @Override
    public int deleteFirstrecordById(Long id)
    {
        return firstrecordMapper.deleteFirstrecordById(id);
    }
}
