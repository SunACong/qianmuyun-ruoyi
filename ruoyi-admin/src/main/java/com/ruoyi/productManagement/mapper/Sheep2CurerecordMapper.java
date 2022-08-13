package com.ruoyi.productManagement.mapper;

import java.util.List;
import com.ruoyi.productManagement.domain.Sheep2Curerecord;

/**
 * 诊疗记录Mapper接口
 * 
 * @author 孙少聪
 * @date 2022-05-20
 */
public interface Sheep2CurerecordMapper 
{
    /**
     * 查询诊疗记录
     * 
     * @param id 诊疗记录主键
     * @return 诊疗记录
     */
    public Sheep2Curerecord selectSheep2CurerecordById(Long id);

    /**
     * 查询诊疗记录列表
     * 
     * @param sheep2Curerecord 诊疗记录
     * @return 诊疗记录集合
     */
    public List<Sheep2Curerecord> selectSheep2CurerecordList(Sheep2Curerecord sheep2Curerecord);

    /**
     * 新增诊疗记录
     * 
     * @param sheep2Curerecord 诊疗记录
     * @return 结果
     */
    public int insertSheep2Curerecord(Sheep2Curerecord sheep2Curerecord);

    /**
     * 修改诊疗记录
     * 
     * @param sheep2Curerecord 诊疗记录
     * @return 结果
     */
    public int updateSheep2Curerecord(Sheep2Curerecord sheep2Curerecord);

    /**
     * 删除诊疗记录
     * 
     * @param id 诊疗记录主键
     * @return 结果
     */
    public int deleteSheep2CurerecordById(Long id);

    /**
     * 批量删除诊疗记录
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSheep2CurerecordByIds(Long[] ids);
}
