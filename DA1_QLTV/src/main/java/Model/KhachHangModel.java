/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Entities.NhanVien;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class KhachHangModel {
    private String MaKh;
    private String TenKH;
    private String MatKhau;
    private boolean GioiTinh;
    private Date NgaySinh;
    private String SĐT;
    private String Email;
    private String Diachi;
    private NhanVien Manv;
    private boolean  TrangThai;
    private int soLuongMuon;

    public KhachHangModel() {
    }

    public KhachHangModel(String MaKh, String TenKH, String MatKhau, boolean GioiTinh, Date NgaySinh, String SĐT, String Email, String Diachi, NhanVien Manv, boolean TrangThai, int soLuongMuon) {
        this.MaKh = MaKh;
        this.TenKH = TenKH;
        this.MatKhau = MatKhau;
        this.GioiTinh = GioiTinh;
        this.NgaySinh = NgaySinh;
        this.SĐT = SĐT;
        this.Email = Email;
        this.Diachi = Diachi;
        this.Manv = Manv;
        this.TrangThai = TrangThai;
        this.soLuongMuon = soLuongMuon;
    }

    public String getMaKh() {
        return MaKh;
    }

    public void setMaKh(String MaKh) {
        this.MaKh = MaKh;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public boolean isGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getSĐT() {
        return SĐT;
    }

    public void setSĐT(String SĐT) {
        this.SĐT = SĐT;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    public NhanVien getManv() {
        return Manv;
    }

    public void setManv(NhanVien Manv) {
        this.Manv = Manv;
    }

    public boolean isTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(boolean TrangThai) {
        this.TrangThai = TrangThai;
    }

    public int getSoLuongMuon() {
        return soLuongMuon;
    }

    public void setSoLuongMuon(int soLuongMuon) {
        this.soLuongMuon = soLuongMuon;
    }
    
    
    
}
