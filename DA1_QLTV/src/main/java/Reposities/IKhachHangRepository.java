/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reposities;

import Entities.KhachHang;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface IKhachHangRepository {
     List<KhachHang> findAll();
    
     KhachHang save(KhachHang kh);
   
    KhachHang findbyMaKH(String makh);
}
