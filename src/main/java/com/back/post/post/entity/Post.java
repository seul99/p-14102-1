package com.back.post.post.entity;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Post extends BaseEntity{
    private String title;
    private String content;

    public Post(String title, String content){
        this.title = title;
        this.content = content;
    }
}
