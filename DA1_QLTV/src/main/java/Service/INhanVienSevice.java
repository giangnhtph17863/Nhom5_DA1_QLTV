/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import Model.NhanVienModel;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public interface INhanVienSevice {
 List<NhanVienModel> getNhanVien();
    NhanVienModel getNVByID(String maNV);
    NhanVienModel createNewNV(NhanVienModel nv);
    NhanVienModel updateNVById(NhanVienModel nv);;
    
}
