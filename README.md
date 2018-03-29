# nm-es
1、模块化拆分服务，便于分开维护
    es-common
    es-util
    是基础类，被引用

2、目录nm-es\es-web\src\main\resources 
    config.properties 数据库配置
    
    
3、 xyz.wongs.es.common.config.Global 下的
private static PropertiesLoader loader = new PropertiesLoader("config.properties"); 需要修改为自己的配置

4、config.properties  ###环境变量，pro-生产;test-测试
  env.type=test
  
 
5、es-workflow 用于工作流程模块服务的开发，最终可以对外提供服务
    


