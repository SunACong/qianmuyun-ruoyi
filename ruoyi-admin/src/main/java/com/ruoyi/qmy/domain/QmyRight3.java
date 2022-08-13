package com.ruoyi.qmy.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 检疫检测对象 qmy_right_3
 * 
 * @author 孙少聪
 * @date 2022-04-06
 */
public class QmyRight3 extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID无意义 */
    private Long id;

    /** 疾病类型 */
    @Excel(name = "疾病类型")
    private String type;

    /** 合格率 */
    @Excel(name = "合格率")
    private Long number;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setType(String type) 
    {
        this.type = type;
    }

    public String getType() 
    {
        return type;
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
            .append("type", getType())
            .append("number", getNumber())
            .toString();
    }
}
