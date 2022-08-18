/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Entities.KhachHang;
import Entities.NhanVien;
import java.util.Date;

/**
 *
 * @author Toan
 */
public class PhieuMuonModel {
    private Integer maPM;
    private Date NgayMuon;
    private Date NgayTra;
    private Double TienCoc;
    private String TrangThai;
    private KhachHang maKH;
    private NhanVien maNV;

    public PhieuMuonModel() {
    }

    public PhieuMuonModel(Integer maPM, Date NgayMuon, Date NgayTra, Double TienCoc, String TrangThai, KhachHang maKH, NhanVien maNV) {
        this.maPM = maPM;
        this.NgayMuon = NgayMuon;
        this.NgayTra = NgayTra;
        this.TienCoc = TienCoc;
        this.TrangThai = TrangThai;
        this.maKH = maKH;
        this.maNV = maNV;
    }
    

    public Integer getMAPM() {
        return maPM;
    }

    public void setMAPM(Integer maPM) {
        this.maPM = maPM;
    }

    public Date getNgayMuon() {
        return NgayMuon;
    }

    public void setNgayMuon(Date NgayMuon) {
        this.NgayMuon = NgayMuon;
    }

    public Date getNgayTra() {
        return NgayTra;
    }

    public void setNgayTra(Date NgayTra) {
        this.NgayTra = NgayTra;
    }

    public Double getTienCoc() {
        return TienCoc;
    }

    public void setTienCoc(Double TienCoc) {
        this.TienCoc = TienCoc;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String TrangThai) {
        this.TrangThai = TrangThai;
    }

    public KhachHang getMaKH() {
        return maKH;
    }

    public void setMaKH(KhachHang maKH) {
        this.maKH = maKH;
    }

    public NhanVien getMaNV() {
        return maNV;
    }

    public void setMaNV(NhanVien maNV) {
        this.maNV = maNV;
    }
}
