/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;


import Entities.KhachHang;
import Repostitories.IQuanLiKhachHangRepository;
import java.util.List;
import Model.QLKhachHang;
import Repostitories.QuanLiKhachHangRepository;
import java.util.ArrayList;
import Entities.KhachHang;
/**
 *
 * @author Admin
 */
public class QuanLiKhachHangService implements IQuanLiKhachHangService{
private final IQuanLiKhachHangRepository _iQuanLiKhachHangRepository;
private List<QLKhachHang> _lstQlKhachHang;
public QuanLiKhachHangService(){
    _iQuanLiKhachHangRepository = new QuanLiKhachHangRepository();
    _lstQlKhachHang =new ArrayList();
}

    @Override
    public List<QLKhachHang> getqlKhachHangs() {
    _lstQlKhachHang = new ArrayList<>();
    var kh=_iQuanLiKhachHangRepository.findAll();
    for(KhachHang x : kh){
        _lstQlKhachHang.add(new QLKhachHang(x.getMaKH(),x.getTenKH(),x.getMatKhau(),
                x.getGioiTinh(),x.getNgaySinh(),x.getSĐT(),x.getEmail(),x.getDiaChi(),x.getMaNV(),x.getTrangThai(),x.getSoLuongMuon()));
    }
    return _lstQlKhachHang;
    }

    @Override
    public QLKhachHang getqlkhachhangById(String makh) {
    var x =_iQuanLiKhachHangRepository.findById(makh);
    return new QLKhachHang(x.getMaKH(),x.getTenKH(),x.getMatKhau(),x.getGioiTinh(),x.getNgaySinh(),x.getSĐT(),x.getEmail(),x.getDiaChi(),x.getMaNV(),x.getTrangThai(),x.getSoLuongMuon());
//List<QLKhachHang> list = getqlKhachHangs();
//        if (list.isEmpty()) {
//            return null;
//        }
//        return list.get(0);
    }

    @Override
    public QLKhachHang createNewkhachhhang(QLKhachHang khachHang) {
     var x=_iQuanLiKhachHangRepository.save(new KhachHang(khachHang.getMaKH(),khachHang.getTenKH(),khachHang.getMatKhau(),
                khachHang.getGioiTinh(),khachHang.getNgaySinh(),khachHang.getSĐT(),khachHang.getEmail(),khachHang.getDiaChi(),khachHang.getMaNV(),khachHang.getTrangThai(),khachHang.getSoLuongMuon()));
  return new QLKhachHang(x.getMaKH(), x.getTenKH(),x.getMatKhau(),x.getGioiTinh(),x.getNgaySinh(),x.getSĐT(),x.getEmail(),x.getDiaChi(),x.getMaNV(), x.getTrangThai(),x.getSoLuongMuon());
    }

    
    @Override
    public QLKhachHang updatekhachhhangById(QLKhachHang khachHang) {
     var x = _iQuanLiKhachHangRepository.save(new KhachHang(khachHang.getMaKH(),khachHang.getTenKH(),khachHang.getMatKhau(),
                khachHang.getGioiTinh(),khachHang.getNgaySinh(),khachHang.getSĐT(),khachHang.getEmail(),khachHang.getDiaChi(),khachHang.getMaNV(),khachHang.getTrangThai(),khachHang.getSoLuongMuon()));
   return new QLKhachHang(x.getMaKH(), x.getTenKH(),x.getMatKhau(),x.getGioiTinh(),x.getNgaySinh(),x.getSĐT(),x.getEmail(),x.getDiaChi(),x.getMaNV(), x.getTrangThai(),x.getSoLuongMuon());
 
    }
}