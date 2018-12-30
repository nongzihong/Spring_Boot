package com.nf147.demo.controller;

import com.nf147.demo.entity.News;
import com.nf147.demo.service.NewsServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class NewsController {

    @Autowired
    private NewsServiceImp newsServiceImp;

    //查询
    @RequestMapping(value = "/listNews", method = RequestMethod.GET)
    public List<News> getNews() {
        return newsServiceImp.listAll();
    }

    //添加 http://localhost:8082/listNewsAdd?title=对方对付对付的&body=擐甲挥戈法国红酒用户提供丰台体育
    @RequestMapping(value = "/listNewsAdd", method = RequestMethod.GET)
    public void add(News news) {
        newsServiceImp.add(news);
    }

    //删除
    //地址栏写法 http://localhost:8082/listNewsdel?id=7
    @RequestMapping(value = "/listNewsdel", method = RequestMethod.GET)
    public void del(int id) {
        newsServiceImp.del(id);
    }

    //修改
    //地址栏写法  http://localhost:8082/listNewsupdate?id=6&title=fdf&body=ddddd
    @RequestMapping(value = "/listNewsupdate", method = RequestMethod.GET)
    public void del(News news) {
        newsServiceImp.update(news);
    }

}
