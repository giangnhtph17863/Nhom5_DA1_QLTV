/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;


import Entities.KhachHang;
import Repostitories.IQuanLiKhachHangRepository;
import java.util.List;
import viewModel.QLKhachHang;
import Repostitories.QuanLiKhachHangRepository;
import java.util.ArrayList;
import Entities.KhachHang;
/**
 *
 * @author Admin
 */
public class ManageQuanLiKhachHangService implements IManageQuanLiKhachHangService{
private  IQuanLiKhachHangRepository _iQuanLiKhachHangRepository;
private List<QLKhachHang> _lstQlKhachHang;
public ManageQuanLiKhachHangService(){
    _iQuanLiKhachHangRepository = new QuanLiKhachHangRepository();
    _lstQlKhachHang =new ArrayList();
}
    @Override
    public List<QLKhachHang> getKhachHangs(int position, int pageSize) {
   _lstQlKhachHang = new ArrayList<>();
    var khachhang = _iQuanLiKhachHangRepository.findAll(position, pageSize);
    for (KhachHang x : khachhang) {
      _lstQlKhachHang.add(new QLKhachHang(x.getMaKH(), x.getTenKH(), x.getMatKhau(),x.getGioiTinh(),x.getNgaySinh(), x.getSĐT(),x.getEmail(),x.getDiaChi(),x.getTrangThai(),x.getSoLuongMuon()));
    }
    return _lstQlKhachHang;  }

    @Override
    public QLKhachHang getProductById(long id) {
     var x = _iQuanLiKhachHangRepository.findById(id);
    return new QLKhachHang(x.getMaKH(), x.getTenKH(), x.getMatKhau(),x.getGioiTinh(),x.getNgaySinh(), x.getSĐT(),x.getEmail(),x.getDiaChi(),x.getTrangThai(),x.getSoLuongMuon());
}

    @Override
    public QLKhachHang createNewProduct(QLKhachHang khachHang) {
     khachHang.setMaKH(null);
    var x = _iQuanLiKhachHangRepository.save(new KhachHang(khachHang.getMaKH(), khachHang.getTenKH(), khachHang.getMatKhau(),khachHang.getGioiTinh(),khachHang.getNgaySinh(), khachHang.getSĐT(),khachHang.getEmail(),
            khachHang.getDiaChi(),khachHang.getTrangThai(),khachHang.getSoLuongMuon()));
    return new QLKhachHang(x.getMaKH(), x.getTenKH(), x.getMatKhau(),x.getGioiTinh(),x.getNgaySinh(), x.getSĐT(),x.getEmail(),x.getDiaChi(),x.getTrangThai(),x.getSoLuongMuon());  }

    @Override
    public QLKhachHang updateProductById(QLKhachHang khachHang) {
         var x = _iQuanLiKhachHangRepository.save(new KhachHang(khachHang.getMaKH(), khachHang.getTenKH(), khachHang.getMatKhau(),khachHang.getGioiTinh(),khachHang.getNgaySinh(), khachHang.getSĐT(),khachHang.getEmail(),
            khachHang.getDiaChi(),khachHang.getTrangThai(),khachHang.getSoLuongMuon()));
    return new QLKhachHang(x.getMaKH(), x.getTenKH(), x.getMatKhau(),x.getGioiTinh(),x.getNgaySinh(), x.getSĐT(),x.getEmail(),x.getDiaChi(),x.getTrangThai(),x.getSoLuongMuon());
  }

    @Override
    public long countAllProducts() {
return _iQuanLiKhachHangRepository.totalCount();
    }
     
}
