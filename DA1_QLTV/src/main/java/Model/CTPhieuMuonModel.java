/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Entities.PhieuMuon;
import Entities.Sach;
import Entities.KhachHang;
import Entities.NhanVien;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class CTPhieuMuonModel {
     private PhieuMuon phieuMuon;
      private Sach maSach;
      private String tinhTrang;
      private Double tienPhat;
       private Date ngayTra;
        private String ghiChu;
        private KhachHang maKH;
        private NhanVien maNV;

    public CTPhieuMuonModel() {
    }

    public CTPhieuMuonModel(PhieuMuon phieuMuon, Sach maSach, String tinhTrang, Double tienPhat, Date ngayTra, String ghiChu, KhachHang maKH, NhanVien maNV) {
        this.phieuMuon = phieuMuon;
        this.maSach = maSach;
        this.tinhTrang = tinhTrang;
        this.tienPhat = tienPhat;
        this.ngayTra = ngayTra;
        this.ghiChu = ghiChu;
        this.maKH = maKH;
        this.maNV = maNV;
    }

    public CTPhieuMuonModel(PhieuMuon phieuMuon, Sach maSach, String tinhTrang, Double tienPhat, Date ngayTra, String ghiChu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        

  

    public PhieuMuon getPhieuMuon() {
        return phieuMuon;
    }

    public void setPhieuMuon(PhieuMuon phieuMuon) {
        this.phieuMuon = phieuMuon;
    }

    public Sach getMaSach() {
        return maSach;
    }

    public void setMaSach(Sach maSach) {
        this.maSach = maSach;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public Double getTienPhat() {
        return tienPhat;
    }

    public void setTienPhat(Double tienPhat) {
        this.tienPhat = tienPhat;
    }

    public Date getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(Date ngayTra) {
        this.ngayTra = ngayTra;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
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
