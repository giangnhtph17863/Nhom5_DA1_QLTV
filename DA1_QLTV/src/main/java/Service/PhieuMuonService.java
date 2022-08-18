/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entities.PhieuMuon;
import Model.PhieuMuonModel;
import Repositories.IPhieuMuonRepository;
import Repositories.PhieuMuonRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class PhieuMuonService implements IPhieuMuonService{
      private final IPhieuMuonRepository _iPhieuMuonRepository;
    private List<PhieuMuon> _lstPhieuMuonMOdel;
     public PhieuMuonService() {
        _iPhieuMuonRepository = new PhieuMuonRepository();
        _lstPhieuMuonMOdel = new ArrayList<>();
    }

    @Override
    public List<PhieuMuon> getPhieuMuon() {
        _lstPhieuMuonMOdel = new ArrayList<>();
        var phieumuon = _iPhieuMuonRepository.findAll();
        for (PhieuMuon x : phieumuon) {
           _lstPhieuMuonMOdel.add(new PhieuMuon(x.getMaPM(),
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
    public PhieuMuon getPhieuMuonByID(String maPhieuMuon) {
        var pm = _iPhieuMuonRepository.findById(maPhieuMuon);
        return new PhieuMuon(pm.getMaPM(), pm.getNgayMuon(), pm.getNgayTra(), pm.getTienCoc()
                ,pm.getTrangThai(), pm.getKhachHang(), pm.getNhanVien());
    }

    @Override
    public PhieuMuon createNewPhieumuon(PhieuMuon phieumuon) {
        phieumuon.setMaPM(null);
         var s = _iPhieuMuonRepository.save(new PhieuMuon(phieumuon.getMaPM(),
                phieumuon.getNgayMuon(), 
                phieumuon.getNgayTra(),
                phieumuon.getTienCoc(),
                phieumuon.getTrangThai(), 
                phieumuon.getKhachHang(),
                phieumuon.getNhanVien())
        );
       return  new PhieuMuon(s.getMaPM(), s.getNgayMuon(), s.getNgayTra(), s.getTienCoc(), s.getTrangThai(), s.getKhachHang(), s.getNhanVien());
    }

    @Override
    public PhieuMuon updatePhieumuonById(PhieuMuon phieumuon) {
        var s = _iPhieuMuonRepository.save(new PhieuMuon(phieumuon.getMaPM(), phieumuon.getNgayMuon(),
                phieumuon.getNgayTra(), 
                phieumuon.getTienCoc(),
                phieumuon.getTrangThai(),
                phieumuon.getKhachHang(),
                phieumuon.getNhanVien()));
        return  new PhieuMuon(s.getMaPM(), s.getNgayMuon(), s.getNgayTra(), s.getTienCoc(), s.getTrangThai(), s.getKhachHang(), s.getNhanVien());
    }
    
}
