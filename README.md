# SpringBootQuartz
## 任务调度

> quartz.properties 集群配置

```yaml
# 固定前缀org.quartz
# 主要分为scheduler、threadPool、jobStore、dataSource等部分

#==============================================================
#Configure Main Scheduler Properties
#==============================================================
org.quartz.scheduler.instanceName = DefaultQuartzScheduler
#集群模式
#org.quartz.scheduler.instanceId = AUTO
org.quartz.scheduler.rmi.export = false
org.quartz.scheduler.rmi.proxy = false 
org.quartz.scheduler.wrapJobExecutionInUserTransaction = false


#==============================================================
#Configure ThreadPool
#==============================================================
# 实例化ThreadPool时，使用的线程类为SimpleThreadPool
org.quartz.threadPool.class = org.quartz.simpl.SimpleThreadPool
# threadCount和threadPriority将以setter的形式注入ThreadPool实例
# 并发个数
org.quartz.threadPool.threadCount = 5
# 优先级
org.quartz.threadPool.threadPriority = 5
org.quartz.threadPool.threadsInheritContextClassLoaderOfInitializingThread = true


#==============================================================
#Configure JobStore
#==============================================================
org.quartz.jobStore.misfireThreshold = 5000
# 默认存储在内存中
#org.quartz.jobStore.class = org.quartz.simpl.RAMJobStore
#持久化
org.quartz.jobStore.class = org.quartz.impl.jdbcjobstore.JobStoreTX
org.quartz.jobStore.tablePrefix = QRTZ_
org.quartz.jobStore.dataSource = qzDS
#集群模式
#org.quartz.jobStore.isClustered = true
#org.quartz.jobStore.clusterCheckinInterval = 10000

#==============================================================
#Configure DataSource
#==============================================================
org.quartz.dataSource.qzDS.driver = com.mysql.jdbc.Driver
org.quartz.dataSource.qzDS.URL = jdbc:mysql://localhost:3306/springboot_quartz_jdbc?useUnicode=true&characterEncoding=UTF-8
org.quartz.dataSource.qzDS.user = root
org.quartz.dataSource.qzDS.password = 
org.quartz.dataSource.qzDS.maxConnections = 10
```

