/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Rectangle;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author prez
 */
public class App extends javax.swing.JFrame {

    public App() {
        initComponents();

        setBounds(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
        setTitle("Archivos");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btnCrear = new javax.swing.JButton();
        btnLeer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtTexto = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        btnCrearProperties = new javax.swing.JButton();
        btnLeerProperties = new javax.swing.JButton();
        btnLeerTodos = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtLog = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCrear.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnCrear.setText("Crear Archivo (Escribir)");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnLeer.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnLeer.setText("Leer Archivo (Leer)");
        btnLeer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeerActionPerformed(evt);
            }
        });

        txtTexto.setBackground(new java.awt.Color(0, 0, 0));
        txtTexto.setColumns(20);
        txtTexto.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        txtTexto.setForeground(new java.awt.Color(51, 255, 51));
        txtTexto.setRows(5);
        txtTexto.setTabSize(4);
        jScrollPane1.setViewportView(txtTexto);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 938, Short.MAX_VALUE)
                    .addComponent(btnCrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLeer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCrear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLeer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Escribir y leer", jPanel1);

        btnCrearProperties.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnCrearProperties.setText("Crear archivo Properties");
        btnCrearProperties.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearPropertiesActionPerformed(evt);
            }
        });

        btnLeerProperties.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnLeerProperties.setText("Leer archivo Properties (uno a uno)");
        btnLeerProperties.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeerPropertiesActionPerformed(evt);
            }
        });

        btnLeerTodos.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnLeerTodos.setText("Leer archivo Properties (Todos)");
        btnLeerTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeerTodosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCrearProperties, javax.swing.GroupLayout.DEFAULT_SIZE, 938, Short.MAX_VALUE)
                    .addComponent(btnLeerProperties, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLeerTodos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCrearProperties)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLeerProperties)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLeerTodos)
                .addContainerGap(207, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Properties", jPanel2);

        txtLog.setEditable(false);
        txtLog.setColumns(20);
        txtLog.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtLog.setRows(5);
        jScrollPane2.setViewportView(txtLog);

        jMenu1.setText("Archivo");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayuda");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        //http://chuwiki.chuidiang.org/index.php?title=Lectura_y_Escritura_de_Ficheros_en_Java
        String texto = txtTexto.getText();

        try {
            File archivo = new File("archivo.txt");
            FileWriter fw = new FileWriter(archivo, false);
            PrintWriter pw = new PrintWriter(fw);

            pw.print(texto);
            pw.close();
            fw.close();

            txtLog.setText("Ruta: " + archivo.getAbsolutePath()
                    + "\nTamaño: " + archivo.length() + " bytes");
        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnLeerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeerActionPerformed
        txtTexto.setText("");

        try {
            File archivo = new File("archivo.txt");

            if (archivo.exists()) {
                FileReader fr = new FileReader(archivo);
                BufferedReader br = new BufferedReader(fr);

                String linea;
                while ((linea = br.readLine()) != null) {
                    System.out.println(linea);
                    txtTexto.setText(txtTexto.getText().concat(linea).concat("\n"));
                }

                br.close();
                fr.close();
            } else {
                JOptionPane.showMessageDialog(this, "Archivo no existe");
            }

        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLeerActionPerformed

    private void btnCrearPropertiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearPropertiesActionPerformed
        // http://chuwiki.chuidiang.org/index.php?title=Leer_y_modificar_fichero_de_propiedades_en_java
        Properties prop = new Properties();

        prop.put("server", "10.23.20.12");
        prop.put("port", "8080");

        try {
            File archivo = new File("archivo.properties");
            FileWriter fw = new FileWriter(archivo);

            prop.store(fw, "Hecho por Patricio Perez Pinto");

            txtLog.setText("Ruta: " + archivo.getAbsolutePath()
                    + "\nTamaño: " + archivo.length() + " bytes");

            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCrearPropertiesActionPerformed

    private void btnLeerPropertiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeerPropertiesActionPerformed

        try {
            Properties p = new Properties();

            File archivo = new File("archivo.properties");

            if (archivo.exists()) {
                FileReader fr = new FileReader(archivo);

                p.load(fr);

                String server, port;
                server = p.getProperty("server");
                port = p.getProperty("port");

                txtLog.setText(txtLog.getText().concat(server).concat("\n"));
                txtLog.setText(txtLog.getText().concat(port).concat("\n"));

                fr.close();
            } else {
                JOptionPane.showMessageDialog(this, "Archivo no existe");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLeerPropertiesActionPerformed

    private void btnLeerTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeerTodosActionPerformed
        try {
            Properties p = new Properties();

            File archivo = new File("archivo.properties");

            if (archivo.exists()) {
                FileReader fr = new FileReader(archivo);

                p.load(fr);

                Enumeration<Object> keys = p.keys();

                while (keys.hasMoreElements()) {
                    Object key = keys.nextElement();
                    txtLog.setText(txtLog.getText().concat(key + " = " + p.get(key)).concat("\n"));
                }

                fr.close();
            } else {
                JOptionPane.showMessageDialog(this, "Archivo no existe");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLeerTodosActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnCrearProperties;
    private javax.swing.JButton btnLeer;
    private javax.swing.JButton btnLeerProperties;
    private javax.swing.JButton btnLeerTodos;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea txtLog;
    private javax.swing.JTextArea txtTexto;
    // End of variables declaration//GEN-END:variables
}
