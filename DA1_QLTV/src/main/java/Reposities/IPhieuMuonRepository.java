/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reposities;

import Entities.PhieuMuon;
import Model.PhieuMuonModel;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface IPhieuMuonRepository {
    List<PhieuMuon> findAll();
    
    PhieuMuon findById(String MaPhieuMuon);
    
    PhieuMuon save(PhieuMuon phieuMuon);
    
    PhieuMuon findbyName(String name);
}
