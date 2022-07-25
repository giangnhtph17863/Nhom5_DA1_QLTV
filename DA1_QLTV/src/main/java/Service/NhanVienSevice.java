/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entities.NhanVien;
import Model.NhanVienModel;
import java.util.List;
import Reposities.INhanVienRepository;
import Reposities.NhanVienRepository;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class NhanVienSevice implements INhanVienSevice{
    private final INhanVienRepository _iNVRepository;
    private List<NhanVienModel> _lstNVModel;
  public NhanVienSevice(){
      _iNVRepository = new NhanVienRepository();
      _lstNVModel = new ArrayList<>();


}

    @Override
    public List<NhanVienModel> getNhanVien() {
        _lstNVModel = new ArrayList<>();
        var nv = _iNVRepository.findAll();
        for (NhanVien x : nv) {
            _lstNVModel.add(new NhanVienModel(nv.getMaNV(), nv.getTenNV(), nv.getMatKhau(), nv.getGioiTinh(), nv.getNgaySinh(),
                                               nv.getSĐT(), nv.getEmail(), nv.getDiaChi(), nv.getTrangThai(), nv.getVaiTro()));
        }
        return _lstNVModel;
    }

    @Override
    public NhanVienModel getNVByID(String maNV) {
        var nv = _iNVRepository.findById(maNV);
        return new NhanVienModel(nv.getMaNV(), nv.getTenNV(), nv.getMatKhau(), nv.getGioiTinh(), nv.getNgaySinh(),
                                               nv.getSĐT(), nv.getEmail(), nv.getDiaChi(), nv.getTrangThai(), nv.getVaiTro());
    }

    @Override
    public NhanVienModel createNewNV(NhanVienModel nv) {
         var nv = _iNVRepository.save(new NhanVien(nv.getMaNV(), nv.getTenNV(), nv.getMatKhau(), nv.getGioiTinh(), nv.getNgaySinh(),
                                               nv.getSĐT(), nv.getEmail(), nv.getDiaChi(), nv.getTrangThai(), nv.getVaiTro()));
        return new NhanVienModel(nv.getMaNV(), nv.getTenNV(), nv.getMatKhau(), nv.getGioiTinh(), nv.getNgaySinh(),
                                               nv.getSĐT(), nv.getEmail(), nv.getDiaChi(), nv.getTrangThai(), nv.getVaiTro());
}

    @Override
    public NhanVienModel updateNVById(NhanVienModel nv) {
       var nv = _iNVRepository.save(new NhanVien(nv.getMaNV(), nv.getTenNV(), nv.getMatKhau(), nv.getGioiTinh(), nv.getNgaySinh(),
                                               nv.getSĐT(), nv.getEmail(), nv.getDiaChi(), nv.getTrangThai(), nv.getVaiTro()));
        return new NhanVienModel(nv.getMaNV(), nv.getTenNV(), nv.getMatKhau(), nv.getGioiTinh(), nv.getNgaySinh(),
                                               nv.getSĐT(), nv.getEmail(), nv.getDiaChi(), nv.getTrangThai(), nv.getVaiTro());
    }
    
}
