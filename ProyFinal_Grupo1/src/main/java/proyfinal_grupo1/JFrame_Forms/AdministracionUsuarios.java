/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyfinal_grupo1.JFrame_Forms;

//Imports
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyfinal_grupo1.Conexion;
import proyfinal_grupo1.Usuario;
import proyfinal_grupo1.main;

/**
 *
 * @author josue
 */
public class AdministracionUsuarios extends javax.swing.JFrame {

    //Variable para conexion con BD
    private final Conexion conn = new Conexion();
    
    public AdministracionUsuarios() {
        initComponents();
        
        //Grupo de los radiobuttons
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(rboAdministrador);
        grupo.add(rboRegular);
        
        //Se actualiza la tabla por primera vez, trayendose los datos de la bd
        cargarTabla();
    }
    
    //Metodo que creara una conexion a la bd y consultara la misma
    private void cargarTabla(){
        //Se crea el atributo conexion, se le asigna el metodo de conexion a bd ya hecho anteriormente
        Connection conexion = conn.conectarBD();
        //Esta variable almacenara la linea de codigo sql que va a ser ejecutada para sacar el resulset y traerlo al programa
        String sql = "SELECT CEDULA_USUARIO, CONTRASENA, PERMISOS from usuarios";
        
        //Se crean las variables que combinen con los atributos de la bd
        int CEDULA_USUARIO;
        String CONTRASENA;
        String PERMISOS;
        
        try{
            //Luego de la conexion vamos a querer sacar un statement
            Statement statement;
            //Se le asigna la variable que lo conectara y sacara el statement de la bd
            statement = conexion.createStatement();
            //Se crea el resulset, es el valor que ocupamos para sacar la data de la bd, este sale del statement
            ResultSet resultset;
            //El resulset almacenara el valor que devuelve executequery(codigo select del MySQL) del statement
            resultset = statement.executeQuery(sql);
            
            //Headers del defaulttablemodel
            String [] columnas = {"Usuario", "Contraseña", "Permisos"};
            //Se crea el modelo de la tabla
            DefaultTableModel modelo = new DefaultTableModel();
            //Se le asignan los headers a la tabla
            modelo.setColumnIdentifiers(columnas);
            
            //Mientras exista un siguiente en el resultset
            while(resultset.next()){
                //Se le asigna los valores de los registros de la base de datos al modelo
                CEDULA_USUARIO = resultset.getInt("CEDULA_USUARIO");
                CONTRASENA = resultset.getString("CONTRASENA");
                PERMISOS = resultset.getString("PERMISOS");
                
                if ("A".equals(PERMISOS)){
                    PERMISOS = "Administrativo";
                }else{
                    PERMISOS = "Regular";
                }
                
                //Se agrega al modelo
                modelo.addRow(new Object[]{CEDULA_USUARIO, CONTRASENA, PERMISOS});
            }
            //Se cierra todo
            resultset.close();
            statement.close();
            conexion.close();
            
            //Se settea el modelo que se acaba de crear
            tblUsuarios.setModel(modelo);
        }catch (Exception e){
            System.out.println(e);
        }
    }
    
    //Metodo para obtener un valor valido de cedula, se usa en editar y eliminar
    private int obtenerCedula(){
        try{
            int cedula; //Recibe la cedula
            boolean existe = false; //Flag para detectar si la cedula existe dentro de la tabla
        
            //Recoge el valor de la cedula ingresado
            cedula = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de cedula del registro que desea afectar"));
            
            //Ciclo que recorre la tabla buscando si el valor ingresado existe en la misma
            for (int i = 0; i < tblUsuarios.getRowCount();i++){
                int row = (int) tblUsuarios.getValueAt(i, 0);
                
                if(row == cedula){
                    existe = true;
                }
            }
            
            //Si existe
            if (existe){
                //Retorna la cedula
                return cedula;
            //Si no existe
            }else{
                //Se le informa al usuario y retorna valor cero
                JOptionPane.showMessageDialog(null, "La cedula ingresada no existe en la tabla!");
                return 0;
            }
        }catch(NumberFormatException e){
            //Si el valor ingresado es invalido, se le informa al usuario y se devuelve cero
            JOptionPane.showMessageDialog(null, "Ha ingresado un valor invalido, vuelvalo a intentar...");
            return 0;
        }
    }
    
