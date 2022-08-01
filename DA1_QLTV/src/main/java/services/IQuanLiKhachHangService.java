/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;

import Entities.KhachHang;
import java.util.List;
import Model.QLKhachHang;

/**
 *
 * @author Admin
 */
public interface IQuanLiKhachHangService {
     List<QLKhachHang> getqlKhachHangs();  
    QLKhachHang getqlkhachhangById(String makh);  
    QLKhachHang createNewkhachhhang(QLKhachHang khachHang);
    QLKhachHang updatekhachhhangById(QLKhachHang khachHang);
    
}
