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
import com.ruoyi.productManagement.domain.Sheep2Genealogy;
import com.ruoyi.productManagement.service.ISheep2GenealogyService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 系谱记录Controller
 * 
 * @author 孙少聪
 * @date 2022-05-20
 */
@RestController
@RequestMapping("/productManagement/genealogyMy")
public class Sheep2GenealogyController extends BaseController
{
    @Autowired
    private ISheep2GenealogyService sheep2GenealogyService;

    /**
     * 查询系谱记录列表
     */
    @PreAuthorize("@ss.hasPermi('productManagement:genealogyMy:list')")
    @GetMapping("/list")
    public TableDataInfo list(Sheep2Genealogy sheep2Genealogy)
    {
        startPage();
        List<Sheep2Genealogy> list = sheep2GenealogyService.selectSheep2GenealogyList(sheep2Genealogy);
        return getDataTable(list);
    }

    /**
     * 导出系谱记录列表
     */
    @PreAuthorize("@ss.hasPermi('productManagement:genealogyMy:export')")
    @Log(title = "系谱记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Sheep2Genealogy sheep2Genealogy)
    {
        List<Sheep2Genealogy> list = sheep2GenealogyService.selectSheep2GenealogyList(sheep2Genealogy);
        ExcelUtil<Sheep2Genealogy> util = new ExcelUtil<Sheep2Genealogy>(Sheep2Genealogy.class);
        util.exportExcel(response, list, "系谱记录数据");
    }

    /**
     * 获取系谱记录详细信息
     */
    @PreAuthorize("@ss.hasPermi('productManagement:genealogyMy:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(sheep2GenealogyService.selectSheep2GenealogyById(id));
    }

    /**
     * 新增系谱记录
     */
    @PreAuthorize("@ss.hasPermi('productManagement:genealogyMy:add')")
    @Log(title = "系谱记录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Sheep2Genealogy sheep2Genealogy)
    {
        return toAjax(sheep2GenealogyService.insertSheep2Genealogy(sheep2Genealogy));
    }

    /**
     * 修改系谱记录
     */
    @PreAuthorize("@ss.hasPermi('productManagement:genealogyMy:edit')")
    @Log(title = "系谱记录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Sheep2Genealogy sheep2Genealogy)
    {
        return toAjax(sheep2GenealogyService.updateSheep2Genealogy(sheep2Genealogy));
    }

    /**
     * 删除系谱记录
     */
    @PreAuthorize("@ss.hasPermi('productManagement:genealogyMy:remove')")
    @Log(title = "系谱记录", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(sheep2GenealogyService.deleteSheep2GenealogyByIds(ids));
    }
}
