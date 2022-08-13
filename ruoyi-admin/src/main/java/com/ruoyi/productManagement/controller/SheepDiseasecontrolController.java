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
import com.ruoyi.productManagement.domain.SheepDiseasecontrol;
import com.ruoyi.productManagement.service.ISheepDiseasecontrolService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 疾病防治Controller
 * 
 * @author 孙少聪
 * @date 2022-03-30
 */
@RestController
@RequestMapping("/productManagement/diseasecontrol")
public class SheepDiseasecontrolController extends BaseController
{
    @Autowired
    private ISheepDiseasecontrolService sheepDiseasecontrolService;

    /**
     * 查询疾病防治列表
     */
    @PreAuthorize("@ss.hasPermi('productManagement:diseasecontrol:list')")
    @GetMapping("/list")
    public TableDataInfo list(SheepDiseasecontrol sheepDiseasecontrol)
    {
        startPage();
        List<SheepDiseasecontrol> list = sheepDiseasecontrolService.selectSheepDiseasecontrolList(sheepDiseasecontrol);
        return getDataTable(list);
    }

    /**
     * 导出疾病防治列表
     */
    @PreAuthorize("@ss.hasPermi('productManagement:diseasecontrol:export')")
    @Log(title = "疾病防治", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SheepDiseasecontrol sheepDiseasecontrol)
    {
        List<SheepDiseasecontrol> list = sheepDiseasecontrolService.selectSheepDiseasecontrolList(sheepDiseasecontrol);
        ExcelUtil<SheepDiseasecontrol> util = new ExcelUtil<SheepDiseasecontrol>(SheepDiseasecontrol.class);
        util.exportExcel(response, list, "疾病防治数据");
    }

    /**
     * 获取疾病防治详细信息
     */
    @PreAuthorize("@ss.hasPermi('productManagement:diseasecontrol:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(sheepDiseasecontrolService.selectSheepDiseasecontrolById(id));
    }

    /**
     * 新增疾病防治
     */
    @PreAuthorize("@ss.hasPermi('productManagement:diseasecontrol:add')")
    @Log(title = "疾病防治", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SheepDiseasecontrol sheepDiseasecontrol)
    {
        return toAjax(sheepDiseasecontrolService.insertSheepDiseasecontrol(sheepDiseasecontrol));
    }

    /**
     * 修改疾病防治
     */
    @PreAuthorize("@ss.hasPermi('productManagement:diseasecontrol:edit')")
    @Log(title = "疾病防治", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SheepDiseasecontrol sheepDiseasecontrol)
    {
        return toAjax(sheepDiseasecontrolService.updateSheepDiseasecontrol(sheepDiseasecontrol));
    }

    /**
     * 删除疾病防治
     */
    @PreAuthorize("@ss.hasPermi('productManagement:diseasecontrol:remove')")
    @Log(title = "疾病防治", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(sheepDiseasecontrolService.deleteSheepDiseasecontrolByIds(ids));
    }
}
