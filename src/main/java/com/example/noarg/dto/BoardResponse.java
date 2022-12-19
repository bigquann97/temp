package com.example.noarg.dto;

import com.example.noarg.entity.Board;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public final class BoardResponse {
    private final Long id; // 변화 가능성x
    private final String title; // 변화 가능성x

    public static BoardResponse of(Board board) {
        return new BoardResponse(board.getId(), board.getTitle());
    }
}
