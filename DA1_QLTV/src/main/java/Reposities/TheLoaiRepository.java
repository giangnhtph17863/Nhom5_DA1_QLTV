/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reposities;

import Entities.TheLoai;
import Utillities.JpaUtils;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author Toan
 */
public class TheLoaiRepository implements ITheLoaiRepository{

    @Override
    public List<TheLoai> findAll() {
        List<TheLoai> theLoai;
        EntityManager em = JpaUtils.getEntityManager();
        String hql = "SELECT c FROM THELOAI c";
        TypedQuery<TheLoai> query = em.createQuery(hql, TheLoai.class);
        theLoai = query.getResultList();
        return theLoai;
    }
    
}
