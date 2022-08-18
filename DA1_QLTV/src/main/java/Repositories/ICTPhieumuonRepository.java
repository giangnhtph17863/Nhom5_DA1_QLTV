/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositories;

import Entities.CTPhieuMuon;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface ICTPhieumuonRepository {
         List<CTPhieuMuon> findAll();
    
    CTPhieuMuon findById(Integer maPM);
    
    CTPhieuMuon save(CTPhieuMuon CTPhieuMuon);
    
    CTPhieuMuon findbyName(String name);
}
