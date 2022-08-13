package com.ruoyi.productManagement.mapper;

import java.util.List;
import com.ruoyi.productManagement.domain.Sheep2Innocuity;

/**
 * 无害化处理Mapper接口
 * 
 * @author 孙少聪
 * @date 2022-05-20
 */
public interface Sheep2InnocuityMapper 
{
    /**
     * 查询无害化处理
     * 
     * @param id 无害化处理主键
     * @return 无害化处理
     */
    public Sheep2Innocuity selectSheep2InnocuityById(Long id);

    /**
     * 查询无害化处理列表
     * 
     * @param sheep2Innocuity 无害化处理
     * @return 无害化处理集合
     */
    public List<Sheep2Innocuity> selectSheep2InnocuityList(Sheep2Innocuity sheep2Innocuity);

    /**
     * 新增无害化处理
     * 
     * @param sheep2Innocuity 无害化处理
     * @return 结果
     */
    public int insertSheep2Innocuity(Sheep2Innocuity sheep2Innocuity);

    /**
     * 修改无害化处理
     * 
     * @param sheep2Innocuity 无害化处理
     * @return 结果
     */
    public int updateSheep2Innocuity(Sheep2Innocuity sheep2Innocuity);

    /**
     * 删除无害化处理
     * 
     * @param id 无害化处理主键
     * @return 结果
     */
    public int deleteSheep2InnocuityById(Long id);

    /**
     * 批量删除无害化处理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSheep2InnocuityByIds(Long[] ids);
}
