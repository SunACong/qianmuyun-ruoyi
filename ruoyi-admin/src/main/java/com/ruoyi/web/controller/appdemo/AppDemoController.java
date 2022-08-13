package com.ruoyi.web.controller.appdemo;

import com.ruoyi.appdemo.domain.AnodeChangeInfoApp;
import com.ruoyi.appdemo.domain.InsertDemoApp;
import com.ruoyi.appdemo.service.AppDemoService;
import com.ruoyi.common.core.domain.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/app/demo")
public class AppDemoController {
    @Autowired
    private AppDemoService anodeChangeInfoService;

    @PostMapping("/insert")
    public AjaxResult addInfo(@RequestBody AnodeChangeInfoApp anodeChangeInfo) {
        anodeChangeInfoService.addAnodeChangeInfo(anodeChangeInfo);
        return AjaxResult.success();
    }

    @PostMapping("/update")
    public AjaxResult updateInfo(@RequestBody AnodeChangeInfoApp anodeChangeInfo) {
        anodeChangeInfoService.updateAnodeChangeInfo(anodeChangeInfo);
        return AjaxResult.success();
    }

    @PostMapping("/delete")
    public AjaxResult deleteInfo(@RequestBody AnodeChangeInfoApp anodeChangeInfo) {
        anodeChangeInfoService.deleteAnodeChangeInfo(String.valueOf(anodeChangeInfo.getSn()));
        return AjaxResult.success();
    }

    //获取potid电解槽号
    @PostMapping("/potid")
    public AjaxResult getPotId(@RequestBody Map<String, String> factoryInfo) {
        AjaxResult ajax;
        List<Integer> potIds = null;
        List<String> factoryNames = null;
        List<String> areaNames = null;
        factoryNames = anodeChangeInfoService.selFactoryName();
        areaNames = anodeChangeInfoService.selAreaName();
        potIds = anodeChangeInfoService.selPotId(factoryInfo.get("factoryName"), factoryInfo.get("areaName"));
        if (potIds != null && factoryNames != null && areaNames != null) {
            ajax = AjaxResult.success();
            ajax.put("potId", potIds);
            ajax.put("factoryNames", factoryNames);
            ajax.put("areaNames", areaNames);
            return ajax;
        } else {
            return AjaxResult.error();
        }
    }

    //获取rod_pos导杆位置
    @GetMapping("/rodpos")
    public AjaxResult getRodPos(Integer potId) {
        AjaxResult ajax;
        List<String> rodPoss = null;
        rodPoss = anodeChangeInfoService.selRodPos(potId);

        if ((rodPoss != null) && !rodPoss.isEmpty()) {
            ajax = AjaxResult.success();
            ajax.put("rodPos", rodPoss);
            return ajax;
        } else {
            return AjaxResult.error();
        }
    }


    //获取流水号SN
    @GetMapping("/sn")
    public List<InsertDemoApp> getSn() {
        return anodeChangeInfoService.selectInsertDemoApp();
    }
}
