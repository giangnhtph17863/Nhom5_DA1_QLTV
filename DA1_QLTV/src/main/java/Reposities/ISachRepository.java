/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Reposities;

import java.util.List;
import Entities.Sach;
/**
 *
 * @author Toan
 */
public interface ISachRepository {
     List<Sach> findAll();
    
    Sach findById(String maSach);
    
    Sach save(Sach sach);
    
    Sach findbyName(String name);
}
