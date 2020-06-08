
package proyectof;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Atributos.Atributos;
import proyectof.Metodos;
import Atributos.Atributos;


public class JFrameBase extends javax.swing.JFrame {

    DefaultTableModel model = new DefaultTableModel();
    
    public void guardar(Atributos a){
        model.addColumn(a);
    }
    
    public void guardarBase(Atributos a){
       try {
           FileWriter fw= new FileWriter("Base.txt",true);
           BufferedWriter bw = new BufferedWriter(fw);
           PrintWriter pw = new PrintWriter(bw);
           pw.print(a.getId());
           pw.println(a.getEntidad());
           pw.println(a.getNatributo());
           pw.println(a.getTipoDato());
           pw.println(a.getLongitud());
           pw.close();
       } catch (Exception e) {
       }
               
   }
   
   public DefaultTableModel model(){
    
        this.model.addColumn("Id");
        this.model.addColumn("Entidad");
        this.model.addColumn("Atributo");
        this.model.addColumn("Tipo de Dato");
        this.model.addColumn("Longitud");
    
        try {
           FileReader fr = new FileReader("Base.txt");
           BufferedReader br = new BufferedReader(fr);
           String a;
           while((a=br.readLine())!=null){
               StringTokenizer dato =new StringTokenizer(a);
               while (dato.hasMoreTokens()) {
               }
           }
       } catch (Exception e) {
       }
        return model;
   }
   
