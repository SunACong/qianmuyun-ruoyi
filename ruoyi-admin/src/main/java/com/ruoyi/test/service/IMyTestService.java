package com.ruoyi.test.service;

import java.util.List;

import com.ruoyi.test.domain.MyTest;

/**
 * 黔牧云登录测试Service接口
 *
 * @author 孙少聪
 * @date 2022-04-01
 */
public interface IMyTestService
{
    /**
     * 查询黔牧云登录测试
     *
     * @param id 黔牧云登录测试主键
     * @return 黔牧云登录测试
     */
    public MyTest selectMyTestById(Long id);

    /**
     * 查询黔牧云登录测试列表
     *
     * @param myTest 黔牧云登录测试
     * @return 黔牧云登录测试集合
     */
    public List<MyTest> selectMyTestList(MyTest myTest);

    /**
     * 新增黔牧云登录测试
     *
     * @param myTest 黔牧云登录测试
     * @return 结果
     */
    public int insertMyTest(MyTest myTest);

    /**
     * 修改黔牧云登录测试
     *
     * @param myTest 黔牧云登录测试
     * @return 结果
     */
    public int updateMyTest(MyTest myTest);

    /**
     * 批量删除黔牧云登录测试
     *
     * @param ids 需要删除的黔牧云登录测试主键集合
     * @return 结果
     */
    public int deleteMyTestByIds(Long[] ids);

    /**
     * 删除黔牧云登录测试信息
     *
     * @param id 黔牧云登录测试主键
     * @return 结果
     */
    public int deleteMyTestById(Long id);
}
