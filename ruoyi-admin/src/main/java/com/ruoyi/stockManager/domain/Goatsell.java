package com.ruoyi.stockManager.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 出售管理对象 goatsell
 *
 * @author 孙少聪
 * @date 2022-05-20
 */
public class Goatsell extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 出售时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "出售时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date selldate;

    /** 耳编号 */
    @Excel(name = "耳编号")
    private String eartagid;

    /** 场区 */
    @Excel(name = "场区")
    private String region;

    /** 栋号 */
    @Excel(name = "栋号")
    private String buildingnum;

    /** 栏号 */
    @Excel(name = "栏号")
    private String columnnum;

    /** 生日 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "生日", width = 30, dateFormat = "yyyy-MM-dd")
    private Date birthdate;

    /** 品类 */
    @Excel(name = "品类")
    private String goattype;

    /** 月龄 */
    @Excel(name = "月龄")
    private String age;

    /** 体重 */
    @Excel(name = "体重")
    private String nweight;

    /** 毛色 */
    @Excel(name = "毛色")
    private String colour;

    /** 等级 */
    @Excel(name = "等级")
    private String rankm;

    /** 购买单位 */
    @Excel(name = "购买单位")
    private String unit;

    /** 订单号 */
    @Excel(name = "订单号")
    private String ordernum;

    /** 采购数量 */
    @Excel(name = "采购数量")
    private String purchasenum;

    /** 预留1 */
    @Excel(name = "预留1")
    private String bak1;

    /** 预留2 */
    @Excel(name = "预留2")
    private String bak2;

    /** 预留3 */
    @Excel(name = "预留3")
    private String bak3;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createDate;

    /** 更新时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "更新时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date updateDate;

    /** 备注信息 */
    @Excel(name = "备注信息")
    private String remarks;

    /** 逻辑删除标记（0：显示；1：隐藏） */
    private String delFlag;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setSelldate(Date selldate)
    {
        this.selldate = selldate;
    }

    public Date getSelldate()
    {
        return selldate;
    }
    public void setEartagid(String eartagid)
    {
        this.eartagid = eartagid;
    }

    public String getEartagid()
    {
        return eartagid;
    }
    public void setRegion(String region)
    {
        this.region = region;
    }

    public String getRegion()
    {
        return region;
    }
    public void setBuildingnum(String buildingnum)
    {
        this.buildingnum = buildingnum;
    }

    public String getBuildingnum()
    {
        return buildingnum;
    }
    public void setColumnnum(String columnnum)
    {
        this.columnnum = columnnum;
    }

    public String getColumnnum()
    {
        return columnnum;
    }
    public void setBirthdate(Date birthdate)
    {
        this.birthdate = birthdate;
    }

    public Date getBirthdate()
    {
        return birthdate;
    }
    public void setGoattype(String goattype)
    {
        this.goattype = goattype;
    }

    public String getGoattype()
    {
        return goattype;
    }
    public void setAge(String age)
    {
        this.age = age;
    }

    public String getAge()
    {
        return age;
    }
    public void setNweight(String nweight)
    {
        this.nweight = nweight;
    }

    public String getNweight()
    {
        return nweight;
    }
    public void setColour(String colour)
    {
        this.colour = colour;
    }

    public String getColour()
    {
        return colour;
    }
    public void setRank(String rankm)
    {
        this.rankm = rankm;
    }

    public String getRank()
    {
        return rankm;
    }
    public void setUnit(String unit)
    {
        this.unit = unit;
    }

    public String getUnit()
    {
        return unit;
    }
    public void setOrdernum(String ordernum)
    {
        this.ordernum = ordernum;
    }

    public String getOrdernum()
    {
        return ordernum;
    }
    public void setPurchasenum(String purchasenum)
    {
        this.purchasenum = purchasenum;
    }

    public String getPurchasenum()
    {
        return purchasenum;
    }
    public void setBak1(String bak1)
    {
        this.bak1 = bak1;
    }

    public String getBak1()
    {
        return bak1;
    }
    public void setBak2(String bak2)
    {
        this.bak2 = bak2;
    }

    public String getBak2()
    {
        return bak2;
    }
    public void setBak3(String bak3)
    {
        this.bak3 = bak3;
    }

    public String getBak3()
    {
        return bak3;
    }
    public void setCreateDate(Date createDate)
    {
        this.createDate = createDate;
    }

    public Date getCreateDate()
    {
        return createDate;
    }
    public void setUpdateDate(Date updateDate)
    {
        this.updateDate = updateDate;
    }

    public Date getUpdateDate()
    {
        return updateDate;
    }
    public void setRemarks(String remarks)
    {
        this.remarks = remarks;
    }

    public String getRemarks()
    {
        return remarks;
    }
    public void setDelFlag(String delFlag)
    {
        this.delFlag = delFlag;
    }

    public String getDelFlag()
    {
        return delFlag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("selldate", getSelldate())
            .append("eartagid", getEartagid())
            .append("region", getRegion())
            .append("buildingnum", getBuildingnum())
            .append("columnnum", getColumnnum())
            .append("birthdate", getBirthdate())
            .append("goattype", getGoattype())
            .append("age", getAge())
            .append("nweight", getNweight())
            .append("colour", getColour())
            .append("rankm", getRank())
            .append("unit", getUnit())
            .append("ordernum", getOrdernum())
            .append("purchasenum", getPurchasenum())
            .append("bak1", getBak1())
            .append("bak2", getBak2())
            .append("bak3", getBak3())
            .append("createBy", getCreateBy())
            .append("createDate", getCreateDate())
            .append("updateBy", getUpdateBy())
            .append("updateDate", getUpdateDate())
            .append("remarks", getRemarks())
            .append("delFlag", getDelFlag())
            .toString();
    }
}
