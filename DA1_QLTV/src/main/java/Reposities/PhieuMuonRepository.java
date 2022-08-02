/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reposities;

import Entities.PhieuMuon;
import Utillities.HibernateUtil;
import java.util.List;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
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
            String hql = "select p from PhieuMuon p";
            TypedQuery<PhieuMuon> query = session.createQuery(hql, PhieuMuon.class);
            phieumuon = query.getResultList();
        }
        return phieumuon;
    }

    @Override
    public PhieuMuon findById(String MaPhieuMuon) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PhieuMuon save(PhieuMuon phieuMuon) {
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

    @Override
    public long totalCount() {
        long total = 0;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            String statement = "SELECT COUNT(p.id) FROM PhieuMuon p";
            TypedQuery<Long> query = session.createQuery(statement, Long.class);
            total = query.getSingleResult();
        }
        return total;
    }
    
}
