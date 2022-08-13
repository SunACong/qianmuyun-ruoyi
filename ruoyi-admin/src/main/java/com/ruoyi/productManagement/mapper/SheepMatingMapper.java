package com.ruoyi.productManagement.mapper;

import java.util.List;
import com.ruoyi.productManagement.domain.SheepMating;

/**
 * 配种档案Mapper接口
 * 
 * @author 孙少聪
 * @date 2022-03-30
 */
public interface SheepMatingMapper 
{
    /**
     * 查询配种档案
     * 
     * @param id 配种档案主键
     * @return 配种档案
     */
    public SheepMating selectSheepMatingById(Long id);

    /**
     * 查询配种档案列表
     * 
     * @param sheepMating 配种档案
     * @return 配种档案集合
     */
    public List<SheepMating> selectSheepMatingList(SheepMating sheepMating);

    /**
     * 新增配种档案
     * 
     * @param sheepMating 配种档案
     * @return 结果
     */
    public int insertSheepMating(SheepMating sheepMating);

    /**
     * 修改配种档案
     * 
     * @param sheepMating 配种档案
     * @return 结果
     */
    public int updateSheepMating(SheepMating sheepMating);

    /**
     * 删除配种档案
     * 
     * @param id 配种档案主键
     * @return 结果
     */
    public int deleteSheepMatingById(Long id);

    /**
     * 批量删除配种档案
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSheepMatingByIds(Long[] ids);
}
