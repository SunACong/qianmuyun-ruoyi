package com.ruoyi.qmy.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 完成率对象 qmy_mid
 * 
 * @author 孙少聪
 * @date 2022-04-06
 */
public class QmyMid extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID无意义 */
    private Long id;

    /** 序号 */
    @Excel(name = "序号")
    private Long number;

    /** 优秀 */
    @Excel(name = "优秀")
    private Long excellent;

    /** 良好 */
    @Excel(name = "良好")
    private Long good;

    /** 差 */
    @Excel(name = "差")
    private Long poor;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setNumber(Long number) 
    {
        this.number = number;
    }

    public Long getNumber() 
    {
        return number;
    }
    public void setExcellent(Long excellent) 
    {
        this.excellent = excellent;
    }

    public Long getExcellent() 
    {
        return excellent;
    }
    public void setGood(Long good) 
    {
        this.good = good;
    }

    public Long getGood() 
    {
        return good;
    }
    public void setPoor(Long poor) 
    {
        this.poor = poor;
    }

    public Long getPoor() 
    {
        return poor;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("number", getNumber())
            .append("excellent", getExcellent())
            .append("good", getGood())
            .append("poor", getPoor())
            .toString();
    }
}
