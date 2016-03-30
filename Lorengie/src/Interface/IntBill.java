/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Logic.Bill;
import Persistence.MSAccess;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
public class IntBill extends javax.swing.JFrame {
    
    private MSAccess dataFile; 
    private int billCodeaux;
    DefaultTableModel model;
    int parameter;
    private boolean flag=false;
    private Bill bill;
    Calendar c;
    double valueT=0;


    /**
     * Creates new form IntBil
     */
    public IntBill() {
        initComponents();
       
        c=Calendar.getInstance();
        int d=c.get(Calendar.DATE),m=1+c.get(Calendar.MONTH),a=c.get(Calendar.YEAR); 
        lblDate.setText(d+"-"+m+"-"+a);
        this.setDataFile(new MSAccess());
        model = new DefaultTableModel();
        bill = new Bill();
        tblBill.setModel(model);
        model.addColumn("Id");
        model.addColumn("idDetailBill");
        model.addColumn("product");
        model.addColumn("quantity");
        model.addColumn("sale Price");
        model.addColumn("total Value");
        model.addColumn("sale Type");
        indexBill();
    }

    public MSAccess getDataFile() {
        return dataFile;
    }

    public void setDataFile(MSAccess dataFile) {
        this.dataFile = dataFile;
    }
      public JLabel getLabelUser() {
        return lblUser;
    }
    
    public void setLabelUser(String userName) {
        this.lblUser.setText(userName);
    }

    public int getBillCodeaux() {
        return billCodeaux;
    }

    public void setBillCodeaux(int billCodeaux) {
        this.billCodeaux = billCodeaux;
    }
     
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panBill = new javax.swing.JPanel();
        jspBill = new javax.swing.JScrollPane();
        tblBill = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnSelect = new javax.swing.JButton();
        btnDeleteProduct = new javax.swing.JButton();
        btnPrintBill = new javax.swing.JButton();
        lblUser = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblIndexBill = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        lblTotal = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panBill.setBackground(new java.awt.Color(204, 204, 255));

