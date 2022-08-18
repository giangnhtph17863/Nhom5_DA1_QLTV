/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entities.PhieuTra;
import Model.PhieuTraModel;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface IPhieuTraService {
      List<PhieuTra> getCTPhieutra();
      PhieuTra getPhieuTraById(Integer maPM);
}
