/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Entities.PhieuMuon;
import Entities.Sach;

/**
 *
 * @author Admin
 */
public class PhieuTraModel {
    private PhieuMuon maPM;
    private Sach maSach;
    private Double soTienCoc;
    private Double tienPhat;
    
    public float getTienHoanTra() {
        float soTienHT = 0;
        if (tienPhat < soTienCoc) {
            return soTienHT = (float) (soTienCoc - tienPhat);
        }
        return 0;
    }
    
    public float getTienThanhToan() {
        float soTienTT = 0;
        if (tienPhat > soTienCoc) {
            return soTienTT = (float) (tienPhat - soTienCoc);
        }
        return 0;
    }

    public Double getTienPhat() {
        return tienPhat;
    }
    
    public PhieuTraModel() {
    }

    public PhieuTraModel(PhieuMuon maPM, Sach maSach, Double soTienCoc, Double tienPhat) {
        this.maPM = maPM;
        this.maSach = maSach;
        this.soTienCoc = soTienCoc;
        this.tienPhat = tienPhat;
    }

    public PhieuMuon getMaPM() {
        return maPM;
    }

    public void setMaPM(PhieuMuon maPM) {
        this.maPM = maPM;
    }
    
    public Sach getMaSach() {
        return maSach;
    }

    public void setMaSach(Sach maSach) {
        this.maSach = maSach;
    }

    public Double getSoTienCoc() {
        return soTienCoc;
    }

    public void setSoTienCoc(Double soTienCoc) {
        this.soTienCoc = soTienCoc;
    }

    public void setTienPhat(Double tienPhat) {
        this.tienPhat = tienPhat;
    }
    
}
