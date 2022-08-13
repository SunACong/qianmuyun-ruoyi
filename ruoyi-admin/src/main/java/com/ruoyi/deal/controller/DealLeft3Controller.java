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
import com.ruoyi.deal.domain.DealLeft3;
import com.ruoyi.deal.service.IDealLeft3Service;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 左 3Controller
 * 
 * @author 孙少聪
 * @date 2022-03-30
 */
@RestController
@RequestMapping("/deal/deal_left_3")
public class DealLeft3Controller extends BaseController
{
    @Autowired
    private IDealLeft3Service dealLeft3Service;

    /**
     * 查询左 3列表
     */
    @PreAuthorize("@ss.hasPermi('deal:deal_left_3:list')")
    @GetMapping("/list")
    public TableDataInfo list(DealLeft3 dealLeft3)
    {
        startPage();
        List<DealLeft3> list = dealLeft3Service.selectDealLeft3List(dealLeft3);
        return getDataTable(list);
    }

    /**
     * 导出左 3列表
     */
    @PreAuthorize("@ss.hasPermi('deal:deal_left_3:export')")
    @Log(title = "左 3", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DealLeft3 dealLeft3)
    {
        List<DealLeft3> list = dealLeft3Service.selectDealLeft3List(dealLeft3);
        ExcelUtil<DealLeft3> util = new ExcelUtil<DealLeft3>(DealLeft3.class);
        util.exportExcel(response, list, "左 3数据");
    }

    /**
     * 获取左 3详细信息
     */
    @PreAuthorize("@ss.hasPermi('deal:deal_left_3:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(dealLeft3Service.selectDealLeft3ById(id));
    }

    /**
     * 新增左 3
     */
    @PreAuthorize("@ss.hasPermi('deal:deal_left_3:add')")
    @Log(title = "左 3", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DealLeft3 dealLeft3)
    {
        return toAjax(dealLeft3Service.insertDealLeft3(dealLeft3));
    }

    /**
     * 修改左 3
     */
    @PreAuthorize("@ss.hasPermi('deal:deal_left_3:edit')")
    @Log(title = "左 3", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DealLeft3 dealLeft3)
    {
        return toAjax(dealLeft3Service.updateDealLeft3(dealLeft3));
    }

    /**
     * 删除左 3
     */
    @PreAuthorize("@ss.hasPermi('deal:deal_left_3:remove')")
    @Log(title = "左 3", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(dealLeft3Service.deleteDealLeft3ByIds(ids));
    }
}
