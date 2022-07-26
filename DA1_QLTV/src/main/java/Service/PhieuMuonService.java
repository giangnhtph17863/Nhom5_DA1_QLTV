/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entities.PhieuMuon;

import Model.PhieuMuonModel;
import Reposities.IPhieuMuonRepository;
import Reposities.PhieuMuonRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class PhieuMuonService implements IPhieuMuonService{
    private final IPhieuMuonRepository _iPhieuMuonRepository;
    private List<PhieuMuonModel> _lstPhieuMuonMOdel;

    public PhieuMuonService() {
        _iPhieuMuonRepository = new PhieuMuonRepository();
        _lstPhieuMuonMOdel = new ArrayList<>();
    }
    
    @Override
    public List<PhieuMuonModel> getPhieuMuon() {
        _lstPhieuMuonMOdel = new ArrayList<>();
        var phieumuon = _iPhieuMuonRepository.findAll();
        for (PhieuMuon x : phieumuon) {
           _lstPhieuMuonMOdel.add(new PhieuMuonModel(x.getMaPM(), x.getNgayMuon(), x.getNgayTra(), x.getTienCoc(), x.getTrangThai(), x.getKhachHang(), x.getNhanVien() ));
        }
        return _lstPhieuMuonMOdel;
    }

    @Override
    public PhieuMuonModel getPhieuMuonByID(String maPhieuMuon) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PhieuMuonModel createNewPhieumuon(PhieuMuonModel phieumuon) {
        var s = _iPhieuMuonRepository.save(new PhieuMuon(phieumuon.getMAPM(),
                phieumuon.getNgayMuon(), 
                phieumuon.getNgayTra(),
                phieumuon.getTienCoc(),
                phieumuon.getTrangThai(), 
                phieumuon.getMaKH(),
                phieumuon.getMaNV())
        );
       return  phieumuon;
    }

    @Override
    public PhieuMuonModel updatePhieumuonById(PhieuMuonModel phieumuon) {
        var s = _iPhieuMuonRepository.save(new PhieuMuon(phieumuon.getMAPM(), phieumuon.getNgayMuon(),
                phieumuon.getNgayTra(), 
                phieumuon.getTienCoc(),
                phieumuon.getTrangThai(),
                phieumuon.getMaKH(),
                phieumuon.getMaNV()));
        return  phieumuon;
    }
    
}
