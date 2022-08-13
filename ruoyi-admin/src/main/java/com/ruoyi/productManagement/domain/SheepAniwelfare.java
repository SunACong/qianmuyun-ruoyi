package com.ruoyi.productManagement.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 动物福利对象 sheep_aniwelfare
 *
 * @author 孙少聪
 * @date 2022-03-30
 */
public class SheepAniwelfare extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 用户Id */
    private Long userId;
    /** 部门Id */
    private Long deptId;

    /** 检查时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "检查时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date checkdate;

    /** 操作流程是否规范 */
    @Excel(name = "操作流程是否规范")
    private String operation;

    /** 饲料房卫生是否清洁 */
    @Excel(name = "饲料房卫生是否清洁")
    private String feedhouse;

    /** 灭鼠是否到位 */
    @Excel(name = "灭鼠是否到位")
    private String killrat;

    /** 羊舍通风采光是否良好 */
    @Excel(name = "羊舍通风采光是否良好")
    private String ventilation;

    /** 羊舍卫生是否清洁 */
    @Excel(name = "羊舍卫生是否清洁")
    private String goathouse;

    /** 环境卫生是否清洁 */
    @Excel(name = "环境卫生是否清洁")
    private String environment;

    /** 饲草饲料是否霉变 */
    @Excel(name = "饲草饲料是否霉变")
    private String forgegrass;

    /** 冬季防寒保暖是否到位 */
    @Excel(name = "冬季防寒保暖是否到位")
    private String coldproof;

    /** 灭蚊是否到位 */
    @Excel(name = "灭蚊是否到位")
    private String mosquitocontrol;

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
    public void setCheckdate(Date checkdate)
    {
        this.checkdate = checkdate;
    }

    public Date getCheckdate()
    {
        return checkdate;
    }
    public void setOperation(String operation)
    {
        this.operation = operation;
    }

    public String getOperation()
    {
        return operation;
    }
    public void setFeedhouse(String feedhouse)
    {
        this.feedhouse = feedhouse;
    }

    public String getFeedhouse()
    {
        return feedhouse;
    }
    public void setKillrat(String killrat)
    {
        this.killrat = killrat;
    }

    public String getKillrat()
    {
        return killrat;
    }
    public void setVentilation(String ventilation)
    {
        this.ventilation = ventilation;
    }

    public String getVentilation()
    {
        return ventilation;
    }
    public void setGoathouse(String goathouse)
    {
        this.goathouse = goathouse;
    }

    public String getGoathouse()
    {
        return goathouse;
    }
    public void setEnvironment(String environment)
    {
        this.environment = environment;
    }

    public String getEnvironment()
    {
        return environment;
    }
    public void setForgegrass(String forgegrass)
    {
        this.forgegrass = forgegrass;
    }

    public String getForgegrass()
    {
        return forgegrass;
    }
    public void setColdproof(String coldproof)
    {
        this.coldproof = coldproof;
    }

    public String getColdproof()
    {
        return coldproof;
    }
    public void setMosquitocontrol(String mosquitocontrol)
    {
        this.mosquitocontrol = mosquitocontrol;
    }

    public String getMosquitocontrol()
    {
        return mosquitocontrol;
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
    public Long getUserId() {
        return userId;
    }

    @Override
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public Long getDeptId() {
        return deptId;
    }

    @Override
    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    @Override
    public String toString() {
        return "SheepAniwelfare{" +
                "id=" + id +
                ", userId=" + userId +
                ", deptId=" + deptId +
                ", checkdate=" + checkdate +
                ", operation='" + operation + '\'' +
                ", feedhouse='" + feedhouse + '\'' +
                ", killrat='" + killrat + '\'' +
                ", ventilation='" + ventilation + '\'' +
                ", goathouse='" + goathouse + '\'' +
                ", environment='" + environment + '\'' +
                ", forgegrass='" + forgegrass + '\'' +
                ", coldproof='" + coldproof + '\'' +
                ", mosquitocontrol='" + mosquitocontrol + '\'' +
                ", video='" + video + '\'' +
                ", startdate=" + startdate +
                ", enddate=" + enddate +
                ", bak1='" + bak1 + '\'' +
                ", bak2='" + bak2 + '\'' +
                ", bak3='" + bak3 + '\'' +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                ", remarks='" + remarks + '\'' +
                ", delFlag='" + delFlag + '\'' +
                '}';
    }
}
