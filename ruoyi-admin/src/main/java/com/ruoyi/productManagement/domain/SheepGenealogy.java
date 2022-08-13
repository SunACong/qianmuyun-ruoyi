package com.ruoyi.productManagement.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 系谱档案对象 sheep_genealogy
 * 
 * @author 孙少聪
 * @date 2022-03-30
 */
public class SheepGenealogy extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 耳标编号 */
    @Excel(name = "耳标编号")
    private String eartagid;

    /** 性别 */
    @Excel(name = "性别")
    private String sex;

    /** 养殖场 */
    @Excel(name = "养殖场")
    private String farmloc;

    /** 出生基地 */
    @Excel(name = "出生基地")
    private String bornloc;

    /** 场区 */
    @Excel(name = "场区")
    private String region;

    /** 栋号 */
    @Excel(name = "栋号")
    private String buildingnum;

    /** 栏号 */
    @Excel(name = "栏号")
    private String columnnum;

    /** 出生日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "出生日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date borntime;

    /** 出生重 */
    @Excel(name = "出生重")
    private String bornweight;

    /** 品种 */
    @Excel(name = "品种")
    private String breed;

    /** 毛色 */
    @Excel(name = "毛色")
    private String coatcolor;

    /** 母号 */
    @Excel(name = "母号")
    private String motherid;

    /** 父号 */
    @Excel(name = "父号")
    private String fatherid;

    /** 祖父号 */
    @Excel(name = "祖父号")
    private String grandfatherid;

    /** 祖母号 */
    @Excel(name = "祖母号")
    private String grandmotherid;

    /** 外祖父号 */
    @Excel(name = "外祖父号")
    private String grandpaid;

    /** 外祖母号 */
    @Excel(name = "外祖母号")
    private String grandmaid;

    /** 视频地址 */
    @Excel(name = "视频地址")
    private String video;

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
    public void setEartagid(String eartagid) 
    {
        this.eartagid = eartagid;
    }

    public String getEartagid() 
    {
        return eartagid;
    }
    public void setSex(String sex) 
    {
        this.sex = sex;
    }

    public String getSex() 
    {
        return sex;
    }
    public void setFarmloc(String farmloc) 
    {
        this.farmloc = farmloc;
    }

    public String getFarmloc() 
    {
        return farmloc;
    }
    public void setBornloc(String bornloc) 
    {
        this.bornloc = bornloc;
    }

    public String getBornloc() 
    {
        return bornloc;
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
    public void setBorntime(Date borntime) 
    {
        this.borntime = borntime;
    }

    public Date getBorntime() 
    {
        return borntime;
    }
    public void setBornweight(String bornweight) 
    {
        this.bornweight = bornweight;
    }

    public String getBornweight() 
    {
        return bornweight;
    }
    public void setBreed(String breed) 
    {
        this.breed = breed;
    }

    public String getBreed() 
    {
        return breed;
    }
    public void setCoatcolor(String coatcolor) 
    {
        this.coatcolor = coatcolor;
    }

    public String getCoatcolor() 
    {
        return coatcolor;
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
    public void setGrandfatherid(String grandfatherid) 
    {
        this.grandfatherid = grandfatherid;
    }

    public String getGrandfatherid() 
    {
        return grandfatherid;
    }
    public void setGrandmotherid(String grandmotherid) 
    {
        this.grandmotherid = grandmotherid;
    }

    public String getGrandmotherid() 
    {
        return grandmotherid;
    }
    public void setGrandpaid(String grandpaid) 
    {
        this.grandpaid = grandpaid;
    }

    public String getGrandpaid() 
    {
        return grandpaid;
    }
    public void setGrandmaid(String grandmaid) 
    {
        this.grandmaid = grandmaid;
    }

    public String getGrandmaid() 
    {
        return grandmaid;
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
            .append("eartagid", getEartagid())
            .append("sex", getSex())
            .append("farmloc", getFarmloc())
            .append("bornloc", getBornloc())
            .append("region", getRegion())
            .append("buildingnum", getBuildingnum())
            .append("columnnum", getColumnnum())
            .append("borntime", getBorntime())
            .append("bornweight", getBornweight())
            .append("breed", getBreed())
            .append("coatcolor", getCoatcolor())
            .append("motherid", getMotherid())
            .append("fatherid", getFatherid())
            .append("grandfatherid", getGrandfatherid())
            .append("grandmotherid", getGrandmotherid())
            .append("grandpaid", getGrandpaid())
            .append("grandmaid", getGrandmaid())
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
            .toString();
    }
}
