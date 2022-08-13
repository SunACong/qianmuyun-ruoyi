package com.ruoyi.stockManager.service;

import java.util.List;
import com.ruoyi.stockManager.domain.Goatsell;

/**
 * 出售管理Service接口
 * 
 * @author 孙少聪
 * @date 2022-05-20
 */
public interface IGoatsellService 
{
    /**
     * 查询出售管理
     * 
     * @param id 出售管理主键
     * @return 出售管理
     */
    public Goatsell selectGoatsellById(Long id);

    /**
     * 查询出售管理列表
     * 
     * @param goatsell 出售管理
     * @return 出售管理集合
     */
    public List<Goatsell> selectGoatsellList(Goatsell goatsell);

    /**
     * 新增出售管理
     * 
     * @param goatsell 出售管理
     * @return 结果
     */
    public int insertGoatsell(Goatsell goatsell);

    /**
     * 修改出售管理
     * 
     * @param goatsell 出售管理
     * @return 结果
     */
    public int updateGoatsell(Goatsell goatsell);

    /**
     * 批量删除出售管理
     * 
     * @param ids 需要删除的出售管理主键集合
     * @return 结果
     */
    public int deleteGoatsellByIds(Long[] ids);

    /**
     * 删除出售管理信息
     * 
     * @param id 出售管理主键
     * @return 结果
     */
    public int deleteGoatsellById(Long id);
}
