# DruidTest
Druid连接池应用
1.关于Druid：
  Druid是阿里巴巴发布的比较优秀的数据库连接池，为监控而生。
2.项目说明
  在Tomcat上面配置Druid连接池的网上的方法太多，太杂，并且很多是不能运行的，本项目是可以用的。
  版本说明：
    Tomcat：6.0
    jdk：1.6
    关于版本说明，我之前尝试tomcat8.5+jdk1.6不能运行，所以版本应该有影响。
3.简单步骤
  1.配置tomcat下conf中的server.xml中的<Resource>
  2.导入jdbc包
  3.在META-INF中配置Context.xml
  4.配置web.xml
