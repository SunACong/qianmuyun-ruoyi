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
import com.ruoyi.qmy.domain.QmyLeft3;
import com.ruoyi.qmy.service.IQmyLeft3Service;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 死亡统计Controller
 * 
 * @author 孙少聪
 * @date 2022-04-06
 */
@RestController
@RequestMapping("/qmy/qmy_left_3")
public class QmyLeft3Controller extends BaseController
{
    @Autowired
    private IQmyLeft3Service qmyLeft3Service;

    /**
     * 查询死亡统计列表
     */
    @PreAuthorize("@ss.hasPermi('qmy:qmy_left_3:list')")
    @GetMapping("/list")
    public TableDataInfo list(QmyLeft3 qmyLeft3)
    {
        startPage();
        List<QmyLeft3> list = qmyLeft3Service.selectQmyLeft3List(qmyLeft3);
        return getDataTable(list);
    }

    /**
     * 导出死亡统计列表
     */
    @PreAuthorize("@ss.hasPermi('qmy:qmy_left_3:export')")
    @Log(title = "死亡统计", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, QmyLeft3 qmyLeft3)
    {
        List<QmyLeft3> list = qmyLeft3Service.selectQmyLeft3List(qmyLeft3);
        ExcelUtil<QmyLeft3> util = new ExcelUtil<QmyLeft3>(QmyLeft3.class);
        util.exportExcel(response, list, "死亡统计数据");
    }

    /**
     * 获取死亡统计详细信息
     */
    @PreAuthorize("@ss.hasPermi('qmy:qmy_left_3:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(qmyLeft3Service.selectQmyLeft3ById(id));
    }

    /**
     * 新增死亡统计
     */
    @PreAuthorize("@ss.hasPermi('qmy:qmy_left_3:add')")
    @Log(title = "死亡统计", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody QmyLeft3 qmyLeft3)
    {
        return toAjax(qmyLeft3Service.insertQmyLeft3(qmyLeft3));
    }

    /**
     * 修改死亡统计
     */
    @PreAuthorize("@ss.hasPermi('qmy:qmy_left_3:edit')")
    @Log(title = "死亡统计", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody QmyLeft3 qmyLeft3)
    {
        return toAjax(qmyLeft3Service.updateQmyLeft3(qmyLeft3));
    }

    /**
     * 删除死亡统计
     */
    @PreAuthorize("@ss.hasPermi('qmy:qmy_left_3:remove')")
    @Log(title = "死亡统计", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(qmyLeft3Service.deleteQmyLeft3ByIds(ids));
    }
}
