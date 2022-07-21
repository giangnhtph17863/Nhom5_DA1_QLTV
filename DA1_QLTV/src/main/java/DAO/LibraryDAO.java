/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.util.List;

/**
 *
 * @author Toan
 */
public abstract class LibraryDAO<EntityType, KeyType> {
    
    public abstract void insert(EntityType entity);
    
    public abstract void update(EntityType entity);

    public abstract List<EntityType> selectAll();

    public abstract EntityType selectByID(KeyType id);

    public abstract List<EntityType> selectBySQL(String sql, Object... args);//Cho phép có nhiều đối số vào 1 phương thức
}
