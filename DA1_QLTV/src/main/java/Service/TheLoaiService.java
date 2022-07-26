/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entities.TheLoai;
import Reposities.ITheLoaiRepository;
import Reposities.TheLoaiRepository;
import java.util.List;

/**
 *
 * @author Toan
 */
public class TheLoaiService implements ITheLoaiService{
    private final ITheLoaiRepository repo;
    
    public TheLoaiService(){
        repo = new TheLoaiRepository();
    } 
    @Override
    public List<TheLoai> getAllTheLoai() {
        return repo.findAll();
    }
    
}
