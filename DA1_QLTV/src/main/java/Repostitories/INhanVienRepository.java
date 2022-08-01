/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repostitories;

import Entities.NhanVien;

/**
 *
 * @author Admin
 */
public interface INhanVienRepository {
//     List<NhanVien> findAll();
//    
//    KhachHang findById(String makh);
//    
//    KhachHang save(KhachHang khachHang);
    
NhanVien findbyMaNv(String manv);
}
