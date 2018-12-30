package com.nf147.demo.service;

import com.nf147.demo.entity.News;

import java.util.List;

public interface NewsService {
    List<News> listAll();
    void add (News news);
    void del (int id);
    void update(News news);
}
