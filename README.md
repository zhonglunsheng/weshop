#### 项目介绍
基于Spring+SpringMvc+Mybatis系统架构，电商平台基础模块开发：用户管理、商品管理、购物车、订单管理、收获地址、在线支付
#### 组织结构
```
├── README.md                   // help
├── mmall
│   ├── common             // 公共包
│   |   ├── Const.java        // 常量
│   |   ├── ExceptionResolver // 全局异常
│   |   ├── RedisPool         // Jedis连接池
│   |   ├── RedisShardedPool  // ShardedJedis连接池
│   |   ├── ResponseCode      // 状态码
│   |   └── ServiceResponse   // 高复用响应
│   ├── controller              // 控制层
│   ├── backend                 // 后台接口
│   ├── common                  // 公共接口
│   └── portal                  // 门户接口
│   ├── dao                     // 数据访问
│   ├── pojo                    // 模型
│   ├── service                 // 业务
│   ├── task                    // 定时任务
│   ├── util                    // 工具类
│   └── vo                      // 表示层
├── resources                   
│   ├── beta                    // 测试环境
│   ├── dev                     // 开发环境
│   └── prod                    // 线上环境
├── tool
└── webapp
```

#### 技术选型
##### 后端技术

技术 | 名称 | 官网
---|---|---
Spring Framework | 容器 | 	http://projects.spring.io/spring-framework/
SpringMVC | MVC框架 | http://docs.spring.io/spring/docs/current/spring-framework-reference/htmlsingle/#mvc
Spring session | 分布式Session管理 | 	http://projects.spring.io/spring-session/
Spring Schedule | Spring 定时任务 | https://spring.io/guides/gs/scheduling-tasks/
MyBatis | ORM框架 | http://www.mybatis.org/mybatis-3/zh/index.html
MyBatis Generator | 代码生成 | http://www.mybatis.org/generator/index.html
PageHelper | MyBatis物理分页插件 | http://git.oschina.net/free/Mybatis_PageHelper
Redis | 分布式缓存数据库 | https://redis.io/
nginx | 负载均衡 | https://www.nginx.com/
tomcat | Java应用服务器 | http://tomcat.apache.org/
Redisson | Java驻内存数据网格 | https://redisson.org/
Logback | 日志组件 | https://logback.qos.ch/
Guava | 谷歌工具类 | https://github.com/google/guava
Joda-Time | 时间管理 | http://www.joda.org/joda-time/
Maven | 项目构建管理 | http://maven.apache.org/
Git | 分布式版本控制 | https://git-scm.com/


#### 架构图
![mark](http://upload.i20forever.cn/blog/180418/0j94JhCLiL.png?imageslim)

#### 项目部署
 - 安装git客户端，克隆项目

```
git clone https://github.com/zhonglunsheng/mmall.git
```
 - 修改配置文件 *datasource.properties mmall.properties zfbinfo.properties*

- maven打包

```
mvn clean package -Dmaven.skip.test=true -Pprod
```

 - 发布war包

#### 演示地址


#### 部分截图
