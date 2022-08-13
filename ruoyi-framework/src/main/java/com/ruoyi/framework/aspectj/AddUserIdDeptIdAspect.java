package com.ruoyi.framework.aspectj;

import com.ruoyi.common.annotation.AddUserIdDeptId;
import com.ruoyi.common.core.domain.model.LoginUser;
import com.ruoyi.common.utils.SecurityUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;

/**
 * @ClassName addUserAndDeptAspect
 * @Description 添加切面类引入注解
 * @Authoc 孙少聪
 * @Date 2022/5/20 10:52:56
 */


@Aspect
@Component
public class AddUserIdDeptIdAspect {


    @Before("@annotation(addUserIdDeptId)")
    public void doBefore(JoinPoint point, AddUserIdDeptId addUserIdDeptId) {
        Object param = point.getArgs()[0];
        LoginUser loginUser = SecurityUtils.getLoginUser();
        System.out.println(loginUser);
        try {
            //获取object中的data属性
            Field userId = param.getClass().getDeclaredField("userId");
            userId.setAccessible(true);//设置data属性为可访问的
            userId.set(param, loginUser.getUserId());
            Field deptId = param.getClass().getDeclaredField("deptId");
            deptId.setAccessible(true);//设置data属性为可访问的
            deptId.set(param, loginUser.getDeptId());
            System.out.println(param);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
