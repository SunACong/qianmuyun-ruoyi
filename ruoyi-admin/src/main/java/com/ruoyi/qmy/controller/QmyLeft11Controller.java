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
import com.ruoyi.qmy.domain.QmyLeft11;
import com.ruoyi.qmy.service.IQmyLeft11Service;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 存栏统计(二)Controller
 * 
 * @author 孙少聪
 * @date 2022-04-06
 */
@RestController
@RequestMapping("/qmy/qmy_left_1_1")
public class QmyLeft11Controller extends BaseController
{
    @Autowired
    private IQmyLeft11Service qmyLeft11Service;

    /**
     * 查询存栏统计(二)列表
     */
    @PreAuthorize("@ss.hasPermi('qmy:qmy_left_1_1:list')")
    @GetMapping("/list")
    public TableDataInfo list(QmyLeft11 qmyLeft11)
    {
        startPage();
        List<QmyLeft11> list = qmyLeft11Service.selectQmyLeft11List(qmyLeft11);
        return getDataTable(list);
    }

    /**
     * 导出存栏统计(二)列表
     */
    @PreAuthorize("@ss.hasPermi('qmy:qmy_left_1_1:export')")
    @Log(title = "存栏统计(二)", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, QmyLeft11 qmyLeft11)
    {
        List<QmyLeft11> list = qmyLeft11Service.selectQmyLeft11List(qmyLeft11);
        ExcelUtil<QmyLeft11> util = new ExcelUtil<QmyLeft11>(QmyLeft11.class);
        util.exportExcel(response, list, "存栏统计(二)数据");
    }

    /**
     * 获取存栏统计(二)详细信息
     */
    @PreAuthorize("@ss.hasPermi('qmy:qmy_left_1_1:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(qmyLeft11Service.selectQmyLeft11ById(id));
    }

    /**
     * 新增存栏统计(二)
     */
    @PreAuthorize("@ss.hasPermi('qmy:qmy_left_1_1:add')")
    @Log(title = "存栏统计(二)", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody QmyLeft11 qmyLeft11)
    {
        return toAjax(qmyLeft11Service.insertQmyLeft11(qmyLeft11));
    }

    /**
     * 修改存栏统计(二)
     */
    @PreAuthorize("@ss.hasPermi('qmy:qmy_left_1_1:edit')")
    @Log(title = "存栏统计(二)", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody QmyLeft11 qmyLeft11)
    {
        return toAjax(qmyLeft11Service.updateQmyLeft11(qmyLeft11));
    }

    /**
     * 删除存栏统计(二)
     */
    @PreAuthorize("@ss.hasPermi('qmy:qmy_left_1_1:remove')")
    @Log(title = "存栏统计(二)", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(qmyLeft11Service.deleteQmyLeft11ByIds(ids));
    }
}
