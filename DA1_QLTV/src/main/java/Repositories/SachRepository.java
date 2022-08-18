/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import Entities.Sach;
import Utillities.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import javax.persistence.TypedQuery;
import org.hibernate.Transaction;

/**
 *
 * @author Toan
 */
public class SachRepository implements ISachRepository {

    @Override
    public List<Sach> findAll() {
        List<Sach> sach;
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql = "from Sach";
            TypedQuery<Sach> query = session.createQuery(hql, Sach.class);
            sach = query.getResultList();
        }
        return sach;
    }

    @Override
    public Sach findById(String maSach) {
        Sach sach;
        try (Session session = HibernateUtil.getSessionFactory().openSession()){
            String hql = "from Sach s WHERE s.maSach = :maSach";
            TypedQuery<Sach> query = session.createQuery(hql, Sach.class);
            query.setParameter("maSach", maSach);
            sach = query.getSingleResult();
        }
        return sach;
    }

    @Override
    public Sach save(Sach sach) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()){
            Transaction trans = session.getTransaction();
            trans.begin();
            try {
                session.saveOrUpdate(sach);
                trans.commit();
            } catch (Exception e) {
                e.printStackTrace();
                trans.rollback();
                sach = null;
            }
        }finally{
            return sach;
        }
    }

    @Override
    public Sach findbyName(String name) {
        Sach sach;
        try (Session session = HibernateUtil.getSessionFactory().openSession()){
            String hql = "from Sach s WHERE s.tenSach = :tenSach";
            TypedQuery<Sach> query = session.createQuery(hql, Sach.class);
            query.setParameter("tenSach", name);
            sach = query.getSingleResult();
        }
        return sach;
    }
}
