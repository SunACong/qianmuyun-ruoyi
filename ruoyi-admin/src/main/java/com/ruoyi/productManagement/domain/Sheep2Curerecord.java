package com.ruoyi.productManagement.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 诊疗记录对象 sheep2_curerecord
 *
 * @author 孙少聪
 * @date 2022-05-20
 */
public class Sheep2Curerecord extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date cureTime;

    /** 圈舍号 */
    @Excel(name = "圈舍号")
    private String curePosition;

    /** 日龄 */
    @Excel(name = "日龄")
    private String dayAge;

    /** 发病日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "发病日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date illTime;

    /** 病因 */
    @Excel(name = "病因")
    private String illCause;

    /** 诊疗人员 */
    @Excel(name = "诊疗人员")
    private String signCure;

    /** 用药名称 */
    @Excel(name = "用药名称")
    private String drugName;

    /** 用药方法 */
    @Excel(name = "用药方法")
    private String drugMethod;

    /** 羊只编号 */
    @Excel(name = "羊只编号")
    private String sheepNumber;

    /** 诊疗结果 */
    @Excel(name = "诊疗结果")
    private String result;

    ///** 用户编号 */
    //@Excel(name = "用户编号")
    //private Long userId;
    //
    ///** 部门编号 */
    //@Excel(name = "部门编号")
    //private Long deptId;

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
    public void setCureTime(Date cureTime)
    {
        this.cureTime = cureTime;
    }

    public Date getCureTime()
    {
        return cureTime;
    }
    public void setCurePosition(String curePosition)
    {
        this.curePosition = curePosition;
    }

    public String getCurePosition()
    {
        return curePosition;
    }
    public void setDayAge(String dayAge)
    {
        this.dayAge = dayAge;
    }

    public String getDayAge()
    {
        return dayAge;
    }
    public void setIllTime(Date illTime)
    {
        this.illTime = illTime;
    }

    public Date getIllTime()
    {
        return illTime;
    }
    public void setIllCause(String illCause)
    {
        this.illCause = illCause;
    }

    public String getIllCause()
    {
        return illCause;
    }
    public void setSignCure(String signCure)
    {
        this.signCure = signCure;
    }

    public String getSignCure()
    {
        return signCure;
    }
    public void setDrugName(String drugName)
    {
        this.drugName = drugName;
    }

    public String getDrugName()
    {
        return drugName;
    }
    public void setDrugMethod(String drugMethod)
    {
        this.drugMethod = drugMethod;
    }

    public String getDrugMethod()
    {
        return drugMethod;
    }
    public void setSheepNumber(String sheepNumber)
    {
        this.sheepNumber = sheepNumber;
    }

    public String getSheepNumber()
    {
        return sheepNumber;
    }
    public void setResult(String result)
    {
        this.result = result;
    }

    public String getResult()
    {
        return result;
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
            .append("cureTime", getCureTime())
            .append("curePosition", getCurePosition())
            .append("dayAge", getDayAge())
            .append("illTime", getIllTime())
            .append("illCause", getIllCause())
            .append("signCure", getSignCure())
            .append("drugName", getDrugName())
            .append("drugMethod", getDrugMethod())
            .append("sheepNumber", getSheepNumber())
            .append("result", getResult())
            .append("remark", getRemark())
            .append("userId", getUserId())
            .append("deptId", getDeptId())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
