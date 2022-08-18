/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entities.PhieuTra;
import Model.PhieuTraModel;
import Repositories.IPhieuTraRepository;
import Repositories.PhieuTraRepositories;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class PhieuTraServeice implements IPhieuTraService {

    private final IPhieuTraRepository _IPhieuTraRepository;
    private List<PhieuTra> _lstPhieuTraModel;

    public PhieuTraServeice() {
        _IPhieuTraRepository = new PhieuTraRepositories();
        _lstPhieuTraModel = new ArrayList<>();
    }

    @Override
    public List<PhieuTra> getCTPhieutra() {
        _lstPhieuTraModel = new ArrayList<>();
        var pt = _IPhieuTraRepository.findAll();
        for (PhieuTra s : pt) {
            _lstPhieuTraModel.add(new PhieuTra(
                    s.getMaPM(),
                    s.getMaSach(),
                    s.getSoTienCoc(),
                    s.getTienPhat()));
        }
        return _lstPhieuTraModel;
    }

    @Override
    public PhieuTra getPhieuTraById(Integer maPM) {
        var pt = _IPhieuTraRepository.fingById(maPM);
        return new PhieuTra(pt.getMaPM(), pt.getMaSach(), pt.getSoTienCoc(), pt.getTienPhat());
    }

}
