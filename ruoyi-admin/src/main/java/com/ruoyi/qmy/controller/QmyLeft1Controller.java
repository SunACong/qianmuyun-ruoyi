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
import com.ruoyi.qmy.domain.QmyLeft1;
import com.ruoyi.qmy.service.IQmyLeft1Service;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 存栏统计(一)Controller
 * 
 * @author 孙少聪
 * @date 2022-04-06
 */
@RestController
@RequestMapping("/qmy/qmy_left_1")
public class QmyLeft1Controller extends BaseController
{
    @Autowired
    private IQmyLeft1Service qmyLeft1Service;

    /**
     * 查询存栏统计(一)列表
     */
    @PreAuthorize("@ss.hasPermi('qmy:qmy_left_1:list')")
    @GetMapping("/list")
    public TableDataInfo list(QmyLeft1 qmyLeft1)
    {
        startPage();
        List<QmyLeft1> list = qmyLeft1Service.selectQmyLeft1List(qmyLeft1);
        return getDataTable(list);
    }

    /**
     * 导出存栏统计(一)列表
     */
    @PreAuthorize("@ss.hasPermi('qmy:qmy_left_1:export')")
    @Log(title = "存栏统计(一)", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, QmyLeft1 qmyLeft1)
    {
        List<QmyLeft1> list = qmyLeft1Service.selectQmyLeft1List(qmyLeft1);
        ExcelUtil<QmyLeft1> util = new ExcelUtil<QmyLeft1>(QmyLeft1.class);
        util.exportExcel(response, list, "存栏统计(一)数据");
    }

    /**
     * 获取存栏统计(一)详细信息
     */
    @PreAuthorize("@ss.hasPermi('qmy:qmy_left_1:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(qmyLeft1Service.selectQmyLeft1ById(id));
    }

    /**
     * 新增存栏统计(一)
     */
    @PreAuthorize("@ss.hasPermi('qmy:qmy_left_1:add')")
    @Log(title = "存栏统计(一)", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody QmyLeft1 qmyLeft1)
    {
        return toAjax(qmyLeft1Service.insertQmyLeft1(qmyLeft1));
    }

    /**
     * 修改存栏统计(一)
     */
    @PreAuthorize("@ss.hasPermi('qmy:qmy_left_1:edit')")
    @Log(title = "存栏统计(一)", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody QmyLeft1 qmyLeft1)
    {
        return toAjax(qmyLeft1Service.updateQmyLeft1(qmyLeft1));
    }

    /**
     * 删除存栏统计(一)
     */
    @PreAuthorize("@ss.hasPermi('qmy:qmy_left_1:remove')")
    @Log(title = "存栏统计(一)", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(qmyLeft1Service.deleteQmyLeft1ByIds(ids));
    }
}
