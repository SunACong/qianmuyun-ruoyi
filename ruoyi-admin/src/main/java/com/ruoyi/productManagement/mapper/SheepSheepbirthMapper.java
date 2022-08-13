package com.ruoyi.productManagement.mapper;

import java.util.List;
import com.ruoyi.productManagement.domain.SheepSheepbirth;

/**
 * 产子档案Mapper接口
 * 
 * @author 孙少聪
 * @date 2022-06-09
 */
public interface SheepSheepbirthMapper 
{
    /**
     * 查询产子档案
     * 
     * @param id 产子档案主键
     * @return 产子档案
     */
    public SheepSheepbirth selectSheepSheepbirthById(Long id);

    /**
     * 查询产子档案列表
     * 
     * @param sheepSheepbirth 产子档案
     * @return 产子档案集合
     */
    public List<SheepSheepbirth> selectSheepSheepbirthList(SheepSheepbirth sheepSheepbirth);

    /**
     * 新增产子档案
     * 
     * @param sheepSheepbirth 产子档案
     * @return 结果
     */
    public int insertSheepSheepbirth(SheepSheepbirth sheepSheepbirth);

    /**
     * 修改产子档案
     * 
     * @param sheepSheepbirth 产子档案
     * @return 结果
     */
    public int updateSheepSheepbirth(SheepSheepbirth sheepSheepbirth);

    /**
     * 删除产子档案
     * 
     * @param id 产子档案主键
     * @return 结果
     */
    public int deleteSheepSheepbirthById(Long id);

    /**
     * 批量删除产子档案
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSheepSheepbirthByIds(Long[] ids);
}
