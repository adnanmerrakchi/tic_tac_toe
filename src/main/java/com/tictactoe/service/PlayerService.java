package com.tictactoe.service;

import com.tictactoe.model.Board;
import com.tictactoe.model.Mark;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {

    private StateBoardService stateBoardService;

    public PlayerService(StateBoardService stateBoardService) {
        this.stateBoardService = stateBoardService;
    }

    public Mark findWinner(Board board){
        //  *   *   *
        //  *   *   *
        //  *   *   * ???
        if(!stateBoardService.isBoardDone(board)){
            return null;
        }   else
        //  *   *   *
        //  -   -   -
        //  -   -   -
        if(board.getCell1().equals(board.getCell2()) && board.getCell1().equals(board.getCell3())){
            return board.getCell1();
        }   else
        //  -   -   -
        //  *   *   *
        //  -   -   -
        if(board.getCell4().equals(board.getCell5()) && board.getCell4().equals(board.getCell6())){
            return board.getCell4();
        }   else
        //  -   -   -
        //  -   -   -
        //  *   *   *
        if(board.getCell7().equals(board.getCell8()) && board.getCell7().equals(board.getCell9())){
            return board.getCell7();
        }   else
        //  *   -   -
        //  *   -   -
        //  *   -   -
        if(board.getCell1().equals(board.getCell4()) && board.getCell1().equals(board.getCell7())){
            return board.getCell1();
        }   else
        //  *   -   -
        //  -   *   -
        //  -   -   *
        if(board.getCell1().equals(board.getCell5()) && board.getCell1().equals(board.getCell9())){
            return board.getCell1();
        }   else
        //  -   *   -
        //  -   *   -
        //  -   *   -
        if(board.getCell2().equals(board.getCell5()) && board.getCell2().equals(board.getCell8())){
            return board.getCell2();
        }   else
        //  -   -   *
        //  -   -   *
        //  -   -   *
        if(board.getCell3().equals(board.getCell6()) && board.getCell3().equals(board.getCell9())){
            return board.getCell3();
        }   else
        //  -   -   *
        //  -   *   -
        //  *   -   -
        if(board.getCell3().equals(board.getCell5()) && board.getCell3().equals(board.getCell7())){
            return board.getCell3();
        }
        return null;
    }

}
