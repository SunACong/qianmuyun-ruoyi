package com.ruoyi.videoManager.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 可视管理对象 t_video
 * 
 * @author 孙少聪
 * @date 2022-04-28
 */
public class TVideo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 区域 */
    @Excel(name = "区域")
    private String area;

    /** 栋舍 */
    @Excel(name = "栋舍")
    private String house;

    /** 设备序列号 */
    @Excel(name = "设备序列号")
    private String deviceserial;

    /** 通道 */
    @Excel(name = "通道")
    private String channelno;

    /** 设备名 */
    @Excel(name = "设备名")
    private String equipmentname;

    /** 状态 */
    @Excel(name = "状态")
    private String status;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setArea(String area) 
    {
        this.area = area;
    }

    public String getArea() 
    {
        return area;
    }
    public void setHouse(String house) 
    {
        this.house = house;
    }

    public String getHouse() 
    {
        return house;
    }
    public void setDeviceserial(String deviceserial) 
    {
        this.deviceserial = deviceserial;
    }

    public String getDeviceserial() 
    {
        return deviceserial;
    }
    public void setChannelno(String channelno) 
    {
        this.channelno = channelno;
    }

    public String getChannelno() 
    {
        return channelno;
    }
    public void setEquipmentname(String equipmentname) 
    {
        this.equipmentname = equipmentname;
    }

    public String getEquipmentname() 
    {
        return equipmentname;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("area", getArea())
            .append("house", getHouse())
            .append("deviceserial", getDeviceserial())
            .append("channelno", getChannelno())
            .append("equipmentname", getEquipmentname())
            .append("status", getStatus())
            .toString();
    }
}
