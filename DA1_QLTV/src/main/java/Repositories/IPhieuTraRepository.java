/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositories;

import Entities.PhieuTra;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface IPhieuTraRepository {
      List<PhieuTra> findAll();
      
      PhieuTra fingById(Integer maPM);
      
      PhieuTra save(PhieuTra phieuTra);
}
