package com.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

public abstract class SessionFactory {
	private static Logger logger = Logger.getLogger(SessionFactory.class);
	// static String resource = "SqlMapConfig.xml";
	private final static String MYBATIS_CONFIG = "SqlMapConfig.xml";
	public final static String AMDB_ENVIRONMENT_ID = "development";

	public static SqlSessionFactory getSessionFactory() {
		InputStream inputStream = null;
		SqlSessionFactory sqlSessionFactory = null;
		try {
			inputStream = Resources.getResourceAsStream(MYBATIS_CONFIG);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream, AMDB_ENVIRONMENT_ID);
			inputStream.close();
			logger.info("获取 [ " + AMDB_ENVIRONMENT_ID + " ] 数据源连接成功");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error("HttptestcaseSessionFactory_getSessionFactory_IOException 获取 [ " + AMDB_ENVIRONMENT_ID
					+ " ] 数据源连接失败，错误信息 ：", e);
		}
		return sqlSessionFactory;
	}

}
