package org.open.config;

import org.open.configuration.Configuration;

/**
 * @author 任传君
 * @create 2018-09-28 17:39
 **/
public class SystemConfig {

    //Redis数据库索引（默认为0）
    public Integer REDIS_DATABASE = Integer.valueOf(Configuration.getConfiguration().getSystemConfig("redis.database"));

    //Redis服务器地址
    public String REDIS_HOST = Configuration.getConfiguration().getSystemConfig("redis.host");

    //Redis服务器连接端口
    public Integer REDIS_POTR = Integer.valueOf(Configuration.getConfiguration().getSystemConfig("redis.port"));

    //Redis服务器连接密码（默认为空）
    public String REDIS_PASSWORD = Configuration.getConfiguration().getSystemConfig("redis.password");

    //连接池最大连接数（使用负值表示没有限制）
    public Integer REDIS_MAXACTIVE = Integer.valueOf(Configuration.getConfiguration().getSystemConfig("redis.maxActive"));

    //连接池最大阻塞等待时间（使用负值表示没有限制）
    public Integer REDIS_MAXWAIT = Integer.valueOf(Configuration.getConfiguration().getSystemConfig("redis.maxWait"));

    //连接池中的最大空闲连接
    public Integer REDIS_MAXIDLE = Integer.valueOf(Configuration.getConfiguration().getSystemConfig("redis.maxIdle"));

    //连接池中的最小空闲连接
    public Integer REDIS_MINIDLE = Integer.valueOf(Configuration.getConfiguration().getSystemConfig("redis.minIdle"));

    //连接超时时间（毫秒）
    public Integer REDIS_TIMEOUT = Integer.valueOf(Configuration.getConfiguration().getSystemConfig("redis.timeOut"));

}
