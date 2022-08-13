package com.ruoyi.productManagement.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 育种选育档案对象 sheep_breeding
 * 
 * @author 孙少聪
 * @date 2022-03-30
 */
public class SheepBreeding extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 耳编号 */
    @Excel(name = "耳编号")
    private String eartagid;

    /** 母号 */
    @Excel(name = "母号")
    private String motherid;

    /** 父号 */
    @Excel(name = "父号")
    private String fatherid;

    /** 选育阶段 */
    @Excel(name = "选育阶段")
    private String breedingstage;

    /** 毛色 */
    @Excel(name = "毛色")
    private String colour;

    /** 体重 */
    @Excel(name = "体重")
    private String gweight;

    /** 体长 */
    @Excel(name = "体长")
    private String bodylength;

    /** 体高 */
    @Excel(name = "体高")
    private String bodyheight;

    /** 胸围 */
    @Excel(name = "胸围")
    private String bodybust;

    /** 腕高 */
    @Excel(name = "腕高")
    private String wristheight;

    /** 视频 */
    @Excel(name = "视频")
    private String video;

    /** 选育时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "选育时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date breedingdate;

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
    public void setBreedingstage(String breedingstage) 
    {
        this.breedingstage = breedingstage;
    }

    public String getBreedingstage() 
    {
        return breedingstage;
    }
    public void setColour(String colour) 
    {
        this.colour = colour;
    }

    public String getColour() 
    {
        return colour;
    }
    public void setGweight(String gweight) 
    {
        this.gweight = gweight;
    }

    public String getGweight() 
    {
        return gweight;
    }
    public void setBodylength(String bodylength) 
    {
        this.bodylength = bodylength;
    }

    public String getBodylength() 
    {
        return bodylength;
    }
    public void setBodyheight(String bodyheight) 
    {
        this.bodyheight = bodyheight;
    }

    public String getBodyheight() 
    {
        return bodyheight;
    }
    public void setBodybust(String bodybust) 
    {
        this.bodybust = bodybust;
    }

    public String getBodybust() 
    {
        return bodybust;
    }
    public void setWristheight(String wristheight) 
    {
        this.wristheight = wristheight;
    }

    public String getWristheight() 
    {
        return wristheight;
    }
    public void setVideo(String video) 
    {
        this.video = video;
    }

    public String getVideo() 
    {
        return video;
    }
    public void setBreedingdate(Date breedingdate) 
    {
        this.breedingdate = breedingdate;
    }

    public Date getBreedingdate() 
    {
        return breedingdate;
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
            .append("eartagid", getEartagid())
            .append("motherid", getMotherid())
            .append("fatherid", getFatherid())
            .append("breedingstage", getBreedingstage())
            .append("colour", getColour())
            .append("gweight", getGweight())
            .append("bodylength", getBodylength())
            .append("bodyheight", getBodyheight())
            .append("bodybust", getBodybust())
            .append("wristheight", getWristheight())
            .append("video", getVideo())
            .append("breedingdate", getBreedingdate())
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
