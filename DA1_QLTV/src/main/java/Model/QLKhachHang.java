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
public class QLKhachHang {
     private String maKH;
    

    private String tenKH;
    

    private String matKhau;
    

    private Boolean gioiTinh;
    

    private Date ngaySinh;
    

    private String SĐT;
    

    private String email;
    

    private String diaChi;
    
    private NhanVien maNV;
    
    private Boolean trangThai;
    
 
    private int soLuongMuon;

    public QLKhachHang() {
    }

    public QLKhachHang(String maKH, String tenKH, String matKhau, Boolean gioiTinh, Date ngaySinh, String SĐT, String email, String diaChi, NhanVien maNV, Boolean trangThai, int soLuongMuon) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.matKhau = matKhau;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.SĐT = SĐT;
        this.email = email;
        this.diaChi = diaChi;
        this.maNV = maNV;
        this.trangThai = trangThai;
        this.soLuongMuon = soLuongMuon;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public Boolean getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(Boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getSĐT() {
        return SĐT;
    }

    public void setSĐT(String SĐT) {
        this.SĐT = SĐT;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public NhanVien getMaNV() {
        return maNV;
    }

    public void setMaNV(NhanVien maNV) {
        this.maNV = maNV;
    }

    public Boolean getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Boolean trangThai) {
        this.trangThai = trangThai;
    }

    public int getSoLuongMuon() {
        return soLuongMuon;
    }

    public void setSoLuongMuon(int soLuongMuon) {
        this.soLuongMuon = soLuongMuon;
    }

   
}
