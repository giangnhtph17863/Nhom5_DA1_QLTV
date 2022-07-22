/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repostitories;

import Entities.KhachHang;
import Utillities.HibernateUtil;
import java.util.List;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Admin
 */
public class QuanLiKhachHangRepository implements IQuanLiKhachHangRepository{

    @Override
    public List<KhachHang> findAll(int position, int pageSize) {
         List<KhachHang> khachHangs;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql = "SELECT p FROM KhachHang p";
            TypedQuery<KhachHang> query = session.createQuery(hql, KhachHang.class);
            query.setFirstResult(position);
            query.setMaxResults(pageSize);
            khachHangs = query.getResultList();
        }
        return khachHangs;
         }

    @Override
    public KhachHang findById(long id) {
         KhachHang khachHang;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql = "SELECT p FROM KhachHang p WHERE p.id = :id";
            TypedQuery<KhachHang> query = session.createQuery(hql, KhachHang.class);
            query.setParameter("id", id);
            khachHang = query.getSingleResult();
        }
        return khachHang;
     }

    @Override
    public KhachHang save(KhachHang khachHang) {
          try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction trans = session.getTransaction();
            trans.begin();
            try {
                session.saveOrUpdate(khachHang);
                trans.commit();
            } catch (Exception e) {
                e.printStackTrace();
                trans.rollback();
                khachHang = null;
            }
        } finally {
            return khachHang;
        }
     }

    @Override
    public long totalCount() {
        long total = 0;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            String statement = "SELECT COUNT(p.id) FROM KhachHang p";
            TypedQuery<Long> query = session.createQuery(statement, Long.class);
            total = query.getSingleResult();
        }
        return total;
     }
    
}
