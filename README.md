## marry_server - 服务端 spring boot + mybatis重构版本

### 项目介绍 
项目为重构marry-server项目。将开发架构改为了spring boot + mybatis开发模式。

#### 完成度
该版本为重构第一版，仅对代码结构进行了spring boot架构上的重构。具体逻辑基本保持了原服务的逻辑。
数据库表结构因个人工作时间问题，没有精力进行优化重构。

#### 可能出现的问题
1、重构项目采用maven管理。原项目中有一个jar包是原作者自己封装的，这次重构没有集成进来。
该jar包应用的逻辑是两处空值判断。不确定是否会出现问题。
2、因为业务逻辑未做大修改。所以没有进行认真系统的测试。可能会出现未想到的bug。欢迎各位找出bug并协助fix

#### 之后可能的重构方向
代码性能优化
代码可读性优化
数据库表结构优化

#### 项目运行说明
运行前先执行mvn clean package -Pdev编译。否则无法读取数据库连接信息。

#### 项目说明
 - 项目架构：spring boot 1.5.4.RELEASE + mybatis 1.3.2
 - 环境：jdk1.8.0_121
 - 数据库：数据库地址配置在pom.xml文件中的profile标签内。id标签为编译时指定的名字，  可根据不同环境编写多个连接信息编译切换。
 - 项目中引用的网络资源若有侵权，请通知及时删除。该小程序为个人开发，一切解释权归作者所有，图片禁止传播。
- 功能简介：
    - 新郎新娘图片展示
    - 婚礼现场导航
    - 点赞祝福，分享好友
    - 身份切换，制作属于自己的请柬


  
#### 个人说明

 - 目前是一名刚毕业的初级码农，代码以及逻辑方面还有很多不足之处，各位大佬，请多多指教。
 - QQ群：830556582
 - QQ邮箱：951319774@qq.com



#### 参与贡献
 建议使用gitFlow分支模型命名
   - feature/branchName
   - bugfix/branchName
   - release/branchName
   - hotfix/branchName




