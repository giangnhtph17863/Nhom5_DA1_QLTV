/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Entities.Sach;
import Utils.JpaUtils;
import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.Session;
/**
 *
 * @author Toan
 */
public class SachDAO{
   private EntityManager em = JpaUtils .getEntityManager();
   @Override
   protected void finalize() throws Throwable{
       em.close();// đóng EntityManager khi DAO giải phóng
       super.finalize();
   }
   
}
