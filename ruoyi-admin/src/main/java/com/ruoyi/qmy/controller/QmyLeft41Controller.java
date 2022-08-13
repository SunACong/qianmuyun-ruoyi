package com.ruoyi.qmy.controller;

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
import com.ruoyi.qmy.domain.QmyLeft41;
import com.ruoyi.qmy.service.IQmyLeft41Service;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 饲料统计Controller
 * 
 * @author 孙少聪
 * @date 2022-04-06
 */
@RestController
@RequestMapping("/qmy/qmy_left_4_1")
public class QmyLeft41Controller extends BaseController
{
    @Autowired
    private IQmyLeft41Service qmyLeft41Service;

    /**
     * 查询饲料统计列表
     */
    @PreAuthorize("@ss.hasPermi('qmy:qmy_left_4_1:list')")
    @GetMapping("/list")
    public TableDataInfo list(QmyLeft41 qmyLeft41)
    {
        startPage();
        List<QmyLeft41> list = qmyLeft41Service.selectQmyLeft41List(qmyLeft41);
        return getDataTable(list);
    }

    /**
     * 导出饲料统计列表
     */
    @PreAuthorize("@ss.hasPermi('qmy:qmy_left_4_1:export')")
    @Log(title = "饲料统计", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, QmyLeft41 qmyLeft41)
    {
        List<QmyLeft41> list = qmyLeft41Service.selectQmyLeft41List(qmyLeft41);
        ExcelUtil<QmyLeft41> util = new ExcelUtil<QmyLeft41>(QmyLeft41.class);
        util.exportExcel(response, list, "饲料统计数据");
    }

    /**
     * 获取饲料统计详细信息
     */
    @PreAuthorize("@ss.hasPermi('qmy:qmy_left_4_1:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(qmyLeft41Service.selectQmyLeft41ById(id));
    }

    /**
     * 新增饲料统计
     */
    @PreAuthorize("@ss.hasPermi('qmy:qmy_left_4_1:add')")
    @Log(title = "饲料统计", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody QmyLeft41 qmyLeft41)
    {
        return toAjax(qmyLeft41Service.insertQmyLeft41(qmyLeft41));
    }

    /**
     * 修改饲料统计
     */
    @PreAuthorize("@ss.hasPermi('qmy:qmy_left_4_1:edit')")
    @Log(title = "饲料统计", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody QmyLeft41 qmyLeft41)
    {
        return toAjax(qmyLeft41Service.updateQmyLeft41(qmyLeft41));
    }

    /**
     * 删除饲料统计
     */
    @PreAuthorize("@ss.hasPermi('qmy:qmy_left_4_1:remove')")
    @Log(title = "饲料统计", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(qmyLeft41Service.deleteQmyLeft41ByIds(ids));
    }
}
