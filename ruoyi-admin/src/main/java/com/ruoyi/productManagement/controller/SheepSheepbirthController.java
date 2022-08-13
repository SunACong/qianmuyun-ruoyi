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
import com.ruoyi.productManagement.domain.SheepSheepbirth;
import com.ruoyi.productManagement.service.ISheepSheepbirthService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 产子档案Controller
 * 
 * @author 孙少聪
 * @date 2022-06-09
 */
@RestController
@RequestMapping("/productManagement/sheepbirth")
public class SheepSheepbirthController extends BaseController
{
    @Autowired
    private ISheepSheepbirthService sheepSheepbirthService;

    /**
     * 查询产子档案列表
     */
    @PreAuthorize("@ss.hasPermi('productManagement:sheepbirth:list')")
    @GetMapping("/list")
    public TableDataInfo list(SheepSheepbirth sheepSheepbirth)
    {
        startPage();
        List<SheepSheepbirth> list = sheepSheepbirthService.selectSheepSheepbirthList(sheepSheepbirth);
        return getDataTable(list);
    }

    /**
     * 导出产子档案列表
     */
    @PreAuthorize("@ss.hasPermi('productManagement:sheepbirth:export')")
    @Log(title = "产子档案", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SheepSheepbirth sheepSheepbirth)
    {
        List<SheepSheepbirth> list = sheepSheepbirthService.selectSheepSheepbirthList(sheepSheepbirth);
        ExcelUtil<SheepSheepbirth> util = new ExcelUtil<SheepSheepbirth>(SheepSheepbirth.class);
        util.exportExcel(response, list, "产子档案数据");
    }

    /**
     * 获取产子档案详细信息
     */
    @PreAuthorize("@ss.hasPermi('productManagement:sheepbirth:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(sheepSheepbirthService.selectSheepSheepbirthById(id));
    }

    /**
     * 新增产子档案
     */
    @PreAuthorize("@ss.hasPermi('productManagement:sheepbirth:add')")
    @Log(title = "产子档案", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SheepSheepbirth sheepSheepbirth)
    {
        return toAjax(sheepSheepbirthService.insertSheepSheepbirth(sheepSheepbirth));
    }

    /**
     * 修改产子档案
     */
    @PreAuthorize("@ss.hasPermi('productManagement:sheepbirth:edit')")
    @Log(title = "产子档案", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SheepSheepbirth sheepSheepbirth)
    {
        return toAjax(sheepSheepbirthService.updateSheepSheepbirth(sheepSheepbirth));
    }

    /**
     * 删除产子档案
     */
    @PreAuthorize("@ss.hasPermi('productManagement:sheepbirth:remove')")
    @Log(title = "产子档案", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(sheepSheepbirthService.deleteSheepSheepbirthByIds(ids));
    }
}
