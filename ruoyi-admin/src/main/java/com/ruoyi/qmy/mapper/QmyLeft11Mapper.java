package com.ruoyi.qmy.mapper;

import java.util.List;
import com.ruoyi.qmy.domain.QmyLeft11;

/**
 * 存栏统计(二)Mapper接口
 * 
 * @author 孙少聪
 * @date 2022-04-06
 */
public interface QmyLeft11Mapper 
{
    /**
     * 查询存栏统计(二)
     * 
     * @param id 存栏统计(二)主键
     * @return 存栏统计(二)
     */
    public QmyLeft11 selectQmyLeft11ById(Long id);

    /**
     * 查询存栏统计(二)列表
     * 
     * @param qmyLeft11 存栏统计(二)
     * @return 存栏统计(二)集合
     */
    public List<QmyLeft11> selectQmyLeft11List(QmyLeft11 qmyLeft11);

    /**
     * 新增存栏统计(二)
     * 
     * @param qmyLeft11 存栏统计(二)
     * @return 结果
     */
    public int insertQmyLeft11(QmyLeft11 qmyLeft11);

    /**
     * 修改存栏统计(二)
     * 
     * @param qmyLeft11 存栏统计(二)
     * @return 结果
     */
    public int updateQmyLeft11(QmyLeft11 qmyLeft11);

    /**
     * 删除存栏统计(二)
     * 
     * @param id 存栏统计(二)主键
     * @return 结果
     */
    public int deleteQmyLeft11ById(Long id);

    /**
     * 批量删除存栏统计(二)
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteQmyLeft11ByIds(Long[] ids);
}
