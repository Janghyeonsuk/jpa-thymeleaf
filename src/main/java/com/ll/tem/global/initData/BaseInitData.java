package com.ll.tem.global.initData;

import com.ll.tem.domain.post.post.entity.Post;
import com.ll.tem.domain.post.post.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.Transactional;

@Configuration
@RequiredArgsConstructor
public class BaseInitData {

    private final PostRepository postRepository;

    @Bean
    public ApplicationRunner baseInitDataRunner() {
        return args -> {
            work();
        };
    }

    @Transactional
    public void work() {
        // 데이터가 이미 존재하면 초기화하지 않음
        if (postRepository.count() > 0) return;

        Post p1 = new Post();
        p1.setTitle("제목 1");
        p1.setContent("내용 1");
        postRepository.save(p1);

        Post p2 = new Post();
        p2.setTitle("제목 2");
        p2.setContent("내용 2");
        postRepository.save(p2);

        Post p3 = new Post();
        p3.setTitle("제목 3");
        p3.setContent("내용 3");
        postRepository.save(p3);
    }
}

