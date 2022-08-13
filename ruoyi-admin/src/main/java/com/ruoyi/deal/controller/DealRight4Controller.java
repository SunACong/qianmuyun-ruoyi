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
import com.ruoyi.deal.domain.DealRight4;
import com.ruoyi.deal.service.IDealRight4Service;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 右 4Controller
 * 
 * @author 孙少聪
 * @date 2022-03-30
 */
@RestController
@RequestMapping("/deal/deal_right_4")
public class DealRight4Controller extends BaseController
{
    @Autowired
    private IDealRight4Service dealRight4Service;

    /**
     * 查询右 4列表
     */
    @PreAuthorize("@ss.hasPermi('deal:deal_right_4:list')")
    @GetMapping("/list")
    public TableDataInfo list(DealRight4 dealRight4)
    {
        startPage();
        List<DealRight4> list = dealRight4Service.selectDealRight4List(dealRight4);
        return getDataTable(list);
    }

    /**
     * 导出右 4列表
     */
    @PreAuthorize("@ss.hasPermi('deal:deal_right_4:export')")
    @Log(title = "右 4", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DealRight4 dealRight4)
    {
        List<DealRight4> list = dealRight4Service.selectDealRight4List(dealRight4);
        ExcelUtil<DealRight4> util = new ExcelUtil<DealRight4>(DealRight4.class);
        util.exportExcel(response, list, "右 4数据");
    }

    /**
     * 获取右 4详细信息
     */
    @PreAuthorize("@ss.hasPermi('deal:deal_right_4:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(dealRight4Service.selectDealRight4ById(id));
    }

    /**
     * 新增右 4
     */
    @PreAuthorize("@ss.hasPermi('deal:deal_right_4:add')")
    @Log(title = "右 4", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DealRight4 dealRight4)
    {
        return toAjax(dealRight4Service.insertDealRight4(dealRight4));
    }

    /**
     * 修改右 4
     */
    @PreAuthorize("@ss.hasPermi('deal:deal_right_4:edit')")
    @Log(title = "右 4", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DealRight4 dealRight4)
    {
        return toAjax(dealRight4Service.updateDealRight4(dealRight4));
    }

    /**
     * 删除右 4
     */
    @PreAuthorize("@ss.hasPermi('deal:deal_right_4:remove')")
    @Log(title = "右 4", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(dealRight4Service.deleteDealRight4ByIds(ids));
    }
}
