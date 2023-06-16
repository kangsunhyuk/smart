package com.example.smart.service;

import com.example.smart.entity.Board;
import com.example.smart.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService{
    @Autowired
    private final BoardRepository boardRepository;

    public BoardServiceImpl(BoardRepository boardRepository) { this.boardRepository = boardRepository;}

    @Override
    public List<Board> listBoard(Board board) {
        List<Board> boardList = boardRepository.findAll();
        return boardList;
    }

    @Override
    public Board oneBoard(Board board) {
        return null;
    }

    @Override
    public int saveBoard(Board board) {
        boardRepository.save(board);
        return 1;
    }

}
