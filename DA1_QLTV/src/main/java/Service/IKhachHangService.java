/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entities.KhachHang;
import Model.KhachHangModel;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface IKhachHangService {
    List<KhachHang> getKhachHang();
    KhachHang getKhachHangByID(String maKhachHang);
    KhachHang createNewkhachHang(KhachHang nv);
    KhachHang updateKhachHangById(KhachHang nv);;
}
