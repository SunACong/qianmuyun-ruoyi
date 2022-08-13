package com.ruoyi.productManagement.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 疾病防治对象 sheep_diseasecontrol
 * 
 * @author 孙少聪
 * @date 2022-03-30
 */
public class SheepDiseasecontrol extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 检查时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "检查时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date checkdate;

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

    /** 症状 */
    @Excel(name = "症状")
    private String symptom;

    /** 诊断结果 */
    @Excel(name = "诊断结果")
    private String diagnosticresults;

    /** 处方 */
    @Excel(name = "处方")
    private String prescription;

    /** 用药量 */
    @Excel(name = "用药量")
    private String dose;

    /** 用药方法 */
    @Excel(name = "用药方法")
    private String method;

    /** 治疗疗程 */
    @Excel(name = "治疗疗程")
    private String course;

    /** 治疗情况 */
    @Excel(name = "治疗情况")
    private String treatment;

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
    public void setCheckdate(Date checkdate) 
    {
        this.checkdate = checkdate;
    }

    public Date getCheckdate() 
    {
        return checkdate;
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
    public void setSymptom(String symptom) 
    {
        this.symptom = symptom;
    }

    public String getSymptom() 
    {
        return symptom;
    }
    public void setDiagnosticresults(String diagnosticresults) 
    {
        this.diagnosticresults = diagnosticresults;
    }

    public String getDiagnosticresults() 
    {
        return diagnosticresults;
    }
    public void setPrescription(String prescription) 
    {
        this.prescription = prescription;
    }

    public String getPrescription() 
    {
        return prescription;
    }
    public void setDose(String dose) 
    {
        this.dose = dose;
    }

    public String getDose() 
    {
        return dose;
    }
    public void setMethod(String method) 
    {
        this.method = method;
    }

    public String getMethod() 
    {
        return method;
    }
    public void setCourse(String course) 
    {
        this.course = course;
    }

    public String getCourse() 
    {
        return course;
    }
    public void setTreatment(String treatment) 
    {
        this.treatment = treatment;
    }

    public String getTreatment() 
    {
        return treatment;
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
            .append("checkdate", getCheckdate())
            .append("eartagid", getEartagid())
            .append("region", getRegion())
            .append("buildingnum", getBuildingnum())
            .append("columnnum", getColumnnum())
            .append("symptom", getSymptom())
            .append("diagnosticresults", getDiagnosticresults())
            .append("prescription", getPrescription())
            .append("dose", getDose())
            .append("method", getMethod())
            .append("course", getCourse())
            .append("treatment", getTreatment())
            .append("video", getVideo())
            .append("startdate", getStartdate())
            .append("enddate", getEnddate())
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
