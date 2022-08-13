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
import com.ruoyi.qmy.domain.QmyRight2;
import com.ruoyi.qmy.service.IQmyRight2Service;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 疫病监测Controller
 * 
 * @author 孙少聪
 * @date 2022-04-06
 */
@RestController
@RequestMapping("/qmy/qmy_right_2")
public class QmyRight2Controller extends BaseController
{
    @Autowired
    private IQmyRight2Service qmyRight2Service;

    /**
     * 查询疫病监测列表
     */
    @PreAuthorize("@ss.hasPermi('qmy:qmy_right_2:list')")
    @GetMapping("/list")
    public TableDataInfo list(QmyRight2 qmyRight2)
    {
        startPage();
        List<QmyRight2> list = qmyRight2Service.selectQmyRight2List(qmyRight2);
        return getDataTable(list);
    }

    /**
     * 导出疫病监测列表
     */
    @PreAuthorize("@ss.hasPermi('qmy:qmy_right_2:export')")
    @Log(title = "疫病监测", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, QmyRight2 qmyRight2)
    {
        List<QmyRight2> list = qmyRight2Service.selectQmyRight2List(qmyRight2);
        ExcelUtil<QmyRight2> util = new ExcelUtil<QmyRight2>(QmyRight2.class);
        util.exportExcel(response, list, "疫病监测数据");
    }

    /**
     * 获取疫病监测详细信息
     */
    @PreAuthorize("@ss.hasPermi('qmy:qmy_right_2:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(qmyRight2Service.selectQmyRight2ById(id));
    }

    /**
     * 新增疫病监测
     */
    @PreAuthorize("@ss.hasPermi('qmy:qmy_right_2:add')")
    @Log(title = "疫病监测", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody QmyRight2 qmyRight2)
    {
        return toAjax(qmyRight2Service.insertQmyRight2(qmyRight2));
    }

    /**
     * 修改疫病监测
     */
    @PreAuthorize("@ss.hasPermi('qmy:qmy_right_2:edit')")
    @Log(title = "疫病监测", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody QmyRight2 qmyRight2)
    {
        return toAjax(qmyRight2Service.updateQmyRight2(qmyRight2));
    }

    /**
     * 删除疫病监测
     */
    @PreAuthorize("@ss.hasPermi('qmy:qmy_right_2:remove')")
    @Log(title = "疫病监测", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(qmyRight2Service.deleteQmyRight2ByIds(ids));
    }
}
