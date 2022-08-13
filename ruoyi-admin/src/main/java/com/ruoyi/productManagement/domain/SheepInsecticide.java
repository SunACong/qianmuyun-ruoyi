package com.ruoyi.productManagement.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 驱虫档案对象 sheep_insecticide
 * 
 * @author 孙少聪
 * @date 2022-03-30
 */
public class SheepInsecticide extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 驱虫时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "驱虫时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date insecttime;

    /** 驱虫场区 */
    @Excel(name = "驱虫场区")
    private String region;

    /** 驱虫羊舍 */
    @Excel(name = "驱虫羊舍")
    private String buildingnum;

    /** 驱虫羊栏 */
    @Excel(name = "驱虫羊栏")
    private String columnnum;

    /** 驱虫耳编号 */
    @Excel(name = "驱虫耳编号")
    private String eartagid;

    /** 驱虫药名称 */
    @Excel(name = "驱虫药名称")
    private String pesticide;

    /** 使用方法 */
    @Excel(name = "使用方法")
    private String method;

    /** 剂量 */
    @Excel(name = "剂量")
    private String dose;

    /** 未驱虫耳编号 */
    @Excel(name = "未驱虫耳编号")
    private String nonpesticideid;

    /** 未驱虫原因 */
    @Excel(name = "未驱虫原因")
    private String reason;

    /** 视频 */
    @Excel(name = "视频")
    private String video;

    /** 查询开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "查询开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startdate;

    /** 查询结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "查询结束时间", width = 30, dateFormat = "yyyy-MM-dd")
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

    /** 更新时间 */
    private Date updateDate;

    /** 备注信息 */
    private String remarks;

    /** 逻辑删除标记（0：显示；1：隐藏） */
    private String delFlag;

    /** 创建时间 */
    private Date createDate;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setInsecttime(Date insecttime) 
    {
        this.insecttime = insecttime;
    }

    public Date getInsecttime() 
    {
        return insecttime;
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
    public void setPesticide(String pesticide) 
    {
        this.pesticide = pesticide;
    }

    public String getPesticide() 
    {
        return pesticide;
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
    public void setNonpesticideid(String nonpesticideid) 
    {
        this.nonpesticideid = nonpesticideid;
    }

    public String getNonpesticideid() 
    {
        return nonpesticideid;
    }
    public void setReason(String reason) 
    {
        this.reason = reason;
    }

    public String getReason() 
    {
        return reason;
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
    public void setCreateDate(Date createDate) 
    {
        this.createDate = createDate;
    }

    public Date getCreateDate() 
    {
        return createDate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("insecttime", getInsecttime())
            .append("region", getRegion())
            .append("buildingnum", getBuildingnum())
            .append("columnnum", getColumnnum())
            .append("eartagid", getEartagid())
            .append("pesticide", getPesticide())
            .append("method", getMethod())
            .append("dose", getDose())
            .append("nonpesticideid", getNonpesticideid())
            .append("reason", getReason())
            .append("video", getVideo())
            .append("startdate", getStartdate())
            .append("enddate", getEnddate())
            .append("bak1", getBak1())
            .append("bak2", getBak2())
            .append("bak3", getBak3())
            .append("createBy", getCreateBy())
            .append("updateBy", getUpdateBy())
            .append("updateDate", getUpdateDate())
            .append("remarks", getRemarks())
            .append("delFlag", getDelFlag())
            .append("createDate", getCreateDate())
            .toString();
    }
}
