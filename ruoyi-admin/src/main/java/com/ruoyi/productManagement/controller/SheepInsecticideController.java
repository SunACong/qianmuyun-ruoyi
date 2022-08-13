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
import com.ruoyi.productManagement.domain.SheepInsecticide;
import com.ruoyi.productManagement.service.ISheepInsecticideService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 驱虫档案Controller
 * 
 * @author 孙少聪
 * @date 2022-03-30
 */
@RestController
@RequestMapping("/productManagement/insecticide")
public class SheepInsecticideController extends BaseController
{
    @Autowired
    private ISheepInsecticideService sheepInsecticideService;

    /**
     * 查询驱虫档案列表
     */
    @PreAuthorize("@ss.hasPermi('productManagement:insecticide:list')")
    @GetMapping("/list")
    public TableDataInfo list(SheepInsecticide sheepInsecticide)
    {
        startPage();
        List<SheepInsecticide> list = sheepInsecticideService.selectSheepInsecticideList(sheepInsecticide);
        return getDataTable(list);
    }

    /**
     * 导出驱虫档案列表
     */
    @PreAuthorize("@ss.hasPermi('productManagement:insecticide:export')")
    @Log(title = "驱虫档案", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SheepInsecticide sheepInsecticide)
    {
        List<SheepInsecticide> list = sheepInsecticideService.selectSheepInsecticideList(sheepInsecticide);
        ExcelUtil<SheepInsecticide> util = new ExcelUtil<SheepInsecticide>(SheepInsecticide.class);
        util.exportExcel(response, list, "驱虫档案数据");
    }

    /**
     * 获取驱虫档案详细信息
     */
    @PreAuthorize("@ss.hasPermi('productManagement:insecticide:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(sheepInsecticideService.selectSheepInsecticideById(id));
    }

    /**
     * 新增驱虫档案
     */
    @PreAuthorize("@ss.hasPermi('productManagement:insecticide:add')")
    @Log(title = "驱虫档案", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SheepInsecticide sheepInsecticide)
    {
        return toAjax(sheepInsecticideService.insertSheepInsecticide(sheepInsecticide));
    }

    /**
     * 修改驱虫档案
     */
    @PreAuthorize("@ss.hasPermi('productManagement:insecticide:edit')")
    @Log(title = "驱虫档案", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SheepInsecticide sheepInsecticide)
    {
        return toAjax(sheepInsecticideService.updateSheepInsecticide(sheepInsecticide));
    }

    /**
     * 删除驱虫档案
     */
    @PreAuthorize("@ss.hasPermi('productManagement:insecticide:remove')")
    @Log(title = "驱虫档案", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(sheepInsecticideService.deleteSheepInsecticideByIds(ids));
    }
}
