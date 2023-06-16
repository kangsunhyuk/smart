package com.example.smart.controller;

import com.example.smart.entity.Board;
import com.example.smart.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;
import java.util.List;

@RequiredArgsConstructor
@Controller
public class BoardController {
    private final BoardService boardService;
    @RequestMapping({"hello"})
    String hello(){
        return "/hello";
    }
    @RequestMapping({"board/list"})
    String boardList(Board board, Model model){
        List<Board> boardList = boardService.listBoard(board);
        model.addAttribute("list",boardList);
        return "/board/list";
    }
    @RequestMapping({"board/write"})
    String boardWrite(){
        return "/board/write";
    }
    @RequestMapping({"board/save"})
    @ResponseBody
    int boardSave(Board board){
        board.setRegistDate(LocalDateTime.now());
        return boardService.saveBoard(board);
    }
}
