package com.ruoyi.productManagement.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 消毒记录对象 sheep2_disinfect
 *
 * @author 孙少聪
 * @date 2022-05-20
 */
public class Sheep2Disinfect extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date disinfectTime;

    /** 消毒场所 */
    @Excel(name = "消毒场所")
    private String disinfectPosition;

    /** 消毒药名称 */
    @Excel(name = "消毒药名称")
    private String disinfectDrug;

    /** 用药剂量 */
    @Excel(name = "用药剂量")
    private String drugDose;

    /** 消毒方法 */
    @Excel(name = "消毒方法")
    private String drugMethod;

    /** 操作员签字 */
    @Excel(name = "操作员签字")
    private String signOperation;

    /** 用户编号 */
    @Excel(name = "用户编号")
    private Long userId;

    /** 部门编号 */
    @Excel(name = "部门编号")
    private Long deptId;

    ///** 创建时间 */
    //@JsonFormat(pattern = "yyyy-MM-dd")
    //@Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    //private Date creatTime;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setDisinfectTime(Date disinfectTime)
    {
        this.disinfectTime = disinfectTime;
    }

    public Date getDisinfectTime()
    {
        return disinfectTime;
    }
    public void setDisinfectPosition(String disinfectPosition)
    {
        this.disinfectPosition = disinfectPosition;
    }

    public String getDisinfectPosition()
    {
        return disinfectPosition;
    }
    public void setDisinfectDrug(String disinfectDrug)
    {
        this.disinfectDrug = disinfectDrug;
    }

    public String getDisinfectDrug()
    {
        return disinfectDrug;
    }
    public void setDrugDose(String drugDose)
    {
        this.drugDose = drugDose;
    }

    public String getDrugDose()
    {
        return drugDose;
    }
    public void setDrugMethod(String drugMethod)
    {
        this.drugMethod = drugMethod;
    }

    public String getDrugMethod()
    {
        return drugMethod;
    }
    public void setSignOperation(String signOperation)
    {
        this.signOperation = signOperation;
    }

    public String getSignOperation()
    {
        return signOperation;
    }
    //public void setUserId(Long userId)
    //{
    //    this.userId = userId;
    //}
    //
    //public Long getUserId()
    //{
    //    return userId;
    //}
    //public void setDeptId(Long deptId)
    //{
    //    this.deptId = deptId;
    //}
    //
    //public Long getDeptId()
    //{
    //    return deptId;
    //}
    //public void setCreatTime(Date creatTime)
    //{
    //    this.creatTime = creatTime;
    //}
    //
    //public Date getCreatTime()
    //{
    //    return creatTime;
    //}

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("disinfectTime", getDisinfectTime())
            .append("disinfectPosition", getDisinfectPosition())
            .append("disinfectDrug", getDisinfectDrug())
            .append("drugDose", getDrugDose())
            .append("drugMethod", getDrugMethod())
            .append("signOperation", getSignOperation())
            .append("remark", getRemark())
            .append("userId", getUserId())
            .append("deptId", getDeptId())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
