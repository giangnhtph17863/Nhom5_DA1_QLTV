/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repostitories;

import Entities.KhachHang;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface IQuanLiKhachHangRepository {
     List<KhachHang> findAll(int position, int pageSize);
    
    KhachHang findById(long id);
    
    KhachHang save(KhachHang khachHang);
    

    long totalCount();
}
