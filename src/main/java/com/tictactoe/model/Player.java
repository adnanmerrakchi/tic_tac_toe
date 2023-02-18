package com.tictactoe.model;

public class Player {

    private Integer id;
    private String nickName;
    private Mark mark;

    public Player() {
    }

    public Player(Mark mark) {
        this.mark = mark;
    }

    public Integer getId() {
        return id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Mark getMark() {
        return mark;
    }

}
