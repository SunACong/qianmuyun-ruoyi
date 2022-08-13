package com.ruoyi.deal.controller;

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
import com.ruoyi.deal.domain.DealLeft4;
import com.ruoyi.deal.service.IDealLeft4Service;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 左 4Controller
 * 
 * @author 孙少聪
 * @date 2022-03-30
 */
@RestController
@RequestMapping("/deal/deal_left_4")
public class DealLeft4Controller extends BaseController
{
    @Autowired
    private IDealLeft4Service dealLeft4Service;

    /**
     * 查询左 4列表
     */
    @PreAuthorize("@ss.hasPermi('deal:deal_left_4:list')")
    @GetMapping("/list")
    public TableDataInfo list(DealLeft4 dealLeft4)
    {
        startPage();
        List<DealLeft4> list = dealLeft4Service.selectDealLeft4List(dealLeft4);
        return getDataTable(list);
    }

    /**
     * 导出左 4列表
     */
    @PreAuthorize("@ss.hasPermi('deal:deal_left_4:export')")
    @Log(title = "左 4", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DealLeft4 dealLeft4)
    {
        List<DealLeft4> list = dealLeft4Service.selectDealLeft4List(dealLeft4);
        ExcelUtil<DealLeft4> util = new ExcelUtil<DealLeft4>(DealLeft4.class);
        util.exportExcel(response, list, "左 4数据");
    }

    /**
     * 获取左 4详细信息
     */
    @PreAuthorize("@ss.hasPermi('deal:deal_left_4:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(dealLeft4Service.selectDealLeft4ById(id));
    }

    /**
     * 新增左 4
     */
    @PreAuthorize("@ss.hasPermi('deal:deal_left_4:add')")
    @Log(title = "左 4", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DealLeft4 dealLeft4)
    {
        return toAjax(dealLeft4Service.insertDealLeft4(dealLeft4));
    }

    /**
     * 修改左 4
     */
    @PreAuthorize("@ss.hasPermi('deal:deal_left_4:edit')")
    @Log(title = "左 4", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DealLeft4 dealLeft4)
    {
        return toAjax(dealLeft4Service.updateDealLeft4(dealLeft4));
    }

    /**
     * 删除左 4
     */
    @PreAuthorize("@ss.hasPermi('deal:deal_left_4:remove')")
    @Log(title = "左 4", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(dealLeft4Service.deleteDealLeft4ByIds(ids));
    }
}
