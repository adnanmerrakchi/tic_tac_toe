package com.tictactoe.model;

import javax.persistence.*;

@Entity
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Enumerated(EnumType.STRING)
    @Column(nullable = true)
    private Mark cell1;
    @Enumerated(EnumType.STRING)
    @Column(nullable = true)
    private Mark cell2;
    @Enumerated(EnumType.STRING)
    @Column(nullable = true)
    private Mark cell3;
    @Enumerated(EnumType.STRING)
    @Column(nullable = true)
    private Mark cell4;
    @Enumerated(EnumType.STRING)
    @Column(nullable = true)
    private Mark cell5;
    @Enumerated(EnumType.STRING)
    @Column(nullable = true)
    private Mark cell6;
    @Enumerated(EnumType.STRING)
    @Column(nullable = true)
    private Mark cell7;
    @Enumerated(EnumType.STRING)
    @Column(nullable = true)
    private Mark cell8;
    @Enumerated(EnumType.STRING)
    @Column(nullable = true)
    private Mark cell9;

    public Board() {
    }

    public Board(Mark cell1, Mark cell2, Mark cell3, Mark cell4, Mark cell5, Mark cell6, Mark cell7, Mark cell8, Mark cell9) {
        this.cell1 = cell1;
        this.cell2 = cell2;
        this.cell3 = cell3;
        this.cell4 = cell4;
        this.cell5 = cell5;
        this.cell6 = cell6;
        this.cell7 = cell7;
        this.cell8 = cell8;
        this.cell9 = cell9;
    }

    public Mark getCell1() {
        return cell1;
    }

    public void setCell1(Mark cell1) {
        this.cell1 = cell1;
    }

    public Mark getCell2() {
        return cell2;
    }

    public void setCell2(Mark cell2) {
        this.cell2 = cell2;
    }

    public Mark getCell3() {
        return cell3;
    }

    public void setCell3(Mark cell3) {
        this.cell3 = cell3;
    }

    public Mark getCell4() {
        return cell4;
    }

    public void setCell4(Mark cell4) {
        this.cell4 = cell4;
    }

    public Mark getCell5() {
        return cell5;
    }

    public void setCell5(Mark cell5) {
        this.cell5 = cell5;
    }

    public Mark getCell6() {
        return cell6;
    }

    public void setCell6(Mark cell6) {
        this.cell6 = cell6;
    }

    public Mark getCell7() {
        return cell7;
    }

    public void setCell7(Mark cell7) {
        this.cell7 = cell7;
    }

    public Mark getCell8() {
        return cell8;
    }

    public void setCell8(Mark cell8) {
        this.cell8 = cell8;
    }

    public Mark getCell9() {
        return cell9;
    }

    public void setCell9(Mark cell9) {
        this.cell9 = cell9;
    }
}
