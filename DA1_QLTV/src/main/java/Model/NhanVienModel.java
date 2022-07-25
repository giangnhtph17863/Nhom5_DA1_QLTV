/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author LENOVO
 */
public class NhanVienModel {
    private String maNV;
    private String tenNV;
    private String matKhau;
    private Boolean gioiTinh;
    private Date ngaySinh;
    private String S?T;
    private String email;
    private String diaChi;
    private Boolean trangThai;  
    private Boolean vaiTro;

    public NhanVienModel() {
    }

    public NhanVienModel(String maNV, String tenNV, String matKhau, Boolean gioiTinh, Date ngaySinh, String S?T, String email, String diaChi, Boolean trangThai, Boolean vaiTro) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.matKhau = matKhau;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.S?T = S?T;
        this.email = email;
        this.diaChi = diaChi;
        this.trangThai = trangThai;
        this.vaiTro = vaiTro;
    }

    public String getMaNV() {
        return maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public Boolean getGioiTinh() {
        return gioiTinh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public String getS?T() {
        return S?T;
    }

    public String getEmail() {
        return email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public Boolean getTrangThai() {
        return trangThai;
    }

    public Boolean getVaiTro() {
        return vaiTro;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public void setGioiTinh(Boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setS?T(String S?T) {
        this.S?T = S?T;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setTrangThai(Boolean trangThai) {
        this.trangThai = trangThai;
    }

    public void setVaiTro(Boolean vaiTro) {
        this.vaiTro = vaiTro;
    }


    
}
