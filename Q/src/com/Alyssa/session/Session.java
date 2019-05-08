package com.Alyssa.session;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Session {
	public static SqlSession getSession() throws IOException {
		 String resource = "Mybatis-config.xml";
	     InputStream is = Resources.getResourceAsStream(resource);
	     //构建sqlSession的工厂
	     SqlSessionFactory sqlSessionFactory= new SqlSessionFactoryBuilder().build(is);
	     //创建能执行映射文件中sql的sqlSession
	     SqlSession session = sqlSessionFactory.openSession();
         return session;
	}
}
