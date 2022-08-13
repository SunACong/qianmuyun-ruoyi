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
import com.ruoyi.qmy.domain.QmyLeft42;
import com.ruoyi.qmy.service.IQmyLeft42Service;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 兽药统计Controller
 * 
 * @author 孙少聪
 * @date 2022-04-06
 */
@RestController
@RequestMapping("/qmy/qmy_left_4_2")
public class QmyLeft42Controller extends BaseController
{
    @Autowired
    private IQmyLeft42Service qmyLeft42Service;

    /**
     * 查询兽药统计列表
     */
    @PreAuthorize("@ss.hasPermi('qmy:qmy_left_4_2:list')")
    @GetMapping("/list")
    public TableDataInfo list(QmyLeft42 qmyLeft42)
    {
        startPage();
        List<QmyLeft42> list = qmyLeft42Service.selectQmyLeft42List(qmyLeft42);
        return getDataTable(list);
    }

    /**
     * 导出兽药统计列表
     */
    @PreAuthorize("@ss.hasPermi('qmy:qmy_left_4_2:export')")
    @Log(title = "兽药统计", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, QmyLeft42 qmyLeft42)
    {
        List<QmyLeft42> list = qmyLeft42Service.selectQmyLeft42List(qmyLeft42);
        ExcelUtil<QmyLeft42> util = new ExcelUtil<QmyLeft42>(QmyLeft42.class);
        util.exportExcel(response, list, "兽药统计数据");
    }

    /**
     * 获取兽药统计详细信息
     */
    @PreAuthorize("@ss.hasPermi('qmy:qmy_left_4_2:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(qmyLeft42Service.selectQmyLeft42ById(id));
    }

    /**
     * 新增兽药统计
     */
    @PreAuthorize("@ss.hasPermi('qmy:qmy_left_4_2:add')")
    @Log(title = "兽药统计", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody QmyLeft42 qmyLeft42)
    {
        return toAjax(qmyLeft42Service.insertQmyLeft42(qmyLeft42));
    }

    /**
     * 修改兽药统计
     */
    @PreAuthorize("@ss.hasPermi('qmy:qmy_left_4_2:edit')")
    @Log(title = "兽药统计", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody QmyLeft42 qmyLeft42)
    {
        return toAjax(qmyLeft42Service.updateQmyLeft42(qmyLeft42));
    }

    /**
     * 删除兽药统计
     */
    @PreAuthorize("@ss.hasPermi('qmy:qmy_left_4_2:remove')")
    @Log(title = "兽药统计", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(qmyLeft42Service.deleteQmyLeft42ByIds(ids));
    }
}
