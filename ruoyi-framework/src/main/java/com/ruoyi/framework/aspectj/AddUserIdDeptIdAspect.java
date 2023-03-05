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
        System.out.println("loginUser信息："+loginUser.getUser().getUserId());
        try {
            //获取object中的data属性
            Field userId = param.getClass().getSuperclass().getDeclaredField("userId");
            userId.setAccessible(true);
            userId.set(param, loginUser.getUser().getUserId());
            Field deptId = param.getClass().getSuperclass().getDeclaredField("deptId");
            deptId.setAccessible(true);
            deptId.set(param, loginUser.getUser().getDeptId());
            System.out.println("param信息是这么个意思："+param);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
