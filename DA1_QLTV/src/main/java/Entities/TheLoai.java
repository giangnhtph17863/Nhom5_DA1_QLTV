/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.Nationalized;

/**
 *
 * @author Toan
 */
@Entity
@Table(name= "TheLoai")
public class TheLoai implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long maTL;
    
    @Column
    private String tenTL;

    @OneToMany(mappedBy = "maTL")
    private List<Sach> sachs;
    

    public Long getMaTL() {
        return maTL;
    }

    public void setMaTL(Long maTL) {
        this.maTL = maTL;
    }
    
    public String getTenTL() {
        return tenTL;
    }

    public void setTenTL(String tenTL) {
        this.tenTL = tenTL;
    }

    public List<Sach> getSachs() {
        return sachs;
    }

    public void setSachs(List<Sach> sachs) {
        this.sachs = sachs;
    }

    @Override
    public String toString() {
        return tenTL;
    }
    
    
}
