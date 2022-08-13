package com.ruoyi.deal.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 右 1对象 deal_right_1
 * 
 * @author 孙少聪
 * @date 2022-03-30
 */
public class DealRight1 extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID无意义 */
    private Long id;

    /** 疾病种类 */
    @Excel(name = "疾病种类")
    private String diseasetype;

    /** 疾病等级 */
    @Excel(name = "疾病等级")
    private String grade;

    /** 发病位置 */
    @Excel(name = "发病位置")
    private String address;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setDiseasetype(String diseasetype) 
    {
        this.diseasetype = diseasetype;
    }

    public String getDiseasetype() 
    {
        return diseasetype;
    }
    public void setGrade(String grade) 
    {
        this.grade = grade;
    }

    public String getGrade() 
    {
        return grade;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("diseasetype", getDiseasetype())
            .append("grade", getGrade())
            .append("address", getAddress())
            .toString();
    }
}
