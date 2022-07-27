/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reposities;

import Entities.TheLoai;
import Utillities.HibernateUtil;
import java.util.List;
import javax.persistence.TypedQuery;
import org.hibernate.Session;

/**
 *
 * @author Toan
 */
public class TheLoaiRepository implements ITheLoaiRepository {

    @Override
    public List<TheLoai> findAll() {
        List<TheLoai> theLoai;
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql = "SELECT t FROM TheLoai t";
            TypedQuery<TheLoai> query = session.createQuery(hql, TheLoai.class);
            theLoai = query.getResultList();
        }
        return theLoai;
    }
}
