package kja.exam.bbs.controller;

import kja.exam.bbs.vo.Article;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BbsController {

    @RequestMapping(value = "/")
    public String main(){
        return "index";
    }

    @RequestMapping("/usr/home/getArticles")
    @ResponseBody
    public List<Article> getArticles() {
        Article artricle1 = new Article(1, "제목1", "내용1");
        Article artricle2 = new Article(2, "제목2", "내용2");

        List<Article> list = new ArrayList<>();
        list.add(artricle1);
        list.add(artricle2);

        return list;
    }


}