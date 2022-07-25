/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Reposities;

import Entities.NhanVien;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public interface INhanVienRepository {
List<NhanVien> findAll();
    
    NhanVien findById(String maNV);
    
    NhanVien save(NhanVien nhanvien);
    
    NhanVien findbyName(String tenNV);
    
}
