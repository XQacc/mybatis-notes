package com.test.xq;

import java.io.IOException;
import java.io.InputStream;
import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.test.mapper.User;
import com.test.mapper.UserMapper;

public class TestMain  {
	private static SqlSessionFactory sqlSessionFactory=null;

	public void init() throws IOException {
		String resource = "mybatisConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory =new SqlSessionFactoryBuilder().build(inputStream);//主要就是解析所有的xml到Configuration中，并且根据配置得到工厂
		this.sqlSessionFactory=sqlSessionFactory;
	}
	public static void main(String[] args) throws IOException {
//    Deque<Integer> deque=new LinkedList<>();
//    ExecutorService service= Executors.new
		TestMain testMain=new TestMain();
		testMain.init();
		SqlSession sqlSession = sqlSessionFactory.openSession();
//		User user = (User) sqlSession.selectOne("selectByAssociation", 3123);
//		System.out.println(user);
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		User user = mapper.selectByPrimaryKey(3123);
//    int update = mapper.updateByPrimaryKey(new User());
//		System.out.println(user.getNum().getClass());
		sqlSession.close();
	}
}
