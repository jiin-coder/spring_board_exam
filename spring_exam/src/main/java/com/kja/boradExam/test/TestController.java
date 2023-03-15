package com.kja.boradExam.test;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @Autowired
    TestService testService;

    @RequestMapping(value="/getList", method=RequestMethod.GET)
    @ResponseBody // 자바 객체를 HTTP 응답 본문의 객체로 변환하여 클라이언트로 전송
    public String getList() throws Exception{
        String resultStr = "";
        List<Map<String, Object>> result = testService.getList();
        for ( Map<String, Object> r : result ) {
            resultStr += r.toString();
            System.out.println( r.toString() );
        }
        return resultStr;
    }

}
