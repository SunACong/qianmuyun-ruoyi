package com.ruoyi.videoManager.service;

import java.util.List;
import com.ruoyi.videoManager.domain.TVideo;

/**
 * 可视管理Service接口
 * 
 * @author 孙少聪
 * @date 2022-04-28
 */
public interface ITVideoService 
{
    /**
     * 查询可视管理
     * 
     * @param id 可视管理主键
     * @return 可视管理
     */
    public TVideo selectTVideoById(Long id);

    /**
     * 查询可视管理列表
     * 
     * @param tVideo 可视管理
     * @return 可视管理集合
     */
    public List<TVideo> selectTVideoList(TVideo tVideo);

    /**
     * 新增可视管理
     * 
     * @param tVideo 可视管理
     * @return 结果
     */
    public int insertTVideo(TVideo tVideo);

    /**
     * 修改可视管理
     * 
     * @param tVideo 可视管理
     * @return 结果
     */
    public int updateTVideo(TVideo tVideo);

    /**
     * 批量删除可视管理
     * 
     * @param ids 需要删除的可视管理主键集合
     * @return 结果
     */
    public int deleteTVideoByIds(Long[] ids);

    /**
     * 删除可视管理信息
     * 
     * @param id 可视管理主键
     * @return 结果
     */
    public int deleteTVideoById(Long id);
}
