package com.kjh1130.board.controller;

import com.kjh1130.board.dto.BoardDTO;
import com.kjh1130.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class BoardController {
    private final BoardService boardService;

    @PostMapping("/save")
    public void save(BoardDTO boardDTO) {
        boardService.save(boardDTO);
    }
}
