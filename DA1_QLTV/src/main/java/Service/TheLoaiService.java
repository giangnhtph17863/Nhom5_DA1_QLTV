/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entities.TheLoai;
import Model.SachModel;
import Model.TheLoaiModel;
import Repositories.ITheLoaiRepository;
import Repositories.TheLoaiRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Toan
 */
public class TheLoaiService implements ITheLoaiService{
    private final ITheLoaiRepository repo;
    private List<TheLoaiModel> _lstTheLoaiModel;
    
    public TheLoaiService(){
        repo = new TheLoaiRepository();
        _lstTheLoaiModel = new ArrayList<>();
    } 
    @Override
    public List<TheLoaiModel> getAllTheLoai() {
        _lstTheLoaiModel = new ArrayList<>();
        var tl = repo.findAll();
        for (TheLoai t : tl) {
            _lstTheLoaiModel.add(new TheLoaiModel(t.getMaTL(), t.getTenTL()));
        }
        return _lstTheLoaiModel;
    }

    @Override
    public TheLoaiModel createNewTheLoai(TheLoaiModel theLoai) {
        var tl = repo.save(new TheLoai(theLoai.getMaTL(), theLoai.getTenTL()));
        return new TheLoaiModel(tl.getMaTL(), tl.getTenTL());
    }

    @Override
    public TheLoaiModel updateTheLoaiById(TheLoaiModel theLoai) {
        var tl = repo.save(new TheLoai(theLoai.getMaTL(), theLoai.getTenTL()));
        return new TheLoaiModel(tl.getMaTL(), tl.getTenTL());
    }

    @Override
    public List<TheLoai> lstTheLoai() {
       return repo.findAll();
    }
    
}
