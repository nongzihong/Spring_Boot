package com.nf147.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "news") //表名
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //标明该字段是自动增长
    private int id;
    private String title;
    private String body;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
