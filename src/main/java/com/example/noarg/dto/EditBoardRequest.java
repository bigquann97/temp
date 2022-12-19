package com.example.noarg.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public final class EditBoardRequest {
    @NotBlank
    private final String title; // 변화 가능성 x
    @NotBlank
    private final String content; // 변화 가능성 x
}
