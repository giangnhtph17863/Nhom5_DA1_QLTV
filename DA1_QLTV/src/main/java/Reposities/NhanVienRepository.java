
package Reposities;

import Entities.NhanVien;
import Utillities.HibernateUtil;
import java.util.List;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class NhanVienRepository implements INhanVienRepository{

    @Override
    public List<NhanVien> findAll(int position, int pageSize) {
        List<NhanVien> nhanvien;
        try (Session session = HibernateUtil.getSessionFactory().openSession()){
            String hql = "Select p From NhanVien p";
            TypedQuery<NhanVien> query = session.createQuery(hql, NhanVien.class);
//            query.setFirstResult(position);
//            query.setMaxResults(pageSize);
            nhanvien = query.getResultList();         
        } 
        
        return nhanvien;
    }

    @Override
    public NhanVien findByMaNv(String MaNv) {
        NhanVien nhanvien;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql = "SELECT p FROM NhanVien p WHERE p.maNV = :maNV";
            TypedQuery<NhanVien> query = session.createQuery(hql, NhanVien.class);
            query.setParameter("maNV", MaNv);
            nhanvien = query.getSingleResult();
        }
        return nhanvien;
    }

    @Override
    public NhanVien save(NhanVien nhanvien) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
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
        } finally {
            return nhanvien;
        }
    }
    
    @Override
    public long totalCount() {
        long total = 0;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            String statement = "SELECT COUNT(p.maNV) FROM NhanVien p";
            TypedQuery<Long> query = session.createQuery(statement, Long.class);
            total = query.getSingleResult();
        }
        return total;
    }
    
}
