
package Service;

import Entities.NhanVien;
import Model.NhanVienModel;
import Reposities.INhanVienRepository;
import Reposities.NhanVienRepository;
import java.util.ArrayList;
import java.util.List;

public class NhanVienService implements INhanVienService{
    private final INhanVienRepository iNhanVienRepo;
    
    private List<NhanVienModel> lstNVModel;
    
    public NhanVienService(){
        iNhanVienRepo = new NhanVienRepository();
        
        lstNVModel = new ArrayList<>();
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
    public NhanVienModel getNvByMaNV(String maNV) {
        var x = iNhanVienRepo.findByMaNv(maNV);
    return new NhanVienModel(x.getMaNV(), x.getTenNV(), x.getMatKhau(),x.getGioiTinh(), x.getNgaySinh(),x.getSĐT(), x.getEmail(),x.getDiaChi(),x.getVaiTro(),x.getTrangThai());
    }

    @Override
    public NhanVienModel createNewNv(NhanVienModel nhanvien) {
//        nhanvien.setMaNV(null);
    var x = iNhanVienRepo.save(new NhanVien(nhanvien.getMaNV(), nhanvien.getTenNV(), nhanvien.getMatKhau(),nhanvien.getGioiTinh(), nhanvien.getNgaySinh(),nhanvien.getSĐT(), nhanvien.getEmail(),nhanvien.getDiaChi(),nhanvien.getVaiTro(),nhanvien.getTrangThai()));
    return new NhanVienModel(x.getMaNV(), x.getTenNV(), x.getMatKhau(),x.getGioiTinh(), x.getNgaySinh(),x.getSĐT(), x.getEmail(),x.getDiaChi(),x.getVaiTro(),x.getTrangThai());
    }

    @Override
    public NhanVienModel updateNvByMaNV(NhanVienModel nhanvien) {
        var x = iNhanVienRepo.save(new NhanVien(nhanvien.getMaNV(), nhanvien.getTenNV(), nhanvien.getMatKhau(),nhanvien.getGioiTinh(), nhanvien.getNgaySinh(),nhanvien.getSĐT(), nhanvien.getEmail(),nhanvien.getDiaChi(),nhanvien.getVaiTro(),nhanvien.getTrangThai()));
    return new NhanVienModel(x.getMaNV(), x.getTenNV(), x.getMatKhau(),x.getGioiTinh(), x.getNgaySinh(),x.getSĐT(), x.getEmail(),x.getDiaChi(),x.getVaiTro(),x.getTrangThai());
    }
    
    @Override
  public long countAllProducts() {
    return iNhanVienRepo.totalCount();
  }
}
