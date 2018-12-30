package com.nf147.demo.service;


import com.nf147.demo.dao.NewsMapper;
import com.nf147.demo.entity.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImp implements NewsService {

    @Autowired
    private NewsMapper newsMapper;


    @Override
    @Cacheable("listNews")
    public List<News> listAll() {
        return newsMapper.findAll();
    }

    @Override
    public void add(News news) {
        newsMapper.save(news);

    }

    @Override
    public void del(int id) {
        newsMapper.deleteById(id);
    }

    @Override
    public void update(News news) {
        newsMapper.save(news);
    }
}
