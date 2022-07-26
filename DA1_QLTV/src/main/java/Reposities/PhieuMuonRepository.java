/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reposities;

import Entities.PhieuMuon;
import Model.PhieuMuonModel;
import java.util.List;
import Utillities.HibernateUtil;
import org.hibernate.Session;
import javax.persistence.TypedQuery;
import org.hibernate.Transaction;

/**
 *
 * @author Admin
 */
public class PhieuMuonRepository implements IPhieuMuonRepository{

    @Override
    public List<PhieuMuon> findAll() {
        List<PhieuMuon> phieumuon;
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql = "from PhieuMuon";
            TypedQuery<PhieuMuon> query = session.createQuery(hql, PhieuMuon.class);
            phieumuon = query.getResultList();
        }
        return phieumuon;
    }

    @Override
    public PhieuMuon findById(String maSach) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PhieuMuon  save(PhieuMuon phieuMuon) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()){
            Transaction trans = session.getTransaction();
            trans.begin();
            try {
                session.saveOrUpdate(phieuMuon);
                trans.commit();
            } catch (Exception e) {
                e.printStackTrace();
                trans.rollback();
                phieuMuon = null;
            }
        }finally{
            return phieuMuon;
        }
    }

    @Override
    public PhieuMuon findbyName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
