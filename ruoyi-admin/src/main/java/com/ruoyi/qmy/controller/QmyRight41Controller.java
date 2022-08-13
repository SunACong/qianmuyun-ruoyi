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
import com.ruoyi.qmy.domain.QmyRight41;
import com.ruoyi.qmy.service.IQmyRight41Service;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 销售统计Controller
 * 
 * @author 孙少聪
 * @date 2022-04-06
 */
@RestController
@RequestMapping("/qmy/qmy_right_4_1")
public class QmyRight41Controller extends BaseController
{
    @Autowired
    private IQmyRight41Service qmyRight41Service;

    /**
     * 查询销售统计列表
     */
    @PreAuthorize("@ss.hasPermi('qmy:qmy_right_4_1:list')")
    @GetMapping("/list")
    public TableDataInfo list(QmyRight41 qmyRight41)
    {
        startPage();
        List<QmyRight41> list = qmyRight41Service.selectQmyRight41List(qmyRight41);
        return getDataTable(list);
    }

    /**
     * 导出销售统计列表
     */
    @PreAuthorize("@ss.hasPermi('qmy:qmy_right_4_1:export')")
    @Log(title = "销售统计", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, QmyRight41 qmyRight41)
    {
        List<QmyRight41> list = qmyRight41Service.selectQmyRight41List(qmyRight41);
        ExcelUtil<QmyRight41> util = new ExcelUtil<QmyRight41>(QmyRight41.class);
        util.exportExcel(response, list, "销售统计数据");
    }

    /**
     * 获取销售统计详细信息
     */
    @PreAuthorize("@ss.hasPermi('qmy:qmy_right_4_1:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(qmyRight41Service.selectQmyRight41ById(id));
    }

    /**
     * 新增销售统计
     */
    @PreAuthorize("@ss.hasPermi('qmy:qmy_right_4_1:add')")
    @Log(title = "销售统计", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody QmyRight41 qmyRight41)
    {
        return toAjax(qmyRight41Service.insertQmyRight41(qmyRight41));
    }

    /**
     * 修改销售统计
     */
    @PreAuthorize("@ss.hasPermi('qmy:qmy_right_4_1:edit')")
    @Log(title = "销售统计", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody QmyRight41 qmyRight41)
    {
        return toAjax(qmyRight41Service.updateQmyRight41(qmyRight41));
    }

    /**
     * 删除销售统计
     */
    @PreAuthorize("@ss.hasPermi('qmy:qmy_right_4_1:remove')")
    @Log(title = "销售统计", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(qmyRight41Service.deleteQmyRight41ByIds(ids));
    }
}
