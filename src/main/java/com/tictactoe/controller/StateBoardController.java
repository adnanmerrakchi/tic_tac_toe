package com.tictactoe.controller;

import com.tictactoe.model.Player;
import com.tictactoe.service.StateBoardService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class StateBoardController {

    private StateBoardService stateBoardService;

    public StateBoardController(StateBoardService stateBoardService){
        this.stateBoardService = stateBoardService;
    }

    @PostMapping(value = "/mark/{index}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity changeStateOfACell(@PathVariable Integer index, @RequestBody Player player){
        stateBoardService.markCell(index, player);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/getBoard")
    public Map<Integer,String> getBoard(){
        return null;
    }

}
