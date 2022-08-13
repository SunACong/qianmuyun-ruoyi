package com.ruoyi.common.annotation;


import com.ruoyi.common.core.domain.model.LoginUser;
import com.ruoyi.common.utils.SecurityUtils;

import java.lang.annotation.*;


/**
 * 自动添加添加userId deptId
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented

public @interface AddUserIdDeptId {


}
