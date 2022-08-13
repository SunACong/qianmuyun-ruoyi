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
import com.ruoyi.qmy.domain.QmyMid;
import com.ruoyi.qmy.service.IQmyMidService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 完成率Controller
 * 
 * @author 孙少聪
 * @date 2022-04-06
 */
@RestController
@RequestMapping("/qmy/mid")
public class QmyMidController extends BaseController
{
    @Autowired
    private IQmyMidService qmyMidService;

    /**
     * 查询完成率列表
     */
    @PreAuthorize("@ss.hasPermi('qmy:mid:list')")
    @GetMapping("/list")
    public TableDataInfo list(QmyMid qmyMid)
    {
        startPage();
        List<QmyMid> list = qmyMidService.selectQmyMidList(qmyMid);
        return getDataTable(list);
    }

    /**
     * 导出完成率列表
     */
    @PreAuthorize("@ss.hasPermi('qmy:mid:export')")
    @Log(title = "完成率", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, QmyMid qmyMid)
    {
        List<QmyMid> list = qmyMidService.selectQmyMidList(qmyMid);
        ExcelUtil<QmyMid> util = new ExcelUtil<QmyMid>(QmyMid.class);
        util.exportExcel(response, list, "完成率数据");
    }

    /**
     * 获取完成率详细信息
     */
    @PreAuthorize("@ss.hasPermi('qmy:mid:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(qmyMidService.selectQmyMidById(id));
    }

    /**
     * 新增完成率
     */
    @PreAuthorize("@ss.hasPermi('qmy:mid:add')")
    @Log(title = "完成率", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody QmyMid qmyMid)
    {
        return toAjax(qmyMidService.insertQmyMid(qmyMid));
    }

    /**
     * 修改完成率
     */
    @PreAuthorize("@ss.hasPermi('qmy:mid:edit')")
    @Log(title = "完成率", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody QmyMid qmyMid)
    {
        return toAjax(qmyMidService.updateQmyMid(qmyMid));
    }

    /**
     * 删除完成率
     */
    @PreAuthorize("@ss.hasPermi('qmy:mid:remove')")
    @Log(title = "完成率", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(qmyMidService.deleteQmyMidByIds(ids));
    }
}
