package com.example.noarg.dto;

import com.example.noarg.entity.Board;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class BoardRequest {
    private final String author; // 변화가능성 X
    private final String title; // 변화가능성 X
    private final String content; // 변화가능성 X

    public Board toEntity() {
        return Board.builder()
                .author(author)
                .title(title)
                .content(content)
                .build();
    }
}
