# 黔牧云——若依后台

## application.yml文件 修改自己的本地服务器的端口，redis信息(主要是密码配置)
```yml
# 开发环境配置
server:
  # 服务器的HTTP端口，默认为8080
  port: 8090
# Spring配置
spring:
  # redis 配置
  redis:
    # 地址
    host: localhost
    # 端口，默认为6379
    port: 6379
    # 数据库索引
    database: 0
    # 密码
#    password: 123456
    password:
```
## application-druid.yml文件 修改自己数据库配置信息
```yml
# 数据源配置
spring:
    datasource:
        type: com.alibaba.druid.pool.DruidDataSource
        driverClassName: com.mysql.cj.jdbc.Driver
        druid:
            # 主库数据源
            master:
                url: jdbc:mysql://localhost:3307/qmy_sheep?useUnicode=true&characterEncoding=utf8&zeroDateTimeBehavior=convertToNull&useSSL=true&serverTimezone=GMT%2B8
                username: root
                password: 123456
```
