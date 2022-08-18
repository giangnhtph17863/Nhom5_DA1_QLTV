/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Toan
 */
@Entity
@Table(name = "PhieuTra")
public class PhieuTra implements Serializable{
    @Id
    @ManyToOne
    @JoinColumn(name="maPM")
    private PhieuMuon maPM;
    
    @Id
    @ManyToOne
    @JoinColumn(name="maSach")
    private Sach maSach;
    
    @Column
    private Double soTienCoc;
    
    @Column
    private Double tienPhat;

    public PhieuTra() {
    }
    
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
    public PhieuTra(PhieuMuon maPM, Sach maSach, Double soTienCoc, Double tienPhat) {
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

    public Double getTienPhat() {
        return tienPhat;
    }

    public void setTienPhat(Double tienPhat) {
        this.tienPhat = tienPhat;
    }
    
    
}
