package com.ruoyi.productManagement.service;

import java.util.List;

import com.ruoyi.common.annotation.DataScope;
import com.ruoyi.productManagement.domain.Sheep2Disinfect;

/**
 * 消毒记录Service接口
 *
 * @author 孙少聪
 * @date 2022-05-20
 */
public interface ISheep2DisinfectService
{
    /**
     * 查询消毒记录
     *
     * @param id 消毒记录主键
     * @return 消毒记录
     */
    public Sheep2Disinfect selectSheep2DisinfectById(Long id);

    /**
     * 查询消毒记录列表
     *
     * @param sheep2Disinfect 消毒记录
     * @return 消毒记录集合
     */
    public List<Sheep2Disinfect> selectSheep2DisinfectList(Sheep2Disinfect sheep2Disinfect);

    /**
     * 新增消毒记录
     *
     * @param sheep2Disinfect 消毒记录
     * @return 结果
     */
    public int insertSheep2Disinfect(Sheep2Disinfect sheep2Disinfect);

    /**
     * 修改消毒记录
     *
     * @param sheep2Disinfect 消毒记录
     * @return 结果
     */
    public int updateSheep2Disinfect(Sheep2Disinfect sheep2Disinfect);

    /**
     * 批量删除消毒记录
     *
     * @param ids 需要删除的消毒记录主键集合
     * @return 结果
     */
    public int deleteSheep2DisinfectByIds(Long[] ids);

    /**
     * 删除消毒记录信息
     *
     * @param id 消毒记录主键
     * @return 结果
     */
    public int deleteSheep2DisinfectById(Long id);
}
