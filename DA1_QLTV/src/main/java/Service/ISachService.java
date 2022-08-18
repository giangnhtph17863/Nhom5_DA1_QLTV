/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import Entities.Sach;
import Model.SachModel;
import java.util.List;

/**
 *
 * @author Toan
 */
public interface ISachService {
    List<SachModel> getSach();
    SachModel getSachByID(String maSach);
    SachModel createNewSach(SachModel sach);
    SachModel updateSachById(SachModel sach);
    SachModel getSachByName(String tenSach);
    List<SachModel> search(String temp);
    List<SachModel> getLstSach();
}
