/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class NhanVienModels {
     private String Manv;
    private String TenNv;
    private String MatKhau;
    private boolean GioiTinh;
    private Date NgaySinh;
    private String SDT;
    private String Email;
    private String Diachi;
    private boolean TRangThai;
    private boolean vaiTro;

    public NhanVienModels() {
    }

    public NhanVienModels(String Manv, String TenNv, String MatKhau, boolean GioiTinh, Date NgaySinh, String SDT, String Email, String Diachi, boolean TRangThai, boolean vaiTro) {
        this.Manv = Manv;
        this.TenNv = TenNv;
        this.MatKhau = MatKhau;
        this.GioiTinh = GioiTinh;
        this.NgaySinh = NgaySinh;
        this.SDT = SDT;
        this.Email = Email;
        this.Diachi = Diachi;
        this.TRangThai = TRangThai;
        this.vaiTro = vaiTro;
    }

    public String getManv() {
        return Manv;
    }

    public void setManv(String Manv) {
        this.Manv = Manv;
    }

    public String getTenNv() {
        return TenNv;
    }

    public void setTenNv(String TenNv) {
        this.TenNv = TenNv;
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

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
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

    public boolean isTRangThai() {
        return TRangThai;
    }

    public void setTRangThai(boolean TRangThai) {
        this.TRangThai = TRangThai;
    }

    public boolean isVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(boolean vaiTro) {
        this.vaiTro = vaiTro;
    }
}
