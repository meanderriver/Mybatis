package org.tl.mybatis.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.tl.mybatis.WordEntry;
import org.tl.mybatis.mapper.WordMapper;

import junit.framework.TestCase;

public class MybatisTest extends TestCase {
	@Test
	public void test() throws IOException {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession opensession = sqlSessionFactory.openSession();
		
		WordMapper mapper = opensession.getMapper(WordMapper.class);
		
		WordEntry wordEntry = mapper.getWordByWordName("integrate");
		
		System.out.println(wordEntry);
		System.out.println("This branch is hot_fixs");
	}
}
