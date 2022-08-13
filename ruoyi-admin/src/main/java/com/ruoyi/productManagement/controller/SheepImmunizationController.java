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
import com.ruoyi.productManagement.domain.SheepImmunization;
import com.ruoyi.productManagement.service.ISheepImmunizationService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 免疫档案Controller
 * 
 * @author 孙少聪
 * @date 2022-03-30
 */
@RestController
@RequestMapping("/productManagement/immunization")
public class SheepImmunizationController extends BaseController
{
    @Autowired
    private ISheepImmunizationService sheepImmunizationService;

    /**
     * 查询免疫档案列表
     */
    @PreAuthorize("@ss.hasPermi('productManagement:immunization:list')")
    @GetMapping("/list")
    public TableDataInfo list(SheepImmunization sheepImmunization)
    {
        startPage();
        List<SheepImmunization> list = sheepImmunizationService.selectSheepImmunizationList(sheepImmunization);
        return getDataTable(list);
    }

    /**
     * 导出免疫档案列表
     */
    @PreAuthorize("@ss.hasPermi('productManagement:immunization:export')")
    @Log(title = "免疫档案", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SheepImmunization sheepImmunization)
    {
        List<SheepImmunization> list = sheepImmunizationService.selectSheepImmunizationList(sheepImmunization);
        ExcelUtil<SheepImmunization> util = new ExcelUtil<SheepImmunization>(SheepImmunization.class);
        util.exportExcel(response, list, "免疫档案数据");
    }

    /**
     * 获取免疫档案详细信息
     */
    @PreAuthorize("@ss.hasPermi('productManagement:immunization:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(sheepImmunizationService.selectSheepImmunizationById(id));
    }

    /**
     * 新增免疫档案
     */
    @PreAuthorize("@ss.hasPermi('productManagement:immunization:add')")
    @Log(title = "免疫档案", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SheepImmunization sheepImmunization)
    {
        return toAjax(sheepImmunizationService.insertSheepImmunization(sheepImmunization));
    }

    /**
     * 修改免疫档案
     */
    @PreAuthorize("@ss.hasPermi('productManagement:immunization:edit')")
    @Log(title = "免疫档案", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SheepImmunization sheepImmunization)
    {
        return toAjax(sheepImmunizationService.updateSheepImmunization(sheepImmunization));
    }

    /**
     * 删除免疫档案
     */
    @PreAuthorize("@ss.hasPermi('productManagement:immunization:remove')")
    @Log(title = "免疫档案", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(sheepImmunizationService.deleteSheepImmunizationByIds(ids));
    }
}
