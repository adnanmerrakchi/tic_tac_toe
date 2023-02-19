package com.tictactoe.model;

import javax.persistence.*;

@Entity
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "board_id")
    private Board board;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "x_player_id")
    private Player xPlayer;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "o_player_id")
    private Player oPlayer;

    public Game() {
    }

    public Game(Board board, Player xPlayer, Player oPlayer) {
        this.board = board;
        this.xPlayer = xPlayer;
        this.oPlayer = oPlayer;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Integer getId() {
        return id;
    }

    public Board getBoard() {
        return board;
    }

    public Player getxPlayer() {
        return xPlayer;
    }

    public Player getoPlayer() {
        return oPlayer;
    }
}
