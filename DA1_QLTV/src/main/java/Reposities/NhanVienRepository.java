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
import org.hibernate.Transaction;

/**
 *
 * @author LENOVO
 */
public class NhanVienRepository implements INhanVienRepository {

    @Override
    public List<NhanVien> findAll() {
List<NhanVien> nhanvien;
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql = "from Nhavien";
            TypedQuery<NhanVien> query = session.createQuery(hql, NhanVien.class);
            nhanvien = query.getResultList();
        }
        return nhanvien;
        
    }

    @Override
    public NhanVien findById(String maNV) {
        NhanVien nhanvien;
        try (Session session = HibernateUtil.getSessionFactory().openSession()){
            String hql = "SELECT nv FROM NHANVIEN nv WHERE nv.maNV = :maNV";
            TypedQuery<NhanVien> query = session.createQuery(hql, NhanVien.class);
            query.setParameter("maNV", maNV);
            nhanvien = query.getSingleResult();
        }
        return nhanvien;
    }

    @Override
    public NhanVien save(NhanVien nhanvien) {
         try (Session session = HibernateUtil.getSessionFactory().openSession()){
            Transaction trans = session.getTransaction();
            trans.begin();
            try {
                session.saveOrUpdate(nhanvien);
                trans.commit();
            } catch (Exception e) {
                e.printStackTrace();
                trans.rollback();
                nhanvien = null;
            }
        }finally{
            return nhanvien;
        }
    }

    @Override
    public NhanVien findbyName(String tenNV) {
        NhanVien sach;
        try (Session session = HibernateUtil.getSessionFactory().openSession()){
            String hql = "SELECT nv FROM SACH nv WHERE nv.tenNV = :tenNV";
            TypedQuery<NhanVien> query = session.createQuery(hql, NhanVien.class);
            query.setParameter("tenNV", tenNV);
            sach = query.getSingleResult();
        }
        return sach;
    }
    }
    
