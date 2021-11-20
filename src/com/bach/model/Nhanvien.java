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
public class Nhanvien {
    private int manv;
    private String macv;
    private String tennv;
    private String ngaysinh;
    private String sodt;
    private String diachi;

    public Nhanvien() {
    }
   
    public Nhanvien(String macv,int manv , String tennv, String ngaysinh, String sodt, String diachi) {
        this.manv = manv;
        this.macv = macv;
        this.tennv = tennv;
        this.ngaysinh = ngaysinh;
        this.sodt = sodt;
        this.diachi = diachi;
    }

    public int getManv() {
        return manv;
    }

    public void setManv(int manv) {
        this.manv = manv;
    }

    public String getMacv() {
        return macv;
    }

    public void setMacv(String macv) {
        this.macv = macv;
    }

    public String getTennv() {
        return tennv;
    }

    public void setTennv(String tennv) {
        this.tennv = tennv;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getSodt() {
        return sodt;
    }

    public void setSodt(String sodt) {
        this.sodt = sodt;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
    
    
}
