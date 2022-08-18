/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;


import Entities.NhanVien;
import Models.NhanVienModel;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface INhanVienService {
    List<NhanVienModel> getQuanLyNV(int position, int pageSize);
    
    NhanVien getNvByMaNV(String maNV);
    
    NhanVienModel createNewNv(NhanVienModel nhanvien);
    
    NhanVienModel updateNvByMaNV(NhanVienModel nhanvien);
    
    long countAllProducts();
}
