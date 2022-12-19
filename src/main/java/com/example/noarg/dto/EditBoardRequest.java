package com.example.noarg.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class EditBoardRequest {
    private final String title;
    private final String content;
}
