package com.ruoyi.qmy.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 销售统计对象 qmy_right_4_1
 * 
 * @author 孙少聪
 * @date 2022-04-06
 */
public class QmyRight41 extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID无意义 */
    private Long id;

    /** 类型 */
    @Excel(name = "类型")
    private String sheeptype;

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
    public void setSheeptype(String sheeptype) 
    {
        this.sheeptype = sheeptype;
    }

    public String getSheeptype() 
    {
        return sheeptype;
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
            .append("sheeptype", getSheeptype())
            .append("number", getNumber())
            .toString();
    }
}
