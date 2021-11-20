/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bach.model;

/**
 *
 * @author Think
 */
public class Chucvu {
    private char macv;
    private String tencv;
    private int hesoluong;

    public Chucvu() {
    }

    public Chucvu(char macv, String tencv, int hesoluong) {
        this.macv = macv;
        this.tencv = tencv;
        this.hesoluong = hesoluong;
    }

    public char getMacv() {
        return macv;
    }

    public void setMacv(char macv) {
        this.macv = macv;
    }

    public String getTencv() {
        return tencv;
    }

    public void setTencv(String tencv) {
        this.tencv = tencv;
    }

    public int getHesoluong() {
        return hesoluong;
    }

    public void setHesoluong(int hesoluong) {
        this.hesoluong = hesoluong;
    }
    
    
}
