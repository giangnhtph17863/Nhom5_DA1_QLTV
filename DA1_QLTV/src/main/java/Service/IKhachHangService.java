/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entities.KhachHang;
import Models.KhachHangModels;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface IKhachHangService {
    List<KhachHangModels> getKhachHang();
    KhachHangModels getKhachHangByID(String maKhachHang);
    KhachHangModels createNewkhachHang(KhachHangModels kh);
    KhachHangModels updateKhachHangById(KhachHangModels kh);;
}
