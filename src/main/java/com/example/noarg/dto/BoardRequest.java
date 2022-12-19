package com.example.noarg.dto;

import com.example.noarg.entity.Board;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public final class BoardRequest {
    @NotBlank
    private final String author; // 변화가능성 X

    @NotBlank
    private final String title; // 변화가능성 X

    @NotBlank
    private final String content; // 변화가능성 X

    public Board toEntity() {
        return Board.builder()
                .author(author)
                .title(title)
                .content(content)
                .build();
    }
}
