/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;


import Entities.NhanVien;
import Models.NhanVienModel;
import Repositories.INhanVienRepository;
import Repositories.NhanVienRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class NhanVienService implements INhanVienService{
    private final INhanVienRepository iNhanVienRepo;
    
    private List<NhanVienModel> lstNVModel;
    
    public NhanVienService(){
        iNhanVienRepo = new NhanVienRepository();
        
        lstNVModel = new ArrayList<>();
    }
    @Override
    public long countAllProducts() {
        return iNhanVienRepo.totalCount();
    }

    @Override
    public List<NhanVienModel> getQuanLyNV(int position, int pageSize) {
        lstNVModel = new ArrayList<>();
        var nhanvien = iNhanVienRepo.findAll(position, pageSize);
        for (NhanVien x : nhanvien) {
            lstNVModel.add(new NhanVienModel(x.getMaNV(), x.getTenNV(), x.getMatKhau(),x.getGioiTinh(), x.getNgaySinh(),x.getSĐT(), x.getEmail(),x.getDiaChi(),x.getVaiTro(),x.getTrangThai()));
        }
        return lstNVModel;
    }

    @Override
    public NhanVien getNvByMaNV(String maNV) {
         var x = iNhanVienRepo.findbyMaNV(maNV);
    return new NhanVien(x.getMaNV(), x.getTenNV(), x.getMatKhau(),x.getGioiTinh(), x.getNgaySinh(),x.getSĐT(), x.getEmail(),x.getDiaChi(),x.getVaiTro(),x.getTrangThai());
    }

    @Override
    public NhanVienModel createNewNv(NhanVienModel nhanvien) {
          var x = iNhanVienRepo.save(new NhanVien(nhanvien.getManv(), nhanvien.getTenNv(), nhanvien.getMatKhau(),nhanvien.isGioiTinh(), nhanvien.getNgaySinh(),nhanvien.getSDT(), nhanvien.getEmail(),nhanvien.getDiachi(),nhanvien.isVaiTro(),nhanvien.isTRangThai()));
    return new NhanVienModel(x.getMaNV(), x.getTenNV(), x.getMatKhau(),x.getGioiTinh(), x.getNgaySinh(),x.getSĐT(), x.getEmail(),x.getDiaChi(),x.getVaiTro(),x.getTrangThai());
    }

    @Override
    public NhanVienModel updateNvByMaNV(NhanVienModel nhanvien) {
        var x = iNhanVienRepo.save(new NhanVien(nhanvien.getManv(), nhanvien.getTenNv(), nhanvien.getMatKhau(),nhanvien.isGioiTinh(), nhanvien.getNgaySinh(),nhanvien.getSDT(), nhanvien.getEmail(),nhanvien.getDiachi(),nhanvien.isVaiTro(),nhanvien.isTRangThai()));
    return new NhanVienModel(x.getMaNV(), x.getTenNV(), x.getMatKhau(),x.getGioiTinh(), x.getNgaySinh(),x.getSĐT(), x.getEmail(),x.getDiaChi(),x.getVaiTro(),x.getTrangThai());
    }
    
}
