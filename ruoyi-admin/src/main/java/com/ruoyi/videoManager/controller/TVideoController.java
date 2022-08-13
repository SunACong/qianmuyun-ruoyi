package com.ruoyi.videoManager.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.videoManager.domain.TVideo;
import com.ruoyi.videoManager.service.ITVideoService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 可视管理Controller
 * 
 * @author 孙少聪
 * @date 2022-04-28
 */
@RestController
@RequestMapping("/videoManager/video")
public class TVideoController extends BaseController
{
    @Autowired
    private ITVideoService tVideoService;

    /**
     * 查询可视管理列表
     */
    @PreAuthorize("@ss.hasPermi('videoManager:video:list')")
    @GetMapping("/list")
    public TableDataInfo list(TVideo tVideo)
    {
        startPage();
        List<TVideo> list = tVideoService.selectTVideoList(tVideo);
        return getDataTable(list);
    }

    /**
     * 导出可视管理列表
     */
    @PreAuthorize("@ss.hasPermi('videoManager:video:export')")
    @Log(title = "可视管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TVideo tVideo)
    {
        List<TVideo> list = tVideoService.selectTVideoList(tVideo);
        ExcelUtil<TVideo> util = new ExcelUtil<TVideo>(TVideo.class);
        util.exportExcel(response, list, "可视管理数据");
    }

    /**
     * 获取可视管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('videoManager:video:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(tVideoService.selectTVideoById(id));
    }

    /**
     * 新增可视管理
     */
    @PreAuthorize("@ss.hasPermi('videoManager:video:add')")
    @Log(title = "可视管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TVideo tVideo)
    {
        return toAjax(tVideoService.insertTVideo(tVideo));
    }

    /**
     * 修改可视管理
     */
    @PreAuthorize("@ss.hasPermi('videoManager:video:edit')")
    @Log(title = "可视管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TVideo tVideo)
    {
        return toAjax(tVideoService.updateTVideo(tVideo));
    }

    /**
     * 删除可视管理
     */
    @PreAuthorize("@ss.hasPermi('videoManager:video:remove')")
    @Log(title = "可视管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(tVideoService.deleteTVideoByIds(ids));
    }
}
