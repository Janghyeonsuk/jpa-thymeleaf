package com.ll.tem.domain.post.post.entity;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Post {
    private static long lastId = 0;

    @Builder.Default
    private Long id = ++lastId;
    private String title;
    private String content;
}