package com.ruoyi.qmy.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 疫病监测对象 qmy_right_2
 * 
 * @author 孙少聪
 * @date 2022-04-06
 */
public class QmyRight2 extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID无意义 */
    private Long id;

    /** 疾病种类 */
    @Excel(name = "疾病种类")
    private String type;

    /** 治愈 */
    @Excel(name = "治愈")
    private Long cure;

    /** 未治愈 */
    @Excel(name = "未治愈")
    private Long nocure;

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
    public void setCure(Long cure) 
    {
        this.cure = cure;
    }

    public Long getCure() 
    {
        return cure;
    }
    public void setNocure(Long nocure) 
    {
        this.nocure = nocure;
    }

    public Long getNocure() 
    {
        return nocure;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("type", getType())
            .append("cure", getCure())
            .append("nocure", getNocure())
            .toString();
    }
}
