package com.ruoyi.productManagement.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 产子档案对象 sheep_sheepbirth
 *
 * @author 孙少聪
 * @date 2022-06-09
 */
public class SheepSheepbirth extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 外键 */
    @Excel(name = "外键")
    private String matingid;

    /** 耳编号 */
    @Excel(name = "耳编号")
    private String eartagid;

    /** 母耳标 */
    @Excel(name = "母耳标")
    private String motherid;

    /** 父耳标 */
    @Excel(name = "父耳标")
    private String fatherid;

    /** 性别 */
    @Excel(name = "性别")
    private String sex;

    /** 毛色 */
    @Excel(name = "毛色")
    private String colour;

    /** 出生重 */
    @Excel(name = "出生重")
    private String birthweight;

    /** 羔羊状态 */
    @Excel(name = "羔羊状态")
    private String status;

    /** 场区 */
    @Excel(name = "场区")
    private String region;

    /** 栋号 */
    @Excel(name = "栋号")
    private String buildingnum;

    /** 栏号 */
    @Excel(name = "栏号")
    private String columnnum;

    /** 断奶时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "断奶时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date weaningdate;

    /** 断奶重 */
    @Excel(name = "断奶重")
    private String weaningweight;

    /** 羔羊类型 */
    @Excel(name = "羔羊类型")
    private String type;

    /** 移至场区 */
    @Excel(name = "移至场区")
    private String newregion;

    /** 移至羊舍 */
    @Excel(name = "移至羊舍")
    private String newbuilding;

    /** 移至羊栏 */
    @Excel(name = "移至羊栏")
    private String newcolumn;

    /** 视频 */
    @Excel(name = "视频")
    private String video;

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
    public void setMatingid(String matingid)
    {
        this.matingid = matingid;
    }

    public String getMatingid()
    {
        return matingid;
    }
    public void setEartagid(String eartagid)
    {
        this.eartagid = eartagid;
    }

    public String getEartagid()
    {
        return eartagid;
    }
    public void setMotherid(String motherid)
    {
        this.motherid = motherid;
    }

    public String getMotherid()
    {
        return motherid;
    }
    public void setFatherid(String fatherid)
    {
        this.fatherid = fatherid;
    }

    public String getFatherid()
    {
        return fatherid;
    }
    public void setSex(String sex)
    {
        this.sex = sex;
    }

    public String getSex()
    {
        return sex;
    }
    public void setColour(String colour)
    {
        this.colour = colour;
    }

    public String getColour()
    {
        return colour;
    }
    public void setBirthweight(String birthweight)
    {
        this.birthweight = birthweight;
    }

    public String getBirthweight()
    {
        return birthweight;
    }
    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getStatus()
    {
        return status;
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
    public void setWeaningdate(Date weaningdate)
    {
        this.weaningdate = weaningdate;
    }

    public Date getWeaningdate()
    {
        return weaningdate;
    }
    public void setWeaningweight(String weaningweight)
    {
        this.weaningweight = weaningweight;
    }

    public String getWeaningweight()
    {
        return weaningweight;
    }
    public void setType(String type)
    {
        this.type = type;
    }

    public String getType()
    {
        return type;
    }
    public void setNewregion(String newregion)
    {
        this.newregion = newregion;
    }

    public String getNewregion()
    {
        return newregion;
    }
    public void setNewbuilding(String newbuilding)
    {
        this.newbuilding = newbuilding;
    }

    public String getNewbuilding()
    {
        return newbuilding;
    }
    public void setNewcolumn(String newcolumn)
    {
        this.newcolumn = newcolumn;
    }

    public String getNewcolumn()
    {
        return newcolumn;
    }
    public void setVideo(String video)
    {
        this.video = video;
    }

    public String getVideo()
    {
        return video;
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
            .append("matingid", getMatingid())
            .append("eartagid", getEartagid())
            .append("motherid", getMotherid())
            .append("fatherid", getFatherid())
            .append("sex", getSex())
            .append("colour", getColour())
            .append("birthweight", getBirthweight())
            .append("status", getStatus())
            .append("region", getRegion())
            .append("buildingnum", getBuildingnum())
            .append("columnnum", getColumnnum())
            .append("weaningdate", getWeaningdate())
            .append("weaningweight", getWeaningweight())
            .append("type", getType())
            .append("newregion", getNewregion())
            .append("newbuilding", getNewbuilding())
            .append("newcolumn", getNewcolumn())
            .append("video", getVideo())
            .append("bak1", getBak1())
            .append("bak2", getBak2())
            .append("bak3", getBak3())
            .append("createBy", getCreateBy())
            .append("createDate", getCreateDate())
            .append("updateBy", getUpdateBy())
            .append("updateDate", getUpdateDate())
            .append("remarks", getRemarks())
            .append("delFlag", getDelFlag())
            .append("userId", getUserId())
            .append("deptId", getDeptId())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
