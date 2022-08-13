package com.ruoyi.stockManager.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 死亡管理对象 deathmanage
 * 
 * @author 孙少聪
 * @date 2022-04-22
 */
public class Deathmanage extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 耳编号 */
    @Excel(name = "耳编号")
    private String eartagid;

    /** 死亡时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "死亡时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date deathdate;

    /** 体重 */
    @Excel(name = "体重")
    private String nweight;

    /** 栋号 */
    @Excel(name = "栋号")
    private String buildingnum;

    /** 栏号 */
    @Excel(name = "栏号")
    private String columnnum;

    /** 毛色 */
    @Excel(name = "毛色")
    private String colour;

    /** 月龄 */
    @Excel(name = "月龄")
    private String age;

    /** 品类 */
    @Excel(name = "品类")
    private String goattype;

    /** 品种 */
    @Excel(name = "品种")
    private String category;

    /** 因病死亡 */
    @Excel(name = "因病死亡")
    private String deathsick;

    /** 自然灾害 */
    @Excel(name = "自然灾害")
    private String disaster;

    /** 意外死亡 */
    @Excel(name = "意外死亡")
    private String accident;

    /** 无害化处理 */
    @Excel(name = "无害化处理")
    private String harmless;

    /** 视频图片 */
    @Excel(name = "视频图片")
    private String video;

    /** 报险 */
    @Excel(name = "报险")
    private String riskreporting;

    /** 审核是否通过 */
    @Excel(name = "审核是否通过")
    private String bak1;

    /** 未通过原因 */
    @Excel(name = "未通过原因")
    private String bak2;

    /** 养殖场 */
    @Excel(name = "养殖场")
    private String bak3;

    /** 创建时间 */
    private Date createDate;

    /** 更新时间 */
    private Date updateDate;

    /** 备注信息 */
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
    public void setEartagid(String eartagid) 
    {
        this.eartagid = eartagid;
    }

    public String getEartagid() 
    {
        return eartagid;
    }
    public void setDeathdate(Date deathdate) 
    {
        this.deathdate = deathdate;
    }

    public Date getDeathdate() 
    {
        return deathdate;
    }
    public void setNweight(String nweight) 
    {
        this.nweight = nweight;
    }

    public String getNweight() 
    {
        return nweight;
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
    public void setColour(String colour) 
    {
        this.colour = colour;
    }

    public String getColour() 
    {
        return colour;
    }
    public void setAge(String age) 
    {
        this.age = age;
    }

    public String getAge() 
    {
        return age;
    }
    public void setGoattype(String goattype) 
    {
        this.goattype = goattype;
    }

    public String getGoattype() 
    {
        return goattype;
    }
    public void setCategory(String category) 
    {
        this.category = category;
    }

    public String getCategory() 
    {
        return category;
    }
    public void setDeathsick(String deathsick) 
    {
        this.deathsick = deathsick;
    }

    public String getDeathsick() 
    {
        return deathsick;
    }
    public void setDisaster(String disaster) 
    {
        this.disaster = disaster;
    }

    public String getDisaster() 
    {
        return disaster;
    }
    public void setAccident(String accident) 
    {
        this.accident = accident;
    }

    public String getAccident() 
    {
        return accident;
    }
    public void setHarmless(String harmless) 
    {
        this.harmless = harmless;
    }

    public String getHarmless() 
    {
        return harmless;
    }
    public void setVideo(String video) 
    {
        this.video = video;
    }

    public String getVideo() 
    {
        return video;
    }
    public void setRiskreporting(String riskreporting) 
    {
        this.riskreporting = riskreporting;
    }

    public String getRiskreporting() 
    {
        return riskreporting;
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
            .append("eartagid", getEartagid())
            .append("deathdate", getDeathdate())
            .append("nweight", getNweight())
            .append("buildingnum", getBuildingnum())
            .append("columnnum", getColumnnum())
            .append("colour", getColour())
            .append("age", getAge())
            .append("goattype", getGoattype())
            .append("category", getCategory())
            .append("deathsick", getDeathsick())
            .append("disaster", getDisaster())
            .append("accident", getAccident())
            .append("harmless", getHarmless())
            .append("video", getVideo())
            .append("riskreporting", getRiskreporting())
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
