package com.ruoyi.deal.controller;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.deal.domain.DealLeft1;
import com.ruoyi.deal.service.IDealLeft1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 左 1Controller
 *
 * @author 孙少聪
 * @date 2022-03-30
 */
@RestController
@RequestMapping("/deal/deal_left_1")
public class DealLeft1Controller extends BaseController
{
    @Autowired
    private IDealLeft1Service dealLeft1Service;

    /**
     * 查询左 1列表
     */
    @PreAuthorize("@ss.hasPermi('deal:deal_left_1:list')")
    @GetMapping("/list")
    public TableDataInfo list(DealLeft1 dealLeft1)
    {
        startPage();
        List<DealLeft1> list = dealLeft1Service.selectDealLeft1List(dealLeft1);
        return getDataTable(list);
    }
    /**
     * 导出左 1列表
     */
    @PreAuthorize("@ss.hasPermi('deal:deal_left_1:export')")
    @Log(title = "左 1", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DealLeft1 dealLeft1)
    {
        List<DealLeft1> list = dealLeft1Service.selectDealLeft1List(dealLeft1);
        ExcelUtil<DealLeft1> util = new ExcelUtil<DealLeft1>(DealLeft1.class);
        util.exportExcel(response, list, "左 1数据");
    }

    /**
     * 获取左 1详细信息
     */
    @PreAuthorize("@ss.hasPermi('deal:deal_left_1:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(dealLeft1Service.selectDealLeft1ById(id));
    }

    /**
     * 新增左 1
     */
    @PreAuthorize("@ss.hasPermi('deal:deal_left_1:add')")
    @Log(title = "左 1", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DealLeft1 dealLeft1)
    {
        return toAjax(dealLeft1Service.insertDealLeft1(dealLeft1));
    }

    /**
     * 修改左 1
     */
    @PreAuthorize("@ss.hasPermi('deal:deal_left_1:edit')")
    @Log(title = "左 1", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DealLeft1 dealLeft1)
    {
        return toAjax(dealLeft1Service.updateDealLeft1(dealLeft1));
    }

    /**
     * 删除左 1
     */
    @PreAuthorize("@ss.hasPermi('deal:deal_left_1:remove')")
    @Log(title = "左 1", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(dealLeft1Service.deleteDealLeft1ByIds(ids));
    }
}
