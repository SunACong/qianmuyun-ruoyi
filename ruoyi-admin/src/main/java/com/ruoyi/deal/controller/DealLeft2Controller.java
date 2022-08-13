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
import com.ruoyi.deal.domain.DealLeft2;
import com.ruoyi.deal.service.IDealLeft2Service;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 左 2Controller
 * 
 * @author 孙少聪
 * @date 2022-03-30
 */
@RestController
@RequestMapping("/deal/deal_left_2")
public class DealLeft2Controller extends BaseController
{
    @Autowired
    private IDealLeft2Service dealLeft2Service;

    /**
     * 查询左 2列表
     */
    @PreAuthorize("@ss.hasPermi('deal:deal_left_2:list')")
    @GetMapping("/list")
    public TableDataInfo list(DealLeft2 dealLeft2)
    {
        startPage();
        List<DealLeft2> list = dealLeft2Service.selectDealLeft2List(dealLeft2);
        return getDataTable(list);
    }

    /**
     * 导出左 2列表
     */
    @PreAuthorize("@ss.hasPermi('deal:deal_left_2:export')")
    @Log(title = "左 2", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DealLeft2 dealLeft2)
    {
        List<DealLeft2> list = dealLeft2Service.selectDealLeft2List(dealLeft2);
        ExcelUtil<DealLeft2> util = new ExcelUtil<DealLeft2>(DealLeft2.class);
        util.exportExcel(response, list, "左 2数据");
    }

    /**
     * 获取左 2详细信息
     */
    @PreAuthorize("@ss.hasPermi('deal:deal_left_2:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(dealLeft2Service.selectDealLeft2ById(id));
    }

    /**
     * 新增左 2
     */
    @PreAuthorize("@ss.hasPermi('deal:deal_left_2:add')")
    @Log(title = "左 2", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DealLeft2 dealLeft2)
    {
        return toAjax(dealLeft2Service.insertDealLeft2(dealLeft2));
    }

    /**
     * 修改左 2
     */
    @PreAuthorize("@ss.hasPermi('deal:deal_left_2:edit')")
    @Log(title = "左 2", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DealLeft2 dealLeft2)
    {
        return toAjax(dealLeft2Service.updateDealLeft2(dealLeft2));
    }

    /**
     * 删除左 2
     */
    @PreAuthorize("@ss.hasPermi('deal:deal_left_2:remove')")
    @Log(title = "左 2", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(dealLeft2Service.deleteDealLeft2ByIds(ids));
    }
}
