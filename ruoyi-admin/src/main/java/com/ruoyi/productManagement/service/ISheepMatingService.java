package com.ruoyi.productManagement.service;

import java.util.List;
import com.ruoyi.productManagement.domain.SheepMating;

/**
 * 配种档案Service接口
 * 
 * @author 孙少聪
 * @date 2022-03-30
 */
public interface ISheepMatingService 
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
     * 批量删除配种档案
     * 
     * @param ids 需要删除的配种档案主键集合
     * @return 结果
     */
    public int deleteSheepMatingByIds(Long[] ids);

    /**
     * 删除配种档案信息
     * 
     * @param id 配种档案主键
     * @return 结果
     */
    public int deleteSheepMatingById(Long id);
}
