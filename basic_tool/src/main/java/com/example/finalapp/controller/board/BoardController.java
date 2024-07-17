package com.example.finalapp.controller.board;

import com.example.finalapp.service.board.BoardService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {
    private final BoardService boardService;

    @GetMapping("/list")
    public String list(){
        return "board/list";
    }

    @GetMapping("/detail")
    public String detail(){
        return "board/detail";
    }

    @GetMapping("/write")
    public String write(){
        return "board/write";
    }
}










