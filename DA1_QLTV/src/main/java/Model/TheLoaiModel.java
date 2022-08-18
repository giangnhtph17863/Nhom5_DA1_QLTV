/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Toan
 */
public class TheLoaiModel {
    private Long maTL;
    private String tenTL;

    public TheLoaiModel() {
    }

    public TheLoaiModel(Long maTL, String tenTL) {
        this.maTL = maTL;
        this.tenTL = tenTL;
    }

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
    
    
}
