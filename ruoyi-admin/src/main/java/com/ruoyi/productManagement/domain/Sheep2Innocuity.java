package com.ruoyi.productManagement.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 无害化处理对象 sheep2_innocuity
 * 
 * @author 孙少聪
 * @date 2022-05-20
 */
public class Sheep2Innocuity extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date recordDate;

    /** 数量 */
    @Excel(name = "数量")
    private Long number;

    /** 处理或死亡原因 */
    @Excel(name = "处理或死亡原因")
    private String cause;

    /** 畜禽标识编码 */
    @Excel(name = "畜禽标识编码")
    private String signCode;

    /** 处理方法 */
    @Excel(name = "处理方法")
    private String dealMethod;

    /** 处理人 */
    @Excel(name = "处理人")
    private String dealPeople;

    /** 官方兽医签字 */
    @Excel(name = "官方兽医签字")
    private String signDocor;

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
    public void setRecordDate(Date recordDate) 
    {
        this.recordDate = recordDate;
    }

    public Date getRecordDate() 
    {
        return recordDate;
    }
    public void setNumber(Long number) 
    {
        this.number = number;
    }

    public Long getNumber() 
    {
        return number;
    }
    public void setCause(String cause) 
    {
        this.cause = cause;
    }

    public String getCause() 
    {
        return cause;
    }
    public void setSignCode(String signCode) 
    {
        this.signCode = signCode;
    }

    public String getSignCode() 
    {
        return signCode;
    }
    public void setDealMethod(String dealMethod) 
    {
        this.dealMethod = dealMethod;
    }

    public String getDealMethod() 
    {
        return dealMethod;
    }
    public void setDealPeople(String dealPeople) 
    {
        this.dealPeople = dealPeople;
    }

    public String getDealPeople() 
    {
        return dealPeople;
    }
    public void setSignDocor(String signDocor) 
    {
        this.signDocor = signDocor;
    }

    public String getSignDocor() 
    {
        return signDocor;
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
            .append("recordDate", getRecordDate())
            .append("number", getNumber())
            .append("cause", getCause())
            .append("signCode", getSignCode())
            .append("dealMethod", getDealMethod())
            .append("dealPeople", getDealPeople())
            .append("signDocor", getSignDocor())
            .append("remark", getRemark())
            .append("userId", getUserId())
            .append("deptId", getDeptId())
            .append("creatTime", getCreatTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
