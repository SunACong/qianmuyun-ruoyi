package com.ruoyi.productManagement.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 采样记录对象 sheep2_sampling
 * 
 * @author 孙少聪
 * @date 2022-05-20
 */
public class Sheep2Sampling extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date samplingTime;

    /** 圈舍号 */
    @Excel(name = "圈舍号")
    private String enclosureNumber;

    /** 羊编号 */
    @Excel(name = "羊编号")
    private String sheepNumber;

    /** 采样名称 */
    @Excel(name = "采样名称")
    private String samplingName;

    /** 采样数目 */
    @Excel(name = "采样数目")
    private Long samplingNumber;

    /** 监测项目 */
    @Excel(name = "监测项目")
    private String monitoringItem;

    /** 监测结果 */
    @Excel(name = "监测结果")
    private String monitoringResult;

    /** 处理情况 */
    @Excel(name = "处理情况")
    private String deal;

    /** 用户编号 */
    @Excel(name = "用户编号")
    private Long userId;

    /** 部门编号 */
    @Excel(name = "部门编号")
    private Long deptId;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date creatTime;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setSamplingTime(Date samplingTime) 
    {
        this.samplingTime = samplingTime;
    }

    public Date getSamplingTime() 
    {
        return samplingTime;
    }
    public void setEnclosureNumber(String enclosureNumber) 
    {
        this.enclosureNumber = enclosureNumber;
    }

    public String getEnclosureNumber() 
    {
        return enclosureNumber;
    }
    public void setSheepNumber(String sheepNumber) 
    {
        this.sheepNumber = sheepNumber;
    }

    public String getSheepNumber() 
    {
        return sheepNumber;
    }
    public void setSamplingName(String samplingName) 
    {
        this.samplingName = samplingName;
    }

    public String getSamplingName() 
    {
        return samplingName;
    }
    public void setSamplingNumber(Long samplingNumber) 
    {
        this.samplingNumber = samplingNumber;
    }

    public Long getSamplingNumber() 
    {
        return samplingNumber;
    }
    public void setMonitoringItem(String monitoringItem) 
    {
        this.monitoringItem = monitoringItem;
    }

    public String getMonitoringItem() 
    {
        return monitoringItem;
    }
    public void setMonitoringResult(String monitoringResult) 
    {
        this.monitoringResult = monitoringResult;
    }

    public String getMonitoringResult() 
    {
        return monitoringResult;
    }
    public void setDeal(String deal) 
    {
        this.deal = deal;
    }

    public String getDeal() 
    {
        return deal;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setDeptId(Long deptId) 
    {
        this.deptId = deptId;
    }

    public Long getDeptId() 
    {
        return deptId;
    }
    public void setCreatTime(Date creatTime) 
    {
        this.creatTime = creatTime;
    }

    public Date getCreatTime() 
    {
        return creatTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("samplingTime", getSamplingTime())
            .append("enclosureNumber", getEnclosureNumber())
            .append("sheepNumber", getSheepNumber())
            .append("samplingName", getSamplingName())
            .append("samplingNumber", getSamplingNumber())
            .append("monitoringItem", getMonitoringItem())
            .append("monitoringResult", getMonitoringResult())
            .append("deal", getDeal())
            .append("remark", getRemark())
            .append("userId", getUserId())
            .append("deptId", getDeptId())
            .append("creatTime", getCreatTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
