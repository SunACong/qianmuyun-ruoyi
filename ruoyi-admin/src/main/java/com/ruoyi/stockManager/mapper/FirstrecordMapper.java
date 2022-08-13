package com.ruoyi.stockManager.mapper;

import java.util.List;
import java.util.Map;

import com.ruoyi.stockManager.domain.Firstrecord;
import org.apache.ibatis.annotations.MapKey;

/**
 * 初次录入Mapper接口
 *
 * @author 孙少聪
 * @date 2022-04-22
 */
public interface FirstrecordMapper
{

    /**
     * 查询养殖场数目
     * @return
     */
    public List<Map<String,Object>> selectFirstrecordFarmNum();

    /**
     * 查询每种羊只数目
     * @return
     */
    public List<Map<String,Object>> selectFirstrecordSheepTypeNum();


    /**
     * 查询初次录入
     *
     * @param id 初次录入主键
     * @return 初次录入
     */
    public Firstrecord selectFirstrecordById(Long id);

    /**
     * 查询初次录入列表
     *
     * @param firstrecord 初次录入
     * @return 初次录入集合
     */
    public List<Firstrecord> selectFirstrecordList(Firstrecord firstrecord);

    /**
     * 新增初次录入
     *
     * @param firstrecord 初次录入
     * @return 结果
     */
    public int insertFirstrecord(Firstrecord firstrecord);

    /**
     * 修改初次录入
     *
     * @param firstrecord 初次录入
     * @return 结果
     */
    public int updateFirstrecord(Firstrecord firstrecord);

    /**
     * 删除初次录入
     *
     * @param id 初次录入主键
     * @return 结果
     */
    public int deleteFirstrecordById(Long id);

    /**
     * 批量删除初次录入
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteFirstrecordByIds(Long[] ids);
}
