/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entities.PhieuMuon;
import Model.PhieuMuonModel;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface IPhieuMuonService {
    List<PhieuMuon> getPhieuMuon();
    PhieuMuon getPhieuMuonByID(String maPhieuMuon);
    PhieuMuon createNewPhieumuon(PhieuMuon phieumuon);
    PhieuMuon updatePhieumuonById(PhieuMuon phieumuon);
//    public PhieuMuonModel getPhieuMuonByID(Integer maPM);
}
