package com.ruoyi.deal.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 左 3对象 deal_left_3
 * 
 * @author 孙少聪
 * @date 2022-03-30
 */
public class DealLeft3 extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID无意义 */
    private Long id;

    /** 种公羊数量 */
    @Excel(name = "种公羊数量")
    private Long man;

    /** 种公羊总存栏 */
    @Excel(name = "种公羊总存栏")
    private Long mantotal;

    /** 种公羊可售出 */
    @Excel(name = "种公羊可售出")
    private Long mansale;

    /** 种母羊数量 */
    @Excel(name = "种母羊数量")
    private Long women;

    /** 种母羊总存栏 */
    @Excel(name = "种母羊总存栏")
    private Long womentotal;

    /** 种母羊可售出 */
    @Excel(name = "种母羊可售出")
    private Long womensale;

    /** 商品羊数量 */
    @Excel(name = "商品羊数量")
    private Long salesheep;

    /** 商品羊总存栏 */
    @Excel(name = "商品羊总存栏")
    private Long salesheeptotal;

    /** 商品羊可售出 */
    @Excel(name = "商品羊可售出")
    private Long salesheepsale;

    /** 出售量 */
    @Excel(name = "出售量")
    private Long ablesale;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setMan(Long man) 
    {
        this.man = man;
    }

    public Long getMan() 
    {
        return man;
    }
    public void setMantotal(Long mantotal) 
    {
        this.mantotal = mantotal;
    }

    public Long getMantotal() 
    {
        return mantotal;
    }
    public void setMansale(Long mansale) 
    {
        this.mansale = mansale;
    }

    public Long getMansale() 
    {
        return mansale;
    }
    public void setWomen(Long women) 
    {
        this.women = women;
    }

    public Long getWomen() 
    {
        return women;
    }
    public void setWomentotal(Long womentotal) 
    {
        this.womentotal = womentotal;
    }

    public Long getWomentotal() 
    {
        return womentotal;
    }
    public void setWomensale(Long womensale) 
    {
        this.womensale = womensale;
    }

    public Long getWomensale() 
    {
        return womensale;
    }
    public void setSalesheep(Long salesheep) 
    {
        this.salesheep = salesheep;
    }

    public Long getSalesheep() 
    {
        return salesheep;
    }
    public void setSalesheeptotal(Long salesheeptotal) 
    {
        this.salesheeptotal = salesheeptotal;
    }

    public Long getSalesheeptotal() 
    {
        return salesheeptotal;
    }
    public void setSalesheepsale(Long salesheepsale) 
    {
        this.salesheepsale = salesheepsale;
    }

    public Long getSalesheepsale() 
    {
        return salesheepsale;
    }
    public void setAblesale(Long ablesale) 
    {
        this.ablesale = ablesale;
    }

    public Long getAblesale() 
    {
        return ablesale;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("man", getMan())
            .append("mantotal", getMantotal())
            .append("mansale", getMansale())
            .append("women", getWomen())
            .append("womentotal", getWomentotal())
            .append("womensale", getWomensale())
            .append("salesheep", getSalesheep())
            .append("salesheeptotal", getSalesheeptotal())
            .append("salesheepsale", getSalesheepsale())
            .append("ablesale", getAblesale())
            .toString();
    }
}
