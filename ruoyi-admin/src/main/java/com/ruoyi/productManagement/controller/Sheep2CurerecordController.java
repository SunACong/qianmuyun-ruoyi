package com.ruoyi.productManagement.controller;

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
import com.ruoyi.productManagement.domain.Sheep2Curerecord;
import com.ruoyi.productManagement.service.ISheep2CurerecordService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 诊疗记录Controller
 * 
 * @author 孙少聪
 * @date 2022-05-20
 */
@RestController
@RequestMapping("/productManagement/curerecordMy")
public class Sheep2CurerecordController extends BaseController
{
    @Autowired
    private ISheep2CurerecordService sheep2CurerecordService;

    /**
     * 查询诊疗记录列表
     */
    @PreAuthorize("@ss.hasPermi('productManagement:curerecordMy:list')")
    @GetMapping("/list")
    public TableDataInfo list(Sheep2Curerecord sheep2Curerecord)
    {
        startPage();
        List<Sheep2Curerecord> list = sheep2CurerecordService.selectSheep2CurerecordList(sheep2Curerecord);
        return getDataTable(list);
    }

    /**
     * 导出诊疗记录列表
     */
    @PreAuthorize("@ss.hasPermi('productManagement:curerecordMy:export')")
    @Log(title = "诊疗记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Sheep2Curerecord sheep2Curerecord)
    {
        List<Sheep2Curerecord> list = sheep2CurerecordService.selectSheep2CurerecordList(sheep2Curerecord);
        ExcelUtil<Sheep2Curerecord> util = new ExcelUtil<Sheep2Curerecord>(Sheep2Curerecord.class);
        util.exportExcel(response, list, "诊疗记录数据");
    }

    /**
     * 获取诊疗记录详细信息
     */
    @PreAuthorize("@ss.hasPermi('productManagement:curerecordMy:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(sheep2CurerecordService.selectSheep2CurerecordById(id));
    }

    /**
     * 新增诊疗记录
     */
    @PreAuthorize("@ss.hasPermi('productManagement:curerecordMy:add')")
    @Log(title = "诊疗记录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Sheep2Curerecord sheep2Curerecord)
    {
        return toAjax(sheep2CurerecordService.insertSheep2Curerecord(sheep2Curerecord));
    }

    /**
     * 修改诊疗记录
     */
    @PreAuthorize("@ss.hasPermi('productManagement:curerecordMy:edit')")
    @Log(title = "诊疗记录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Sheep2Curerecord sheep2Curerecord)
    {
        return toAjax(sheep2CurerecordService.updateSheep2Curerecord(sheep2Curerecord));
    }

    /**
     * 删除诊疗记录
     */
    @PreAuthorize("@ss.hasPermi('productManagement:curerecordMy:remove')")
    @Log(title = "诊疗记录", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(sheep2CurerecordService.deleteSheep2CurerecordByIds(ids));
    }
}
