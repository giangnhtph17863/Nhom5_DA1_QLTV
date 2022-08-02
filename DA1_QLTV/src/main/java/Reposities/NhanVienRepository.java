/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reposities;

import Entities.NhanVien;
import Utillities.HibernateUtil;
import java.util.List;
import javax.persistence.TypedQuery;
import org.hibernate.Session;

/**
 *
 * @author Admin
 */
public class NhanVienRepository implements INhanVienRepository{

    @Override
    public List<NhanVien> findAll() {
        List<NhanVien> nv;
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql = " select p from NhanVien p";
            TypedQuery<NhanVien> query = session.createQuery(hql, NhanVien.class);
            nv = query.getResultList();
        }
        return nv;
    }

    @Override
    public NhanVien findById(String maNv) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public NhanVien save(NhanVien nv) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public NhanVien findbyMaNV(String manv) {
        NhanVien nv;
        try (Session session = HibernateUtil.getSessionFactory().openSession()){
        String hql = "FROM NhanVien AS p WHERE p.maNV = :maNV";
        TypedQuery<NhanVien> query = session.createQuery(hql, NhanVien.class);
        query.setParameter("maNV", manv);
        nv = query.getSingleResult();
    }
        return  nv;
    }
    
}
