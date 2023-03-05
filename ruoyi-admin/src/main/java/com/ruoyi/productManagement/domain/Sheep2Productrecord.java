package com.ruoyi.productManagement.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 生产记录对象 sheep2_productrecord
 *
 * @author 孙少聪
 * @date 2022-05-20
 */
public class Sheep2Productrecord extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 圈舍号 */
    @Excel(name = "圈舍号")
    private String enclosure;

    /** 时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date productTime;

    /** 出生 */
    @Excel(name = "出生")
    private Long born;

    /** 调入 */
    @Excel(name = "调入")
    private Long transferIn;

    /** 调出 */
    @Excel(name = "调出")
    private Long transferOut;

    /** 死亡 */
    @Excel(name = "死亡")
    private Long death;

    /** 存栏数量 */
    @Excel(name = "存栏数量")
    private Long number;

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
    public void setEnclosure(String enclosure)
    {
        this.enclosure = enclosure;
    }

    public String getEnclosure()
    {
        return enclosure;
    }
    public void setProductTime(Date productTime)
    {
        this.productTime = productTime;
    }

    public Date getProductTime()
    {
        return productTime;
    }
    public void setBorn(Long born)
    {
        this.born = born;
    }

    public Long getBorn()
    {
        return born;
    }
    public void setTransferIn(Long transferIn)
    {
        this.transferIn = transferIn;
    }

    public Long getTransferIn()
    {
        return transferIn;
    }
    public void setTransferOut(Long transferOut)
    {
        this.transferOut = transferOut;
    }

    public Long getTransferOut()
    {
        return transferOut;
    }
    public void setDeath(Long death)
    {
        this.death = death;
    }

    public Long getDeath()
    {
        return death;
    }
    public void setNumber(Long number)
    {
        this.number = number;
    }

    public Long getNumber()
    {
        return number;
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
            .append("enclosure", getEnclosure())
            .append("productTime", getProductTime())
            .append("born", getBorn())
            .append("transferIn", getTransferIn())
            .append("transferOut", getTransferOut())
            .append("death", getDeath())
            .append("number", getNumber())
            .append("remark", getRemark())
            .append("userId", getUserId())
            .append("deptId", getDeptId())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
