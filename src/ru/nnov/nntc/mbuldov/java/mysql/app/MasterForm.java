/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.nnov.nntc.mbuldov.java.mysql.app;

import java.util.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javenue.csv.Csv;
import ru.nnov.nntc.mbuldov.java.mysql.appdb.Lecturer;
import ru.nnov.nntc.mbuldov.java.mysql.appdb.Student;

/**
 *
 * @author student
 */
public class MasterForm extends javax.swing.JFrame {

    // Диалоги, вызываемые из главной формы
    private final AboutJDialog aboutDlg = new AboutJDialog(this, rootPaneCheckingEnabled);
    private final SettingsJDialog settDialog = new SettingsJDialog(this, rootPaneCheckingEnabled);
 
    // Подключение к базе данных
    public static Connection conn = null;
    
    /**
     * Creates new form MasterForm
     */
    public MasterForm() {
        initComponents();
        setLocationRelativeTo(null); // позиционировать форму по центу экрана
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar = new javax.swing.JMenuBar();
        mainMenu = new javax.swing.JMenu();
        importStudMenuItem = new javax.swing.JMenuItem();
        importLectMenuItem = new javax.swing.JMenuItem();
        exportMenuItem = new javax.swing.JMenuItem();
        settingsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        mainMenu.setMnemonic('f');
        mainMenu.setText("Меню");

        importStudMenuItem.setMnemonic('o');
        importStudMenuItem.setText("Импорт студентов");
        importStudMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importStudMenuItemActionPerformed(evt);
            }
        });
        mainMenu.add(importStudMenuItem);

        importLectMenuItem.setMnemonic('o');
        importLectMenuItem.setText("Импорт преподавателей");
        importLectMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importLectMenuItemActionPerformed(evt);
            }
        });
        mainMenu.add(importLectMenuItem);

        exportMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        exportMenuItem.setMnemonic('s');
        exportMenuItem.setText("Экспорт");
        mainMenu.add(exportMenuItem);

        settingsMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        settingsMenuItem.setMnemonic('a');
        settingsMenuItem.setText("Настройки");
        settingsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsMenuItemActionPerformed(evt);
            }
        });
        mainMenu.add(settingsMenuItem);

        exitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Выход");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        mainMenu.add(exitMenuItem);

        menuBar.add(mainMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Помощь");

        aboutMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("О программе");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 579, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        //System.exit(0);
        formWindowClosing(null);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // реализуем диалог подтверждения выхода из программы
        int dialogResult = JOptionPane.showConfirmDialog (null, "Выйти из программы?","Выход", JOptionPane.YES_NO_OPTION);
        if(dialogResult == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
        aboutDlg.setVisible(true);
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        
        if(isConnSucess()){
            // подключение успешно - работаем дальше
            System.out.println("Успешное подключение к бд");
        } else {
            settDialog.setVisible(true);
        }
        
    }//GEN-LAST:event_formFocusGained

    private void settingsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsMenuItemActionPerformed
        settDialog.setVisible(true);
    }//GEN-LAST:event_settingsMenuItemActionPerformed

    private void importStudMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importStudMenuItemActionPerformed
        // открываем диалог загрузки файла csv
        JFileChooser fileopen = new JFileChooser();
        int fopenResult = fileopen.showDialog(null, "Импорт студентов");
        int SUCCESS_SELECTED_FILE = 0;
        
        if (SUCCESS_SELECTED_FILE == fopenResult) {
            // пользователь выбрал файл - парсим...
            Csv.Reader reader = null;

            try {
                reader = new Csv.Reader(new FileReader(fileopen.getSelectedFile()))
                        .delimiter(',') // !!!
                        .ignoreComments(true); // !!!
            } catch (FileNotFoundException ex) {
                Logger.getLogger(MasterForm.class.getName()).log(Level.SEVERE, null, ex);
                return;
            }
            
            List<String> line;
            List<String> importErrors = new ArrayList<String>();
            
            line=reader.readLine(); // считали первую строчку - чтобы она не была в итерациях цикла
            
            //проверка шапки
            String F1 = "номер зачётки";
            String F2 = "фамилия";
            String F3 = "имя";
            String F4 = "курс";
            
            if (!(F1.equalsIgnoreCase(line.get(0)) 
                    && F2.equalsIgnoreCase(line.get(1)) 
                    && F3.equalsIgnoreCase(line.get(2)) 
                    && F4.equalsIgnoreCase(line.get(3)))){
                
                importErrors.add("Шапка не соответствует формату:\""
                        .concat(F1.concat(",").concat(F2).concat(",").concat(F3).concat(",").concat(F4)).concat("\""));
                
                ErrorsJDialog errDlg = new ErrorsJDialog(this, rootPaneCheckingEnabled);
                errDlg.SetErrors("Ошибка импорта студентов:", importErrors);
                errDlg.setVisible(true);
                return;
                
            }
            
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("myJavaAppPU");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
            
            while((line=reader.readLine())!=null){
                
                // распарсить список на отдельные значения и выполнить INSERT в базу данных
                String num = line.get(0);
                String surname = line.get(1);
                String name = line.get(2);
                String kurs = line.get(3);
                
                Student stud = new Student();
                stud.setStudentId(Integer.parseInt(num));
                stud.setName(name);
                stud.setSurname(surname);
                stud.setKurs(Integer.parseInt(kurs));
                em.persist(stud);
                
            }
            
            em.getTransaction().commit();
            

        } else {
            System.out.println("Пользователь не выбрал файл");
        }
        
        
    }//GEN-LAST:event_importStudMenuItemActionPerformed

    private void importLectMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importLectMenuItemActionPerformed
        // открываем диалог загрузки файла csv
        JFileChooser fileopen = new JFileChooser();
        int fopenResult = fileopen.showDialog(null, "Импорт преподавателей");
        int SUCCESS_SELECTED_FILE = 0;
        
        if (SUCCESS_SELECTED_FILE == fopenResult) {
            // пользователь выбрал файл - парсим...
            Csv.Reader reader = null;

            try {
                reader = new Csv.Reader(new FileReader(fileopen.getSelectedFile()))
                        .delimiter(',') // !!!
                        .ignoreComments(true); // !!!
            } catch (FileNotFoundException ex) {
                Logger.getLogger(MasterForm.class.getName()).log(Level.SEVERE, null, ex);
                return;
            }
            
            List<String> line;
            
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("myJavaAppPU");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
            
            line=reader.readLine(); // считали первую строчку - чтобы она не была в итерациях цикла
            
            while((line=reader.readLine())!=null){
                
                // распарсить список на отдельные значения и выполнить INSERT в базу данных
                String surname = line.get(0);
                String name = line.get(1);
                String city = line.get(2);
                
                Lecturer lect = new Lecturer();
                lect.setName(name);
                lect.setSurname(surname);
                lect.setCity(city);
                em.persist(lect);
                
            }
            
            em.getTransaction().commit();
            

        } else {
            System.out.println("Пользователь не выбрал файл");
        }
    }//GEN-LAST:event_importLectMenuItemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        //Config.load("config.json");
        
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
            java.util.logging.Logger.getLogger(MasterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MasterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MasterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MasterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MasterForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenuItem exportMenuItem;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem importLectMenuItem;
    private javax.swing.JMenuItem importStudMenuItem;
    private javax.swing.JMenu mainMenu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem settingsMenuItem;
    // End of variables declaration//GEN-END:variables

    private boolean isConnSucess() {
        
        Config.load("config.json");
        String DB_USER = Config.getInstance().DB_USER;
        String DB_PASSWORD = Config.getInstance().DB_PASSWORD;
        String DB_CONN_STRING = Config.getInstance().DB_CONN_STRING;
        
        try {
                    conn = DriverManager.getConnection(DB_CONN_STRING, DB_USER, DB_PASSWORD);
                    System.out.println("Connected");
                    return true;
                } catch (SQLException e){
                    System.err.println(e.toString());
                    return false;
                }        
    }

}