/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entities.KhachHang;
import Models.KhachHangModels;
import Repositories.IKhachHangRepository;
import Repositories.KhachHangRepository;
import java.util.List;

/**
 *
 * @author Admin
 */
public class KhachHangService implements IKhachHangService{
    private final IKhachHangRepository _iKHRepo;
    
    public KhachHangService(){
        _iKHRepo = new KhachHangRepository();
    }
    
    @Override
    public List<KhachHangModels> getKhachHang() {
         throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public KhachHang getKhachHangByID(String maKhachHang) {
        var x = _iKHRepo.findbyMaKH(maKhachHang);
    return new KhachHang(x.getMaKH(), x.getTenKH(), x.getMatKhau(), x.getGioiTinh(), x.getNgaySinh(), x.getSĐT(), x.getEmail(), x.getDiaChi(), x.getMaNV(), x.getTrangThai(), x.getSoLuongMuon());
    }

    @Override
    public KhachHangModels createNewkhachHang(KhachHangModels kh) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public KhachHangModels updateKhachHangById(KhachHangModels kh) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
