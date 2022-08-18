/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import Entities.TheLoai;
import Utillities.HibernateUtil;
import java.util.List;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Toan
 */
public class TheLoaiRepository implements ITheLoaiRepository {

    @Override
    public List<TheLoai> findAll() {
        List<TheLoai> theLoai;
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql = "from TheLoai";
            TypedQuery<TheLoai> query = session.createQuery(hql, TheLoai.class);
            theLoai = query.getResultList();
        }
        return theLoai;
    }

    @Override
    public TheLoai save(TheLoai theLoai) {
       try (Session session = HibernateUtil.getSessionFactory().openSession()){
            Transaction trans = session.getTransaction();
            trans.begin();
            try {
                session.saveOrUpdate(theLoai);
                trans.commit();
            } catch (Exception e) {
                e.printStackTrace();
                trans.rollback();
                theLoai = null;
            }
        }finally{
            return theLoai;
        }
    }
}
