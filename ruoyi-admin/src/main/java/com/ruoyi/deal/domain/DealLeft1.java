package com.ruoyi.deal.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 左 1对象 deal_left_1
 *
 * @author 孙少聪
 * @date 2022-03-30
 */
public class DealLeft1 extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID 无意义 */
    private Long id;

    /** 星期 */
    @Excel(name = "星期")
    private String week;

    /** 总存栏 */
    @Excel(name = "总存栏")
    private Long total;

    /** 可售出 */
    @Excel(name = "可售出")
    private Long sale;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setWeek(String week)
    {
        this.week = week;
    }

    public String getWeek()
    {
        return week;
    }
    public void setTotal(Long total)
    {
        this.total = total;
    }

    public Long getTotal()
    {
        return total;
    }
    public void setSale(Long sale)
    {
        this.sale = sale;
    }

    public Long getSale()
    {
        return sale;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("week", getWeek())
            .append("total", getTotal())
            .append("sale", getSale())
            .toString();
    }
}
