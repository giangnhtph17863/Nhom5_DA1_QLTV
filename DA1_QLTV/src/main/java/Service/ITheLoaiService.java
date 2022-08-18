/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import Entities.TheLoai;
import Model.TheLoaiModel;
import java.util.List;

/**
 *
 * @author Toan
 */
public interface ITheLoaiService {
    List<TheLoai> lstTheLoai();
    List<TheLoaiModel> getAllTheLoai();
    TheLoaiModel createNewTheLoai(TheLoaiModel theLoai);
    TheLoaiModel updateTheLoaiById(TheLoaiModel theLoai);
}
