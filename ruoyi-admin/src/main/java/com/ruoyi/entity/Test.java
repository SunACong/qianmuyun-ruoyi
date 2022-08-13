package com.ruoyi.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.IsAutoIncrement;
import com.gitee.sunchenbin.mybatis.actable.annotation.IsKey;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.ruoyi.common.core.domain.MyBase;

//@Table(name = "role",isSimple = true)
public class Test extends MyBase {

    @IsKey
    @IsAutoIncrement
    private Integer	id;

    private String	name;

    private String	type;

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

