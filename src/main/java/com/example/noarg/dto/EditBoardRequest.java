package com.example.noarg.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class EditBoardRequest {
    private final String title; // 변화 가능성 x
    private final String content; // 변화 가능성 x
}
