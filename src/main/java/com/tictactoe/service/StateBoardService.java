package com.tictactoe.service;

import com.tictactoe.model.Player;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class StateBoardService {

    Map<Integer, String> board;

    public StateBoardService(){
        this.board = new HashMap<>();
        this.board.put(1, null);
        this.board.put(2, null);
        this.board.put(3, null);
        this.board.put(4, null);
        this.board.put(5, null);
        this.board.put(6, null);
        this.board.put(7, null);
        this.board.put(8, null);
        this.board.put(9, null);
    }
    public Map<Integer, String> markCell(Integer index, Player oPlayer) {
        if( index > 9 || index<1 ){
            throw new RuntimeException("the " + index + " out of indexes");
        }
        this.board.put(index, oPlayer.getMark().getValue());
        return board;
    }

    public Map<Integer, String> getBoard() {
        return board;
    }
}
