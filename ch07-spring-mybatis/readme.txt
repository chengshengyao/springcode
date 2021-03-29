spring框架集成mybatis框架的步骤：
1.新建maven项目
2加入依赖项
    -druid数据库连接池
    -spring
    -mybatis
    -mysql驱动
    -spring事务驱动
    -spring与mybatis相集成的依赖【spring项目中创建sqlSessionFactory对象，dao对象】
    -Junit
3 创建实体类 [domain.Student] 描述数据库表模型
4 创建dao接口和sql映射文件 [此步骤是描述对数据库中表数据进行的操作描述]
5创建mybatis配置文件
6 创建Service接口[业务抽象方法进行描述]
  和其实现类Serviceimpl[实现业务方法]中引入属性是dao [将业务逻辑操作与持久层建立联系]
7创建spring配置文件/此处声明mybatis对象交给spring创建
    -数据源
    -sqlSessionFactory
    -dao
    -声明自定义的Service
8创建 测试类 获取Service对象，通过调用service调用dao完成对数据库的访问及其操作