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
    List<PhieuMuonModel> getPhieuMuon();
    PhieuMuonModel getPhieuMuonByID(String maPhieuMuon);
    PhieuMuonModel createNewPhieumuon(PhieuMuonModel phieumuon);
    PhieuMuonModel updatePhieumuonById(PhieuMuonModel phieumuon);;
}
