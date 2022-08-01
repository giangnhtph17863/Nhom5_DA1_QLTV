/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.quanly;


import Entities.KhachHang;
import helper.XDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.table.DefaultTableModel;
import Model.QLKhachHang;
import Entities.NhanVien;
import helper.XCheck;
import helper.XMgsbox;
import javax.swing.JOptionPane;
import services.QuanLiKhachHangService;
import Repostitories.INhanVienRepository;
import Repostitories.NhanVienRepository;
import static java.awt.Color.pink;
import static java.awt.Color.white;
import javax.swing.JTextField;
import services.IQuanLiKhachHangService;
import services.IQuanLiKhachHangService;
public class form_quanli_QuanLiKhachHang extends javax.swing.JFrame {
DefaultTableModel defaultTableModel;
    private final IQuanLiKhachHangService _iManageQuanLiKhachHangService;
    private final INhanVienRepository _iNhanVienRepository;
int index;


    public form_quanli_QuanLiKhachHang() {
        initComponents();
        setLocationRelativeTo(null);
   
        grouButton();
         _iNhanVienRepository = new NhanVienRepository();
        _iManageQuanLiKhachHangService = new QuanLiKhachHangService();
      loadDatatotable();
    }
   void grouButton() {
        ButtonGroup bg = new ButtonGroup();
        bg.add(rdoNam);
        bg.add(rdoNu);
        rdoNam.setSelected(true);
    }


    private  void loadDatatotable(){
        List<QLKhachHang> ds = _iManageQuanLiKhachHangService.getqlKhachHangs();
    DefaultTableModel dtm=(DefaultTableModel) tblQlkh.getModel();
    dtm.setRowCount(0);
    for(QLKhachHang khachHang: ds){
            Object[] rowdata = {
                khachHang.getMaKH(),
                khachHang.getTenKH(),
                khachHang.getMatKhau(),
            khachHang.getGioiTinh()? "Nam" : "Nữ",
                    khachHang.getNgaySinh(),
                    khachHang.getSĐT(),
                    khachHang.getEmail(),
                    khachHang.getDiaChi(),
                    khachHang.getMaNV().getMaNV(),
                    khachHang.getTrangThai()? "Hoạt Động" : "Không Hoạt Động"
        };
            dtm.addRow(rowdata);
    }
    
    
    }
      

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnTimKiem = new javax.swing.JButton();
        rdoNam = new javax.swing.JRadioButton();
        cbxTrangThai = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtSdt = new javax.swing.JTextField();
        txtNgaySinh = new javax.swing.JTextField();
        txtTenKh = new javax.swing.JTextField();
        txtMakh = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();
        txtManv = new javax.swing.JTextField();
        rdoNu = new javax.swing.JRadioButton();
        txtEmail = new javax.swing.JTextField();
        txtMatKhau = new javax.swing.JPasswordField();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblQlkh = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUẢN LÝ KHACH HÀNG");

        jPanel1.setBackground(new java.awt.Color(238, 232, 171));

        btnTimKiem.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        btnTimKiem.setText("Tìm Kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        rdoNam.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdoNam.setSelected(true);
        rdoNam.setText("Nam");

        cbxTrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hoạt Động", "Không Hoạt Động" }));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Quản Lý Khách Hàng");

        btnThem.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel10.setText("Mã KH");

        jLabel11.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel11.setText("Ngày Sinh");

        jLabel16.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel16.setText("Địa Chỉ");

        jLabel19.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel19.setText("Mã NV");

        jLabel15.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel15.setText("SĐT");

        jLabel14.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel14.setText("Giới Tính");

        jLabel9.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel9.setText("Tìm Kiếm");

        jLabel13.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel13.setText("Email");

        jLabel17.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel17.setText("Mật Khẩu");

        jLabel12.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel12.setText("Tên KH");

        rdoNu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdoNu.setText("Nữ");

        jLabel18.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel18.setText("Trạng Thái");

