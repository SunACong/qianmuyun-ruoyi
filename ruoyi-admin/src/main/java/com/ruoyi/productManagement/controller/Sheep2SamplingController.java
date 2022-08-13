package com.ruoyi.productManagement.controller;

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
import com.ruoyi.productManagement.domain.Sheep2Sampling;
import com.ruoyi.productManagement.service.ISheep2SamplingService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 采样记录Controller
 * 
 * @author 孙少聪
 * @date 2022-05-20
 */
@RestController
@RequestMapping("/productManagement/samplingMy")
public class Sheep2SamplingController extends BaseController
{
    @Autowired
    private ISheep2SamplingService sheep2SamplingService;

    /**
     * 查询采样记录列表
     */
    @PreAuthorize("@ss.hasPermi('productManagement:samplingMy:list')")
    @GetMapping("/list")
    public TableDataInfo list(Sheep2Sampling sheep2Sampling)
    {
        startPage();
        List<Sheep2Sampling> list = sheep2SamplingService.selectSheep2SamplingList(sheep2Sampling);
        return getDataTable(list);
    }

    /**
     * 导出采样记录列表
     */
    @PreAuthorize("@ss.hasPermi('productManagement:samplingMy:export')")
    @Log(title = "采样记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Sheep2Sampling sheep2Sampling)
    {
        List<Sheep2Sampling> list = sheep2SamplingService.selectSheep2SamplingList(sheep2Sampling);
        ExcelUtil<Sheep2Sampling> util = new ExcelUtil<Sheep2Sampling>(Sheep2Sampling.class);
        util.exportExcel(response, list, "采样记录数据");
    }

    /**
     * 获取采样记录详细信息
     */
    @PreAuthorize("@ss.hasPermi('productManagement:samplingMy:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(sheep2SamplingService.selectSheep2SamplingById(id));
    }

    /**
     * 新增采样记录
     */
    @PreAuthorize("@ss.hasPermi('productManagement:samplingMy:add')")
    @Log(title = "采样记录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Sheep2Sampling sheep2Sampling)
    {
        return toAjax(sheep2SamplingService.insertSheep2Sampling(sheep2Sampling));
    }

    /**
     * 修改采样记录
     */
    @PreAuthorize("@ss.hasPermi('productManagement:samplingMy:edit')")
    @Log(title = "采样记录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Sheep2Sampling sheep2Sampling)
    {
        return toAjax(sheep2SamplingService.updateSheep2Sampling(sheep2Sampling));
    }

    /**
     * 删除采样记录
     */
    @PreAuthorize("@ss.hasPermi('productManagement:samplingMy:remove')")
    @Log(title = "采样记录", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(sheep2SamplingService.deleteSheep2SamplingByIds(ids));
    }
}
