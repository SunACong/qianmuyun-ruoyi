package com.ruoyi.productManagement.service;

import java.util.List;
import com.ruoyi.productManagement.domain.SheepDiseasecontrol;

/**
 * 疾病防治Service接口
 * 
 * @author 孙少聪
 * @date 2022-03-30
 */
public interface ISheepDiseasecontrolService 
{
    /**
     * 查询疾病防治
     * 
     * @param id 疾病防治主键
     * @return 疾病防治
     */
    public SheepDiseasecontrol selectSheepDiseasecontrolById(Long id);

    /**
     * 查询疾病防治列表
     * 
     * @param sheepDiseasecontrol 疾病防治
     * @return 疾病防治集合
     */
    public List<SheepDiseasecontrol> selectSheepDiseasecontrolList(SheepDiseasecontrol sheepDiseasecontrol);

    /**
     * 新增疾病防治
     * 
     * @param sheepDiseasecontrol 疾病防治
     * @return 结果
     */
    public int insertSheepDiseasecontrol(SheepDiseasecontrol sheepDiseasecontrol);

    /**
     * 修改疾病防治
     * 
     * @param sheepDiseasecontrol 疾病防治
     * @return 结果
     */
    public int updateSheepDiseasecontrol(SheepDiseasecontrol sheepDiseasecontrol);

    /**
     * 批量删除疾病防治
     * 
     * @param ids 需要删除的疾病防治主键集合
     * @return 结果
     */
    public int deleteSheepDiseasecontrolByIds(Long[] ids);

    /**
     * 删除疾病防治信息
     * 
     * @param id 疾病防治主键
     * @return 结果
     */
    public int deleteSheepDiseasecontrolById(Long id);
}
