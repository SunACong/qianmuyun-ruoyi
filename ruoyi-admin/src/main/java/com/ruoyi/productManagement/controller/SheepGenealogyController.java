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
import com.ruoyi.productManagement.domain.SheepGenealogy;
import com.ruoyi.productManagement.service.ISheepGenealogyService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 系谱档案Controller
 *
 * @author 孙少聪
 * @date 2022-03-30
 */
@RestController
@RequestMapping("/productManagement/genealogy")
public class SheepGenealogyController extends BaseController
{
    @Autowired
    private ISheepGenealogyService sheepGenealogyService;

    /**
     * 查询每种羊的数量
     * 孙少聪
     */
    @PreAuthorize("@ss.hasPermi('productManagement:genealogy:sheepSpecies')")
    @GetMapping("/sheepSpecies")
    public AjaxResult sheepSpecies()
    {
        return AjaxResult.success(sheepGenealogyService.selectSheepGenealogysheepSpecies());
    }

    /**
     * 查询养殖场的个数
     * 孙少聪
     */
    @PreAuthorize("@ss.hasPermi('productManagement:genealogy:farmlocList')")
    @GetMapping("/farmlocList")
    public AjaxResult farmlocList()
    {
       return AjaxResult.success(sheepGenealogyService.selectSheepGenealogyFaemlocList());
    }

    /**
     * 查询系谱档案列表
     */
    @PreAuthorize("@ss.hasPermi('productManagement:genealogy:list')")
    @GetMapping("/list")
    public TableDataInfo list(SheepGenealogy sheepGenealogy)
    {
        startPage();
        List<SheepGenealogy> list = sheepGenealogyService.selectSheepGenealogyList(sheepGenealogy);
        return getDataTable(list);
    }

    /**
     * 导出系谱档案列表
     */
    @PreAuthorize("@ss.hasPermi('productManagement:genealogy:export')")
    @Log(title = "系谱档案", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SheepGenealogy sheepGenealogy)
    {
        List<SheepGenealogy> list = sheepGenealogyService.selectSheepGenealogyList(sheepGenealogy);
        ExcelUtil<SheepGenealogy> util = new ExcelUtil<SheepGenealogy>(SheepGenealogy.class);
        util.exportExcel(response, list, "系谱档案数据");
    }

    /**
     * 获取系谱档案详细信息
     */
    @PreAuthorize("@ss.hasPermi('productManagement:genealogy:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(sheepGenealogyService.selectSheepGenealogyById(id));
    }

    /**
     * 新增系谱档案
     */
    @PreAuthorize("@ss.hasPermi('productManagement:genealogy:add')")
    @Log(title = "系谱档案", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SheepGenealogy sheepGenealogy)
    {
        return toAjax(sheepGenealogyService.insertSheepGenealogy(sheepGenealogy));
    }

    /**
     * 修改系谱档案
     */
    @PreAuthorize("@ss.hasPermi('productManagement:genealogy:edit')")
    @Log(title = "系谱档案", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SheepGenealogy sheepGenealogy)
    {
        return toAjax(sheepGenealogyService.updateSheepGenealogy(sheepGenealogy));
    }

    /**
     * 删除系谱档案
     */
    @PreAuthorize("@ss.hasPermi('productManagement:genealogy:remove')")
    @Log(title = "系谱档案", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(sheepGenealogyService.deleteSheepGenealogyByIds(ids));
    }
}
