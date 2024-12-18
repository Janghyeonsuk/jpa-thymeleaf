package com.ll.tem.domain.post.post.entity;

import com.ll.tem.global.jpa.entity.BaseTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Post extends BaseTime {
    @Column(length = 100)
    private String title;

    @Column(columnDefinition = "TEXT")
    private String content;
}