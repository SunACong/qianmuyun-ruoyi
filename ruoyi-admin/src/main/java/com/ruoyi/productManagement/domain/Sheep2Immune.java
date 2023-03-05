package com.ruoyi.productManagement.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 免疫记录对象 sheep2_immune
 *
 * @author 孙少聪
 * @date 2022-05-20
 */
public class Sheep2Immune extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 羊只编号 */
    @Excel(name = "羊只编号")
    private String sheepNumber;

    /** 时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date immuneTime;

    /** 所在圈舍 */
    @Excel(name = "所在圈舍")
    private String immunePosition;

    /** 疫苗名称 */
    @Excel(name = "疫苗名称")
    private String immuneName;

    /** 疫苗生产厂 */
    @Excel(name = "疫苗生产厂")
    private String immuneFrom;

    /** 批号 */
    @Excel(name = "批号")
    private String batchNumber;

    /** 免疫方法 */
    @Excel(name = "免疫方法")
    private String immuneMethod;

    /** 免疫剂量 */
    @Excel(name = "免疫剂量")
    private String immuneDose;

    /** 免疫人员 */
    @Excel(name = "免疫人员")
    private String signOperation;

    ///** 用户编号 */
    //@Excel(name = "用户编号")
    //private Long userId;
    //
    ///** 部门编号 */
    //@Excel(name = "部门编号")
    //private Long deptId;
    //
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
    public void setSheepNumber(String sheepNumber)
    {
        this.sheepNumber = sheepNumber;
    }

    public String getSheepNumber()
    {
        return sheepNumber;
    }
    public void setImmuneTime(Date immuneTime)
    {
        this.immuneTime = immuneTime;
    }

    public Date getImmuneTime()
    {
        return immuneTime;
    }
    public void setImmunePosition(String immunePosition)
    {
        this.immunePosition = immunePosition;
    }

    public String getImmunePosition()
    {
        return immunePosition;
    }
    public void setImmuneName(String immuneName)
    {
        this.immuneName = immuneName;
    }

    public String getImmuneName()
    {
        return immuneName;
    }
    public void setImmuneFrom(String immuneFrom)
    {
        this.immuneFrom = immuneFrom;
    }

    public String getImmuneFrom()
    {
        return immuneFrom;
    }
    public void setBatchNumber(String batchNumber)
    {
        this.batchNumber = batchNumber;
    }

    public String getBatchNumber()
    {
        return batchNumber;
    }
    public void setImmuneMethod(String immuneMethod)
    {
        this.immuneMethod = immuneMethod;
    }

    public String getImmuneMethod()
    {
        return immuneMethod;
    }
    public void setImmuneDose(String immuneDose)
    {
        this.immuneDose = immuneDose;
    }

    public String getImmuneDose()
    {
        return immuneDose;
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
            .append("sheepNumber", getSheepNumber())
            .append("immuneTime", getImmuneTime())
            .append("immunePosition", getImmunePosition())
            .append("immuneName", getImmuneName())
            .append("immuneFrom", getImmuneFrom())
            .append("batchNumber", getBatchNumber())
            .append("immuneMethod", getImmuneMethod())
            .append("immuneDose", getImmuneDose())
            .append("signOperation", getSignOperation())
            .append("remark", getRemark())
            .append("userId", getUserId())
            .append("deptId", getDeptId())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
