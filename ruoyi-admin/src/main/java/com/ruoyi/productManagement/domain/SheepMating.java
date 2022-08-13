package com.ruoyi.productManagement.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 配种档案对象 sheep_mating
 * 
 * @author 孙少聪
 * @date 2022-03-30
 */
public class SheepMating extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 配种时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "配种时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date matingdate;

    /** 母羊编号 */
    @Excel(name = "母羊编号")
    private String femaleid;

    /** 公羊编号 */
    @Excel(name = "公羊编号")
    private String maleid;

    /** 近亲测定 */
    @Excel(name = "近亲测定")
    private String nrelation;

    /** 母羊场区 */
    @Excel(name = "母羊场区")
    private String region;

    /** 母羊栋号 */
    @Excel(name = "母羊栋号")
    private String buildingnum;

    /** 母羊栏号 */
    @Excel(name = "母羊栏号")
    private String columnnum;

    /** 孕检情况 */
    @Excel(name = "孕检情况")
    private String matingmode;

    /** 检查结果 */
    @Excel(name = "检查结果")
    private String birthmode;

    /** 流产原因 */
    @Excel(name = "流产原因")
    private String abortionreason;

    /** 羔羊场区 */
    @Excel(name = "羔羊场区")
    private String newregion;

    /** 羔羊栋号 */
    @Excel(name = "羔羊栋号")
    private String newbuilding;

    /** 羔羊栏号 */
    @Excel(name = "羔羊栏号")
    private String newcolumn;

    /** 配种方式 */
    @Excel(name = "配种方式")
    private String method;

    /** 生产时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "生产时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date birthdate;

    /** 产子数 */
    @Excel(name = "产子数")
    private String birthnum;

    /** 公羔数 */
    @Excel(name = "公羔数")
    private String birthmale;

    /** 母羔数 */
    @Excel(name = "母羔数")
    private String birthfemale;

    /** 胎次 */
    @Excel(name = "胎次")
    private String parity;

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

    /** 备注信息 */
    private String remarks;

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
    public void setMatingdate(Date matingdate) 
    {
        this.matingdate = matingdate;
    }

    public Date getMatingdate() 
    {
        return matingdate;
    }
    public void setFemaleid(String femaleid) 
    {
        this.femaleid = femaleid;
    }

    public String getFemaleid() 
    {
        return femaleid;
    }
    public void setMaleid(String maleid) 
    {
        this.maleid = maleid;
    }

    public String getMaleid() 
    {
        return maleid;
    }
    public void setNrelation(String nrelation) 
    {
        this.nrelation = nrelation;
    }

    public String getNrelation() 
    {
        return nrelation;
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
    public void setMatingmode(String matingmode) 
    {
        this.matingmode = matingmode;
    }

    public String getMatingmode() 
    {
        return matingmode;
    }
    public void setBirthmode(String birthmode) 
    {
        this.birthmode = birthmode;
    }

    public String getBirthmode() 
    {
        return birthmode;
    }
    public void setAbortionreason(String abortionreason) 
    {
        this.abortionreason = abortionreason;
    }

    public String getAbortionreason() 
    {
        return abortionreason;
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
    public void setMethod(String method) 
    {
        this.method = method;
    }

    public String getMethod() 
    {
        return method;
    }
    public void setBirthdate(Date birthdate) 
    {
        this.birthdate = birthdate;
    }

    public Date getBirthdate() 
    {
        return birthdate;
    }
    public void setBirthnum(String birthnum) 
    {
        this.birthnum = birthnum;
    }

    public String getBirthnum() 
    {
        return birthnum;
    }
    public void setBirthmale(String birthmale) 
    {
        this.birthmale = birthmale;
    }

    public String getBirthmale() 
    {
        return birthmale;
    }
    public void setBirthfemale(String birthfemale) 
    {
        this.birthfemale = birthfemale;
    }

    public String getBirthfemale() 
    {
        return birthfemale;
    }
    public void setParity(String parity) 
    {
        this.parity = parity;
    }

    public String getParity() 
    {
        return parity;
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
    public void setRemarks(String remarks) 
    {
        this.remarks = remarks;
    }

    public String getRemarks() 
    {
        return remarks;
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
            .append("matingdate", getMatingdate())
            .append("femaleid", getFemaleid())
            .append("maleid", getMaleid())
            .append("nrelation", getNrelation())
            .append("region", getRegion())
            .append("buildingnum", getBuildingnum())
            .append("columnnum", getColumnnum())
            .append("matingmode", getMatingmode())
            .append("birthmode", getBirthmode())
            .append("abortionreason", getAbortionreason())
            .append("newregion", getNewregion())
            .append("newbuilding", getNewbuilding())
            .append("newcolumn", getNewcolumn())
            .append("method", getMethod())
            .append("birthdate", getBirthdate())
            .append("birthnum", getBirthnum())
            .append("birthmale", getBirthmale())
            .append("birthfemale", getBirthfemale())
            .append("parity", getParity())
            .append("bak1", getBak1())
            .append("bak2", getBak2())
            .append("bak3", getBak3())
            .append("createBy", getCreateBy())
            .append("createDate", getCreateDate())
            .append("remarks", getRemarks())
            .append("updateBy", getUpdateBy())
            .append("updateDate", getUpdateDate())
            .append("delFlag", getDelFlag())
            .toString();
    }
}
