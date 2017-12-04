/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.courier;

import com.calculate.CostDAO;
import com.calculate.DAODaftarHargaPengirimanPaket;
import com.masterdata.DeliveryPackage;
import com.masterdata.Paket;
import com.masterdata.Penerima;
import com.masterdata.Pengirim;
import com.masterdata.Tarif;
import com.masterdata.TarifDao;
import javax.swing.JOptionPane;

//import com.Calculate.listKota;
//import com.MasterData.DeliveryCostLib;
//import com.MasterData.hargaProduct;

/**
 *
 * @author user
 */
public class Application extends javax.swing.JFrame {

    private int indexKotaTujuan;
    private String indexTypePengiriman;
    TarifDao tfDAO;
    Paket result;
    DAODaftarHargaPengirimanPaket transaksi;
    private boolean pilihan;
    private double totalHarga;
    private Tarif JenisPengiriman;
    private CostDAO costDAO;
    private DeliveryPackage packages;
    private Pengirim pengirims;
    private Penerima penerimas;
//Pengirim input = new Pengirim();
//hargaProduct hitung = new hargaProduct();

    /**
     * Creates new form Test
     */
    public Application() {
        tfDAO = new TarifDao();
        transaksi = new DAODaftarHargaPengirimanPaket();
        result = new Paket();
        packages = new DeliveryPackage();
        costDAO = new CostDAO();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        NamaPengirimTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        AlamatPengirimTextArea = new javax.swing.JTextArea();
        TypePengirimanCombo = new javax.swing.JComboBox<>();
        BeratPaketTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        YaRadio = new javax.swing.JRadioButton();
        TidakRadioButton = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        kotaTujuanCombo = new javax.swing.JComboBox<>();
        SubmitButton = new javax.swing.JButton();
        HapusButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        hargaBarangTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        NamaPenerimaTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        AlamatPenerimaTextField = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        kotaTujuanPaket = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        NoTelfonPenerima = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPrintHasil = new javax.swing.JTextArea();
        ButtonHitung = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        KeluarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(204, 0, 255));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setText("Nama Pengirim");

        jLabel2.setText("Alamat Pengirim");

        jLabel3.setText("Type Pengiriman");

        jLabel4.setText("Berat Paket");

        NamaPengirimTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamaPengirimTextFieldActionPerformed(evt);
            }
        });

        AlamatPengirimTextArea.setColumns(20);
        AlamatPengirimTextArea.setRows(5);
        jScrollPane1.setViewportView(AlamatPengirimTextArea);

        TypePengirimanCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Reguler", "Kilat", "SDS", "ONS", "HDS" }));
        TypePengirimanCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TypePengirimanComboActionPerformed(evt);
            }
        });

        jLabel6.setText("Asuransi");

        buttonGroup1.add(YaRadio);
        YaRadio.setText("Ya");
        YaRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YaRadioActionPerformed(evt);
            }
        });

        buttonGroup1.add(TidakRadioButton);
        TidakRadioButton.setText("Tidak");
        TidakRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TidakRadioButtonActionPerformed(evt);
            }
        });

        jLabel8.setText("Kode Tujuan");

        kotaTujuanCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bandung", "Semarang", "Surabaya", "Timika", "Malang", "Tanggerang", "Tasikmalaya", "Yogyakarta", "Medan" }));
        kotaTujuanCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kotaTujuanComboActionPerformed(evt);
            }
        });

        SubmitButton.setText("Submit");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        HapusButton.setText("Hapus");
        HapusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusButtonActionPerformed(evt);
            }
        });

        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        jLabel11.setText("Harga Barang");

        jLabel12.setText("Tipe Pembayaran");

        buttonGroup2.add(jRadioButton3);
        jRadioButton3.setText("Cash");

        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setText("Debit");

        buttonGroup2.add(jRadioButton5);
        jRadioButton5.setText("Credit");

        buttonGroup2.add(jRadioButton6);
        jRadioButton6.setText("Ngutang yak");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });

        jLabel13.setText("Kg");

        jLabel14.setFont(new java.awt.Font("Space Age", 0, 14)); // NOI18N
        jLabel14.setText("Cyber Courier Indonesia");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ExitButton)
                    .addComponent(jLabel8)
                    .addComponent(jLabel12)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel11)
                                .addComponent(jLabel1))
                            .addGap(41, 41, 41)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(hargaBarangTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(NamaPengirimTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14))
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel6))
                                    .addGap(61, 61, 61))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(38, 38, 38)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TypePengirimanCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(YaRadio)
                                    .addGap(18, 18, 18)
                                    .addComponent(TidakRadioButton))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(BeratPaketTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel13))
                                .addComponent(kotaTujuanCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jRadioButton3)
                                        .addComponent(jRadioButton5))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jRadioButton4)
                                        .addComponent(jRadioButton6)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(SubmitButton)
                                    .addGap(18, 18, 18)
                                    .addComponent(HapusButton))))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(NamaPengirimTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(hargaBarangTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(103, 103, 103)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TypePengirimanCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(BeratPaketTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(YaRadio)
                    .addComponent(TidakRadioButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(kotaTujuanCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton5)
                    .addComponent(jRadioButton6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SubmitButton)
                    .addComponent(HapusButton)
                    .addComponent(ExitButton))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Pengirim", jPanel1);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel5.setText("Nama Penerima");

        NamaPenerimaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamaPenerimaTextFieldActionPerformed(evt);
            }
        });

        jLabel7.setText("Alamat Penerima");

        AlamatPenerimaTextField.setColumns(20);
        AlamatPenerimaTextField.setRows(5);
        jScrollPane2.setViewportView(AlamatPenerimaTextField);

        jLabel9.setText("Kota");

        kotaTujuanPaket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kotaTujuanPaketActionPerformed(evt);
            }
        });

        jLabel10.setText("No.Telfon Penerima");

        NoTelfonPenerima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoTelfonPenerimaActionPerformed(evt);
            }
        });

        jPrintHasil.setColumns(20);
        jPrintHasil.setRows(5);
        jScrollPane3.setViewportView(jPrintHasil);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                .addContainerGap())
        );

        ButtonHitung.setText("Hitung");
        ButtonHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonHitungActionPerformed(evt);
            }
        });

        deleteButton.setText("Hapus");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        KeluarButton.setText("Exit");
        KeluarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NamaPenerimaTextField)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(ButtonHitung)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(deleteButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                                .addComponent(KeluarButton)
                                .addGap(25, 25, 25))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(NoTelfonPenerima, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                                    .addComponent(kotaTujuanPaket)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(NamaPenerimaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel10))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(NoTelfonPenerima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(kotaTujuanPaket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonHitung)
                    .addComponent(deleteButton)
                    .addComponent(KeluarButton))
                .addGap(3, 3, 3)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Penerima", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NamaPengirimTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamaPengirimTextFieldActionPerformed
        NamaPengirimTextField.getText();
        // TODO add your handling code here:
    }//GEN-LAST:event_NamaPengirimTextFieldActionPerformed

    private void TidakRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TidakRadioButtonActionPerformed
        if (TidakRadioButton.isSelected()) {
            pilihan = false;
//     setPackagePriceVisible(false);  
     packages.setAsuransi(false);
        }
// TODO add your handling code here:
    }//GEN-LAST:event_TidakRadioButtonActionPerformed

    private void kotaTujuanComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kotaTujuanComboActionPerformed
        Object ttf = (Object) kotaTujuanCombo.getSelectedItem();
        indexKotaTujuan = kotaTujuanCombo.getSelectedIndex();
        packages.setKotaTujuan(kotaTujuanCombo.getSelectedItem().toString());
        kotaTujuanPaket.setText(ttf.toString());
        // TODO add your handling code here:
    }//GEN-LAST:event_kotaTujuanComboActionPerformed

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
//     index = kotaCombo.getSelectedIndex();   
        try {
            transaksi.setBerat(Double.parseDouble(BeratPaketTextField.getText()));
            transaksi.setBerat(Integer.parseInt(hargaBarangTextField.getText()));
            JOptionPane.showMessageDialog(rootPane, "Data Sukes Silakan Pindah Ke Tab Data Penerima");
            packages.setBeratPaket(Double.parseDouble(BeratPaketTextField.getText()));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Masukan Data Dengan Benar !!");
        }
    }//GEN-LAST:event_SubmitButtonActionPerformed

    private void NamaPenerimaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamaPenerimaTextFieldActionPerformed
        NamaPenerimaTextField.getText();
        // TODO add your handling code here:
    }//GEN-LAST:event_NamaPenerimaTextFieldActionPerformed

    private void TypePengirimanComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TypePengirimanComboActionPerformed
        Object ttf = (Object) TypePengirimanCombo.getSelectedItem();
        indexTypePengiriman = TypePengirimanCombo.toString();
        packages.setJenisPengiriman(TypePengirimanCombo.getSelectedItem().toString());
       // TypePengirimanCombo.setSelectedItem(ttf);
        // TODO add your handling code here:
    }//GEN-LAST:event_TypePengirimanComboActionPerformed
