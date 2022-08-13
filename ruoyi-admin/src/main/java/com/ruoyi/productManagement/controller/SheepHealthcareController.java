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
import com.ruoyi.productManagement.domain.SheepHealthcare;
import com.ruoyi.productManagement.service.ISheepHealthcareService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 保健档案Controller
 * 
 * @author 孙少聪
 * @date 2022-06-09
 */
@RestController
@RequestMapping("/productManagement/healthcare")
public class SheepHealthcareController extends BaseController
{
    @Autowired
    private ISheepHealthcareService sheepHealthcareService;

    /**
     * 查询保健档案列表
     */
    @PreAuthorize("@ss.hasPermi('productManagement:healthcare:list')")
    @GetMapping("/list")
    public TableDataInfo list(SheepHealthcare sheepHealthcare)
    {
        startPage();
        List<SheepHealthcare> list = sheepHealthcareService.selectSheepHealthcareList(sheepHealthcare);
        return getDataTable(list);
    }

    /**
     * 导出保健档案列表
     */
    @PreAuthorize("@ss.hasPermi('productManagement:healthcare:export')")
    @Log(title = "保健档案", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SheepHealthcare sheepHealthcare)
    {
        List<SheepHealthcare> list = sheepHealthcareService.selectSheepHealthcareList(sheepHealthcare);
        ExcelUtil<SheepHealthcare> util = new ExcelUtil<SheepHealthcare>(SheepHealthcare.class);
        util.exportExcel(response, list, "保健档案数据");
    }

    /**
     * 获取保健档案详细信息
     */
    @PreAuthorize("@ss.hasPermi('productManagement:healthcare:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(sheepHealthcareService.selectSheepHealthcareById(id));
    }

    /**
     * 新增保健档案
     */
    @PreAuthorize("@ss.hasPermi('productManagement:healthcare:add')")
    @Log(title = "保健档案", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SheepHealthcare sheepHealthcare)
    {
        return toAjax(sheepHealthcareService.insertSheepHealthcare(sheepHealthcare));
    }

    /**
     * 修改保健档案
     */
    @PreAuthorize("@ss.hasPermi('productManagement:healthcare:edit')")
    @Log(title = "保健档案", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SheepHealthcare sheepHealthcare)
    {
        return toAjax(sheepHealthcareService.updateSheepHealthcare(sheepHealthcare));
    }

    /**
     * 删除保健档案
     */
    @PreAuthorize("@ss.hasPermi('productManagement:healthcare:remove')")
    @Log(title = "保健档案", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(sheepHealthcareService.deleteSheepHealthcareByIds(ids));
    }
}
