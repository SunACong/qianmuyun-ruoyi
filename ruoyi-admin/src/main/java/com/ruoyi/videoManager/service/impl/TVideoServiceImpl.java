package com.ruoyi.videoManager.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.videoManager.mapper.TVideoMapper;
import com.ruoyi.videoManager.domain.TVideo;
import com.ruoyi.videoManager.service.ITVideoService;

/**
 * 可视管理Service业务层处理
 * 
 * @author 孙少聪
 * @date 2022-04-28
 */
@Service
public class TVideoServiceImpl implements ITVideoService 
{
    @Autowired
    private TVideoMapper tVideoMapper;

    /**
     * 查询可视管理
     * 
     * @param id 可视管理主键
     * @return 可视管理
     */
    @Override
    public TVideo selectTVideoById(Long id)
    {
        return tVideoMapper.selectTVideoById(id);
    }

    /**
     * 查询可视管理列表
     * 
     * @param tVideo 可视管理
     * @return 可视管理
     */
    @Override
    public List<TVideo> selectTVideoList(TVideo tVideo)
    {
        return tVideoMapper.selectTVideoList(tVideo);
    }

    /**
     * 新增可视管理
     * 
     * @param tVideo 可视管理
     * @return 结果
     */
    @Override
    public int insertTVideo(TVideo tVideo)
    {
        return tVideoMapper.insertTVideo(tVideo);
    }

    /**
     * 修改可视管理
     * 
     * @param tVideo 可视管理
     * @return 结果
     */
    @Override
    public int updateTVideo(TVideo tVideo)
    {
        return tVideoMapper.updateTVideo(tVideo);
    }

    /**
     * 批量删除可视管理
     * 
     * @param ids 需要删除的可视管理主键
     * @return 结果
     */
    @Override
    public int deleteTVideoByIds(Long[] ids)
    {
        return tVideoMapper.deleteTVideoByIds(ids);
    }

    /**
     * 删除可视管理信息
     * 
     * @param id 可视管理主键
     * @return 结果
     */
    @Override
    public int deleteTVideoById(Long id)
    {
        return tVideoMapper.deleteTVideoById(id);
    }
}
