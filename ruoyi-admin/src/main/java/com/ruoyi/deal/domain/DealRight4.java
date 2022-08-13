package com.ruoyi.deal.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 右 4对象 deal_right_4
 * 
 * @author 孙少聪
 * @date 2022-03-30
 */
public class DealRight4 extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID无意义 */
    private Long id;

    /** 类型 */
    @Excel(name = "类型")
    private String datatype;

    /** 数量 */
    @Excel(name = "数量")
    private Long number;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setDatatype(String datatype) 
    {
        this.datatype = datatype;
    }

    public String getDatatype() 
    {
        return datatype;
    }
    public void setNumber(Long number) 
    {
        this.number = number;
    }

    public Long getNumber() 
    {
        return number;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("datatype", getDatatype())
            .append("number", getNumber())
            .toString();
    }
}
