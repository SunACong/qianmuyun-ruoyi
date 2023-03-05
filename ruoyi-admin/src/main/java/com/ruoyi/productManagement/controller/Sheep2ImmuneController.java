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
import com.ruoyi.productManagement.domain.Sheep2Immune;
import com.ruoyi.productManagement.service.ISheep2ImmuneService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 免疫记录Controller
 *
 * @author 孙少聪
 * @date 2022-05-20
 */
@RestController
@RequestMapping("/productManagement/immuneMy")
public class Sheep2ImmuneController extends BaseController
{
    @Autowired
    private ISheep2ImmuneService sheep2ImmuneService;

    /**
     * 查询免疫记录列表
     */
    @PreAuthorize("@ss.hasPermi('productManagement:immuneMy:list')")
    @GetMapping("/list")
    public TableDataInfo list(Sheep2Immune sheep2Immune)
    {
        startPage();
        List<Sheep2Immune> list = sheep2ImmuneService.selectSheep2ImmuneList(sheep2Immune);
        return getDataTable(list);
    }

    /**
     * 导出免疫记录列表
     */
    @PreAuthorize("@ss.hasPermi('productManagement:immuneMy:export')")
    @Log(title = "免疫记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Sheep2Immune sheep2Immune)
    {
        List<Sheep2Immune> list = sheep2ImmuneService.selectSheep2ImmuneList(sheep2Immune);
        ExcelUtil<Sheep2Immune> util = new ExcelUtil<Sheep2Immune>(Sheep2Immune.class);
        util.exportExcel(response, list, "免疫记录数据");
    }

    /**
     * 获取免疫记录详细信息
     */
    @PreAuthorize("@ss.hasPermi('productManagement:immuneMy:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(sheep2ImmuneService.selectSheep2ImmuneById(id));
    }

    /**
     * 新增免疫记录
     */
    @AddUserIdDeptId()
    @PreAuthorize("@ss.hasPermi('productManagement:immuneMy:add')")
    @Log(title = "免疫记录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Sheep2Immune sheep2Immune)
    {
        return toAjax(sheep2ImmuneService.insertSheep2Immune(sheep2Immune));
    }

    /**
     * 修改免疫记录
     */
    @PreAuthorize("@ss.hasPermi('productManagement:immuneMy:edit')")
    @Log(title = "免疫记录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Sheep2Immune sheep2Immune)
    {
        return toAjax(sheep2ImmuneService.updateSheep2Immune(sheep2Immune));
    }

    /**
     * 删除免疫记录
     */
    @PreAuthorize("@ss.hasPermi('productManagement:immuneMy:remove')")
    @Log(title = "免疫记录", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(sheep2ImmuneService.deleteSheep2ImmuneByIds(ids));
    }
}
