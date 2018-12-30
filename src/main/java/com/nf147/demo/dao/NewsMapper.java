package com.nf147.demo.dao;

import com.nf147.demo.entity.News;
import org.springframework.data.jpa.repository.JpaRepository;


public interface NewsMapper extends JpaRepository<News,Integer> {

}
