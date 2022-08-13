package com.ruoyi.qmy.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 存栏统计(一)对象 qmy_left_1
 * 
 * @author 孙少聪
 * @date 2022-04-06
 */
public class QmyLeft1 extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID无意义 */
    private Long id;

    /** 种类 */
    @Excel(name = "种类")
    private String sheeptype;

    /** 数量 */
    @Excel(name = "数量")
    private Long formatterdata;

    /** 不合格 */
    @Excel(name = "不合格")
    private Long value11;

    /** 合格 */
    @Excel(name = "合格")
    private Long value12;

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
    public void setFormatterdata(Long formatterdata) 
    {
        this.formatterdata = formatterdata;
    }

    public Long getFormatterdata() 
    {
        return formatterdata;
    }
    public void setValue11(Long value11) 
    {
        this.value11 = value11;
    }

    public Long getValue11() 
    {
        return value11;
    }
    public void setValue12(Long value12) 
    {
        this.value12 = value12;
    }

    public Long getValue12() 
    {
        return value12;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("sheeptype", getSheeptype())
            .append("formatterdata", getFormatterdata())
            .append("value11", getValue11())
            .append("value12", getValue12())
            .toString();
    }
}
