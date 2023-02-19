package com.tictactoe.service;

import com.tictactoe.model.Board;
import com.tictactoe.model.Mark;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlayerServiceTest {


    @Test
    public void findWinnerMark_xIsWinner(){
        Board board = new Board(Mark.X, Mark.X, Mark.X,
                                Mark.X, Mark.O, Mark.X,
                                null,   Mark.O, null);
        PlayerService playerService = new PlayerService();
        Assertions.assertEquals(playerService.findWinner(board), Mark.X);

    }

    @Test
    public void findWinnerMark_oIsWinner(){
        Board board = new Board(Mark.O, null,   Mark.X,
                                Mark.X, Mark.O, Mark.X,
                                null,   Mark.O, Mark.O);
        PlayerService playerService = new PlayerService();
        Assertions.assertEquals(playerService.findWinner(board), Mark.O);
    }

    @Test
    public void findWinnerMark_noWinner(){
        Board board = new Board(Mark.O, null,   Mark.X,
                                Mark.X, Mark.O, Mark.X,
                                null,   Mark.O, Mark.O);
        PlayerService playerService = new PlayerService();
        Assertions.assertEquals(playerService.findWinner(board), null);
    }
}
