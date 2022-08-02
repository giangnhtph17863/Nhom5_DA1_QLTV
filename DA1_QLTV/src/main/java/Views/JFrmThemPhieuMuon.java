/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import Entities.KhachHang;
import Entities.NhanVien;
import Entities.PhieuMuon;
import Helper.XCheck;
import Models.KhachHangModels;
import Models.NhanVienModels;
import Models.PhieuMuonModels;
import Reposities.IKhachHangRepository;
import Reposities.INhanVienRepository;
import Reposities.KhachHangRepository;
import Reposities.NhanVienRepository;
import Service.IKhachHangService;
import Service.INhanVienService;
import Service.IPhieuMuonService;
import Service.KhachHangService;
import Service.NhanVienService;
import Service.PhieMuonService;
import static java.awt.Color.pink;
import static java.awt.Color.white;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import Helper.XDate;
import Helper.XMgsbox;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class JFrmThemPhieuMuon extends javax.swing.JFrame {

     private final IPhieuMuonService _iPhieuMuonService;
    private final INhanVienService _iNhanVienService;
   private final  IKhachHangService _iKhachHangService;
    private final IKhachHangRepository _iKhachHangRepo;
    private final INhanVienRepository _inhanVienRepository;
    int index;
    int check = 1;
     private int _currentPage;
    private int _totalPages;
    private final int _pageSize;
    private long _totalProducts;
    /**
     * Creates new form JFrmThemPhieuMuon
     */
    public JFrmThemPhieuMuon() {
        initComponents();
        _iPhieuMuonService = new PhieMuonService();
        _iKhachHangService = new KhachHangService();
        _iNhanVienService = new NhanVienService();
        _iKhachHangRepo = new KhachHangRepository();
        _inhanVienRepository = new NhanVienRepository();
  
        _currentPage = 1;
        _pageSize = 10;
        txtNgayMuon.setDateFormatString("yyyy-MM-dd");
        txtNgayTra.setDateFormatString("yyyy-MM-dd");
        
        setLocationRelativeTo(null);
        loadTable();
    }
     private void loadTable(){
        List<PhieuMuonModels> pm = _iPhieuMuonService.getPhieuMuon(_currentPage - 1, _pageSize);
        DefaultTableModel dtm = (DefaultTableModel) this.tblBang.getModel();
        dtm.setRowCount(0);
        for (PhieuMuonModels x : pm) {
            Object[] rowData = {
                x.getMAPM(),
                x.getMaKH() == null ? null : x.getMaKH().getMaKH(),
                x.getMaNV() == null ? null : x.getMaNV().getMaNV(),
                x.getNgayMuon(),
                x.getNgayTra(),
                x.getTienCoc(),
                x.getTrangThai()  
            };
            dtm.addRow(rowData);
        }
        _totalProducts = _iPhieuMuonService.countAllProducts();
        lbTotalProducts.setText("Total: " + _totalProducts);
        _totalPages = (int) (_totalProducts / _pageSize) + 1;
        
    }
    private PhieuMuonModels getPhieuMuonFromInput() {
        
        PhieuMuonModels model = new PhieuMuonModels();
        model.setMAPM(txtMaPm.getText());
        model.setNgayTra(txtNgayTra.getDate());
        model.setNgayMuon(txtNgayMuon.getDate());
        model.setTienCoc(Double.parseDouble(txtTiencoc.getText()));
        model.setTrangThai((String) cbcTrangThai.getSelectedItem() );
        model.setMaKH(_iKhachHangRepo.findbyMaKH(txtMaKH.getText()));
        model.setMaNV(_inhanVienRepository.findbyMaNV(txtManv.getText()));
        

        return model;
    }
    void checkDL() {
        float tienCoc;
        try {
            tienCoc = Float.parseFloat(txtTiencoc.getText());
            if (tienCoc < 0) {
                XMgsbox.alert(this, "Số tiền cọc phải lớn hơn 0");
                txtTiencoc.requestFocus();
                txtTiencoc.setBackground(Color.red);
                check = 0;
            }
        } catch (Exception e) {
            XMgsbox.alert(this, "Thu nhập không phải là số");
            txtTiencoc.requestFocus();
            txtTiencoc.setBackground(Color.red);
            check = 0;
        }
    }
//     public boolean check14Ngay(JDateChooser txt, JDateChooser txt2) {
//        txt.setBackground(white);
//        java.util.Date date = XDate.toDate(txt.getDate());
//        java.util.Date date2 = XDate.toDate(txt2.getText());
//        Calendar c1 = Calendar.getInstance();
//        Calendar c2 = Calendar.getInstance();
//        c1.setTime(date);
//        c2.setTime(date2);
//        long a = (c2.getTime().getTime() - c1.getTime().getTime()) / (24 * 3600 * 1000);
//        if (a >= 14) {
//            txt2.setBackground(pink);
//            XMgsbox.alert(this, "Ngày trả không được lớn hơn ngày mượn quá 14 ngày");
//            return false;
//        } else {
//            return true;
//        }
//    }
//     private boolean checkSoLuongMuon(String maKH) {
//        String sql = "SELECT soLuongMuon FROM KHACHHANG WHERE MAKH like '%" + maKH + "%'";
//        try {
//            Statement statement = conn.createStatement();
//            ResultSet rs = statement.executeQuery(sql);
//            while (rs.next()) {
//                int result = Integer.parseInt(rs.getString("SOLUONGMUON"));
//                if (result == 3) {
//                    return false;
//                }
//            }
//
//        } catch (Exception e) {
//
//        }
//        return true;
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBang = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        txtMaPm = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMaKH = new javax.swing.JTextField();
        txtManv = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtTiencoc = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cbcTrangThai = new javax.swing.JComboBox<>();
        btnSua = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        lbTotalProducts = new javax.swing.JLabel();
        txtNgayMuon = new com.toedter.calendar.JDateChooser();
        txtNgayTra = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 0));

        tblBang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã PM", "MÃ KH", "MÃ NV", "Ngày Mượn", "Ngày Trả", "Tiền Cọc", "Trạng Thái"
            }
        ));
        tblBang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBang);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Thêm Phiếu Mượn");

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        jLabel3.setText("MÃ PM");

        jLabel4.setText("MÃ KH");

        jLabel5.setText("MÃ NV");

        jLabel6.setText("Ngày Mượn");

        jLabel7.setText("Ngày Trả");

        jLabel8.setText("Tiền cọc");

        jLabel9.setText("Trạng Thái");

        cbcTrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đã Trả", "Chưa trả" }));
        cbcTrangThai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbcTrangThaiActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        lbTotalProducts.setText("Total : 0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMaPm, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtManv, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(60, 60, 60)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTiencoc)
                                    .addComponent(cbcTrangThai, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtNgayTra, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNgayMuon, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1))
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbTotalProducts)
                .addGap(155, 155, 155))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtMaPm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(txtTiencoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtManv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(cbcTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(txtNgayMuon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThem)
                            .addComponent(btnSua)
                            .addComponent(btnClear))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbTotalProducts))
                    .addComponent(txtNgayTra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
  
       
        if (txtMaPm.getText().isBlank() || txtMaKH.getText().isBlank() || txtManv.getText().isBlank() || txtTiencoc.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Không được để trống");
        } else if(txtTiencoc.getText() != null){
            checkDL();
        }else {
            PhieuMuonModels cModel = getPhieuMuonFromInput();
            if (_iPhieuMuonService.createNewPhieumuon(cModel) != null) {
                JOptionPane.showMessageDialog(this, "Thành công");
            } else {
                JOptionPane.showMessageDialog(this, "Thất bại");
            };
            loadTable();
        }

//        String strMaPm = txtMaPm.getText();
//        String strMakh = txtMaKH.getText();
//        String strManv = txtManv.getText();
//        String tiencoc = txtTiencoc.getText();
//        if (strMaPm.equals("")) {
//            JOptionPane.showMessageDialog(this, "Không được để trống");
//            return;
//        }
//        if (strMakh.equals("")) {
//            JOptionPane.showMessageDialog(this, "Không được để trống");
//            return;
//        }
//        if (strManv.equals("")) {
//            JOptionPane.showMessageDialog(this, "Không được để trống");
//            return;
//        }
//        if (tiencoc.equals("")) {
//            JOptionPane.showMessageDialog(this, "Không được để trống");
//            return;
//        }
        loadTable();
    }//GEN-LAST:event_btnThemActionPerformed
