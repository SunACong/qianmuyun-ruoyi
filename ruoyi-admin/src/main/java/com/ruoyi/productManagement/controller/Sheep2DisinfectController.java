package com.ruoyi.productManagement.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.common.annotation.AddUserIdDeptId;
import com.ruoyi.common.annotation.DataScope;
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
import com.ruoyi.productManagement.domain.Sheep2Disinfect;
import com.ruoyi.productManagement.service.ISheep2DisinfectService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 消毒记录Controller
 *
 * @author 孙少聪
 * @date 2022-05-20
 */
@RestController
@RequestMapping("/productManagement/disinfectMy")
public class Sheep2DisinfectController extends BaseController
{
    @Autowired
    private ISheep2DisinfectService sheep2DisinfectService;

    /**
     * 查询消毒记录列表
     */
    @PreAuthorize("@ss.hasPermi('productManagement:disinfectMy:list')")
    @GetMapping("/list")
    public TableDataInfo list(Sheep2Disinfect sheep2Disinfect)
    {
        startPage();
        List<Sheep2Disinfect> list = sheep2DisinfectService.selectSheep2DisinfectList(sheep2Disinfect);
        return getDataTable(list);
    }

    /**
     * 导出消毒记录列表
     */
    @PreAuthorize("@ss.hasPermi('productManagement:disinfectMy:export')")
    @Log(title = "消毒记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Sheep2Disinfect sheep2Disinfect)
    {
        List<Sheep2Disinfect> list = sheep2DisinfectService.selectSheep2DisinfectList(sheep2Disinfect);
        ExcelUtil<Sheep2Disinfect> util = new ExcelUtil<Sheep2Disinfect>(Sheep2Disinfect.class);
        util.exportExcel(response, list, "消毒记录数据");
    }

    /**
     * 获取消毒记录详细信息
     */
    @PreAuthorize("@ss.hasPermi('productManagement:disinfectMy:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(sheep2DisinfectService.selectSheep2DisinfectById(id));
    }

    /**
     * 新增消毒记录
     */
    @AddUserIdDeptId()
    @PreAuthorize("@ss.hasPermi('productManagement:disinfectMy:add')")
    @Log(title = "消毒记录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Sheep2Disinfect sheep2Disinfect)
    {
        return toAjax(sheep2DisinfectService.insertSheep2Disinfect(sheep2Disinfect));
    }

    /**
     * 修改消毒记录
     */
    @PreAuthorize("@ss.hasPermi('productManagement:disinfectMy:edit')")
    @Log(title = "消毒记录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Sheep2Disinfect sheep2Disinfect)
    {
        return toAjax(sheep2DisinfectService.updateSheep2Disinfect(sheep2Disinfect));
    }

    /**
     * 删除消毒记录
     */
    @PreAuthorize("@ss.hasPermi('productManagement:disinfectMy:remove')")
    @Log(title = "消毒记录", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(sheep2DisinfectService.deleteSheep2DisinfectByIds(ids));
    }
}
