/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Toan
 */
public class JpaUtils {
    private static EntityManagerFactory factory;
    static public EntityManager getEntityManager(){
        if(factory == null || !factory.isOpen()){
            factory = Persistence.createEntityManagerFactory("QuanLyThuVien");      
        }
        return factory.createEntityManager();
    }
    static public void shutdown(){
        if(factory != null && factory.isOpen()){
            factory.close();
        }
        factory = null;
    }
}
