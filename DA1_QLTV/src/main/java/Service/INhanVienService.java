/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entities.NhanVien;
import Model.NhanVienModel;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface INhanVienService {
    List<NhanVien> getNhanVien();
    NhanVienModel getNhanVienByID(String maNhanVien);
    NhanVienModel createNewNhanVien(NhanVienModel nv);
    NhanVienModel updateNhanVienById(NhanVienModel nv);;
}