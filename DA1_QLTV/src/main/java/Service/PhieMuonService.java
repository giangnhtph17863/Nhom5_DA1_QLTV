/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entities.PhieuMuon;
import Models.PhieuMuonModels;
import Reposities.IPhieuMuonRepository;
import Reposities.PhieuMuonRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class PhieMuonService implements IPhieuMuonService{
      private final IPhieuMuonRepository _iPhieuMuonRepository;
    private List<PhieuMuonModels> _lstPhieuMuonMOdel;
     public PhieMuonService() {
        _iPhieuMuonRepository = new PhieuMuonRepository();
        _lstPhieuMuonMOdel = new ArrayList<>();
    }

    @Override
    public List<PhieuMuonModels> getPhieuMuon(int position, int pageSize) {
        _lstPhieuMuonMOdel = new ArrayList<>();
        var phieumuon = _iPhieuMuonRepository.findAll();
        for (PhieuMuon x : phieumuon) {
           _lstPhieuMuonMOdel.add(new PhieuMuonModels(x.getMaPM(),
                   x.getNgayMuon(),
                   x.getNgayTra(),
                   x.getTienCoc(),
                   x.getTrangThai(),
                   x.getKhachHang(),
                   x.getNhanVien() ));
        }
        return _lstPhieuMuonMOdel;
    }

    @Override
    public PhieuMuonModels getPhieuMuonByID(String maPhieuMuon) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PhieuMuonModels createNewPhieumuon(PhieuMuonModels phieumuon) {
         var s = _iPhieuMuonRepository.save(new PhieuMuon(phieumuon.getMAPM(),
                phieumuon.getNgayMuon(), 
                phieumuon.getNgayTra(),
                phieumuon.getTienCoc(),
                phieumuon.getTrangThai(), 
                phieumuon.getMaKH(),
                phieumuon.getMaNV())
        );
       return  new PhieuMuonModels(s.getMaPM(), s.getNgayMuon(), s.getNgayTra(), s.getTienCoc(), s.getTrangThai(), s.getKhachHang(), s.getNhanVien());
    }

    @Override
    public PhieuMuonModels updatePhieumuonById(PhieuMuonModels phieumuon) {
        var s = _iPhieuMuonRepository.save(new PhieuMuon(phieumuon.getMAPM(), phieumuon.getNgayMuon(),
                phieumuon.getNgayTra(), 
                phieumuon.getTienCoc(),
                phieumuon.getTrangThai(),
                phieumuon.getMaKH(),
                phieumuon.getMaNV()));
        return  new PhieuMuonModels(s.getMaPM(), s.getNgayMuon(), s.getNgayTra(), s.getTienCoc(), s.getTrangThai(), s.getKhachHang(), s.getNhanVien());
    }

    @Override
    public long countAllProducts() {
        return _iPhieuMuonRepository.totalCount();
    }
    
}
