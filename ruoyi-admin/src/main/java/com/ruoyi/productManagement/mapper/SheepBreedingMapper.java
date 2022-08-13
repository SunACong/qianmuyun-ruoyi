package com.ruoyi.productManagement.mapper;

import java.util.List;
import com.ruoyi.productManagement.domain.SheepBreeding;

/**
 * 育种选育档案Mapper接口
 * 
 * @author 孙少聪
 * @date 2022-03-30
 */
public interface SheepBreedingMapper 
{
    /**
     * 查询育种选育档案
     * 
     * @param id 育种选育档案主键
     * @return 育种选育档案
     */
    public SheepBreeding selectSheepBreedingById(Long id);

    /**
     * 查询育种选育档案列表
     * 
     * @param sheepBreeding 育种选育档案
     * @return 育种选育档案集合
     */
    public List<SheepBreeding> selectSheepBreedingList(SheepBreeding sheepBreeding);

    /**
     * 新增育种选育档案
     * 
     * @param sheepBreeding 育种选育档案
     * @return 结果
     */
    public int insertSheepBreeding(SheepBreeding sheepBreeding);

    /**
     * 修改育种选育档案
     * 
     * @param sheepBreeding 育种选育档案
     * @return 结果
     */
    public int updateSheepBreeding(SheepBreeding sheepBreeding);

    /**
     * 删除育种选育档案
     * 
     * @param id 育种选育档案主键
     * @return 结果
     */
    public int deleteSheepBreedingById(Long id);

    /**
     * 批量删除育种选育档案
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSheepBreedingByIds(Long[] ids);
}
