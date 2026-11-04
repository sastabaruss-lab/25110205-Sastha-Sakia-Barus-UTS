package view;

import dao.BarangDAO;
import model.Barang;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormBarang extends javax.swing.JFrame {
private BarangDAO dao = new BarangDAO();
private DefaultTableModel
        modelTable;
   
    public FormBarang() {
        initComponents();
        initTable();
        loadData();
    }
    
    private void initTable(){
        modelTable= new 
            DefaultTableModel();
        modelTable.addColumn("Kode Barang");
        modelTable.addColumn("Nama Barang");
        modelTable.addColumn("Kategori");
        modelTable.addColumn("Stok");
        
       tblBarang.setModel(modelTable);
    }

   private void loadData() {
    modelTable.setRowCount(0);
    List<Barang> list = dao.getAllBarang();
    for (Barang b : list) {
        modelTable.addRow(new Object[]{
            b.getKodeBarang(),
            b.getNamaBarang(),
            b.getKategori(),
            b.getStok()
        });
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtStok = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtKode = new javax.swing.JTextField();
        cmbKategori = new javax.swing.JComboBox<>();
        btnSimpan = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnBersihkan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBarang = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("FORM PENGELOLAAN DATA BARANG LAB");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        jLabel2.setText("Kode Barang  :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel3.setText("Nama Barang :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel4.setText("Kategori        :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel5.setText("Stok             :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        txtStok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStokActionPerformed(evt);
            }
        });
        getContentPane().add(txtStok, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 390, -1));

        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });
        getContentPane().add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 390, -1));

        txtKode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKodeActionPerformed(evt);
            }
        });
        getContentPane().add(txtKode, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 390, -1));

        cmbKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Komputer", "Jaringan", "Alat Ukur" }));
        cmbKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbKategoriActionPerformed(evt);
            }
        });
        getContentPane().add(cmbKategori, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 390, -1));

        btnSimpan.setText("Simpan ");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        getContentPane().add(btnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        btnUbah.setText("Ubah");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });
        getContentPane().add(btnUbah, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 90, -1));

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        getContentPane().add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 90, -1));

        btnBersihkan.setText("Bersihkan ");
        btnBersihkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBersihkanActionPerformed(evt);
            }
        });
        getContentPane().add(btnBersihkan, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, -1, -1));

        tblBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBarangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBarang);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 700, 140));

        jLabel6.setText("Tabel Data Barang ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtStokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStokActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStokActionPerformed

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void txtKodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKodeActionPerformed

    private void cmbKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbKategoriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbKategoriActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
  
    // 1. Ambil data dari text field / form
    String kode = txtKode.getText();
    String nama = txtNama.getText();
    String kategori = cmbKategori.getSelectedItem().toString();
    int stok = Integer.parseInt(txtStok.getText());

    // 2. Masukkan ke objek Barang
    Barang b = new Barang(kode, nama, kategori, stok);

    // 3. Simpan lewat DAO
    if (dao.simpan(b)) {
        JOptionPane.showMessageDialog(this, "Data berhasil disimpan!");
        loadData(); // Refresh tabel agar data langsung muncul
        // Bersihkan form setelah disimpan
        txtKode.setText("");
        txtNama.setText("");
        txtStok.setText("");
        txtKode.requestFocus();
    } else {
        JOptionPane.showMessageDialog(this, "Gagal menyimpan data!", "Error", JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed

    try {
        String kode = txtKode.getText();
        String nama = txtNama.getText();
        String kategori = cmbKategori.getSelectedItem().toString();
        int stok = Integer.parseInt(txtStok.getText());

        Barang b = new Barang(kode, nama, kategori, stok);
        if (dao.ubah(b)) {
            JOptionPane.showMessageDialog(this, "Data berhasil diubah!");
            loadData();
            // Bersihkan form setelah diubah
            txtKode.setText("");
            txtNama.setText("");
            txtStok.setText("");
            txtKode.setEditable(true); // Aktifkan kembali kode barang
            txtKode.requestFocus();
        } else {
            JOptionPane.showMessageDialog(this, "Gagal mengubah data!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Pastikan semua data terisi dengan benar!", "Peringatan", JOptionPane.WARNING_MESSAGE);
    }

    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed

    String kode = txtKode.getText();
    if (kode.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Pilih data pada tabel yang ingin dihapus terlebih dahulu!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        return;
    }

    int konfirmasi = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin menghapus data dengan kode: " + kode + "?", "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION);
    if (konfirmasi == JOptionPane.YES_OPTION) {
        if (dao.hapus(kode)) {
            JOptionPane.showMessageDialog(this, "Data berhasil dihapus!");
            loadData();
            txtKode.setText("");
            txtNama.setText("");
            txtStok.setText("");
            txtKode.setEditable(true);
            txtKode.requestFocus();
        } else {
            JOptionPane.showMessageDialog(this, "Gagal menghapus data!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnBersihkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBersihkanActionPerformed

    txtKode.setText("");
    txtNama.setText("");
    cmbKategori.setSelectedIndex(0);
    txtStok.setText("");
    txtKode.setEditable(true);
    txtKode.requestFocus();

    }//GEN-LAST:event_btnBersihkanActionPerformed

    private void tblBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBarangMouseClicked
   
    int row = tblBarang.getSelectedRow();
    if (row != -1) {
        txtKode.setText(tblBarang.getValueAt(row, 0).toString());
        txtNama.setText(tblBarang.getValueAt(row, 1).toString());
        cmbKategori.setSelectedItem(tblBarang.getValueAt(row, 2).toString());
        txtStok.setText(tblBarang.getValueAt(row, 3).toString());
        txtKode.setEditable(false); // Kunci kode barang agar tidak bisa diubah saat proses edit
    }

    }//GEN-LAST:event_tblBarangMouseClicked

    
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
            java.util.logging.Logger.getLogger(FormBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormBarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBersihkan;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUbah;
    private javax.swing.JComboBox<String> cmbKategori;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBarang;
    private javax.swing.JTextField txtKode;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtStok;
    // End of variables declaration//GEN-END:variables
}
