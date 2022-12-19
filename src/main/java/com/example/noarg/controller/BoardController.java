package com.example.noarg.controller;

import com.example.noarg.dto.BoardRequest;
import com.example.noarg.dto.BoardResponse;
import com.example.noarg.dto.EditBoardRequest;
import com.example.noarg.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @PostMapping("/board")
    public ResponseEntity<BoardResponse> uploadPost(@RequestBody BoardRequest req) {
        BoardResponse res = boardService.uploadPost(req);
        return ResponseEntity.ok().body(res);
    }

    @GetMapping("/board/{id}")
    public ResponseEntity<BoardResponse> showOnePost(@PathVariable Long id) {
        BoardResponse res = boardService.showOnePost(id);
        return ResponseEntity.ok().body(res);
    }

    @PutMapping("/board/{id}")
    public ResponseEntity<BoardResponse> modifyPost(@PathVariable Long id, @RequestBody EditBoardRequest req) {
        BoardResponse res = boardService.editPost(id, req);
        return ResponseEntity.ok().body(res);
    }
}
