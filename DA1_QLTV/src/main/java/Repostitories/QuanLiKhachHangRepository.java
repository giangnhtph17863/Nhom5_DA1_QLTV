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
    public List<KhachHang> findAll() {
       List<KhachHang> khachHangs;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql = "SELECT p FROM KhachHang p";
            TypedQuery<KhachHang> query = session.createQuery(hql, KhachHang.class);
            khachHangs = query.getResultList();
        }
        return khachHangs; }

    @Override
    public KhachHang findById(String makh) {
     KhachHang khachHang;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql = "SELECT p FROM KhachHang p WHERE p.maKH = :maKH";
            TypedQuery<KhachHang> query = session.createQuery(hql, KhachHang.class);
            query.setParameter("maKH", makh);
            khachHang = query.getSingleResult();
        }
        return khachHang;   }

    @Override
    public KhachHang findbyName(String name) {
   KhachHang khachhang;
   try (Session session = HibernateUtil.getSessionFactory().openSession()){
            String hql = "SELECT s FROM KHACHHANG s WHERE s.tenKH = :tenKH";
            TypedQuery<KhachHang> query = session.createQuery(hql, KhachHang.class);
            query.setParameter("maSach", name);
            khachhang = query.getSingleResult();
        }
        return khachhang;
    }
    
}
