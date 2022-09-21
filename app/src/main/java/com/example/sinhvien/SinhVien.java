package com.example.sinhvien;

import java.io.Serializable;

public class SinhVien implements Serializable {
    String ten,masv;

    public SinhVien() {
    }

    public SinhVien(String ten, String masv) {
        this.ten = ten;
        this.masv = masv;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }
}
