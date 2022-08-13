package com.ruoyi.stockManager.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 初次录入对象 firstrecord
 * 
 * @author 孙少聪
 * @date 2022-04-22
 */
public class Firstrecord extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 录入时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "录入时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date recorddate;

    /** 养殖场 */
    @Excel(name = "养殖场")
    private String ranch;

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

    /** 性别 */
    @Excel(name = "性别")
    private String gender;

    /** 品种 */
    @Excel(name = "品种")
    private String species;

    /** 品类 */
    @Excel(name = "品类")
    private String type;

    /** 阶段 */
    @Excel(name = "阶段")
    private String stage;

    /** 月龄 */
    @Excel(name = "月龄")
    private String age;

    /** 毛色 */
    @Excel(name = "毛色")
    private String colour;

    /** 体重 */
    @Excel(name = "体重")
    private String weight;

    /** 视频 */
    @Excel(name = "视频")
    private String video;

    /** 查询开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "查询开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startdate;

    /** 查询截止时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "查询截止时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date enddate;

    /** 审核是否通过 */
    @Excel(name = "审核是否通过")
    private String bak1;

    /** 未通过原因 */
    @Excel(name = "未通过原因")
    private String bak2;

    /** 预留3 */
    @Excel(name = "预留3")
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
    public void setRecorddate(Date recorddate) 
    {
        this.recorddate = recorddate;
    }

    public Date getRecorddate() 
    {
        return recorddate;
    }
    public void setRanch(String ranch) 
    {
        this.ranch = ranch;
    }

    public String getRanch() 
    {
        return ranch;
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
    public void setGender(String gender) 
    {
        this.gender = gender;
    }

    public String getGender() 
    {
        return gender;
    }
    public void setSpecies(String species) 
    {
        this.species = species;
    }

    public String getSpecies() 
    {
        return species;
    }
    public void setType(String type) 
    {
        this.type = type;
    }

    public String getType() 
    {
        return type;
    }
    public void setStage(String stage) 
    {
        this.stage = stage;
    }

    public String getStage() 
    {
        return stage;
    }
    public void setAge(String age) 
    {
        this.age = age;
    }

    public String getAge() 
    {
        return age;
    }
    public void setColour(String colour) 
    {
        this.colour = colour;
    }

    public String getColour() 
    {
        return colour;
    }
    public void setWeight(String weight) 
    {
        this.weight = weight;
    }

    public String getWeight() 
    {
        return weight;
    }
    public void setVideo(String video) 
    {
        this.video = video;
    }

    public String getVideo() 
    {
        return video;
    }
    public void setStartdate(Date startdate) 
    {
        this.startdate = startdate;
    }

    public Date getStartdate() 
    {
        return startdate;
    }
    public void setEnddate(Date enddate) 
    {
        this.enddate = enddate;
    }

    public Date getEnddate() 
    {
        return enddate;
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
            .append("recorddate", getRecorddate())
            .append("ranch", getRanch())
            .append("eartagid", getEartagid())
            .append("region", getRegion())
            .append("buildingnum", getBuildingnum())
            .append("columnnum", getColumnnum())
            .append("gender", getGender())
            .append("species", getSpecies())
            .append("type", getType())
            .append("stage", getStage())
            .append("age", getAge())
            .append("colour", getColour())
            .append("weight", getWeight())
            .append("video", getVideo())
            .append("startdate", getStartdate())
            .append("enddate", getEnddate())
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
