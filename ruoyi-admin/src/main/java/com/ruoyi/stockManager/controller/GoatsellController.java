package com.ruoyi.stockManager.controller;

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
import com.ruoyi.stockManager.domain.Goatsell;
import com.ruoyi.stockManager.service.IGoatsellService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 出售管理Controller
 * 
 * @author 孙少聪
 * @date 2022-05-20
 */
@RestController
@RequestMapping("/stockManager/goatsell")
public class GoatsellController extends BaseController
{
    @Autowired
    private IGoatsellService goatsellService;

    /**
     * 查询出售管理列表
     */
    @PreAuthorize("@ss.hasPermi('stockManager:goatsell:list')")
    @GetMapping("/list")
    public TableDataInfo list(Goatsell goatsell)
    {
        startPage();
        List<Goatsell> list = goatsellService.selectGoatsellList(goatsell);
        return getDataTable(list);
    }

    /**
     * 导出出售管理列表
     */
    @PreAuthorize("@ss.hasPermi('stockManager:goatsell:export')")
    @Log(title = "出售管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Goatsell goatsell)
    {
        List<Goatsell> list = goatsellService.selectGoatsellList(goatsell);
        ExcelUtil<Goatsell> util = new ExcelUtil<Goatsell>(Goatsell.class);
        util.exportExcel(response, list, "出售管理数据");
    }

    /**
     * 获取出售管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('stockManager:goatsell:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(goatsellService.selectGoatsellById(id));
    }

    /**
     * 新增出售管理
     */
    @PreAuthorize("@ss.hasPermi('stockManager:goatsell:add')")
    @Log(title = "出售管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Goatsell goatsell)
    {
        return toAjax(goatsellService.insertGoatsell(goatsell));
    }

    /**
     * 修改出售管理
     */
    @PreAuthorize("@ss.hasPermi('stockManager:goatsell:edit')")
    @Log(title = "出售管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Goatsell goatsell)
    {
        return toAjax(goatsellService.updateGoatsell(goatsell));
    }

    /**
     * 删除出售管理
     */
    @PreAuthorize("@ss.hasPermi('stockManager:goatsell:remove')")
    @Log(title = "出售管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(goatsellService.deleteGoatsellByIds(ids));
    }
}
