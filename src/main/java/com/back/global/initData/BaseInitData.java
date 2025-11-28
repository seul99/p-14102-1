package com.back.global.initData;


import com.back.post.post.service.postService;

@Configuration
public class BaseInitData {
    private postService postService;

    @Bean
    ApplicationRunner baseInitDataApplicationRunner(){
        return args -> {
            if(postService.count( postService>0) return;

            Post post1 = postService.write("제목 1", "내용 1");
            Post post2 = postService.write("제목 1", "내용 1");
            Post post3 = postService.write("제목 1", "내용 1");
        }
    }

}
