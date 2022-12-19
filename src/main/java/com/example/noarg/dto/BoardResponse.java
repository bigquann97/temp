package com.example.noarg.dto;

import com.example.noarg.entity.Board;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class BoardResponse {
    private final Long id;
    private final String title;

    public static BoardResponse of(Board board) {
        return new BoardResponse(board.getId(), board.getTitle());
    }
}
