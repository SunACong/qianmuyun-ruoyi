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
import com.ruoyi.productManagement.domain.SheepMating;
import com.ruoyi.productManagement.service.ISheepMatingService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 配种档案Controller
 * 
 * @author 孙少聪
 * @date 2022-03-30
 */
@RestController
@RequestMapping("/productManagement/mating")
public class SheepMatingController extends BaseController
{
    @Autowired
    private ISheepMatingService sheepMatingService;

    /**
     * 查询配种档案列表
     */
    @PreAuthorize("@ss.hasPermi('productManagement:mating:list')")
    @GetMapping("/list")
    public TableDataInfo list(SheepMating sheepMating)
    {
        startPage();
        List<SheepMating> list = sheepMatingService.selectSheepMatingList(sheepMating);
        return getDataTable(list);
    }

    /**
     * 导出配种档案列表
     */
    @PreAuthorize("@ss.hasPermi('productManagement:mating:export')")
    @Log(title = "配种档案", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SheepMating sheepMating)
    {
        List<SheepMating> list = sheepMatingService.selectSheepMatingList(sheepMating);
        ExcelUtil<SheepMating> util = new ExcelUtil<SheepMating>(SheepMating.class);
        util.exportExcel(response, list, "配种档案数据");
    }

    /**
     * 获取配种档案详细信息
     */
    @PreAuthorize("@ss.hasPermi('productManagement:mating:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(sheepMatingService.selectSheepMatingById(id));
    }

    /**
     * 新增配种档案
     */
    @PreAuthorize("@ss.hasPermi('productManagement:mating:add')")
    @Log(title = "配种档案", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SheepMating sheepMating)
    {
        return toAjax(sheepMatingService.insertSheepMating(sheepMating));
    }

    /**
     * 修改配种档案
     */
    @PreAuthorize("@ss.hasPermi('productManagement:mating:edit')")
    @Log(title = "配种档案", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SheepMating sheepMating)
    {
        return toAjax(sheepMatingService.updateSheepMating(sheepMating));
    }

    /**
     * 删除配种档案
     */
    @PreAuthorize("@ss.hasPermi('productManagement:mating:remove')")
    @Log(title = "配种档案", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(sheepMatingService.deleteSheepMatingByIds(ids));
    }
}
