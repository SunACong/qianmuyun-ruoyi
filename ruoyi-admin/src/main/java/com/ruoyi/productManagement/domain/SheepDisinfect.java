package com.ruoyi.productManagement.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 消毒档案对象 sheep_disinfect
 * 
 * @author 孙少聪
 * @date 2022-03-30
 */
public class SheepDisinfect extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 消毒时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "消毒时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date disinfectdate;

    /** 消毒场所 */
    @Excel(name = "消毒场所")
    private String disinfectloc;

    /** 消毒场区 */
    @Excel(name = "消毒场区")
    private String disinfectregion;

    /** 消毒羊舍 */
    @Excel(name = "消毒羊舍")
    private String disinfectbuilding;

    /** 消毒药 */
    @Excel(name = "消毒药")
    private String disinfectmedicine;

    /** 消毒方法 */
    @Excel(name = "消毒方法")
    private String disinfectmethod;

    /** 剂量 */
    @Excel(name = "剂量")
    private String dose;

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
    public void setDisinfectdate(Date disinfectdate) 
    {
        this.disinfectdate = disinfectdate;
    }

    public Date getDisinfectdate() 
    {
        return disinfectdate;
    }
    public void setDisinfectloc(String disinfectloc) 
    {
        this.disinfectloc = disinfectloc;
    }

    public String getDisinfectloc() 
    {
        return disinfectloc;
    }
    public void setDisinfectregion(String disinfectregion) 
    {
        this.disinfectregion = disinfectregion;
    }

    public String getDisinfectregion() 
    {
        return disinfectregion;
    }
    public void setDisinfectbuilding(String disinfectbuilding) 
    {
        this.disinfectbuilding = disinfectbuilding;
    }

    public String getDisinfectbuilding() 
    {
        return disinfectbuilding;
    }
    public void setDisinfectmedicine(String disinfectmedicine) 
    {
        this.disinfectmedicine = disinfectmedicine;
    }

    public String getDisinfectmedicine() 
    {
        return disinfectmedicine;
    }
    public void setDisinfectmethod(String disinfectmethod) 
    {
        this.disinfectmethod = disinfectmethod;
    }

    public String getDisinfectmethod() 
    {
        return disinfectmethod;
    }
    public void setDose(String dose) 
    {
        this.dose = dose;
    }

    public String getDose() 
    {
        return dose;
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
            .append("disinfectdate", getDisinfectdate())
            .append("disinfectloc", getDisinfectloc())
            .append("disinfectregion", getDisinfectregion())
            .append("disinfectbuilding", getDisinfectbuilding())
            .append("disinfectmedicine", getDisinfectmedicine())
            .append("disinfectmethod", getDisinfectmethod())
            .append("dose", getDose())
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
