package com.ruoyi.test.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 黔牧云登录测试对象 my_test
 * 
 * @author 孙少聪
 * @date 2022-04-01
 */
public class MyTest extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键无意义 */
    private Long id;

    /** 用户名 */
    @Excel(name = "用户名")
    private String username;

    /** 手机 */
    @Excel(name = "手机")
    private String phonenum;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setUsername(String username) 
    {
        this.username = username;
    }

    public String getUsername() 
    {
        return username;
    }
    public void setPhonenum(String phonenum) 
    {
        this.phonenum = phonenum;
    }

    public String getPhonenum() 
    {
        return phonenum;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("username", getUsername())
            .append("phonenum", getPhonenum())
            .toString();
    }
}
