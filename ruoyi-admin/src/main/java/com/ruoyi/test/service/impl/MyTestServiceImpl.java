package com.ruoyi.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.test.mapper.MyTestMapper;
import com.ruoyi.test.domain.MyTest;
import com.ruoyi.test.service.IMyTestService;

/**
 * 黔牧云登录测试Service业务层处理
 *
 * @author 孙少聪
 * @date 2022-04-01
 */
@Service
public class MyTestServiceImpl implements IMyTestService
{
    @Autowired
    private MyTestMapper myTestMapper;

    /**
     * 查询黔牧云登录测试
     *
     * @param id 黔牧云登录测试主键
     * @return 黔牧云登录测试
     */
    @Override
    public MyTest selectMyTestById(Long id)
    {
        return myTestMapper.selectMyTestById(id);
    }

    /**
     * 查询黔牧云登录测试列表
     *
     * @param myTest 黔牧云登录测试
     * @return 黔牧云登录测试
     */
    @Override
    public List<MyTest> selectMyTestList(MyTest myTest)
    {
        return myTestMapper.selectMyTestList(myTest);
    }

    /**
     * 新增黔牧云登录测试
     *
     * @param myTest 黔牧云登录测试
     * @return 结果
     */
    @Override
    public int insertMyTest(MyTest myTest)
    {
        return myTestMapper.insertMyTest(myTest);
    }

    /**
     * 修改黔牧云登录测试
     *
     * @param myTest 黔牧云登录测试
     * @return 结果
     */
    @Override
    public int updateMyTest(MyTest myTest)
    {
        return myTestMapper.updateMyTest(myTest);
    }

    /**
     * 批量删除黔牧云登录测试
     *
     * @param ids 需要删除的黔牧云登录测试主键
     * @return 结果
     */
    @Override
    public int deleteMyTestByIds(Long[] ids)
    {
        return myTestMapper.deleteMyTestByIds(ids);
    }

    /**
     * 删除黔牧云登录测试信息
     *
     * @param id 黔牧云登录测试主键
     * @return 结果
     */
    @Override
    public int deleteMyTestById(Long id)
    {
        return myTestMapper.deleteMyTestById(id);
    }
}
