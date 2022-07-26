/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entities.Sach;
import Model.SachModel;
import Reposities.ISachRepository;
import Reposities.SachRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Toan
 */
public class SachService implements ISachService{
    private final ISachRepository _iSachRepository;
    private List<SachModel> _lstSachModel;
    
    public SachService(){
        _iSachRepository = new SachRepository();
        _lstSachModel = new ArrayList<>();
    }
    
    @Override
    public List<SachModel> getSach() {
        _lstSachModel = new ArrayList<>();
        var sach = _iSachRepository.findAll();
        for (Sach s : sach) {
            _lstSachModel.add(new SachModel(s.getMaSach(), s.getNXB(), s.getTenSach(),
                    s.getNoiDat(), s.getGiaTien(), s.getTacGia(), s.getNamXB(), s.getSoLuong(), s.getMaTL()));
        }
        return _lstSachModel;
    }

    @Override
    public SachModel getSachByID(String maSach) {
        var s = _iSachRepository.findById(maSach);
        return new SachModel(s.getMaSach(), s.getNXB(), s.getTenSach(), s.getNoiDat(),
                s.getGiaTien(), s.getTacGia(), s.getNamXB(), s.getSoLuong(), s.getMaTL());
    
    }

    @Override
    public SachModel createNewSach(SachModel sach) {
        var s = _iSachRepository.save(new Sach(sach.getMaSach(), sach.getNXB(), sach.getTenSach(), sach.getNoiDat(), sach.getGiaTien(), sach.getTacGia(), sach.getNamXB(), sach.getSoLuong(), sach.getMaTL()));
        return new SachModel(s.getMaSach(), s.getNXB(), s.getTenSach(), s.getNoiDat(),
                s.getGiaTien(), s.getTacGia(), s.getNamXB(), s.getSoLuong(), s.getMaTL());
    }

    @Override
    public SachModel updateSachById(SachModel sach) {
        var s = _iSachRepository.save(new Sach(sach.getMaSach(), sach.getNXB(), sach.getTenSach(),sach.getNoiDat(), sach.getGiaTien(), sach.getTacGia(),
                sach.getNamXB(), sach.getSoLuong(), sach.getMaTL()));
        return new SachModel(s.getMaSach(), s.getNXB(), s.getTenSach(), s.getNoiDat(),
                s.getGiaTien(), s.getTacGia(), s.getNamXB(), s.getSoLuong(), s.getMaTL());
    }
    
}
