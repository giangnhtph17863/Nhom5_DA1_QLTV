/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import Entities.PhieuTra;
import Utillities.HibernateUtil;
import java.util.List;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Toan
 */
public class PhieuTraRepositories implements IPhieuTraRepository{

    @Override
    public List<PhieuTra> findAll() {
        List<PhieuTra> phieuTra;
        try (Session session = HibernateUtil.getSessionFactory().openSession()){
            String hql = "from PhieuTra";
            TypedQuery<PhieuTra> query = session.createQuery(hql, PhieuTra.class);
            phieuTra = query.getResultList();
        }
        return phieuTra;
    }

    @Override
    public PhieuTra fingById(Integer maPM) {
        PhieuTra phieuTra;
        try (Session session = HibernateUtil.getSessionFactory().openSession()){
            String hql = "from PhieuTra t where t.maPM = :maPM";
            TypedQuery<PhieuTra> query = session.createQuery(hql, PhieuTra.class);
            query.setParameter("maPM", maPM);
            phieuTra = query.getSingleResult();
        }
        return phieuTra;
    }

    @Override
    public PhieuTra save(PhieuTra phieuTra) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()){
            Transaction trans = session.getTransaction();
            trans.begin();
            try {
                session.saveOrUpdate(phieuTra);
                trans.commit();
            } catch (Exception e) {
                e.printStackTrace();
                trans.rollback();
                phieuTra = null;
            }
        }finally{
            return phieuTra;
        }
    }
    
}
