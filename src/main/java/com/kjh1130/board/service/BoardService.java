package com.kjh1130.board.service;

import com.kjh1130.board.dto.BoardDTO;
import com.kjh1130.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    public void save(BoardDTO boardDTO) {
        boardRepository.save(boardDTO);
    }
}
