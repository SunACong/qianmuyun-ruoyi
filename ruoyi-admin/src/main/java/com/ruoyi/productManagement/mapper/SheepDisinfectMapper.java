package com.ruoyi.productManagement.mapper;

import java.util.List;
import com.ruoyi.productManagement.domain.SheepDisinfect;

/**
 * 消毒档案Mapper接口
 * 
 * @author 孙少聪
 * @date 2022-03-30
 */
public interface SheepDisinfectMapper 
{
    /**
     * 查询消毒档案
     * 
     * @param id 消毒档案主键
     * @return 消毒档案
     */
    public SheepDisinfect selectSheepDisinfectById(Long id);

    /**
     * 查询消毒档案列表
     * 
     * @param sheepDisinfect 消毒档案
     * @return 消毒档案集合
     */
    public List<SheepDisinfect> selectSheepDisinfectList(SheepDisinfect sheepDisinfect);

    /**
     * 新增消毒档案
     * 
     * @param sheepDisinfect 消毒档案
     * @return 结果
     */
    public int insertSheepDisinfect(SheepDisinfect sheepDisinfect);

    /**
     * 修改消毒档案
     * 
     * @param sheepDisinfect 消毒档案
     * @return 结果
     */
    public int updateSheepDisinfect(SheepDisinfect sheepDisinfect);

    /**
     * 删除消毒档案
     * 
     * @param id 消毒档案主键
     * @return 结果
     */
    public int deleteSheepDisinfectById(Long id);

    /**
     * 批量删除消毒档案
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSheepDisinfectByIds(Long[] ids);
}
