/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reposities;

import Entities.NhanVien;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface INhanVienRepository {
    List<NhanVien> findAll(int position, int pageSize);
    
 
    
    NhanVien save(NhanVien nv);
    
    NhanVien findbyMaNV(String manv);
    
    long totalCount();
}
