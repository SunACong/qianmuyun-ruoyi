package com.ruoyi.productManagement.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 免疫档案对象 sheep_immunization
 * 
 * @author 孙少聪
 * @date 2022-03-30
 */
public class SheepImmunization extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 接种时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "接种时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date inoculationdate;

    /** 单位 */
    @Excel(name = "单位")
    private String company;

    /** 免疫场区 */
    @Excel(name = "免疫场区")
    private String region;

    /** 免疫羊舍 */
    @Excel(name = "免疫羊舍")
    private String buildingnum;

    /** 免疫羊栏 */
    @Excel(name = "免疫羊栏")
    private String columnnum;

    /** 免疫耳编号 */
    @Excel(name = "免疫耳编号")
    private String eartagid;

    /** 疫苗 */
    @Excel(name = "疫苗")
    private String vaccine;

    /** 接种方法 */
    @Excel(name = "接种方法")
    private String method;

    /** 剂量 */
    @Excel(name = "剂量")
    private String dose;

    /** 免疫期 */
    @Excel(name = "免疫期")
    private String immunitydate;

    /** 未接种原因 */
    @Excel(name = "未接种原因")
    private String reason;

    /** 未接种耳编号 */
    @Excel(name = "未接种耳编号")
    private String nonimmunity;

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

    /** 备注信息 */
    @Excel(name = "备注信息")
    private String remarks;

    /** 视频 */
    @Excel(name = "视频")
    private String video;

    /** 创建时间 */
    private Date createDate;

    /** 更新时间 */
    private Date updateDate;

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
    public void setInoculationdate(Date inoculationdate) 
    {
        this.inoculationdate = inoculationdate;
    }

    public Date getInoculationdate() 
    {
        return inoculationdate;
    }
    public void setCompany(String company) 
    {
        this.company = company;
    }

    public String getCompany() 
    {
        return company;
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
    public void setEartagid(String eartagid) 
    {
        this.eartagid = eartagid;
    }

    public String getEartagid() 
    {
        return eartagid;
    }
    public void setVaccine(String vaccine) 
    {
        this.vaccine = vaccine;
    }

    public String getVaccine() 
    {
        return vaccine;
    }
    public void setMethod(String method) 
    {
        this.method = method;
    }

    public String getMethod() 
    {
        return method;
    }
    public void setDose(String dose) 
    {
        this.dose = dose;
    }

    public String getDose() 
    {
        return dose;
    }
    public void setImmunitydate(String immunitydate) 
    {
        this.immunitydate = immunitydate;
    }

    public String getImmunitydate() 
    {
        return immunitydate;
    }
    public void setReason(String reason) 
    {
        this.reason = reason;
    }

    public String getReason() 
    {
        return reason;
    }
    public void setNonimmunity(String nonimmunity) 
    {
        this.nonimmunity = nonimmunity;
    }

    public String getNonimmunity() 
    {
        return nonimmunity;
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
    public void setRemarks(String remarks) 
    {
        this.remarks = remarks;
    }

    public String getRemarks() 
    {
        return remarks;
    }
    public void setVideo(String video) 
    {
        this.video = video;
    }

    public String getVideo() 
    {
        return video;
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
            .append("inoculationdate", getInoculationdate())
            .append("company", getCompany())
            .append("region", getRegion())
            .append("buildingnum", getBuildingnum())
            .append("columnnum", getColumnnum())
            .append("eartagid", getEartagid())
            .append("vaccine", getVaccine())
            .append("method", getMethod())
            .append("dose", getDose())
            .append("immunitydate", getImmunitydate())
            .append("reason", getReason())
            .append("nonimmunity", getNonimmunity())
            .append("startdate", getStartdate())
            .append("enddate", getEnddate())
            .append("bak1", getBak1())
            .append("bak2", getBak2())
            .append("bak3", getBak3())
            .append("remarks", getRemarks())
            .append("video", getVideo())
            .append("createBy", getCreateBy())
            .append("createDate", getCreateDate())
            .append("updateBy", getUpdateBy())
            .append("updateDate", getUpdateDate())
            .append("delFlag", getDelFlag())
            .toString();
    }
}
