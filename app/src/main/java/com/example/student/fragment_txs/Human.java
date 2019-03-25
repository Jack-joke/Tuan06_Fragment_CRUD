package com.example.student.fragment_txs;

import java.io.Serializable;

public class Human implements Serializable {
    private String ma, ten;

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Human() {
    }

    public Human(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }

    @Override
    public String toString() {
        return ten;
    }
}
