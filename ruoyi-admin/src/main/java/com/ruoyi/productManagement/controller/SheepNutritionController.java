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
import com.ruoyi.productManagement.domain.SheepNutrition;
import com.ruoyi.productManagement.service.ISheepNutritionService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 阶段营养档案Controller
 * 
 * @author 孙少聪
 * @date 2022-03-30
 */
@RestController
@RequestMapping("/productManagement/nutrition")
public class SheepNutritionController extends BaseController
{
    @Autowired
    private ISheepNutritionService sheepNutritionService;

    /**
     * 查询阶段营养档案列表
     */
    @PreAuthorize("@ss.hasPermi('productManagement:nutrition:list')")
    @GetMapping("/list")
    public TableDataInfo list(SheepNutrition sheepNutrition)
    {
        startPage();
        List<SheepNutrition> list = sheepNutritionService.selectSheepNutritionList(sheepNutrition);
        return getDataTable(list);
    }

    /**
     * 导出阶段营养档案列表
     */
    @PreAuthorize("@ss.hasPermi('productManagement:nutrition:export')")
    @Log(title = "阶段营养档案", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SheepNutrition sheepNutrition)
    {
        List<SheepNutrition> list = sheepNutritionService.selectSheepNutritionList(sheepNutrition);
        ExcelUtil<SheepNutrition> util = new ExcelUtil<SheepNutrition>(SheepNutrition.class);
        util.exportExcel(response, list, "阶段营养档案数据");
    }

    /**
     * 获取阶段营养档案详细信息
     */
    @PreAuthorize("@ss.hasPermi('productManagement:nutrition:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(sheepNutritionService.selectSheepNutritionById(id));
    }

    /**
     * 新增阶段营养档案
     */
    @PreAuthorize("@ss.hasPermi('productManagement:nutrition:add')")
    @Log(title = "阶段营养档案", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SheepNutrition sheepNutrition)
    {
        return toAjax(sheepNutritionService.insertSheepNutrition(sheepNutrition));
    }

    /**
     * 修改阶段营养档案
     */
    @PreAuthorize("@ss.hasPermi('productManagement:nutrition:edit')")
    @Log(title = "阶段营养档案", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SheepNutrition sheepNutrition)
    {
        return toAjax(sheepNutritionService.updateSheepNutrition(sheepNutrition));
    }

    /**
     * 删除阶段营养档案
     */
    @PreAuthorize("@ss.hasPermi('productManagement:nutrition:remove')")
    @Log(title = "阶段营养档案", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(sheepNutritionService.deleteSheepNutritionByIds(ids));
    }
}
