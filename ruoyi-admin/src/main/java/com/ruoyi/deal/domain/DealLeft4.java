package com.ruoyi.deal.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 左 4对象 deal_left_4
 * 
 * @author 孙少聪
 * @date 2022-03-30
 */
public class DealLeft4 extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID无意义 */
    private Long id;

    /** 月份&类型 */
    @Excel(name = "月份&类型")
    private String monthandtype;

    /** 新增 */
    @Excel(name = "新增")
    private Long newadd;

    /** 死亡 */
    @Excel(name = "死亡")
    private Long death;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setMonthandtype(String monthandtype) 
    {
        this.monthandtype = monthandtype;
    }

    public String getMonthandtype() 
    {
        return monthandtype;
    }
    public void setNewadd(Long newadd) 
    {
        this.newadd = newadd;
    }

    public Long getNewadd() 
    {
        return newadd;
    }
    public void setDeath(Long death) 
    {
        this.death = death;
    }

    public Long getDeath() 
    {
        return death;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("monthandtype", getMonthandtype())
            .append("newadd", getNewadd())
            .append("death", getDeath())
            .toString();
    }
}
