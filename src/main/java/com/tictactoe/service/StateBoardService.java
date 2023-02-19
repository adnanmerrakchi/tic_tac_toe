package com.tictactoe.service;

import com.tictactoe.model.Board;
import com.tictactoe.model.Player;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class StateBoardService {

    public Map<Integer, String> markCell(Integer index, Player oPlayer) {
        Map<Integer, String> board = new HashMap<>();
        if( index > 9 || index<1 ){
            throw new RuntimeException("the " + index + " out of indexes");
        }
        board.put(index, oPlayer.getMark().getValue());
        return board;
    }

    public Boolean isBoardDone(Board board){
        if( board.getCell1() == null || board.getCell2() == null ||board.getCell3() == null ||
            board.getCell4() == null ||board.getCell5() == null ||board.getCell6() == null ||
            board.getCell7() == null ||board.getCell8() == null ||board.getCell9() == null ){
            return false;
        }
        return true;
    }

}
