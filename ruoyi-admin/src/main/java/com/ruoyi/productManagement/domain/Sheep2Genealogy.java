package com.ruoyi.productManagement.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 系谱记录对象 sheep2_genealogy
 *
 * @author 孙少聪
 * @date 2022-05-20
 */
public class Sheep2Genealogy extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 品种 */
    @Excel(name = "品种")
    private String sheepType;

    /** 耳标号 */
    @Excel(name = "耳标号")
    private String sheepNumber;

    /** 性别 */
    @Excel(name = "性别")
    private String sex;

    /** 出生日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "出生日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date bornTime;

    /** 同胞数 */
    @Excel(name = "同胞数")
    private Long number;

    /** 胎次 */
    @Excel(name = "胎次")
    private Long bornNumber;

    /** 级别 */
    @Excel(name = "级别")
    private String rankm;

    /** 出场日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "出场日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date outTime;

    /** 出场体重 */
    @Excel(name = "出场体重")
    private Long outKg;

    /** 父号 */
    @Excel(name = "父号")
    private String fatherNumber;

    /** 父父号 */
    @Excel(name = "父父号")
    private String ffatherNumber;

    /** 父母号 */
    @Excel(name = "父母号")
    private String fmotherNumber;

    /** 母号 */
    @Excel(name = "母号")
    private String motherNumber;

    /** 母父号 */
    @Excel(name = "母父号")
    private String mfatherNumber;

    /** 母母号 */
    @Excel(name = "母母号")
    private String mmotherNumber;

    /** 年龄 */
    @Excel(name = "年龄")
    private String age;

    /** 体重 */
    @Excel(name = "体重")
    private Long kHeavy;

    /** 体高 */
    @Excel(name = "体高")
    private Long kHeight;

    /** 体长 */
    @Excel(name = "体长")
    private Long kLong;

    /** 胸围 */
    @Excel(name = "胸围")
    private Long kChest;

    /** 图片 */
    @Excel(name = "图片")
    private String picture;

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
    public void setSheepType(String sheepType)
    {
        this.sheepType = sheepType;
    }

    public String getSheepType()
    {
        return sheepType;
    }
    public void setSheepNumber(String sheepNumber)
    {
        this.sheepNumber = sheepNumber;
    }

    public String getSheepNumber()
    {
        return sheepNumber;
    }
    public void setSex(String sex)
    {
        this.sex = sex;
    }

    public String getSex()
    {
        return sex;
    }
    public void setBornTime(Date bornTime)
    {
        this.bornTime = bornTime;
    }

    public Date getBornTime()
    {
        return bornTime;
    }
    public void setNumber(Long number)
    {
        this.number = number;
    }

    public Long getNumber()
    {
        return number;
    }
    public void setBornNumber(Long bornNumber)
    {
        this.bornNumber = bornNumber;
    }

    public Long getBornNumber()
    {
        return bornNumber;
    }
    public void setRankm(String rankm)
    {
        this.rankm = rankm;
    }

    public String getRankm()
    {
        return rankm;
    }
    public void setOutTime(Date outTime)
    {
        this.outTime = outTime;
    }

    public Date getOutTime()
    {
        return outTime;
    }
    public void setOutKg(Long outKg)
    {
        this.outKg = outKg;
    }

    public Long getOutKg()
    {
        return outKg;
    }
    public void setFatherNumber(String fatherNumber)
    {
        this.fatherNumber = fatherNumber;
    }

    public String getFatherNumber()
    {
        return fatherNumber;
    }
    public void setFfatherNumber(String ffatherNumber)
    {
        this.ffatherNumber = ffatherNumber;
    }

    public String getFfatherNumber()
    {
        return ffatherNumber;
    }
    public void setFmotherNumber(String fmotherNumber)
    {
        this.fmotherNumber = fmotherNumber;
    }

    public String getFmotherNumber()
    {
        return fmotherNumber;
    }
    public void setMotherNumber(String motherNumber)
    {
        this.motherNumber = motherNumber;
    }

    public String getMotherNumber()
    {
        return motherNumber;
    }
    public void setMfatherNumber(String mfatherNumber)
    {
        this.mfatherNumber = mfatherNumber;
    }

    public String getMfatherNumber()
    {
        return mfatherNumber;
    }
    public void setMmotherNumber(String mmotherNumber)
    {
        this.mmotherNumber = mmotherNumber;
    }

    public String getMmotherNumber()
    {
        return mmotherNumber;
    }
    public void setAge(String age)
    {
        this.age = age;
    }

    public String getAge()
    {
        return age;
    }
    public void setkHeavy(Long kHeavy)
    {
        this.kHeavy = kHeavy;
    }

    public Long getkHeavy()
    {
        return kHeavy;
    }
    public void setkHeight(Long kHeight)
    {
        this.kHeight = kHeight;
    }

    public Long getkHeight()
    {
        return kHeight;
    }
    public void setkLong(Long kLong)
    {
        this.kLong = kLong;
    }

    public Long getkLong()
    {
        return kLong;
    }
    public void setkChest(Long kChest)
    {
        this.kChest = kChest;
    }

    public Long getkChest()
    {
        return kChest;
    }
    public void setPicture(String picture)
    {
        this.picture = picture;
    }

    public String getPicture()
    {
        return picture;
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
            .append("sheepType", getSheepType())
            .append("sheepNumber", getSheepNumber())
            .append("sex", getSex())
            .append("bornTime", getBornTime())
            .append("number", getNumber())
            .append("bornNumber", getBornNumber())
            .append("rankm", getRankm())
            .append("outTime", getOutTime())
            .append("outKg", getOutKg())
            .append("fatherNumber", getFatherNumber())
            .append("ffatherNumber", getFfatherNumber())
            .append("fmotherNumber", getFmotherNumber())
            .append("motherNumber", getMotherNumber())
            .append("mfatherNumber", getMfatherNumber())
            .append("mmotherNumber", getMmotherNumber())
            .append("age", getAge())
            .append("kHeavy", getkHeavy())
            .append("kHeight", getkHeight())
            .append("kLong", getkLong())
            .append("kChest", getkChest())
            .append("picture", getPicture())
            .append("userId", getUserId())
            .append("deptId", getDeptId())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
