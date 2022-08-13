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
import com.ruoyi.stockManager.domain.Firstrecord;
import com.ruoyi.stockManager.service.IFirstrecordService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 初次录入Controller
 *
 * @author 孙少聪
 * @date 2022-04-22
 */
@RestController
@RequestMapping("/stockManager/firstrecord")
public class FirstrecordController extends BaseController
{
    @Autowired
    private IFirstrecordService firstrecordService;

    /**
     * 查询养殖场的个数
     * 孙少聪
     */
    @PreAuthorize("@ss.hasPermi('stockManager:firstrecord:list')")
    @GetMapping("/farmlocList")
    public AjaxResult farmlocList()
    {
        return AjaxResult.success(firstrecordService.selectFirstrecordFarmNum());
    }

    /**
     * 查询养每种羊只数目
     * 孙少聪
     */
    @PreAuthorize("@ss.hasPermi('stockManager:firstrecord:list')")
    @GetMapping("/sheepNumList")
    public AjaxResult sheepNumList()
    {
        return AjaxResult.success(firstrecordService.selectFirstrecordSheepTypeNum());
    }

    /**
     * 查询初次录入列表
     */
    @PreAuthorize("@ss.hasPermi('stockManager:firstrecord:list')")
    @GetMapping("/list")
    public TableDataInfo list(Firstrecord firstrecord)
    {
        startPage();
        List<Firstrecord> list = firstrecordService.selectFirstrecordList(firstrecord);
        return getDataTable(list);
    }

    /**
     * 导出初次录入列表
     */
    @PreAuthorize("@ss.hasPermi('stockManager:firstrecord:export')")
    @Log(title = "初次录入", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Firstrecord firstrecord)
    {
        List<Firstrecord> list = firstrecordService.selectFirstrecordList(firstrecord);
        ExcelUtil<Firstrecord> util = new ExcelUtil<Firstrecord>(Firstrecord.class);
        util.exportExcel(response, list, "初次录入数据");
    }

    /**
     * 获取初次录入详细信息
     */
    @PreAuthorize("@ss.hasPermi('stockManager:firstrecord:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(firstrecordService.selectFirstrecordById(id));
    }

    /**
     * 新增初次录入
     */
    @PreAuthorize("@ss.hasPermi('stockManager:firstrecord:add')")
    @Log(title = "初次录入", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Firstrecord firstrecord)
    {
        return toAjax(firstrecordService.insertFirstrecord(firstrecord));
    }

    /**
     * 修改初次录入
     */
    @PreAuthorize("@ss.hasPermi('stockManager:firstrecord:edit')")
    @Log(title = "初次录入", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Firstrecord firstrecord)
    {
        return toAjax(firstrecordService.updateFirstrecord(firstrecord));
    }

    /**
     * 删除初次录入
     */
    @PreAuthorize("@ss.hasPermi('stockManager:firstrecord:remove')")
    @Log(title = "初次录入", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(firstrecordService.deleteFirstrecordByIds(ids));
    }
}
