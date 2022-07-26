/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entities.NhanVien;
import Model.NhanVienModel;
import Reposities.INhanVienRepository;
import Reposities.NhanVienRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class NhanVienService implements INhanVienService{
 private final   INhanVienRepository _iNhanVienRepository;
  private  List<NhanVienModel> _lstNhanVienModel;

    public NhanVienService() {
        _iNhanVienRepository = new NhanVienRepository();
        _lstNhanVienModel = new ArrayList<>();
    }
    

    @Override
    public List<NhanVien> getNhanVien() {
        _lstNhanVienModel = new ArrayList<>();
        var nhanvien = _iNhanVienRepository.findAll();
        for (NhanVien x : nhanvien) {
            _lstNhanVienModel.add(new NhanVienModel(x.getMaNV(), x.getTenNV(), x.getMatKhau(), x.getGioiTinh(),x.getNgaySinh(), x.getSĐT(), x.getEmail(), x.getDiaChi(), x.getTrangThai(), x.getVaiTro()));
        }
        return nhanvien;
    }

    @Override
    public NhanVienModel getNhanVienByID(String maNhanVien) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public NhanVienModel createNewNhanVien(NhanVienModel nv) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public NhanVienModel updateNhanVienById(NhanVienModel nv) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
