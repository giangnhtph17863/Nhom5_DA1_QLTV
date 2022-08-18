/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import Entities.KhachHang;
import Utillities.HibernateUtil;
import java.util.List;
import javax.persistence.TypedQuery;
import org.hibernate.Session;

/**
 *
 * @author Admin
 */
public class KhachHangRepository implements IKhachHangRepository{

    @Override
    public List<KhachHang> findAll() {
        List<KhachHang> khachhang;
        try (Session session = HibernateUtil.getSessionFactory().openSession()){
        String hql = "select p from KhachHang p";
        TypedQuery<KhachHang> query = session.createQuery(hql, KhachHang.class);
        khachhang = query.getResultList();
    }
        return khachhang;
    }

    @Override
    public KhachHang save(KhachHang kh) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public KhachHang findbyMaKH(String makh) {
        KhachHang khachhang;
        try (Session session = HibernateUtil.getSessionFactory().openSession()){
        String hql = "FROM KhachHang p WHERE p.maKH = :maKH";
        TypedQuery<KhachHang> query = session.createQuery(hql, KhachHang.class);
        query.setParameter("maKH", makh);
        khachhang = query.getSingleResult();
    }
        return  khachhang;
    }
    
}
