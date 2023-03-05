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
import com.ruoyi.productManagement.domain.Sheep2Productrecord;
import com.ruoyi.productManagement.service.ISheep2ProductrecordService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 生产记录Controller
 *
 * @author 孙少聪
 * @date 2022-05-20
 */
@RestController
@RequestMapping("/productManagement/productrecordMy")
public class Sheep2ProductrecordController extends BaseController
{
    @Autowired
    private ISheep2ProductrecordService sheep2ProductrecordService;

    /**
     * 查询生产记录列表
     */
    @PreAuthorize("@ss.hasPermi('productManagement:productrecordMy:list')")
    @GetMapping("/list")
    public TableDataInfo list(Sheep2Productrecord sheep2Productrecord)
    {
        startPage();
        List<Sheep2Productrecord> list = sheep2ProductrecordService.selectSheep2ProductrecordList(sheep2Productrecord);
        return getDataTable(list);
    }

    /**
     * 导出生产记录列表
     */
    @PreAuthorize("@ss.hasPermi('productManagement:productrecordMy:export')")
    @Log(title = "生产记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Sheep2Productrecord sheep2Productrecord)
    {
        List<Sheep2Productrecord> list = sheep2ProductrecordService.selectSheep2ProductrecordList(sheep2Productrecord);
        ExcelUtil<Sheep2Productrecord> util = new ExcelUtil<Sheep2Productrecord>(Sheep2Productrecord.class);
        util.exportExcel(response, list, "生产记录数据");
    }

    /**
     * 获取生产记录详细信息
     */
    @PreAuthorize("@ss.hasPermi('productManagement:productrecordMy:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(sheep2ProductrecordService.selectSheep2ProductrecordById(id));
    }

    /**
     * 新增生产记录
     */
    @AddUserIdDeptId()
    @PreAuthorize("@ss.hasPermi('productManagement:productrecordMy:add')")
    @Log(title = "生产记录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Sheep2Productrecord sheep2Productrecord)
    {
        return toAjax(sheep2ProductrecordService.insertSheep2Productrecord(sheep2Productrecord));
    }

    /**
     * 修改生产记录
     */
    @PreAuthorize("@ss.hasPermi('productManagement:productrecordMy:edit')")
    @Log(title = "生产记录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Sheep2Productrecord sheep2Productrecord)
    {
        return toAjax(sheep2ProductrecordService.updateSheep2Productrecord(sheep2Productrecord));
    }

    /**
     * 删除生产记录
     */
    @PreAuthorize("@ss.hasPermi('productManagement:productrecordMy:remove')")
    @Log(title = "生产记录", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(sheep2ProductrecordService.deleteSheep2ProductrecordByIds(ids));
    }
}
