
import javax.swing.table.DefaultTableModel;


public class stok extends javax.swing.JFrame {

    public stok() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        urun_tablosu = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        mesaj_kutusu = new javax.swing.JLabel();
        tf_urun = new javax.swing.JTextField();
        tf_fıyat = new javax.swing.JTextField();
        cb_kategori = new javax.swing.JComboBox<>();
        urun_ekle_btn = new javax.swing.JButton();
        ürün_sil_btn = new javax.swing.JButton();
        update_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 255, 255));

        urun_tablosu.setBackground(new java.awt.Color(204, 204, 204));
        urun_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ürün İsmi", "Kategori", "Fiyat"
            }
        ));
        jScrollPane1.setViewportView(urun_tablosu);

        jLabel1.setText("Ürün");

        jLabel2.setText("Kategori");

        jLabel3.setText("Fiyat");

        mesaj_kutusu.setForeground(new java.awt.Color(255, 0, 0));

        cb_kategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "KİTAP", "ELEKTRONİK", "TEKNOLOJİ", " " }));

        urun_ekle_btn.setForeground(new java.awt.Color(0, 102, 255));
        urun_ekle_btn.setText("ÜRÜN EKLE");
        urun_ekle_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urun_ekle_btnActionPerformed(evt);
            }
        });

        ürün_sil_btn.setForeground(new java.awt.Color(0, 51, 204));
        ürün_sil_btn.setText("ÜRÜN SİL");
        ürün_sil_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ürün_sil_btnActionPerformed(evt);
            }
        });

        update_btn.setForeground(new java.awt.Color(0, 51, 255));
        update_btn.setText("ÜRÜN GÜNCELLE");
        update_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(cb_kategori, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tf_fıyat, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(34, 34, 34)
                                .addComponent(tf_urun, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(mesaj_kutusu, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(urun_ekle_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ürün_sil_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(update_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_urun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cb_kategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_fıyat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(mesaj_kutusu, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(urun_ekle_btn)
                    .addComponent(ürün_sil_btn)
                    .addComponent(update_btn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void urun_ekle_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urun_ekle_btnActionPerformed
        mesaj_kutusu.setText("");
        DefaultTableModel model = (DefaultTableModel)urun_tablosu.getModel();
        
        if(tf_urun.getText().trim().equals("") && tf_fıyat.getText().trim().equals("")){  //trim baş ve son boş mu kontrol eder
            mesaj_kutusu.setText("Ürün ismi ve Fiyat booş bıraklılamaz...");
        }
       else if(!tf_urun.getText().trim().equals("") && tf_fıyat.getText().trim().equals("")){  //trim baş ve son boş mu kontrol eder
            mesaj_kutusu.setText(" Fiyat booş bıraklılamaz...");
        }
       else if(tf_urun.getText().trim().equals("") && !tf_fıyat.getText().trim().equals("")){  //trim baş ve son boş mu kontrol eder
            mesaj_kutusu.setText("Ürün ismi booş bıraklılamaz...");
        }
        else{
            Object[] eklenecek = {tf_urun.getText(),cb_kategori.getSelectedItem().toString(),tf_fıyat.getText()};
            model.addRow(eklenecek);
        }
        
    }//GEN-LAST:event_urun_ekle_btnActionPerformed

    private void ürün_sil_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ürün_sil_btnActionPerformed
        DefaultTableModel model = (DefaultTableModel) urun_tablosu.getModel();
        
        int seciliürün = urun_tablosu.getSelectedRow();
        
        if (seciliürün == -1) {//herhangi bir satır seçilmediyse getSelectedRow() değeri -1 olur
            if (urun_tablosu.getRowCount() == 0) {
                mesaj_kutusu.setText("Ürün Tablosu boş");
            }
            else{
                mesaj_kutusu.setText("Lütfen silmek istediğiniz ürünü seçin...");
            }
        }
        else{
            model.removeRow(seciliürün);
            mesaj_kutusu.setText("Ürün Silindi ");
        }
        
    }//GEN-LAST:event_ürün_sil_btnActionPerformed

    private void update_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_btnActionPerformed
         int seciliürün = urun_tablosu.getSelectedRow();
         
         if (seciliürün == -1) {
             if (urun_tablosu.getRowCount() == 0 ) {
                 mesaj_kutusu.setText("Ürün Tablosu BOş");
             }
             else{
                 mesaj_kutusu.setText("Lütfen güncellemek istediğiniz ürünü seçiniz.");
             }
        }
         else{
             urun_tablosu.setValueAt(tf_urun.getText(),seciliürün,0);
             urun_tablosu.setValueAt(cb_kategori.getSelectedItem(),seciliürün,1);
             urun_tablosu.setValueAt(tf_fıyat.getText(),seciliürün ,2 );
             mesaj_kutusu.setText("Ürün  Başarıyla Güncellendi");
         }
    }//GEN-LAST:event_update_btnActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new stok().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_kategori;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mesaj_kutusu;
    private javax.swing.JTextField tf_fıyat;
    private javax.swing.JTextField tf_urun;
    private javax.swing.JButton update_btn;
    private javax.swing.JButton urun_ekle_btn;
    private javax.swing.JTable urun_tablosu;
    private javax.swing.JButton ürün_sil_btn;
    // End of variables declaration//GEN-END:variables
}
