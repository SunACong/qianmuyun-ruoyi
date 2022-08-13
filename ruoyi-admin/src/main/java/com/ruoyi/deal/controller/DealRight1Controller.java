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
import com.ruoyi.deal.domain.DealRight1;
import com.ruoyi.deal.service.IDealRight1Service;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 右 1Controller
 * 
 * @author 孙少聪
 * @date 2022-03-30
 */
@RestController
@RequestMapping("/deal/deal_right_1")
public class DealRight1Controller extends BaseController
{
    @Autowired
    private IDealRight1Service dealRight1Service;

    /**
     * 查询右 1列表
     */
    @PreAuthorize("@ss.hasPermi('deal:deal_right_1:list')")
    @GetMapping("/list")
    public TableDataInfo list(DealRight1 dealRight1)
    {
        startPage();
        List<DealRight1> list = dealRight1Service.selectDealRight1List(dealRight1);
        return getDataTable(list);
    }

    /**
     * 导出右 1列表
     */
    @PreAuthorize("@ss.hasPermi('deal:deal_right_1:export')")
    @Log(title = "右 1", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DealRight1 dealRight1)
    {
        List<DealRight1> list = dealRight1Service.selectDealRight1List(dealRight1);
        ExcelUtil<DealRight1> util = new ExcelUtil<DealRight1>(DealRight1.class);
        util.exportExcel(response, list, "右 1数据");
    }

    /**
     * 获取右 1详细信息
     */
    @PreAuthorize("@ss.hasPermi('deal:deal_right_1:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(dealRight1Service.selectDealRight1ById(id));
    }

    /**
     * 新增右 1
     */
    @PreAuthorize("@ss.hasPermi('deal:deal_right_1:add')")
    @Log(title = "右 1", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DealRight1 dealRight1)
    {
        return toAjax(dealRight1Service.insertDealRight1(dealRight1));
    }

    /**
     * 修改右 1
     */
    @PreAuthorize("@ss.hasPermi('deal:deal_right_1:edit')")
    @Log(title = "右 1", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DealRight1 dealRight1)
    {
        return toAjax(dealRight1Service.updateDealRight1(dealRight1));
    }

    /**
     * 删除右 1
     */
    @PreAuthorize("@ss.hasPermi('deal:deal_right_1:remove')")
    @Log(title = "右 1", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(dealRight1Service.deleteDealRight1ByIds(ids));
    }
}
