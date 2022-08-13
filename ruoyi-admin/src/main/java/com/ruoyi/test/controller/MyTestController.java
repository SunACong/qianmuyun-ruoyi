package com.ruoyi.test.controller;

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
import com.ruoyi.test.domain.MyTest;
import com.ruoyi.test.service.IMyTestService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 黔牧云登录测试Controller
 *
 * @author 孙少聪
 * @date 2022-04-01
 */
@RestController
@RequestMapping("/test/test")
public class MyTestController extends BaseController
{
    @Autowired
    private IMyTestService myTestService;

    /**
     * 查询黔牧云登录测试列表
     */
    @PreAuthorize("@ss.hasPermi('test:test:list')")
    @GetMapping("/list")
    public TableDataInfo list(MyTest myTest)
    {
        startPage();
        List<MyTest> list = myTestService.selectMyTestList(myTest);
        return getDataTable(list);
    }

    /**
     * 导出黔牧云登录测试列表
     */
    @PreAuthorize("@ss.hasPermi('test:test:export')")
    @Log(title = "黔牧云登录测试", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, MyTest myTest)
    {
        List<MyTest> list = myTestService.selectMyTestList(myTest);
        ExcelUtil<MyTest> util = new ExcelUtil<MyTest>(MyTest.class);
        util.exportExcel(response, list, "黔牧云登录测试数据");
    }

    /**
     * 获取黔牧云登录测试详细信息
     */
    @PreAuthorize("@ss.hasPermi('test:test:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(myTestService.selectMyTestById(id));
    }

    /**
     * 新增黔牧云登录测试
     */
    @PreAuthorize("@ss.hasPermi('test:test:add')")
    @Log(title = "黔牧云登录测试", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody MyTest myTest)
    {
        return toAjax(myTestService.insertMyTest(myTest));
    }

    /**
     * 修改黔牧云登录测试
     */
    @PreAuthorize("@ss.hasPermi('test:test:edit')")
    @Log(title = "黔牧云登录测试", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody MyTest myTest)
    {
        return toAjax(myTestService.updateMyTest(myTest));
    }

    /**
     * 删除黔牧云登录测试
     */
    @PreAuthorize("@ss.hasPermi('test:test:remove')")
    @Log(title = "黔牧云登录测试", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(myTestService.deleteMyTestByIds(ids));
    }
}
