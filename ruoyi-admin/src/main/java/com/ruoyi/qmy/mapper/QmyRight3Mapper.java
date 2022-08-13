package com.ruoyi.qmy.mapper;

import java.util.List;
import com.ruoyi.qmy.domain.QmyRight3;

/**
 * 检疫检测Mapper接口
 * 
 * @author 孙少聪
 * @date 2022-04-06
 */
public interface QmyRight3Mapper 
{
    /**
     * 查询检疫检测
     * 
     * @param id 检疫检测主键
     * @return 检疫检测
     */
    public QmyRight3 selectQmyRight3ById(Long id);

    /**
     * 查询检疫检测列表
     * 
     * @param qmyRight3 检疫检测
     * @return 检疫检测集合
     */
    public List<QmyRight3> selectQmyRight3List(QmyRight3 qmyRight3);

    /**
     * 新增检疫检测
     * 
     * @param qmyRight3 检疫检测
     * @return 结果
     */
    public int insertQmyRight3(QmyRight3 qmyRight3);

    /**
     * 修改检疫检测
     * 
     * @param qmyRight3 检疫检测
     * @return 结果
     */
    public int updateQmyRight3(QmyRight3 qmyRight3);

    /**
     * 删除检疫检测
     * 
     * @param id 检疫检测主键
     * @return 结果
     */
    public int deleteQmyRight3ById(Long id);

    /**
     * 批量删除检疫检测
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteQmyRight3ByIds(Long[] ids);
}
