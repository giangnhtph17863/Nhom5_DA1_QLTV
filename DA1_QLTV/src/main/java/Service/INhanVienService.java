/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entities.NhanVien;
import Models.NhanVienModels;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface INhanVienService {
     List<NhanVienModels> getNhanVien();
    NhanVienModels getNhanVienByID(String maNhanVien);
    NhanVienModels createNewNhanVien(NhanVienModels nv);
    NhanVienModels updateNhanVienById(NhanVienModels nv);
}
