/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entities.CTPhieuMuon;
import Model.CTPhieuMuonModel;
import Repositories.ICTPhieumuonRepository;
import Repositories.CTPhieumuonRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class CTPhieumuonService implements ICTPhieumuonService{
 private final ICTPhieumuonRepository _iCTPhieumuonRepository;
    private List<CTPhieuMuonModel> _lstCTPhieumuonModels;
    
    public CTPhieumuonService(){
        _iCTPhieumuonRepository = new CTPhieumuonRepository();
        _lstCTPhieumuonModels= new ArrayList<>();
    }
    @Override
    public List<CTPhieuMuonModel> getCTPhieumuon() {
        _lstCTPhieumuonModels = new ArrayList<>();
        var ctpm = _iCTPhieumuonRepository.findAll();
        for (CTPhieuMuon s : ctpm) {
            _lstCTPhieumuonModels.add(new CTPhieuMuonModel(
                    s.getPhieuMuon(),
                    s.getMaSach(),
                    s.getTinhTrang(),
                    s.getTienPhat(),
                    s.getNgayTra(),
                    s.getGhiChu()));
        }
        return _lstCTPhieumuonModels;
    }    

    @Override
    public CTPhieuMuonModel getCTPhieumuonByID(Integer maPM) {
var s = _iCTPhieumuonRepository.findById(maPM);
        return new CTPhieuMuonModel( 
                    s.getPhieuMuon(),
                    s.getMaSach(),
                    s.getTinhTrang(),
                    s.getTienPhat(),
                    s.getNgayTra(),
                    s.getGhiChu());
        }

    @Override
    public CTPhieuMuonModel createNewCTPhieumuon(CTPhieuMuonModel ctpm) {
  var s = _iCTPhieumuonRepository.save(new CTPhieuMuon(
                    ctpm .getPhieuMuon(),
                    ctpm.getMaSach(),
                    ctpm.getTinhTrang(),
                    ctpm.getTienPhat(),
                    ctpm.getNgayTra(),
                    ctpm.getGhiChu()));
        return new CTPhieuMuonModel(
                s.getPhieuMuon(),
                    s.getMaSach(),
                    s.getTinhTrang(),
                    s.getTienPhat(),
                    s.getNgayTra(),
                    s.getGhiChu());
       }

    @Override
    public CTPhieuMuonModel updateCTPhieumuonById(CTPhieuMuonModel ctpm) {
 var c = _iCTPhieumuonRepository.save(new CTPhieuMuon(
                    ctpm .getPhieuMuon(),
                    ctpm.getMaSach(),
                    ctpm.getTinhTrang(),
                    ctpm.getTienPhat(),
                    ctpm.getNgayTra(),
                    ctpm.getGhiChu()));
        return new CTPhieuMuonModel(
                    c.getPhieuMuon(),
                    c.getMaSach(),
                    c.getTinhTrang(),
                    c.getTienPhat(),
                    c.getNgayTra(),
                    c.getGhiChu());
      }
    
}
