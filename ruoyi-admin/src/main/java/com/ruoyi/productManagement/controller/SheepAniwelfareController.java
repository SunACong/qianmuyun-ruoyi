package com.ruoyi.productManagement.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.common.annotation.AddUserIdDeptId;
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
import com.ruoyi.productManagement.domain.SheepAniwelfare;
import com.ruoyi.productManagement.service.ISheepAniwelfareService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 动物福利Controller
 *
 * @author 孙少聪
 * @date 2022-03-30
 */
@RestController
@RequestMapping("/productManagement/aniwelfare")
public class SheepAniwelfareController extends BaseController
{
    @Autowired
    private ISheepAniwelfareService sheepAniwelfareService;

    /**
     * 查询动物福利列表
     */

    @PreAuthorize("@ss.hasPermi('productManagement:aniwelfare:list')")
    @GetMapping("/list")
    public TableDataInfo list(SheepAniwelfare sheepAniwelfare)
    {
        startPage();
        List<SheepAniwelfare> list = sheepAniwelfareService.selectSheepAniwelfareList(sheepAniwelfare);
        return getDataTable(list);
    }

    /**
     * 导出动物福利列表
     */
    @PreAuthorize("@ss.hasPermi('productManagement:aniwelfare:export')")
    @Log(title = "动物福利", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SheepAniwelfare sheepAniwelfare)
    {
        List<SheepAniwelfare> list = sheepAniwelfareService.selectSheepAniwelfareList(sheepAniwelfare);
        ExcelUtil<SheepAniwelfare> util = new ExcelUtil<SheepAniwelfare>(SheepAniwelfare.class);
        util.exportExcel(response, list, "动物福利数据");
    }

    /**
     * 获取动物福利详细信息
     */
    @PreAuthorize("@ss.hasPermi('productManagement:aniwelfare:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(sheepAniwelfareService.selectSheepAniwelfareById(id));
    }

    /**
     * 新增动物福利
     */
    @AddUserIdDeptId()
    @PreAuthorize("@ss.hasPermi('productManagement:aniwelfare:add')")
    @Log(title = "动物福利", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SheepAniwelfare sheepAniwelfare)
    {
        return toAjax(sheepAniwelfareService.insertSheepAniwelfare(sheepAniwelfare));
    }

    /**
     * 修改动物福利
     */
    @PreAuthorize("@ss.hasPermi('productManagement:aniwelfare:edit')")
    @Log(title = "动物福利", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SheepAniwelfare sheepAniwelfare)
    {
        return toAjax(sheepAniwelfareService.updateSheepAniwelfare(sheepAniwelfare));
    }

    /**
     * 删除动物福利
     */
    @PreAuthorize("@ss.hasPermi('productManagement:aniwelfare:remove')")
    @Log(title = "动物福利", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(sheepAniwelfareService.deleteSheepAniwelfareByIds(ids));
    }
}
