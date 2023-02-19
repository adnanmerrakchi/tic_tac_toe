package com.tictactoe.service;

import com.tictactoe.model.Board;
import com.tictactoe.model.Mark;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class PlayerServiceTest {

    @InjectMocks
    PlayerService playerService;

    @Mock
    StateBoardService stateBoardService;

    @BeforeEach
    void init(){
    }


    @Test
    public void findWinnerMark_xIsWinner(){
        Board board = new Board(Mark.X, Mark.X, Mark.X,
                                Mark.X, Mark.O, Mark.X,
                                Mark.O, Mark.O, Mark.O);
        Mockito.when(stateBoardService.isBoardDone(Mockito.any(Board.class))).thenReturn(true);
        Assertions.assertEquals(playerService.findWinner(board), Mark.X);

    }

    @Test
    public void findWinnerMark_oIsWinner(){
        Board board = new Board(Mark.O, Mark.O,   Mark.X,
                                Mark.X, Mark.O, Mark.X,
                                Mark.X,   Mark.O, Mark.O);
        Mockito.when(stateBoardService.isBoardDone(Mockito.any(Board.class))).thenReturn(true);
        Assertions.assertEquals(playerService.findWinner(board), Mark.O);
    }

    @Test
    public void findWinnerMark_noWinner(){
        Board board = new Board(Mark.O, null,   Mark.X,
                                Mark.X, Mark.O, Mark.X,
                                null,   Mark.O, Mark.O);
        Mockito.when(stateBoardService.isBoardDone(Mockito.any(Board.class))).thenReturn(false);
        Assertions.assertEquals(playerService.findWinner(board), null);
    }
}
