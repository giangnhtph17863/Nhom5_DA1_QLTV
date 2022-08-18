/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import Model.CTPhieuMuonModel;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface ICTPhieumuonService {
    List<CTPhieuMuonModel> getCTPhieumuon();
    CTPhieuMuonModel getCTPhieumuonByID(Integer maPM);
    CTPhieuMuonModel createNewCTPhieumuon(CTPhieuMuonModel ctpm);
    CTPhieuMuonModel updateCTPhieumuonById(CTPhieuMuonModel ctpm);
}
