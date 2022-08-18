/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import Entities.CTPhieuMuon;
import Entities.CTPhieuMuon;
import Entities.CTPhieuMuon;
import Entities.CTPhieuMuon;
import Utillities.HibernateUtil;
import java.util.List;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Admin
 */
public class CTPhieumuonRepository implements ICTPhieumuonRepository{

    @Override
    public List<CTPhieuMuon> findAll() {
 List<CTPhieuMuon> CTPhieuMuon;
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql = "from CTPhieuMuon";
            TypedQuery<CTPhieuMuon> query = session.createQuery(hql, CTPhieuMuon.class);
            CTPhieuMuon = query.getResultList();
        }
        return CTPhieuMuon;    }

    @Override
    public CTPhieuMuon findById(Integer maPM) {
        CTPhieuMuon CTPhieuMuon;
        try (Session session = HibernateUtil.getSessionFactory().openSession()){
            String hql = "from CTPhieuMuon s WHERE s.maPM = :maPM";
            TypedQuery<CTPhieuMuon> query = session.createQuery(hql, CTPhieuMuon.class);
            query.setParameter("maPM", maPM);
            CTPhieuMuon = query.getSingleResult();
        }
        return CTPhieuMuon;    
    }

    @Override
    public CTPhieuMuon save(CTPhieuMuon CTPhieuMuon) {
try (Session session = HibernateUtil.getSessionFactory().openSession()){
            Transaction trans = session.getTransaction();
            trans.begin();
            try {
                session.saveOrUpdate(CTPhieuMuon);
                trans.commit();
            } catch (Exception e) {
                e.printStackTrace();
                trans.rollback();
                CTPhieuMuon = null;
            }
        }finally{
            return CTPhieuMuon;
        }    }

    @Override
    public CTPhieuMuon findbyName(String name) {
         CTPhieuMuon CTPhieuMuon;
        try (Session session = HibernateUtil.getSessionFactory().openSession()){
            String hql = "SELECT s FROM CTPhieuMuon s WHERE s.maPM = :maPM";
            TypedQuery<CTPhieuMuon> query = session.createQuery(hql, CTPhieuMuon.class);
            query.setParameter("maPM", name);
            CTPhieuMuon = query.getSingleResult();
        }
        return CTPhieuMuon;
   
    }
    
}
