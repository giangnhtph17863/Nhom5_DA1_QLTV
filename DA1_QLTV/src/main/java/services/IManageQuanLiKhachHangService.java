/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;

import java.util.List;
import viewModel.QLKhachHang;

/**
 *
 * @author Admin
 */
public interface IManageQuanLiKhachHangService {
     List<QLKhachHang> getKhachHangs(int position, int pageSize);
    
    QLKhachHang getProductById(long id);
    
    QLKhachHang createNewProduct(QLKhachHang khachHang);
    
    QLKhachHang updateProductById(QLKhachHang khachHang);
  
    long countAllProducts();
}
