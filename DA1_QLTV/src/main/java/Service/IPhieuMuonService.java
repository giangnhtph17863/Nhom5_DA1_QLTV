/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Models.PhieuMuonModels;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface IPhieuMuonService {
    List<PhieuMuonModels> getPhieuMuon(int position, int pageSize);
    PhieuMuonModels getPhieuMuonByID(String maPhieuMuon);
    PhieuMuonModels createNewPhieumuon(PhieuMuonModels phieumuon);
    PhieuMuonModels updatePhieumuonById(PhieuMuonModels phieumuon);
    long countAllProducts();
}
