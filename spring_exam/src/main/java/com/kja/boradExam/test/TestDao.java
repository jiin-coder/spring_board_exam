package com.kja.boradExam.test;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class TestDao {

    @Inject
    private SqlSessionFactory sqlSessionFactory;

    public List<Map<String, Object>> getList() throws Exception {
        SqlSession session = sqlSessionFactory.openSession();
        // mapper/test_SQL.xml 파일 mapper tag namespace 속성의 값 + select tag id 속성의 값
        return session.selectList( "com.kja.boardExam.test.TestDao.getList" );
    }

}