    //Metodo para revisar que todas las casillas tengan un valor
    private boolean checkCasillas(){
        if("".equals(txtCedula.getText()) || "".equals(txtContrasena.getText()) || (!rboAdministrador.isSelected()&&!rboRegular.isSelected())){
            JOptionPane.showMessageDialog(null, "Debe de llenar todos los apartados!");
            return false;
        }else{
            return true;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtContrasena = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnInsertar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        rboAdministrador = new javax.swing.JRadioButton();
        rboRegular = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        btnMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administración de Usuarios");
        setBackground(new java.awt.Color(153, 204, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
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
        tblUsuarios.setEnabled(false);
        jScrollPane1.setViewportView(tblUsuarios);

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Datos");

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Contraseña:");

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Permisos:");

        jLabel11.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Cédula:");

        btnInsertar.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        btnInsertar.setText("Insertar Usuario");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        btnEditar.setText("Editar Usuario");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        btnEliminar.setText("Eliminar Usuario");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        rboAdministrador.setText("Administrador");
        rboAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rboAdministradorActionPerformed(evt);
            }
        });

        rboRegular.setText("Regular");
        rboRegular.setActionCommand("");
        rboRegular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rboRegularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rboAdministrador)
                    .addComponent(rboRegular))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(rboAdministrador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rboRegular))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 66, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInsertar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtContrasena, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnInsertar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminar)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 1, 36)); // NOI18N
        jLabel2.setText("Administración de Usuarios");

        btnMenu.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        btnMenu.setText("Menu");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnMenu)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel2)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(btnMenu)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        //Revisa primero si todas las casillas tienen un valor
        if (checkCasillas()){
            //Revisa que el valor de la cedula sea mayor que cero
            if (Integer.parseInt(txtCedula.getText()) <= 0){
                JOptionPane.showMessageDialog(null, "La cedula no puede ser un valor menor a 1...");
            }else{
                try{
                    //Determinar el valor de los permisos del usuario
                    String administrador = "";
                    if(rboAdministrador.isSelected()){
                        administrador = "A";
                    }else if(rboRegular.isSelected()){
                        administrador = "R";
                    }
                    
                    //Se crean las variables que combinen con los atributos de la bd
                    Usuario usuario = new Usuario(administrador, txtContrasena.getText().trim(), Integer.parseInt(txtCedula.getText().trim()));
                    //Conexion a bd
                    Connection conexion = conn.conectarBD();
                    //Se crea el statement
                    Statement statement = conexion.createStatement();
                    //Codigo sql a ejecutar
                    String sql = "INSERT INTO usuarios(CEDULA_USUARIO, CONTRASENA, PERMISOS)"
                                +"VALUES(" +usuario.getNumeroCedula()+",'"
                                           +usuario.getPassword()+"','"
                                           +usuario.getAdministrador()+"')";
                    //Se ejecuta el update que es el comando escrito anteriormente
                    statement.executeUpdate(sql);
                    //Se informa si sale bien
                    JOptionPane.showMessageDialog(null, "Registro insertado con exito");
                    //Cargar tabla para que se muestren los reemplazos de la bd de inmediato
                    cargarTabla();
                    
                    //Reiniciar apartados de insercion de datos
                    rboAdministrador.setSelected(false);
                    rboRegular.setSelected(false);
                    txtContrasena.setText("");
                    txtCedula.setText("");

                    //Cerrar
                    statement.close();
                    conexion.close();
                }catch (Exception e){
                    System.out.println(e);
                }
            }
        }
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        //Revisa si todas las casillas poseen un valor
        if (checkCasillas()){
            //Revisa si la cedula es mayor a 0
            if (Integer.parseInt(txtCedula.getText()) <= 0){
                JOptionPane.showMessageDialog(null, "La cedula no puede ser un valor menor a 1...");
            }else{
                //Determinar el valor de los permisos del usuario
                String administrador = "";
                if(rboAdministrador.isSelected()){
                    administrador = "A";
                }else if(rboRegular.isSelected()){
                    administrador = "R";
                }
                    
                //Se crean las variables que combinen con los atributos de la bd
                Usuario usuario = new Usuario(administrador, txtContrasena.getText().trim(), Integer.parseInt(txtCedula.getText().trim()));

                //Variable para usar en el script sql al ejecutar
                int id = obtenerCedula();

                try{
                    //Conexion a bd
                    Connection conexion = conn.conectarBD();
                    //Se crea el statement
                    Statement statement = conexion.createStatement();
                    //Codigo sql a ejecutar
                    String sql = "UPDATE usuarios SET "
                               + "CEDULA_USUARIO = "+usuario.getNumeroCedula()
                               + ",CONTRASENA = '"+usuario.getPassword()
                               + "',PERMISOS = '"+usuario.getAdministrador()+"' "
                               + "WHERE CEDULA_USUARIO = " + id + "";
                    //Se ejecuta el update que es el comando escrito anteriormente
                    statement.executeUpdate(sql);
                    //Se informa si sale bien
                    if (id == 0){
                    }else{
                        JOptionPane.showMessageDialog(null, "Registro editado con exito");
                    }
                    //Cargar tabla para que se muestren los reemplazos de la bd de inmediato
                    cargarTabla();

                    //Reiniciar apartados de insercion de datos
                    rboAdministrador.setSelected(false);
                    rboRegular.setSelected(false);
                    txtContrasena.setText("");
                    txtCedula.setText("");
                    
                    //Cerrar
                    statement.close();
                    conexion.close();
                }catch (Exception e){
                    System.out.println(e);
                }
            }
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        //Se crean las variables que combinen con los atributos de la bd
        Integer id = obtenerCedula();

        try{
            //Conexion a bd
            Connection conexion = conn.conectarBD();
            //Se crea el statement
            Statement statement = conexion.createStatement();
            //Codigo sql a ejecutar
            String sql = "DELETE FROM usuarios WHERE CEDULA_USUARIO = " + id + "";
            //Se ejecuta el update que es el comando escrito anteriormente
            statement.executeUpdate(sql);
            //Se informa si sale bien
            if (id == 0){
            }else{
                JOptionPane.showMessageDialog(null, "Registro eliminado con exito");
            }
            //Cargar tabla para que se muestren los reemplazos de la bd de inmediato
            cargarTabla();

            //Cerrar
            statement.close();
            conexion.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        if (main.Administrador){
            MenuAdmin menuA = new MenuAdmin();
            this.dispose();
            menuA.setVisible(true);
        }else{
            MenuEmpleado menuE = new MenuEmpleado();
            this.dispose();
            menuE.setVisible(true);
        }
    }//GEN-LAST:event_btnMenuActionPerformed

    private void rboAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rboAdministradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rboAdministradorActionPerformed

    private void rboRegularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rboRegularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rboRegularActionPerformed

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
            java.util.logging.Logger.getLogger(AdministracionUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministracionUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministracionUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministracionUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministracionUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rboAdministrador;
    private javax.swing.JRadioButton rboRegular;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtContrasena;
    // End of variables declaration//GEN-END:variables
}