        tblBill.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jspBill.setViewportView(tblBill);

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnSelect.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnSelect.setText("Select current bill");
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });

        btnDeleteProduct.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnDeleteProduct.setText("Delete Product");
        btnDeleteProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteProductActionPerformed(evt);
            }
        });

        btnPrintBill.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnPrintBill.setText("Save and print");
        btnPrintBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintBillActionPerformed(evt);
            }
        });

        lblUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblTotal.setText("Total");

        jButton1.setText("See another bill");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panBillLayout = new javax.swing.GroupLayout(panBill);
        panBill.setLayout(panBillLayout);
        panBillLayout.setHorizontalGroup(
            panBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBillLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panBillLayout.createSequentialGroup()
                        .addComponent(btnSelect)
                        .addGroup(panBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panBillLayout.createSequentialGroup()
                                .addGap(269, 269, 269)
                                .addComponent(lblIndexBill))
                            .addGroup(panBillLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jButton1)
                                .addGap(26, 26, 26)
                                .addComponent(btnDeleteProduct)
                                .addGap(26, 26, 26)
                                .addComponent(btnPrintBill)
                                .addGap(31, 31, 31)
                                .addComponent(lblTotal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panBillLayout.createSequentialGroup()
                        .addGroup(panBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panBillLayout.createSequentialGroup()
                                .addComponent(btnBack)
                                .addGap(435, 435, 435)
                                .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jspBill, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panBillLayout.setVerticalGroup(
            panBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBillLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(panBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panBillLayout.createSequentialGroup()
                        .addComponent(lblIndexBill)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panBillLayout.createSequentialGroup()
                        .addGroup(panBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack)
                            .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jspBill, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPrintBill, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblTotal))
                            .addGroup(panBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnSelect)
                                .addComponent(btnDeleteProduct)
                                .addComponent(jButton1)))))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panBill, javax.swing.GroupLayout.PREFERRED_SIZE, 775, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panBill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
       this.setVisible(false);
       txtTotal.setText("");
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
        parameter = this.getBillCodeaux();
        this.addTable(parameter);
        valueT=0;
        totalValue();
    }//GEN-LAST:event_btnSelectActionPerformed

    private void btnDeleteProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteProductActionPerformed
        int fila = tblBill.getSelectedRow();
        String sql = "DELETE * FROM DetailBill WHERE Id="+ tblBill.getValueAt(fila, 0);
        boolean f=dataFile.execute(sql);
        if(f==true){
            addTable(parameter);
            totalValue();
            JOptionPane.showMessageDialog(null, "Deleted data", "Information",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteProductActionPerformed

    private void btnPrintBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintBillActionPerformed
        int dialog= JOptionPane.YES_NO_OPTION;
        JOptionPane.showConfirmDialog(this,"You want to add the bill prior to the final bill?","Information",dialog);
        if(dialog == JOptionPane.YES_OPTION && validateview()){
            insertProductToFinalBill();
            indexBill();
        }
        else{
            JOptionPane.showMessageDialog(this, "Error code of Bill repeated");
        }
    }//GEN-LAST:event_btnPrintBillActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        parameter = Integer.parseInt(JOptionPane.showInputDialog(this,"Please write of idBill"));
        this.addTable(parameter);
        valueT=0;
        totalValue();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(IntBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IntBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IntBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IntBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IntBill().setVisible(true);
            }
        });
    }
    
    private void indexBill(){
        try {
            String sql ="SELECT * FROM Bill ORDER BY billCode DESC LIMIT 1";
            dataFile.execute(sql);
            while(dataFile.getResultSet().next()){
                int last=dataFile.getResultSet().getInt("billCode");
                int plus=last+1;
                lblIndexBill.setText(""+plus);
                lblIndexBill.setVisible(false);
            }
        } catch (SQLException ex) {
            Logger.getLogger(IntBill.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void totalValue(){
       double numero = 0;
        for(int i=0;i<model.getRowCount();i++){
           numero = Double.parseDouble(model.getValueAt(i, 5).toString());
           valueT +=numero;
           }
           txtTotal.setText("$"+valueT);
    }
    
    private Bill interface2ObjectBill() {
            Bill bill = new Bill();
                bill.setBillCode(Integer.parseInt(lblIndexBill.getText()));
                bill.setBillDate(lblDate.getText());
                bill.setSaleType(""+(tblBill.getValueAt(0,6)));
                bill.setSellerName(this.getLabelUser().getText());
                bill.setValue(valueT);
        return bill;
    }
     
      private void insertProductToFinalBill() {
        bill = this.interface2ObjectBill();
        String query = "INSERT INTO Bill"
                + "(billCode, billDate,saleType, sellerName, valueBill)"
                + "VALUES ("
                + bill.getBillCode() + ",'"
                + bill.getBillDate()+ "','"
                + bill.getSaleType()+ "','"
                +bill.getSellerName()+ "',"
                +bill.getValue()+")";
        if (this.getDataFile().execute(query)) {
            JOptionPane.showMessageDialog(this, "product Add to Bill");
        }
        else
           JOptionPane.showMessageDialog(this, "Error", "error",JOptionPane.ERROR);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeleteProduct;
    private javax.swing.JButton btnPrintBill;
    private javax.swing.JButton btnSelect;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jspBill;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblIndexBill;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPanel panBill;
    private javax.swing.JTable tblBill;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

    private void addTable(int parameter) {
        for (int i = 0; i<tblBill.getRowCount(); i++) {
            model.removeRow(i);
            i-=1;
        }
        Object []object = new Object[7];
        try {
            String query = "SELECT * FROM DetailBill WHERE idDetailBill="+parameter+"";
            this.getDataFile().execute(query);
            while(dataFile.getResultSet().next()) {
                object[0] = dataFile.getResultSet().getInt("Id");
                object[1] = dataFile.getResultSet().getInt("idDetailBill");
                object[2] = dataFile.getResultSet().getString("product");
                object[3] = dataFile.getResultSet().getInt("quantity");
                object[4] = dataFile.getResultSet().getString("salePrice");
                object[5] = dataFile.getResultSet().getString("totalValue");
                object[6] = dataFile.getResultSet().getString("saleType");
                model.addRow(object);
               }
            } catch (SQLException | NullPointerException ex) {
            Logger.getLogger(IntBill.class.getName()).log(Level.SEVERE, null, ex);
        }
        }

    private boolean validateview() {
        boolean validate = false;
        String sql ="SELECT * FROM Bill";
            dataFile.execute(sql);
        try {
            while(dataFile.getResultSet().next()){
                int in=dataFile.getResultSet().getInt("billCode");
                if(Integer.parseInt(tblBill.getValueAt(0,1).toString()) == in){
                 validate = false;   
                }
                else{
                    validate= true;
                }
            }
        } catch (SQLException ex) {  
            Logger.getLogger(IntBill.class.getName()).log(Level.SEVERE, null, ex);
        }
        return validate;
    }
    
    public void selectCurrentBill() {
        parameter = this.getBillCodeaux();
        this.addTable(parameter);
        valueT=0;
        totalValue();
    }
    
}