//    double berat = Double.parseDouble(BeratPaketTextField.getText().trim());


    private void NoTelfonPenerimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoTelfonPenerimaActionPerformed
        NoTelfonPenerima.getText();
        // TODO add your handling code here:
    }//GEN-LAST:event_NoTelfonPenerimaActionPerformed

    private void kotaTujuanPaketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kotaTujuanPaketActionPerformed
        kotaTujuanCombo.getSelectedIndex();
        // TODO add your handling code here:
    }//GEN-LAST:event_kotaTujuanPaketActionPerformed

    private void ButtonHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonHitungActionPerformed

        try {
            if (TidakRadioButton.isSelected()) {
                packages.setHargaPaketKirim(0.0);
            } else {
                packages.setHargaPaketKirim(Double.parseDouble(hargaBarangTextField.getText()));
            }
            Double totalCost = costDAO.calculateCost(packages);
            jPrintHasil.append("    ============= Laporan Pengiriman Paket ===================       "
                    + "\n Nama Pengirim Barang : " + NamaPengirimTextField.getText()
                    + "\n Alamat Pengirim : " + AlamatPengirimTextArea.getText()
                    + "\n Berat Paket : " + BeratPaketTextField.getText() + " Kg "
                    + "\n Harga Barang yang di Paketkan : " + hargaBarangTextField.getText()
                    + "\n Jenis Pengiriman Paket : " + TypePengirimanCombo.getSelectedItem()
                    + "\n Tujuan Pengiriman Paket : " + kotaTujuanCombo.getSelectedItem()
                    + "\n Total Harga Yang Dibayar : " + totalCost
                    + "\n============================================================"
                    + "\n Nama Penerima : " + NamaPenerimaTextField.getText()
                    + "\n Alamat Penerima : " + AlamatPenerimaTextField.getText()
                    + "\n No Telfon Penerima : " + NoTelfonPenerima.getText());
            System.out.println("Berat Paket: " + packages.getBeratPaket());
            System.out.println("Asuransi: " + packages.getAsuransi());
            System.out.println("Tujuan: " + packages.getKotaTujuan());
            System.out.println("Tipe: " + packages.getJenisPengiriman());
            System.out.println("Harga: " + packages.getHargaPaketKirim());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Data yang anda masukkan masih error");
            e.printStackTrace();

// TODO add your handling code here:
    }//GEN-LAST:event_ButtonHitungActionPerformed
    }
    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        NamaPenerimaTextField.setText(" ");
        AlamatPenerimaTextField.setText(" ");
        NoTelfonPenerima.setText(" ");
        kotaTujuanPaket.setText("");
        jPrintHasil.setText(" ");

        // TODO add your handling code here:
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void KeluarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarButtonActionPerformed
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_KeluarButtonActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void HapusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusButtonActionPerformed
        NamaPengirimTextField.setText(" ");
        AlamatPengirimTextArea.setText(" ");
        hargaBarangTextField.setText(" ");
        BeratPaketTextField.setText(" ");
    }//GEN-LAST:event_HapusButtonActionPerformed

    private void YaRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YaRadioActionPerformed
        if (YaRadio.isSelected()) {
            pilihan = true;
//          setPackagePriceVisible(true);
         packages.setAsuransi(true);
        }
    }//GEN-LAST:event_YaRadioActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Application().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AlamatPenerimaTextField;
    private javax.swing.JTextArea AlamatPengirimTextArea;
    private javax.swing.JTextField BeratPaketTextField;
    private javax.swing.JButton ButtonHitung;
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton HapusButton;
    private javax.swing.JButton KeluarButton;
    private javax.swing.JTextField NamaPenerimaTextField;
    private javax.swing.JTextField NamaPengirimTextField;
    private javax.swing.JTextField NoTelfonPenerima;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JRadioButton TidakRadioButton;
    private javax.swing.JComboBox<String> TypePengirimanCombo;
    private javax.swing.JRadioButton YaRadio;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField hargaBarangTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextArea jPrintHasil;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox<String> kotaTujuanCombo;
    private javax.swing.JTextField kotaTujuanPaket;
    // End of variables declaration//GEN-END:variables

}