/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helper;

import Entities.KhachHang;
import Entities.NhanVien;

/**
 *
 * @author LENOVO
 */
public class XAuther {
public static NhanVien USER = null;
    
    public static KhachHang UserKH = null;

    public static void clear() {
        XAuther.USER = null;
    }

    public static boolean isLogin() {
        return XAuther.USER != null;
    }
    
    public static boolean isLoginKH() {
        return XAuther.UserKH != null;
    }
    
    public static boolean isManager() {
        return XAuther.isLogin() && USER.getVaiTro();
    }
    
}
