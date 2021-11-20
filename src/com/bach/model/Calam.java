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
public class Calam {
    private int macalam;
    private char manv;
    private String ngaylam;
    private char buoi;
    private String ghichu;

    public Calam() {
    }

    public Calam(int macalam, char manv, String ngaylam, char buoi, String ghichu) {
        this.macalam = macalam;
        this.manv = manv;
        this.ngaylam = ngaylam;
        this.buoi = buoi;
        this.ghichu = ghichu;
    }

    public int getMacalam() {
        return macalam;
    }

    public void setMacalam(int macalam) {
        this.macalam = macalam;
    }

    public char getManv() {
        return manv;
    }

    public void setManv(char manv) {
        this.manv = manv;
    }

    public String getNgaylam() {
        return ngaylam;
    }

    public void setNgaylam(String ngaylam) {
        this.ngaylam = ngaylam;
    }

    public char getBuoi() {
        return buoi;
    }

    public void setBuoi(char buoi) {
        this.buoi = buoi;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }
    
    
}
