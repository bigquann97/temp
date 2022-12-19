package com.example.noarg.entity;

import com.example.noarg.dto.EditBoardRequest;
import jakarta.persistence.*;
import lombok.*;

@Builder
@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(updatable = false)
    private String author; // 변화 가능성 X - final 말고 updatable로 막아주기??

    @Column
    private String title; // 변화 가능성 O - updatable의 기본값은 true

    @Column
    private String content; // 변화 가능성 O - updatable의 기본값은 true

    public void editPost(EditBoardRequest req) {
        this.title = req.getTitle(); // 변화
        this.content = req.getContent(); // 변화
    }
}
