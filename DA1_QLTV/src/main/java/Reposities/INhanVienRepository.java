
package Reposities;

import Entities.NhanVien;
import java.util.List;

public interface INhanVienRepository {
    List<NhanVien> findAll(int position, int pageSize);
    
    NhanVien findByMaNv(String MaNv);
    
    NhanVien save(NhanVien nhanvien);
    
    long totalCount();
}
