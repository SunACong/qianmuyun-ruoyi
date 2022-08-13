package com.ruoyi.test.mapper;

import java.util.List;

import com.ruoyi.test.domain.MyTest;
import org.apache.ibatis.annotations.Param;

/**
 * 黔牧云登录测试Mapper接口
 *
 * @author 孙少聪
 * @date 2022-04-01
 */
public interface MyTestMapper
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
     * 删除黔牧云登录测试
     *
     * @param id 黔牧云登录测试主键
     * @return 结果
     */
    public int deleteMyTestById(Long id);

    /**
     * 批量删除黔牧云登录测试
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMyTestByIds(Long[] ids);
}
