/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.nnov.nntc.mbuldov.java.mysql.app;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.TypedQuery;
import javax.swing.table.DefaultTableModel;
import javax.persistence.Query;
import javax.swing.JTable;
import ru.nnov.nntc.mbuldov.java.mysql.appdb.Student;
/**
 *
 * @author student
 */

public class StudentsForm extends javax.swing.JFrame {
    
    public final MasterForm parent;
    //private final int pageSize = 3;
    private int pageNumber = 1;
    private int pagesCount;
    
    public Student selectedStudent = null;
    /**
     * Creates new form StudentsForm
     * @param parent
     */
    public StudentsForm(MasterForm parent) {
        initComponents();
        setLocationRelativeTo(null); // позиционировать форму по центу экрана
        this.parent = parent;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTop = new javax.swing.JPanel();
        jBtnImport = new javax.swing.JButton();
        jBtnAdd = new javax.swing.JButton();
        jBtnExport = new javax.swing.JButton();
        jTextFieldFilter = new javax.swing.JTextField();
        jBtnFilter = new javax.swing.JButton();
        jPanelMid = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableStudents = new javax.swing.JTable();
        jPanelBottom = new javax.swing.JPanel();
        jLabelPages = new javax.swing.JLabel();
        jBtnBack = new javax.swing.JButton();
        jBtnForw = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldPageSize = new javax.swing.JTextField();

        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jBtnImport.setText("Импорт");
        jBtnImport.setMaximumSize(new java.awt.Dimension(90, 30));
        jBtnImport.setMinimumSize(new java.awt.Dimension(90, 30));

        jBtnAdd.setText("Добавить");
        jBtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAddActionPerformed(evt);
            }
        });

        jBtnExport.setText("Экспорт");

        jBtnFilter.setText("Фильтр");
        jBtnFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnFilterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelTopLayout = new javax.swing.GroupLayout(jPanelTop);
        jPanelTop.setLayout(jPanelTopLayout);
        jPanelTopLayout.setHorizontalGroup(
            jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBtnImport, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnFilter, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelTopLayout.setVerticalGroup(
            jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTopLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnImport, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(jBtnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnExport, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldFilter)
                    .addComponent(jBtnFilter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTableStudents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "№ зачётки", "Фамилия", "Имя", "Курс"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableStudents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableStudentsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableStudents);

        javax.swing.GroupLayout jPanelMidLayout = new javax.swing.GroupLayout(jPanelMid);
        jPanelMid.setLayout(jPanelMidLayout);
        jPanelMidLayout.setHorizontalGroup(
            jPanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanelMidLayout.setVerticalGroup(
            jPanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMidLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabelPages.setText("1/15");

        jBtnBack.setText("Назад");
        jBtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBackActionPerformed(evt);
            }
        });

        jBtnForw.setText("Вперед");
        jBtnForw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnForwActionPerformed(evt);
            }
        });

        jLabel1.setText("Кол-во страниц");

        jTextFieldPageSize.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldPageSize.setText("5");

        javax.swing.GroupLayout jPanelBottomLayout = new javax.swing.GroupLayout(jPanelBottom);
        jPanelBottom.setLayout(jPanelBottomLayout);
        jPanelBottomLayout.setHorizontalGroup(
            jPanelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBottomLayout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addComponent(jBtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelPages)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldPageSize, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnForw)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBottomLayout.setVerticalGroup(
            jPanelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBottomLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnBack)
                    .addComponent(jBtnForw)
                    .addComponent(jLabelPages)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPageSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelBottom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelMid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelMid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBottom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAddActionPerformed
     StudentsCardForm studCardForm = new StudentsCardForm(this);
     studCardForm.setVisible(true);  
    }//GEN-LAST:event_jBtnAddActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        refreshTable();
    }//GEN-LAST:event_formWindowActivated

    private void jBtnFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnFilterActionPerformed
       refreshTable();
    }//GEN-LAST:event_jBtnFilterActionPerformed

    private void jBtnForwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnForwActionPerformed
      if((pageNumber + 1) <= pagesCount){
          pageNumber++;
      }
      refreshTable();
    }//GEN-LAST:event_jBtnForwActionPerformed

    private void jBtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBackActionPerformed
         if((pageNumber - 1) >= 1){
          pageNumber--;
      }
      refreshTable();
    }//GEN-LAST:event_jBtnBackActionPerformed

    private void jTableStudentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableStudentsMouseClicked
       
        if(evt.getClickCount() == 2){
            
           JTable table = (JTable) evt.getSource();
           int row = table.rowAtPoint(evt.getPoint());
           int id = (int) jTableStudents.getModel().getValueAt(row, 0);
            
           //System.out.println(id);
           Query query = this.parent.em.createNamedQuery("Student.findByStudentId");
           query.setParameter("studentId", id);
           List<Student> resultList = query.getResultList();
           selectedStudent = resultList.get(0);
           
           StudentsCardForm studCardForm = new StudentsCardForm(this);
           studCardForm.setVisible(true);
 
        }
    }//GEN-LAST:event_jTableStudentsMouseClicked

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        refreshTable();
    }//GEN-LAST:event_formFocusGained

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
            java.util.logging.Logger.getLogger(StudentsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentsForm(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAdd;
    private javax.swing.JButton jBtnBack;
    private javax.swing.JButton jBtnExport;
    private javax.swing.JButton jBtnFilter;
    private javax.swing.JButton jBtnForw;
    private javax.swing.JButton jBtnImport;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelPages;
    private javax.swing.JPanel jPanelBottom;
    private javax.swing.JPanel jPanelMid;
    private javax.swing.JPanel jPanelTop;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableStudents;
    private javax.swing.JTextField jTextFieldFilter;
    private javax.swing.JTextField jTextFieldPageSize;
    // End of variables declaration//GEN-END:variables

    
     public static boolean isInteger(String s, int radix) {
         if(s.isEmpty()) return false;
         for(int i = 0; i < s.length(); i++){
             if(i == 0 && s.charAt(i) == '-') {
                 if(s.length() == 1) return false;
                 else continue;
             }
             if(Character.digit(s.charAt(i), radix) < 0) return false;
         }
         return true;
     }

    private void refreshTable(){
       
        DefaultTableModel model = (DefaultTableModel) jTableStudents.getModel();
        //Очистка
        model.setRowCount(0);
        
        String filter = "";
        
        String userFilter = jTextFieldFilter.getText();
        
        if(userFilter.length()>0){

            List<String> filterParts = new ArrayList<String>();
            
            if(isInteger(userFilter, 10)){
                filterParts.add("id=" + userFilter);
            }
            
            filterParts.add("surname LIKE '%" + userFilter + "%'");
            filterParts.add("name LIKE '%" + userFilter + "%'");
            
            if(isInteger(userFilter, 10)){
                filterParts.add("kurs=" + userFilter);
            }
            
            String filterPartsString = String.join(" OR ", filterParts);
            
            filter = filter + " WHERE " + filterPartsString;
        }
        
        TypedQuery<Object[]> query = this.parent.em.createQuery(
                "SELECT s.studentId id, s.surname surname, s.name name, s.kurs kurs FROM Student s" + filter,
                Object[].class
                );
        
        if(!isInteger(jTextFieldPageSize.getText(), 10)){
            jTextFieldPageSize.setText("5");
        } else {
            if(Integer.valueOf(jTextFieldPageSize.getText())<=0){
                jTextFieldPageSize.setText("5");
            }
        }
        
        if(Integer.valueOf(jTextFieldPageSize.getText())>0){
            
            int rowsAll = query.getResultList().size();
            pagesCount = rowsAll/Integer.valueOf(jTextFieldPageSize.getText());
            
            if((pagesCount*Integer.valueOf(jTextFieldPageSize.getText())) < rowsAll){
                pagesCount++;
            }
            
            
            jLabelPages.setText(String.valueOf(pageNumber) + "/" + String.valueOf(pagesCount));
        } else {
            jLabelPages.setText("");
            jBtnBack.setEnabled(false);
            jBtnForw.setEnabled(false);
        }
        
    
        if(Integer.valueOf(jTextFieldPageSize.getText()) > 0){
            query.setMaxResults(Integer.valueOf(jTextFieldPageSize.getText()));
            query.setFirstResult((pageNumber-1) * Integer.valueOf(jTextFieldPageSize.getText()));
        }
        
        List<Object[]> results = query.getResultList();
        
        for(Object[] result : results){
            
            Object rowData[] = new Object[4];
        
            rowData[0] = result[0];
            rowData[1] = result[1];
            rowData[2] = result[2];
            rowData[3] = result[3];
            
            model.addRow(rowData);   
        }
        
        jTableStudents.setModel(model);
        
        // включить сортировку данных по кликам в зголовки
        jTableStudents.setAutoCreateRowSorter(true);
        
        jBtnBack.setEnabled(!(pageNumber==1));
        jBtnForw.setEnabled(!(pageNumber==pagesCount));
         
    }

}



