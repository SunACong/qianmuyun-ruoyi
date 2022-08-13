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
import com.ruoyi.deal.domain.DealRight3;
import com.ruoyi.deal.service.IDealRight3Service;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 右 3Controller
 * 
 * @author 孙少聪
 * @date 2022-03-30
 */
@RestController
@RequestMapping("/deal/deal_right_3")
public class DealRight3Controller extends BaseController
{
    @Autowired
    private IDealRight3Service dealRight3Service;

    /**
     * 查询右 3列表
     */
    @PreAuthorize("@ss.hasPermi('deal:deal_right_3:list')")
    @GetMapping("/list")
    public TableDataInfo list(DealRight3 dealRight3)
    {
        startPage();
        List<DealRight3> list = dealRight3Service.selectDealRight3List(dealRight3);
        return getDataTable(list);
    }

    /**
     * 导出右 3列表
     */
    @PreAuthorize("@ss.hasPermi('deal:deal_right_3:export')")
    @Log(title = "右 3", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DealRight3 dealRight3)
    {
        List<DealRight3> list = dealRight3Service.selectDealRight3List(dealRight3);
        ExcelUtil<DealRight3> util = new ExcelUtil<DealRight3>(DealRight3.class);
        util.exportExcel(response, list, "右 3数据");
    }

    /**
     * 获取右 3详细信息
     */
    @PreAuthorize("@ss.hasPermi('deal:deal_right_3:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(dealRight3Service.selectDealRight3ById(id));
    }

    /**
     * 新增右 3
     */
    @PreAuthorize("@ss.hasPermi('deal:deal_right_3:add')")
    @Log(title = "右 3", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DealRight3 dealRight3)
    {
        return toAjax(dealRight3Service.insertDealRight3(dealRight3));
    }

    /**
     * 修改右 3
     */
    @PreAuthorize("@ss.hasPermi('deal:deal_right_3:edit')")
    @Log(title = "右 3", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DealRight3 dealRight3)
    {
        return toAjax(dealRight3Service.updateDealRight3(dealRight3));
    }

    /**
     * 删除右 3
     */
    @PreAuthorize("@ss.hasPermi('deal:deal_right_3:remove')")
    @Log(title = "右 3", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(dealRight3Service.deleteDealRight3ByIds(ids));
    }
}
