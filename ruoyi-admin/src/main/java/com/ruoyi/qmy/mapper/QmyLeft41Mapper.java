package com.ruoyi.qmy.mapper;

import java.util.List;
import com.ruoyi.qmy.domain.QmyLeft41;

/**
 * 饲料统计Mapper接口
 * 
 * @author 孙少聪
 * @date 2022-04-06
 */
public interface QmyLeft41Mapper 
{
    /**
     * 查询饲料统计
     * 
     * @param id 饲料统计主键
     * @return 饲料统计
     */
    public QmyLeft41 selectQmyLeft41ById(Long id);

    /**
     * 查询饲料统计列表
     * 
     * @param qmyLeft41 饲料统计
     * @return 饲料统计集合
     */
    public List<QmyLeft41> selectQmyLeft41List(QmyLeft41 qmyLeft41);

    /**
     * 新增饲料统计
     * 
     * @param qmyLeft41 饲料统计
     * @return 结果
     */
    public int insertQmyLeft41(QmyLeft41 qmyLeft41);

    /**
     * 修改饲料统计
     * 
     * @param qmyLeft41 饲料统计
     * @return 结果
     */
    public int updateQmyLeft41(QmyLeft41 qmyLeft41);

    /**
     * 删除饲料统计
     * 
     * @param id 饲料统计主键
     * @return 结果
     */
    public int deleteQmyLeft41ById(Long id);

    /**
     * 批量删除饲料统计
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteQmyLeft41ByIds(Long[] ids);
}
