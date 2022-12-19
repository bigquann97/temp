package com.example.noarg.service;

import com.example.noarg.repository.BoardRepository;
import com.example.noarg.dto.BoardRequest;
import com.example.noarg.dto.BoardResponse;
import com.example.noarg.dto.EditBoardRequest;
import com.example.noarg.entity.Board;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

    @Transactional(readOnly = true)
    public BoardResponse showOnePost(Long id) {
        Board board = boardRepository.findById(id).orElseThrow(IllegalArgumentException::new);
        return BoardResponse.of(board);
    }

    @Transactional
    public BoardResponse uploadPost(BoardRequest req) {
        Board board = req.toEntity();
        Board savedBoard = boardRepository.save(board);
        return BoardResponse.of(savedBoard);
    }

    @Transactional
    public BoardResponse editPost(Long id, EditBoardRequest req) {
        Board board = boardRepository.findById(id).orElseThrow(IllegalArgumentException::new);
        board.editPost(req);
        Board editedPost = boardRepository.saveAndFlush(board);
        return BoardResponse.of(editedPost);
    }
}
