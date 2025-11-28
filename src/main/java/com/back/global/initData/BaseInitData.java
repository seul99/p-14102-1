package com.back.global.initData;


import com.back.domain.post.post.entity.Post;
import com.back.domain.post.post.service.PostService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BaseInitData {
    private PostService postService;

    @Bean
    ApplicationRunner baseInitDataApplicationRunner(){
        return args -> {
            if(postService.count() >0) return;

            Post post1 = postService.write("제목 1", "내용 1");
            Post post2 = postService.write("제목 1", "내용 1");
            Post post3 = postService.write("제목 1", "내용 1");
        };
    }

}
