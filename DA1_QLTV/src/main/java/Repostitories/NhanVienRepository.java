/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repostitories;

import Entities.KhachHang;
import Entities.NhanVien;
import Utillities.HibernateUtil;
import javax.persistence.TypedQuery;
import org.hibernate.Session;

/**
 *
 * @author Admin
 */
public class NhanVienRepository implements INhanVienRepository{

    @Override
    public NhanVien findbyMaNv(String manv) {
        NhanVien nv;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql = "SELECT p FROM NhanVien p WHERE p.maNV = :maNV";
            TypedQuery<NhanVien> query = session.createQuery(hql, NhanVien.class);
            query.setParameter("maNV", manv);
            nv = query.getSingleResult();
        }
        return nv;   }
    }
    
