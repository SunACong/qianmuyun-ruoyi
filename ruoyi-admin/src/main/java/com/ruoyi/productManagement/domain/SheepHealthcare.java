package com.ruoyi.productManagement.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 保健档案对象 sheep_healthcare
 * 
 * @author 孙少聪
 * @date 2022-06-09
 */
public class SheepHealthcare extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 保健时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "保健时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date healthdate;

    /** 场区 */
    @Excel(name = "场区")
    private String region;

    /** 栋号 */
    @Excel(name = "栋号")
    private String buildingnum;

    /** 栏号 */
    @Excel(name = "栏号")
    private String columnnum;

    /** 耳编号 */
    @Excel(name = "耳编号")
    private String eartagid;

    /** 数量 */
    @Excel(name = "数量")
    private String amount;

    /** 平均体重 */
    @Excel(name = "平均体重")
    private String weight;

    /** 阶段 */
    @Excel(name = "阶段")
    private String stage;

    /** 保健药名称 */
    @Excel(name = "保健药名称")
    private String name;

    /** 投喂方式 */
    @Excel(name = "投喂方式")
    private String method;

    /** 剂量 */
    @Excel(name = "剂量")
    private String dose;

    /** 总投喂量(kg) */
    @Excel(name = "总投喂量(kg)")
    private String volume;

    /** 投喂疗程(天) */
    @Excel(name = "投喂疗程(天)")
    private String period;

    /** 查询开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "查询开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startdate;

    /** 查询截止时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "查询截止时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date enddate;

    /** 视频 */
    @Excel(name = "视频")
    private String video;

    /** 备注信息 */
    @Excel(name = "备注信息")
    private String remarks;

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
    public void setHealthdate(Date healthdate) 
    {
        this.healthdate = healthdate;
    }

    public Date getHealthdate() 
    {
        return healthdate;
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
    public void setAmount(String amount) 
    {
        this.amount = amount;
    }

    public String getAmount() 
    {
        return amount;
    }
    public void setWeight(String weight) 
    {
        this.weight = weight;
    }

    public String getWeight() 
    {
        return weight;
    }
    public void setStage(String stage) 
    {
        this.stage = stage;
    }

    public String getStage() 
    {
        return stage;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
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
    public void setVolume(String volume) 
    {
        this.volume = volume;
    }

    public String getVolume() 
    {
        return volume;
    }
    public void setPeriod(String period) 
    {
        this.period = period;
    }

    public String getPeriod() 
    {
        return period;
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
    public void setVideo(String video) 
    {
        this.video = video;
    }

    public String getVideo() 
    {
        return video;
    }
    public void setRemarks(String remarks) 
    {
        this.remarks = remarks;
    }

    public String getRemarks() 
    {
        return remarks;
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
            .append("healthdate", getHealthdate())
            .append("region", getRegion())
            .append("buildingnum", getBuildingnum())
            .append("columnnum", getColumnnum())
            .append("eartagid", getEartagid())
            .append("amount", getAmount())
            .append("weight", getWeight())
            .append("stage", getStage())
            .append("name", getName())
            .append("method", getMethod())
            .append("dose", getDose())
            .append("volume", getVolume())
            .append("period", getPeriod())
            .append("startdate", getStartdate())
            .append("enddate", getEnddate())
            .append("video", getVideo())
            .append("remarks", getRemarks())
            .append("bak1", getBak1())
            .append("bak2", getBak2())
            .append("bak3", getBak3())
            .append("createBy", getCreateBy())
            .append("createDate", getCreateDate())
            .append("updateBy", getUpdateBy())
            .append("updateDate", getUpdateDate())
            .append("delFlag", getDelFlag())
            .toString();
    }
}
