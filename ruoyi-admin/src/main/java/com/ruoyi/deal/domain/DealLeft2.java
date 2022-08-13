package com.ruoyi.deal.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 左 2对象 deal_left_2
 * 
 * @author 孙少聪
 * @date 2022-03-30
 */
public class DealLeft2 extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 白山羊 */
    @Excel(name = "白山羊")
    private Long whitegoat;

    /** 杜柏羊 */
    @Excel(name = "杜柏羊")
    private Long dubaisheep;

    /** 黑山羊 */
    @Excel(name = "黑山羊")
    private Long blackgoat;

    /** 波尔 */
    @Excel(name = "波尔")
    private Long boersheep;

    /** 努比亚 */
    @Excel(name = "努比亚")
    private Long nubiansheep;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setWhitegoat(Long whitegoat) 
    {
        this.whitegoat = whitegoat;
    }

    public Long getWhitegoat() 
    {
        return whitegoat;
    }
    public void setDubaisheep(Long dubaisheep) 
    {
        this.dubaisheep = dubaisheep;
    }

    public Long getDubaisheep() 
    {
        return dubaisheep;
    }
    public void setBlackgoat(Long blackgoat) 
    {
        this.blackgoat = blackgoat;
    }

    public Long getBlackgoat() 
    {
        return blackgoat;
    }
    public void setBoersheep(Long boersheep) 
    {
        this.boersheep = boersheep;
    }

    public Long getBoersheep() 
    {
        return boersheep;
    }
    public void setNubiansheep(Long nubiansheep) 
    {
        this.nubiansheep = nubiansheep;
    }

    public Long getNubiansheep() 
    {
        return nubiansheep;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("whitegoat", getWhitegoat())
            .append("dubaisheep", getDubaisheep())
            .append("blackgoat", getBlackgoat())
            .append("boersheep", getBoersheep())
            .append("nubiansheep", getNubiansheep())
            .toString();
    }
}
