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
	     //����sqlSession�Ĺ���
	     SqlSessionFactory sqlSessionFactory= new SqlSessionFactoryBuilder().build(is);
	     //������ִ��ӳ���ļ���sql��sqlSession
	     SqlSession session = sqlSessionFactory.openSession();
         return session;
	}
}