//txtxNgayKg.setDate((Date) lblBang.getModel().getValueAt(index, 4));
//        txtNgayTao.setDate((Date) lblBang.getModel().getValueAt(index, 7));
    private void tblBangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBangMouseClicked
        // TODO add your handling code here:
        index = tblBang.getSelectedRow();
       txtMaPm.setText(tblBang.getModel().getValueAt(index, 0).toString());
       txtMaKH.setText(tblBang.getModel().getValueAt(index, 1).toString());
       txtManv.setText(tblBang.getModel().getValueAt(index, 2).toString());
       txtNgayMuon.setDate( (Date) tblBang.getModel().getValueAt(index, 3));
       txtNgayTra.setDate( (Date) tblBang.getModel().getValueAt(index, 4));
       txtTiencoc.setText(tblBang.getModel().getValueAt(index, 5).toString());
       cbcTrangThai.setSelectedIndex(index) ;
    }//GEN-LAST:event_tblBangMouseClicked

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        txtManv.setText("");
        txtMaKH.setText("");
        txtMaPm.setText("");
        
        txtTiencoc.setText("");
        cbcTrangThai.setSelectedItem(true);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        PhieuMuonModels updatePhieuMuon = getPhieuMuonFromInput();
         if(_iPhieuMuonService.updatePhieumuonById(updatePhieuMuon) != null){
            JOptionPane.showMessageDialog(this, "Thành công");
        }else{
            JOptionPane.showMessageDialog(this, "Thất Bại");
        }
        loadTable();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void cbcTrangThaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbcTrangThaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbcTrangThaiActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(JFrmThemPhieuMuon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrmThemPhieuMuon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrmThemPhieuMuon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrmThemPhieuMuon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrmThemPhieuMuon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JComboBox<String> cbcTrangThai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbTotalProducts;
    private javax.swing.JTable tblBang;
    private javax.swing.JTextField txtMaKH;
    private javax.swing.JTextField txtMaPm;
    private javax.swing.JTextField txtManv;
    private com.toedter.calendar.JDateChooser txtNgayMuon;
    private com.toedter.calendar.JDateChooser txtNgayTra;
    private javax.swing.JTextField txtTiencoc;
    // End of variables declaration//GEN-END:variables
}
