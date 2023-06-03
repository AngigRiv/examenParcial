package presentacion;

import dominio.Propiedad;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import negocio.PropiedadControl;

public class FrmPropiedad extends javax.swing.JInternalFrame {

   
    private PropiedadControl control;
    private Propiedad obj;
    
    public FrmPropiedad() {
        initComponents();
        obj= new Propiedad();
        control=new PropiedadControl();
        this.lb_id.setVisible(false);
        this.txt_id.setVisible(false);
        this.txt_id.setEditable(false);
        this.listar();
    }
    private void listar(){
        String texto=txtBuscar.getText();
        tablaListado.setModel(control.listar(texto));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btn_buscar = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        btn_registrar = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        txtBuscar = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaListado = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_caracteristicas = new javax.swing.JTextField();
        txt_estado = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_precio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btn_accion = new javax.swing.JButton();
        lb_id = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        btn_mostrar_lista = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Gestión de Propiedades");

        jPanel1.setLayout(new java.awt.CardLayout());

        jPanel8.setLayout(new java.awt.BorderLayout());

        jPanel3.setLayout(new java.awt.BorderLayout());

        jLabel1.setText("Nombre");
        jPanel5.add(jLabel1);

        jPanel3.add(jPanel5, java.awt.BorderLayout.LINE_START);

        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });
        jPanel6.add(btn_buscar);

        btn_limpiar.setText("Limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });
        jPanel6.add(btn_limpiar);

        btn_registrar.setText("Registrar");
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });
        jPanel6.add(btn_registrar);

        btn_actualizar.setText("Actualizar");
        btn_actualizar.setEnabled(false);
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });
        jPanel6.add(btn_actualizar);

        btn_eliminar.setText("Eliminar");
        btn_eliminar.setEnabled(false);
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        jPanel6.add(btn_eliminar);

        jPanel3.add(jPanel6, java.awt.BorderLayout.LINE_END);

        jPanel7.setLayout(new java.awt.BorderLayout());

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
        });
        jPanel7.add(txtBuscar, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel7, java.awt.BorderLayout.CENTER);

        jPanel8.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel4.setLayout(new java.awt.BorderLayout());

        tablaListado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaListado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaListadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaListado);

        jPanel4.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel8.add(jPanel4, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel8, "card2");

        jLabel2.setText("Nombre");

        jLabel3.setText("Direccion");

        jLabel4.setText("Caracteristicas");

        jLabel5.setText("Estado");

        jLabel6.setText("Precio");

        btn_accion.setText("Accion");
        btn_accion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_accionActionPerformed(evt);
            }
        });

        lb_id.setText("id");

        btn_mostrar_lista.setText("Atras");
        btn_mostrar_lista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mostrar_listaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(lb_id)
                        .addGap(41, 41, 41)
                        .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(41, 41, 41)
                        .addComponent(txt_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(41, 41, 41)
                        .addComponent(txt_caracteristicas, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(41, 41, 41)
                        .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(41, 41, 41)
                        .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_accion)
                            .addComponent(jLabel6))
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(txt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_mostrar_lista, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(376, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_id)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_caracteristicas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_accion)
                    .addComponent(btn_mostrar_lista))
                .addContainerGap(247, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel9, "card3");

        jTabbedPane2.addTab("Listado", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
       CardLayout card = (CardLayout) this.jPanel1.getLayout();
       card.show(jPanel1, "card3");
       this.btn_accion.setText("Actualizar");
       txtBuscar.setText("");
       this.lb_id.setVisible(true);
        this.txt_id.setVisible(true);
        
        this.txt_id.setText(""+obj.getId());
        this.txt_nombre.setText(obj.getNombre());
        this.txt_caracteristicas.setText(obj.getCaracteristicas());
        this.txt_direccion.setText(obj.getDireccion());
        this.txt_estado.setText(obj.getEstado());
        this.txt_precio.setText(""+obj.getPrecioAlquiler());
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
       CardLayout card = (CardLayout) this.jPanel1.getLayout();
       card.show(jPanel1, "card3");
       this.btn_accion.setText("Registrar");
       txtBuscar.setText("");
              this.lb_id.setVisible(false);
        this.txt_id.setVisible(false);
        this.txt_id.setEditable(false);
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void btn_mostrar_listaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mostrar_listaActionPerformed
       CardLayout card = (CardLayout) this.jPanel1.getLayout();
       card.show(jPanel1, "card2");
       
       
       this.txt_id.setText("");
       this.txt_nombre.setText("");
       this.txt_caracteristicas.setText("");
       this.txt_direccion.setText("");
       this.txt_estado.setText("");
       this.txt_precio.setText("");
       this.btn_actualizar.setEnabled(false);
       this. btn_eliminar.setEnabled(false);
            obj= new Propiedad();
    }//GEN-LAST:event_btn_mostrar_listaActionPerformed

    private void btn_accionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_accionActionPerformed
      this.SeleccionarAccion ();
    }//GEN-LAST:event_btn_accionActionPerformed

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed

    }//GEN-LAST:event_txtBuscarKeyPressed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
     if (this.txtBuscar.getText().isEmpty()){
         JOptionPane.showMessageDialog(null, "Por favor, ingrese un nombre", "Error", JOptionPane.ERROR_MESSAGE);
     }else{
     this.listar();
     
     }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
       tablaListado.setModel(control.listar(""));
       txtBuscar.setText("");
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void tablaListadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaListadoMouseClicked
        DefaultTableModel model = (DefaultTableModel) tablaListado.getModel();
          int selectedRow = tablaListado.getSelectedRow();
           if (selectedRow >= 0) {
            // Obtener los datos de la fila seleccionada
            int id = Integer.parseInt(model.getValueAt(selectedRow, 0).toString());
            String nombre = model.getValueAt(selectedRow, 1).toString();
            String direccion = model.getValueAt(selectedRow, 2).toString();
            String caracteristicas = model.getValueAt(selectedRow, 3).toString();
            String estado = model.getValueAt(selectedRow, 4).toString();
            double precioAlquiler = Double.parseDouble(model.getValueAt(selectedRow, 5).toString());
            obj.setId(id);
            obj.setNombre(nombre);
            obj.setDireccion(direccion);
            obj.setCaracteristicas(caracteristicas);
            obj.setEstado(estado);
            obj.setPrecioAlquiler(precioAlquiler);
            btn_actualizar.setEnabled(true);
            btn_eliminar.setEnabled(true);
        }else{
           btn_actualizar.setEnabled(false);
            btn_eliminar.setEnabled(false);
           }
        //tablaListado.setModel(control.listar(texto));
    }//GEN-LAST:event_tablaListadoMouseClicked

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
       String resp;
        resp = this.control.eliminar(obj.getId());
         if (resp.equals("OK")) {
                   JOptionPane.showMessageDialog(null, "Datos eliminados correctamente", "Success", JOptionPane.INFORMATION_MESSAGE);
                this.listar();
                  this.txt_id.setText("");
                    this.txt_nombre.setText("");
                    this.txt_caracteristicas.setText("");
                    this.txt_direccion.setText("");
                    this.txt_estado.setText("");
                    this.txt_precio.setText("");
                    this.btn_actualizar.setEnabled(false);
                    this. btn_eliminar.setEnabled(false);
                         obj= new Propiedad();
            } else {
               JOptionPane.showMessageDialog(null, resp, "Error", JOptionPane.ERROR_MESSAGE);
            }
         
         
    }//GEN-LAST:event_btn_eliminarActionPerformed
    public void SeleccionarAccion (){
            if ("Registrar".equals(btn_accion.getText())){
                   // Validar que el campo nombre no este vacío
        String resp;
        String nombre= this.txt_nombre.getText(),
                direccion= this.txt_direccion.getText(),
                caracteristicas= this.txt_caracteristicas.getText(),
                estado= this.txt_estado.getText();
        
        double precioAlquiler= Double.parseDouble(this.txt_precio.getText());

        if (nombre.length() == 0|| this.txt_precio.getText().isEmpty() || direccion.length() == 0|| caracteristicas.length() == 0|| estado.length() == 0) {
             JOptionPane.showMessageDialog(null, "Por favor, Llena todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            obj.setNombre(nombre);
            obj.setDireccion(direccion);
            obj.setEstado(estado);
            obj.setCaracteristicas(caracteristicas);
            obj.setPrecioAlquiler(precioAlquiler);
            resp = this.control.insertar(obj);//resp toma lo q devuelva el metodo insertar de la capa negocio
            if (resp.equals("OK")) {
                   JOptionPane.showMessageDialog(null, "Datos insertados correctamente", "Success", JOptionPane.INFORMATION_MESSAGE);
               
                this.listar();
               
            } else {
               JOptionPane.showMessageDialog(null, resp, "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
                
            }else{
               
        String resp;
        int id = Integer.parseInt(this.txt_id.getText());
        String nombre= this.txt_nombre.getText(),
                direccion= this.txt_direccion.getText(),
                caracteristicas= this.txt_caracteristicas.getText(),
                estado= this.txt_estado.getText();
        
        double precioAlquiler= Double.parseDouble(this.txt_precio.getText());

        if (nombre.length() == 0|| this.txt_precio.getText().isEmpty() || direccion.length() == 0|| caracteristicas.length() == 0|| estado.length() == 0) {
             JOptionPane.showMessageDialog(null, "Por favor, Llena todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            obj.setId(id);
            obj.setNombre(nombre);
            obj.setDireccion(direccion);
            obj.setEstado(estado);
            obj.setCaracteristicas(caracteristicas);
            obj.setPrecioAlquiler(precioAlquiler);
            resp = this.control.actualizar(obj);//resp toma lo q devuelva el metodo insertar de la capa negocio
            if (resp.equals("OK")) {
                   JOptionPane.showMessageDialog(null, "Datos actualizados correctamente", "Success", JOptionPane.INFORMATION_MESSAGE);
               
                this.listar();
               
            } else {
               JOptionPane.showMessageDialog(null, resp, "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
            
            }
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_accion;
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_mostrar_lista;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel lb_id;
    private javax.swing.JTable tablaListado;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txt_caracteristicas;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_estado;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_precio;
    // End of variables declaration//GEN-END:variables
}
