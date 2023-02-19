package com.tictactoe.model;

import javax.persistence.*;

@Entity
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nickName;
    @Enumerated(EnumType.STRING)
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
