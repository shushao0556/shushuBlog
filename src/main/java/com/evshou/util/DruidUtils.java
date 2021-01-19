package com.evshou.util;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.osgi.service.jdbc.DataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.util.Properties;

public class DruidUtils {
    private static DruidDataSource dataSource;
    static{
        Properties pro=new Properties();
        try{
            pro.load(DruidUtils.class.getClassLoader().getResourceAsStream("database.properties"));
            dataSource= (DruidDataSource) DruidDataSourceFactory.createDataSource(pro);
        }catch (Exception e){}
    }
    public static DruidDataSource getDataSource(){
        return dataSource;
    }
}
