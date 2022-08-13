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
import com.ruoyi.productManagement.domain.SheepBreeding;
import com.ruoyi.productManagement.service.ISheepBreedingService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 育种选育档案Controller
 * 
 * @author 孙少聪
 * @date 2022-03-30
 */
@RestController
@RequestMapping("/productManagement/breeding")
public class SheepBreedingController extends BaseController
{
    @Autowired
    private ISheepBreedingService sheepBreedingService;

    /**
     * 查询育种选育档案列表
     */
    @PreAuthorize("@ss.hasPermi('productManagement:breeding:list')")
    @GetMapping("/list")
    public TableDataInfo list(SheepBreeding sheepBreeding)
    {
        startPage();
        List<SheepBreeding> list = sheepBreedingService.selectSheepBreedingList(sheepBreeding);
        return getDataTable(list);
    }

    /**
     * 导出育种选育档案列表
     */
    @PreAuthorize("@ss.hasPermi('productManagement:breeding:export')")
    @Log(title = "育种选育档案", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SheepBreeding sheepBreeding)
    {
        List<SheepBreeding> list = sheepBreedingService.selectSheepBreedingList(sheepBreeding);
        ExcelUtil<SheepBreeding> util = new ExcelUtil<SheepBreeding>(SheepBreeding.class);
        util.exportExcel(response, list, "育种选育档案数据");
    }

    /**
     * 获取育种选育档案详细信息
     */
    @PreAuthorize("@ss.hasPermi('productManagement:breeding:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(sheepBreedingService.selectSheepBreedingById(id));
    }

    /**
     * 新增育种选育档案
     */
    @PreAuthorize("@ss.hasPermi('productManagement:breeding:add')")
    @Log(title = "育种选育档案", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SheepBreeding sheepBreeding)
    {
        return toAjax(sheepBreedingService.insertSheepBreeding(sheepBreeding));
    }

    /**
     * 修改育种选育档案
     */
    @PreAuthorize("@ss.hasPermi('productManagement:breeding:edit')")
    @Log(title = "育种选育档案", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SheepBreeding sheepBreeding)
    {
        return toAjax(sheepBreedingService.updateSheepBreeding(sheepBreeding));
    }

    /**
     * 删除育种选育档案
     */
    @PreAuthorize("@ss.hasPermi('productManagement:breeding:remove')")
    @Log(title = "育种选育档案", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(sheepBreedingService.deleteSheepBreedingByIds(ids));
    }
}
