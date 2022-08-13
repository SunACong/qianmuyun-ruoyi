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
import com.ruoyi.qmy.domain.QmyLeft2;
import com.ruoyi.qmy.service.IQmyLeft2Service;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 生产统计Controller
 * 
 * @author 孙少聪
 * @date 2022-04-06
 */
@RestController
@RequestMapping("/qmy/qmy_left_2")
public class QmyLeft2Controller extends BaseController
{
    @Autowired
    private IQmyLeft2Service qmyLeft2Service;

    /**
     * 查询生产统计列表
     */
    @PreAuthorize("@ss.hasPermi('qmy:qmy_left_2:list')")
    @GetMapping("/list")
    public TableDataInfo list(QmyLeft2 qmyLeft2)
    {
        startPage();
        List<QmyLeft2> list = qmyLeft2Service.selectQmyLeft2List(qmyLeft2);
        return getDataTable(list);
    }

    /**
     * 导出生产统计列表
     */
    @PreAuthorize("@ss.hasPermi('qmy:qmy_left_2:export')")
    @Log(title = "生产统计", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, QmyLeft2 qmyLeft2)
    {
        List<QmyLeft2> list = qmyLeft2Service.selectQmyLeft2List(qmyLeft2);
        ExcelUtil<QmyLeft2> util = new ExcelUtil<QmyLeft2>(QmyLeft2.class);
        util.exportExcel(response, list, "生产统计数据");
    }

    /**
     * 获取生产统计详细信息
     */
    @PreAuthorize("@ss.hasPermi('qmy:qmy_left_2:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(qmyLeft2Service.selectQmyLeft2ById(id));
    }

    /**
     * 新增生产统计
     */
    @PreAuthorize("@ss.hasPermi('qmy:qmy_left_2:add')")
    @Log(title = "生产统计", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody QmyLeft2 qmyLeft2)
    {
        return toAjax(qmyLeft2Service.insertQmyLeft2(qmyLeft2));
    }

    /**
     * 修改生产统计
     */
    @PreAuthorize("@ss.hasPermi('qmy:qmy_left_2:edit')")
    @Log(title = "生产统计", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody QmyLeft2 qmyLeft2)
    {
        return toAjax(qmyLeft2Service.updateQmyLeft2(qmyLeft2));
    }

    /**
     * 删除生产统计
     */
    @PreAuthorize("@ss.hasPermi('qmy:qmy_left_2:remove')")
    @Log(title = "生产统计", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(qmyLeft2Service.deleteQmyLeft2ByIds(ids));
    }
}