        tblQlkh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "MAKH", "tên kh", "mat khau", "gioi tinh", "ngay sinh", "sđt", "email", "địa chỉ", "mã nv", "trạng thái"
            }
        ));
        tblQlkh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblQlkhMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblQlkh);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addComponent(rdoNam, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(18, 18, 18)
                                                            .addComponent(rdoNu, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addGap(46, 46, 46)
                                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(txtMakh, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(txtTenKh, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(4, 4, 4))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                                    .addComponent(txtSdt, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                                    .addComponent(cbxTrangThai, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtDiaChi, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                                    .addComponent(txtManv, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(159, 159, 159)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnTimKiem))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 98, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiem)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMakh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenKh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdoNam)
                    .addComponent(rdoNu)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtManv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 674, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private QLKhachHang getKhachHangFromInput(){
     QLKhachHang kh = new QLKhachHang();
        kh.setMaKH(txtMakh.getText());
        kh.setTenKH(txtTenKh.getText());
        kh.setMatKhau(new String(txtMatKhau.getPassword()));
        kh.setGioiTinh(rdoNam.isSelected());

        try {
            String ngay = txtNgaySinh.getText();
            Date date = XDate.toDate(ngay, "dd/MM/yyyy");
            kh.setNgaySinh(date);
        } catch (Exception e) {
        }

        kh.setSĐT(txtSdt.getText());
        kh.setEmail(txtEmail.getText());
        kh.setDiaChi(txtDiaChi.getText());
        kh.setMaNV(_iNhanVienRepository.findbyMaNv(txtManv.getText()));
        kh.setTrangThai(cbxTrangThai.getSelectedIndex() == 0);
        kh.setSoLuongMuon(Integer.parseInt("0"));   
        return kh;
}
//    public boolean checkTrungMa(JTextField txt) {
//        txt.setBackground(white);
//        if (_iManageQuanLiKhachHangService.getqlkhachhangById(txt.getText()) == null) {
//            return true;
//        } else {
//            txt.setBackground(pink);
//            XMgsbox.alert(this, txt.getName() + " đã tồn tại.");
//            return false;
//        }
//    }
//     public boolean checkTrungMaNV(JTextField txt) {
//        txt.setBackground(white);
//        if (_iManageQuanLiKhachHangService.getqlkhachhangById(txt.getText()) == null) {
//            return true;
//        } else {
//            txt.setBackground(pink);
//            XMgsbox.alert(this, txt.getName() + " đã tồn tại.");
//            return false;
//        }
//    }
     void insert(){
         QLKhachHang createkhachhang =getKhachHangFromInput();
    if(_iManageQuanLiKhachHangService.createNewkhachhhang(createkhachhang)!=null){
        JOptionPane.showMessageDialog(this,"thanh cong");
        
    }else{
        JOptionPane.showConfirmDialog(this,"that bai");
    }
    loadDatatotable();
     }
    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
    this.insert();
//    if (XCheck.checkNullText(txtMakh)
//                && XCheck.checkNullText(txtTenKh)
//                && XCheck.checkNullPass(txtMatKhau)
//                && XCheck.checkNullText(txtNgaySinh)
//                && XCheck.checkNullText(txtSdt)
//                && XCheck.checkNullText(txtEmail)
//                && XCheck.checkNullText(txtDiaChi)
//                && XCheck.checkNullText(txtManv)) {
//            if (XCheck.checkMaNV(txtMakh)
//                    && XCheck.checkName(txtTenKh)
//                    && XCheck.checkPass(txtMatKhau)
//                    && XCheck.checkDate(txtNgaySinh)
//                    && XCheck.checkSDT(txtSdt)
//                    && XCheck.checkEmail(txtEmail)
//                    && XCheck.checkMaNV(txtManv)
//                    && XCheck.checkName(txtDiaChi)){
//                if (checkTrungMa(txtMakh)) {
//                    this.insert();
//                }
//
//            }
//        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        QLKhachHang updataqlkhachhang = getKhachHangFromInput();
         if(_iManageQuanLiKhachHangService.updatekhachhhangById(updataqlkhachhang) != null){
            JOptionPane.showMessageDialog(this, "Thành công");
        }else{
            JOptionPane.showMessageDialog(this, "That bai");
        }
         loadDatatotable();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
String timkiem = txtTimKiem.getText();
QLKhachHang makh =_iManageQuanLiKhachHangService.getqlkhachhangById(timkiem);
  if(timkiem.equalsIgnoreCase("")){
           XMgsbox.alert(this, "Ô nhập tìm kiếm đang để trống !");
       }
       else if(makh == null){
           XMgsbox.alert(this, "Không có mã bạn cần tìm !");
       }else{
          setForm(makh);
       
}

    }//GEN-LAST:event_btnTimKiemActionPerformed
  void loadtabletk(){
        String timkiem = txtTimKiem.getText();
        QLKhachHang kh = _iManageQuanLiKhachHangService.getqlkhachhangById(timkiem);
        if (kh != null) {
            setForm(kh);
        } else {
            return;
        }
  }
    void setForm(QLKhachHang kh) {
        txtMakh.setText(kh.getMaKH());
        txtTenKh.setText(kh.getTenKH());
        txtMatKhau.setText(kh.getMatKhau());

        if (kh.getGioiTinh() == true) {
            rdoNam.setSelected(true);
        } else {
            rdoNu.setSelected(true);
        }
        txtNgaySinh.setText(XDate.toString(kh.getNgaySinh(), "dd/MM/yyyy"));
        txtSdt.setText(kh.getSĐT());
        txtEmail.setText(kh.getEmail());
        txtDiaChi.setText(kh.getDiaChi());
    //   txtManv.setText(kh.getMaNV());
        cbxTrangThai.setSelectedItem(kh.getTrangThai() ? true : false);

    }
  
    private void tblQlkhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblQlkhMouseClicked
index =tblQlkh.getSelectedRow();
txtMakh.setText(tblQlkh.getModel().getValueAt(index,0).toString());
txtTenKh.setText(tblQlkh.getModel().getValueAt(index,1).toString());
txtMatKhau.setText(tblQlkh.getModel().getValueAt(index,2).toString());
txtNgaySinh.setText(tblQlkh.getModel().getValueAt(index,4).toString());
txtSdt.setText(tblQlkh.getModel().getValueAt(index,5).toString());
txtEmail.setText(tblQlkh.getModel().getValueAt(index,6).toString());
txtDiaChi.setText(tblQlkh.getModel().getValueAt(index,7).toString());
txtManv.setText(tblQlkh.getModel().getValueAt(index,8).toString());
cbxTrangThai.setSelectedIndex(index);
rdoNam.isSelected();
rdoNu.isSelected();

    }//GEN-LAST:event_tblQlkhMouseClicked


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(form_quanli_QuanLiKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_quanli_QuanLiKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_quanli_QuanLiKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_quanli_QuanLiKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_quanli_QuanLiKhachHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JComboBox<String> cbxTrangThai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTable tblQlkh;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMakh;
    private javax.swing.JTextField txtManv;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtSdt;
    private javax.swing.JTextField txtTenKh;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
