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
import com.ruoyi.qmy.domain.QmyRight3;
import com.ruoyi.qmy.service.IQmyRight3Service;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 检疫检测Controller
 * 
 * @author 孙少聪
 * @date 2022-04-06
 */
@RestController
@RequestMapping("/qmy/qmy_right_3")
public class QmyRight3Controller extends BaseController
{
    @Autowired
    private IQmyRight3Service qmyRight3Service;

    /**
     * 查询检疫检测列表
     */
    @PreAuthorize("@ss.hasPermi('qmy:qmy_right_3:list')")
    @GetMapping("/list")
    public TableDataInfo list(QmyRight3 qmyRight3)
    {
        startPage();
        List<QmyRight3> list = qmyRight3Service.selectQmyRight3List(qmyRight3);
        return getDataTable(list);
    }

    /**
     * 导出检疫检测列表
     */
    @PreAuthorize("@ss.hasPermi('qmy:qmy_right_3:export')")
    @Log(title = "检疫检测", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, QmyRight3 qmyRight3)
    {
        List<QmyRight3> list = qmyRight3Service.selectQmyRight3List(qmyRight3);
        ExcelUtil<QmyRight3> util = new ExcelUtil<QmyRight3>(QmyRight3.class);
        util.exportExcel(response, list, "检疫检测数据");
    }

    /**
     * 获取检疫检测详细信息
     */
    @PreAuthorize("@ss.hasPermi('qmy:qmy_right_3:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(qmyRight3Service.selectQmyRight3ById(id));
    }

    /**
     * 新增检疫检测
     */
    @PreAuthorize("@ss.hasPermi('qmy:qmy_right_3:add')")
    @Log(title = "检疫检测", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody QmyRight3 qmyRight3)
    {
        return toAjax(qmyRight3Service.insertQmyRight3(qmyRight3));
    }

    /**
     * 修改检疫检测
     */
    @PreAuthorize("@ss.hasPermi('qmy:qmy_right_3:edit')")
    @Log(title = "检疫检测", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody QmyRight3 qmyRight3)
    {
        return toAjax(qmyRight3Service.updateQmyRight3(qmyRight3));
    }

    /**
     * 删除检疫检测
     */
    @PreAuthorize("@ss.hasPermi('qmy:qmy_right_3:remove')")
    @Log(title = "检疫检测", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(qmyRight3Service.deleteQmyRight3ByIds(ids));
    }
}
