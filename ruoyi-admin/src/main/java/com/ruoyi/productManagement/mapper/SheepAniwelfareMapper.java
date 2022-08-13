package com.ruoyi.productManagement.mapper;

import java.util.List;
import com.ruoyi.productManagement.domain.SheepAniwelfare;

/**
 * 动物福利Mapper接口
 * 
 * @author 孙少聪
 * @date 2022-03-30
 */
public interface SheepAniwelfareMapper 
{
    /**
     * 查询动物福利
     * 
     * @param id 动物福利主键
     * @return 动物福利
     */
    public SheepAniwelfare selectSheepAniwelfareById(Long id);

    /**
     * 查询动物福利列表
     * 
     * @param sheepAniwelfare 动物福利
     * @return 动物福利集合
     */
    public List<SheepAniwelfare> selectSheepAniwelfareList(SheepAniwelfare sheepAniwelfare);

    /**
     * 新增动物福利
     * 
     * @param sheepAniwelfare 动物福利
     * @return 结果
     */
    public int insertSheepAniwelfare(SheepAniwelfare sheepAniwelfare);

    /**
     * 修改动物福利
     * 
     * @param sheepAniwelfare 动物福利
     * @return 结果
     */
    public int updateSheepAniwelfare(SheepAniwelfare sheepAniwelfare);

    /**
     * 删除动物福利
     * 
     * @param id 动物福利主键
     * @return 结果
     */
    public int deleteSheepAniwelfareById(Long id);

    /**
     * 批量删除动物福利
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSheepAniwelfareByIds(Long[] ids);
}
