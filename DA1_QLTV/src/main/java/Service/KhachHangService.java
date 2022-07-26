/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entities.KhachHang;
import Model.KhachHangModel;
import Reposities.IKhachHangRepository;
import Reposities.KhachHangRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class KhachHangService implements IKhachHangService{
   private final IKhachHangRepository _iKhachHangRepository;
   private List<KhachHangModel> _lstKhachHangmodel;

    public KhachHangService() {
        _iKhachHangRepository = new KhachHangRepository();
        _lstKhachHangmodel = new ArrayList<>();
    }
    

    @Override
    public List<KhachHang> getKhachHang() {
        _lstKhachHangmodel = new ArrayList<>();
        var khachhang = _iKhachHangRepository.findAll();
        for (KhachHang x : khachhang) {
            _lstKhachHangmodel.add(new KhachHangModel(x.getMaKH(),
                                                      x.getTenKH(), 
                                                      x.getMatKhau(), 
                                                      x.getGioiTinh(),  
                                                      x.getNgaySinh(),  
                                                      x.getSĐT(),  
                                                      x.getEmail(),  
                                                      x.getDiaChi(), 
                                                      x.getMaNV(), 
                                                      x.getTrangThai(), 
                                                      x.getSoLuongMuon()));
        }
        return khachhang;
    }

    @Override
    public KhachHang getKhachHangByID(String maKhachHang) {
        // viet sql lay khách hàng theo mã khách hàng
       return new KhachHang();
    }

    @Override
    public KhachHang createNewkhachHang(KhachHang nv) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public KhachHang updateKhachHangById(KhachHang nv) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
