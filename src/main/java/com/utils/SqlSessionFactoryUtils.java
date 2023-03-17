package com.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class SqlSessionFactoryUtils {
    private static final SqlSessionFactory sqlSessionFactory;
    static {
        // static block will execute when the class load it execute once
        try {
            String resources = "mybatis-config.xml";
            InputStream stream = Resources.getResourceAsStream(resources);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(stream);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
    public static SqlSessionFactory getSqlSessionFactory(){
        return sqlSessionFactory;
    }
}