    public JFrameBase() {
        initComponents();
        
        //Creacion de Columnas para la Tabla
        this.model.addColumn("Id");
        this.model.addColumn("Entidad");
        this.model.addColumn("Atributo");
        this.model.addColumn("Tipo de Dato");
        this.model.addColumn("Longitud");
        this.tableDatos.setModel(model); 
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbId = new javax.swing.JLabel();
        jlbEntidad = new javax.swing.JLabel();
        jlbAtributo = new javax.swing.JLabel();
        jlbTipoDato = new javax.swing.JLabel();
        jlbLongitud = new javax.swing.JLabel();
        txtAtributo = new javax.swing.JTextField();
        comboBoxDato = new javax.swing.JComboBox<>();
        txtLongitud = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDatos = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txtEntidad = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        btnEliminarBase = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlbId.setText("Identificador:");

        jlbEntidad.setText("Ingrese Entidad:");

        jlbAtributo.setText("Ingrese Atributo:");

        jlbTipoDato.setText("Ingrese Tipo de Dato:");

        jlbLongitud.setText("Ingrese Longitud:    ");

        txtAtributo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAtributoKeyTyped(evt);
            }
        });

        comboBoxDato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingrese Dato", "INT", "LONG", "STRING", "DOUBLE", "FLOAT", "DATE", "CHAR" }));
        comboBoxDato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxDatoActionPerformed(evt);
            }
        });

        txtLongitud.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLongitudKeyTyped(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        tableDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Float.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableDatos.setRowHeight(30);
        tableDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableDatos);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel6.setText("BASE DE DATOS");

        txtEntidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEntidadKeyTyped(evt);
            }
        });

        txtId.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });

        btnEliminarBase.setText("Eliminar Base");
        btnEliminarBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarBaseActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jlbId, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlbEntidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlbAtributo, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlbLongitud, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jlbTipoDato, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtAtributo)
                    .addComponent(txtLongitud)
                    .addComponent(txtEntidad, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtId)
                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboBoxDato, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(btnEliminarBase, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(110, 110, 110))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarBase, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(201, 201, 201))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbId, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbEntidad, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEntidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbAtributo)
                    .addComponent(txtAtributo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbTipoDato)
                    .addComponent(comboBoxDato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbLongitud)
                    .addComponent(txtLongitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        
        //Metodo para Boton Agregar
         this.model.addRow(new Object[]{this.txtId.getText(),this.txtEntidad.getText(),this.txtAtributo.getText(),this.comboBoxDato.getSelectedItem(),
         this.txtLongitud.getText()}); 
         
         this.txtId.setText("");
         this.txtEntidad.setText("");
         this.txtAtributo.setText("");
         this.comboBoxDato.setSelectedIndex(0);
         this.txtLongitud.setText("");
         txtId.grabFocus();
         
         
         
    }//GEN-LAST:event_btnAgregarActionPerformed
    int filas;
    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
       
         String []agregar=new String[5];
            agregar[0]=txtId.getText();
            agregar[1]=txtEntidad.getText();
            agregar[2]=txtAtributo.getText();
            agregar[3]=this.comboBoxDato.getSelectedItem().toString();
            agregar[4]=txtLongitud.getText();
   
            for (int i = 0; i < tableDatos.getColumnCount(); i++) {
                
                model.setValueAt(agregar[i], filas, i);
                
                this.txtId.setText("");
                this.txtEntidad.setText("");
                this.txtAtributo.setText("");
                this.comboBoxDato.setSelectedIndex(0);
                this.txtLongitud.setText("");
                txtId.grabFocus();
            
            }
         
        
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        //Metodo para el boton Eliminar     
        int fila_seleccionada =tableDatos.getSelectedRow();
        if(fila_seleccionada>=0){
            model.removeRow(fila_seleccionada);
        }else{
            JOptionPane.showMessageDialog(null, "Selecione una fila por favor");
        }
        this.txtId.setText("");
                this.txtEntidad.setText("");
                this.txtAtributo.setText("");
                this.comboBoxDato.setSelectedIndex(0);
                this.txtLongitud.setText("");
                txtId.grabFocus();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEliminarBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarBaseActionPerformed
        
        //Metodo para El boton Eliminar Base
        int eliminar_todo=tableDatos.getRowCount();
        for (int i = eliminar_todo-1; i >=0; i--) {
            model.removeRow(i);
        }
    }//GEN-LAST:event_btnEliminarBaseActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        
         System.exit(0);
        
    }//GEN-LAST:event_btnSalirActionPerformed

    private void tableDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDatosMouseClicked
            //Metodo para poder utilizar el click del Mouse para seleccionar fila de la tabla
            int fila_seleccionada=tableDatos.getSelectedRow();
        txtId.setText(tableDatos.getValueAt(fila_seleccionada, 0).toString());
        txtEntidad.setText(tableDatos.getValueAt(fila_seleccionada, 1).toString());
        txtAtributo.setText(tableDatos.getValueAt(fila_seleccionada, 2).toString());
        comboBoxDato.setSelectedItem(tableDatos.getValueAt(fila_seleccionada, 3).toString());
        txtLongitud.setText(tableDatos.getValueAt(fila_seleccionada, 4).toString());
        filas=fila_seleccionada;
    }//GEN-LAST:event_tableDatosMouseClicked

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "Ingrese un Numero, no se Permiten letras");
        }
    }//GEN-LAST:event_txtIdKeyTyped

    private void txtLongitudKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLongitudKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "Ingrese un Numero, no se Permiten letras");
        }
    }//GEN-LAST:event_txtLongitudKeyTyped

    private void txtEntidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEntidadKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        
        if(Character.isDigit(validar)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "Ingrese letras , no se Permiten numeros");
        }
    }//GEN-LAST:event_txtEntidadKeyTyped

    private void txtAtributoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAtributoKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        
        if(Character.isDigit(validar)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "Ingrese letras , no se Permiten numeros");
        }
    }//GEN-LAST:event_txtAtributoKeyTyped

    private void comboBoxDatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxDatoActionPerformed
        String valor = (String)comboBoxDato.getSelectedItem();
        
        if(valor.equals("INT")){
            txtLongitud.setVisible(false);
         
        }else if(valor.equals("LONG")){
            txtLongitud.setVisible(false);
           
        }else if(valor.equals("STRING")){
            txtLongitud.setVisible(true);
        
        }else if(valor.equals("DOUBLE")){
            txtLongitud.setVisible(false);
        
        }else if(valor.equals("FLOAT")){
            txtLongitud.setVisible(false);
        
        }else if(valor.equals("DATE")){
            txtLongitud.setVisible(false);
        
        }else if(valor.equals("CHAR")){
            txtLongitud.setVisible(false);
        }
        
    }//GEN-LAST:event_comboBoxDatoActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameBase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminarBase;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> comboBoxDato;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlbAtributo;
    private javax.swing.JLabel jlbEntidad;
    private javax.swing.JLabel jlbId;
    private javax.swing.JLabel jlbLongitud;
    private javax.swing.JLabel jlbTipoDato;
    private javax.swing.JTable tableDatos;
    private javax.swing.JTextField txtAtributo;
    private javax.swing.JTextField txtEntidad;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLongitud;
    // End of variables declaration//GEN-END:variables
}
