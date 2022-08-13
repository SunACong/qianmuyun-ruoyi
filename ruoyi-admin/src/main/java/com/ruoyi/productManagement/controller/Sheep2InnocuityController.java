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
import com.ruoyi.productManagement.domain.Sheep2Innocuity;
import com.ruoyi.productManagement.service.ISheep2InnocuityService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 无害化处理Controller
 * 
 * @author 孙少聪
 * @date 2022-05-20
 */
@RestController
@RequestMapping("/productManagement/innocuityMy")
public class Sheep2InnocuityController extends BaseController
{
    @Autowired
    private ISheep2InnocuityService sheep2InnocuityService;

    /**
     * 查询无害化处理列表
     */
    @PreAuthorize("@ss.hasPermi('productManagement:innocuityMy:list')")
    @GetMapping("/list")
    public TableDataInfo list(Sheep2Innocuity sheep2Innocuity)
    {
        startPage();
        List<Sheep2Innocuity> list = sheep2InnocuityService.selectSheep2InnocuityList(sheep2Innocuity);
        return getDataTable(list);
    }

    /**
     * 导出无害化处理列表
     */
    @PreAuthorize("@ss.hasPermi('productManagement:innocuityMy:export')")
    @Log(title = "无害化处理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Sheep2Innocuity sheep2Innocuity)
    {
        List<Sheep2Innocuity> list = sheep2InnocuityService.selectSheep2InnocuityList(sheep2Innocuity);
        ExcelUtil<Sheep2Innocuity> util = new ExcelUtil<Sheep2Innocuity>(Sheep2Innocuity.class);
        util.exportExcel(response, list, "无害化处理数据");
    }

    /**
     * 获取无害化处理详细信息
     */
    @PreAuthorize("@ss.hasPermi('productManagement:innocuityMy:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(sheep2InnocuityService.selectSheep2InnocuityById(id));
    }

    /**
     * 新增无害化处理
     */
    @PreAuthorize("@ss.hasPermi('productManagement:innocuityMy:add')")
    @Log(title = "无害化处理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Sheep2Innocuity sheep2Innocuity)
    {
        return toAjax(sheep2InnocuityService.insertSheep2Innocuity(sheep2Innocuity));
    }

    /**
     * 修改无害化处理
     */
    @PreAuthorize("@ss.hasPermi('productManagement:innocuityMy:edit')")
    @Log(title = "无害化处理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Sheep2Innocuity sheep2Innocuity)
    {
        return toAjax(sheep2InnocuityService.updateSheep2Innocuity(sheep2Innocuity));
    }

    /**
     * 删除无害化处理
     */
    @PreAuthorize("@ss.hasPermi('productManagement:innocuityMy:remove')")
    @Log(title = "无害化处理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(sheep2InnocuityService.deleteSheep2InnocuityByIds(ids));
    }
}
