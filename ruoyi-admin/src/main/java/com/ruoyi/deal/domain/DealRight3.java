package com.ruoyi.deal.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 右 3对象 deal_right_3
 * 
 * @author 孙少聪
 * @date 2022-03-30
 */
public class DealRight3 extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID无意义 */
    private Long id;

    /** 种类 */
    @Excel(name = "种类")
    private String sheeptype;

    /** 检疫合格数 */
    @Excel(name = "检疫合格数")
    private Long pass;

    /** 检疫未通过数 */
    @Excel(name = "检疫未通过数")
    private Long nopass;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setSheeptype(String sheeptype) 
    {
        this.sheeptype = sheeptype;
    }

    public String getSheeptype() 
    {
        return sheeptype;
    }
    public void setPass(Long pass) 
    {
        this.pass = pass;
    }

    public Long getPass() 
    {
        return pass;
    }
    public void setNopass(Long nopass) 
    {
        this.nopass = nopass;
    }

    public Long getNopass() 
    {
        return nopass;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("sheeptype", getSheeptype())
            .append("pass", getPass())
            .append("nopass", getNopass())
            .toString();
    }
}
