/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositories;

import Entities.Sach;
import Entities.TheLoai;
import java.util.List;

/**
 *
 * @author Toan
 */
public interface ITheLoaiRepository {
    List<TheLoai> findAll();
    TheLoai save(TheLoai theLoai);
}
