/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package crud_java3.EmpleadosGUI;

import crud_java3.EmpleadosDAL.Empleados_Data_Acces_Layer;
import crud_java3.EmpleadosBL.Empleados_Bussines_Layer;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Devel
 */
public class GUI_CRUD_JAVA3 extends javax.swing.JFrame {
    DefaultTableModel Modelo;
    /**
     * Creates new form GUI_CRUD_JAVA3
     */
    public GUI_CRUD_JAVA3() {
        initComponents();
            String [] Titulos = {"ID","PRODUCTO","BODEGA"};
        Modelo = new DefaultTableModel(null,Titulos);
        Table_Data.setModel(Modelo);
        mostrar_Datos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modi  fy this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Table_Data = new javax.swing.JTable();
        ButtonAgregar = new javax.swing.JButton();
        ButtonEditar = new javax.swing.JButton();
        ButtonBorrar = new javax.swing.JButton();
        ButtonCancelar = new javax.swing.JButton();
        TxtID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TxtNombres = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TxtCorreo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CANTIDAD = new javax.swing.JTextField();
        STOCK = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        ComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Table_Data.setModel(new javax.swing.table.DefaultTableModel(
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
        Table_Data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_DataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table_Data);

        ButtonAgregar.setText("Agregar");
        ButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAgregarActionPerformed(evt);
            }
        });

        ButtonEditar.setText("Editar");
        ButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEditarActionPerformed(evt);
            }
        });

        ButtonBorrar.setText("Borrar");
        ButtonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBorrarActionPerformed(evt);
            }
        });

        ButtonCancelar.setText("Cancelar");

        TxtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtIDActionPerformed(evt);
            }
        });

        jLabel1.setText("STOCK");

        jLabel2.setText("PRODUCTO");

        jLabel3.setText("BODEGA");

        TxtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCorreoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Binevenid@s");
        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 0)));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("VERIFICACION STOCK");

        CANTIDAD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CANTIDADActionPerformed(evt);
            }
        });
        CANTIDAD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CANTIDADKeyReleased(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(0, 102, 255));
        jLabel6.setText("STOCK :");

        jLabel7.setForeground(new java.awt.Color(0, 102, 255));
        jLabel7.setText("BODEGA :");

        jButton1.setBackground(new java.awt.Color(51, 255, 51));
        jButton1.setText("VERIFICAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(0, 102, 255));
        jLabel8.setText("CANTIDAD :");

        ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ButtonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(ButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(ButtonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel1))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TxtCorreo)
                                            .addComponent(TxtNombres)
                                            .addComponent(TxtID))))
                                .addGap(18, 18, 18)
                                .addComponent(ButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel6))
                                        .addGap(30, 30, 30))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(STOCK)
                                    .addComponent(ComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CANTIDAD)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))))
                        .addGap(0, 50, Short.MAX_VALUE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(TxtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TxtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ButtonAgregar)
                            .addComponent(ButtonEditar)
                            .addComponent(ButtonBorrar)
                            .addComponent(ButtonCancelar))
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(STOCK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CANTIDAD, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonEditarActionPerformed

    private void TxtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtIDActionPerformed

    private void TxtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCorreoActionPerformed

    private void ButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAgregarActionPerformed

        Empleados_Data_Acces_Layer objConexion = new Empleados_Data_Acces_Layer();
        
          Empleados_Bussines_Layer Objempleados = recuperarDatosdelGUI();
          
          String strSentenciaInsert= String.format("INSERT INTO REGISTRO (PRODUCTO,CANTIDAD,STOCK) VALUES ('%s','%s','%s')",Objempleados.getId(),Objempleados.getNombre(),Objempleados.getCorreo());          
          
        
        objConexion.EjecutarSentenciaSQLite(strSentenciaInsert);
         
       
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonAgregarActionPerformed

    private void Table_DataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_DataMouseClicked
        // TODO add your handling code here:
        
        
        if(evt.getClickCount()==1){
        JTable receptordelatabla = (JTable)evt.getSource();
        
        TxtID.setText(receptordelatabla.getModel().getValueAt(receptordelatabla.getSelectedRow(),0).toString());
        TxtNombres.setText(receptordelatabla.getModel().getValueAt(receptordelatabla.getSelectedRow(),1).toString());
        TxtCorreo.setText(receptordelatabla.getModel().getValueAt(receptordelatabla.getSelectedRow(),2).toString());
        }
        
        
    }//GEN-LAST:event_Table_DataMouseClicked

    private void ButtonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBorrarActionPerformed

       
  Empleados_Data_Acces_Layer objConexion = new Empleados_Data_Acces_Layer();
        
          Empleados_Bussines_Layer Objempleados = recuperarDatosdelGUI();
          
          String strSentenciaInsert= String.format("DELETE FROM REGISTRO ID=%d",Objempleados.getId());          
          
        
        objConexion.EjecutarSentenciaSQLite(strSentenciaInsert);
        this.mostrar_Datos();

        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonBorrarActionPerformed

    private void CANTIDADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CANTIDADActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CANTIDADActionPerformed

    private void CANTIDADKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CANTIDADKeyReleased

    }//GEN-LAST:event_CANTIDADKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        int stock = 0;
        stock=Integer.parseInt(STOCK.getText());
        if (stock<=100){
        CANTIDAD.setText(""+stock);
        CANTIDAD.setFont(new java.awt.Font("Tahoma",0,45){});
        CANTIDAD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CANTIDAD.setAlignmentX(CENTER_ALIGNMENT);
        CANTIDAD.setBackground(Color.GREEN);
        STOCK.setText("");
        STOCK.requestFocus();
        
        }
        
        if (stock>=200&&stock<=300){
        CANTIDAD.setText(""+stock);
        CANTIDAD.setFont(new java.awt.Font("Tahoma",0,45){});
        CANTIDAD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CANTIDAD.setAlignmentX(CENTER_ALIGNMENT);
        CANTIDAD.setBackground(Color.YELLOW);
        STOCK.setText("");
        STOCK.requestFocus();
        
        }
             
        if (stock>300){
        CANTIDAD.setText(""+stock);
        CANTIDAD.setFont(new java.awt.Font("Tahoma",0,45){});
        CANTIDAD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CANTIDAD.setAlignmentX(CENTER_ALIGNMENT);
        CANTIDAD.setBackground(Color.RED);
        STOCK.setText("");
        STOCK.requestFocus();
        
        }
        
    
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxActionPerformed
               
       

    }//GEN-LAST:event_ComboBoxActionPerformed

    private void FillComboBox(java.awt.event.ActionEvent evt) {                                             

       
  Empleados_Data_Acces_Layer objConexionFillComboBox = new Empleados_Data_Acces_Layer();
        
          Empleados_Bussines_Layer Objempleados = recuperarDatosdelGUI();
          
          String strSentenciaSelect= String.format("SELECT * FROM REGISTRO ID=%d",Objempleados.getId());          
          
        
        objConexionFillComboBox.EjecutarSentenciaSQLite(strSentenciaSelect);
        this.mostrar_Datos();

        // TODO add your handling code here:
    } 
    
    public Empleados_Bussines_Layer recuperarDatosdelGUI(){
    Empleados_Bussines_Layer ObjEmpleados= new Empleados_Bussines_Layer();
    int ID = (TxtID.getText().isEmpty())?0: Integer.parseInt(TxtID.getText());
    
    ObjEmpleados.setID(ID);
    ObjEmpleados.setNombre(TxtNombres.getText());
    ObjEmpleados.setCorreo(TxtCorreo.getText());
    
    return ObjEmpleados;
    
    }
    
    public void mostrar_Datos(){
        
        while(Modelo.getRowCount()>0){
            Modelo.removeRow(0);
        }
        
        
        
         Empleados_Data_Acces_Layer objConexion = new Empleados_Data_Acces_Layer();
       try {
                ResultSet resultado = objConexion.ConsultarRegistros("SELECT * FROM REGISTRO;");
            
                while (resultado.next()) {
                        System.out.println(resultado.getString("PRODUCTO"));
                        System.out.println(resultado.getString("CANTIDAD"));
                        System.out.println(resultado.getString("STOCK"));       
                       
                        Object[] ObjTableUsuario={resultado.getString("PRODUCTO"),resultado.getString("CANTIDAD"),resultado.getString("STOCK")};
                        Modelo.addRow(ObjTableUsuario);
                
                }
            } catch (SQLException e) {
                System.out.println(e);
            }
      
    }
 
    
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
            java.util.logging.Logger.getLogger(GUI_CRUD_JAVA3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_CRUD_JAVA3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_CRUD_JAVA3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_CRUD_JAVA3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_CRUD_JAVA3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAgregar;
    private javax.swing.JButton ButtonBorrar;
    private javax.swing.JButton ButtonCancelar;
    private javax.swing.JButton ButtonEditar;
    private javax.swing.JTextField CANTIDAD;
    private javax.swing.JComboBox<String> ComboBox;
    private javax.swing.JTextField STOCK;
    private javax.swing.JTable Table_Data;
    private javax.swing.JTextField TxtCorreo;
    private javax.swing.JTextField TxtID;
    private javax.swing.JTextField TxtNombres;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}