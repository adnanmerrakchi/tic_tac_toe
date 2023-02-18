package com.tictactoe.service;

import com.tictactoe.model.Mark;
import com.tictactoe.model.Player;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.Map;

public class StateBoardServiceTest {


    @Test
    public void changeState_markACellSuccessfully(){
        StateBoardService stateBoardService = new StateBoardService();
        Integer index = 7;
        Player oPlayer = new Player(Mark.X);

        Map<Integer, String> board = stateBoardService.markCell(index, oPlayer);

        Assertions.assertNotNull(board.get(index));
        Assertions.assertEquals(board.get(index), oPlayer.getMark().getValue());

    }

    @Test
    public void changeState_throwsException(){
        StateBoardService stateBoardService = new StateBoardService();
        Integer index = 10;
        Player oPlayer = new Player(Mark.X);

        Assertions.assertThrows(RuntimeException.class,()->{
            stateBoardService.markCell(index, oPlayer);
        });

    }
}
