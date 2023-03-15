package com.kja.boradExam.test;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Autowired // Bean 자동 주입
    TestDao testDao;

    @Override
    public List<Map<String, Object>> getList() throws Exception {
        return testDao.getList();
    }

}
