package Service;

import Model.NhanVienModel;
import java.util.List;

public interface INhanVienService {
    List<NhanVienModel> getQuanLyNV(int position, int pageSize);
    
    NhanVienModel getNvByMaNV(String maNV);
    
    NhanVienModel createNewNv(NhanVienModel nhanvien);
    
    NhanVienModel updateNvByMaNV(NhanVienModel nhanvien);
    
    long countAllProducts();
}
