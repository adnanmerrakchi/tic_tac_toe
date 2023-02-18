package com.tictactoe.model;

public enum Mark {

    X("x"),
    O("o");

    private String value;

    Mark(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
