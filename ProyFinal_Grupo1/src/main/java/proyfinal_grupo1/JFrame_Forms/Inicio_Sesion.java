package proyfinal_grupo1.JFrame_Forms;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import proyfinal_grupo1.*;
        
public class Inicio_Sesion extends javax.swing.JFrame {

    //Variable para conexion con BD
    private final Conexion conn = new Conexion();
    
    public Inicio_Sesion() {
        initComponents();
    }
    //Metodo para revisar que todas las casillas tengan un valor
    private boolean checkCasillas(){
        if("".equals(txtUsuario.getText()) || "".equals(txtContraseña.getText())){
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
        lbltitulo1 = new javax.swing.JLabel();
        lbltitulo2 = new javax.swing.JLabel();
        lbltitulo = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        txtContraseña = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio Sesion");
        setResizable(false);

        lbltitulo1.setFont(new java.awt.Font("Corbel", 1, 36)); // NOI18N
        lbltitulo1.setText("Inicio de Sesion");

        lbltitulo2.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        lbltitulo2.setText("Usuario:");

        lbltitulo.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        lbltitulo.setText("Contraseña:");

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        btnIngresar.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        txtContraseña.setText("jPasswordField1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbltitulo)
                                    .addComponent(lbltitulo2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                    .addComponent(txtContraseña))))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lbltitulo1)
                        .addGap(54, 54, 54))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lbltitulo1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltitulo2)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltitulo)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        //Variable que indica si se ha encontrado el usuario
        boolean encontrado = false;

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
            
            //Mientras exista un siguiente en el resultset
            while(resultset.next()){
                //Se le asigna los valores de los registros de la base de datos al modelo
                CEDULA_USUARIO = resultset.getInt("CEDULA_USUARIO");
                CONTRASENA = resultset.getString("CONTRASENA");
                PERMISOS = resultset.getString("PERMISOS");
                
                //Si el usuario y la contrasena coinciden
                if ((CEDULA_USUARIO == Integer.parseInt(txtUsuario.getText().trim())) && CONTRASENA.equals(txtContraseña.getText())){
                    //Se chequea si es admin para abrir la interfaz de admin
                    if ("A".equals(PERMISOS)){
                        //Se llama al JFrame para los usuarios admin
                        MenuAdmin menuA = new MenuAdmin();
                        this.dispose();
                        menuA.setVisible(true);
                        encontrado = true;
                        main.Administrador = true;
                        break;
                    //Si no es admin se abre la interfaz regular
                    }else if ("R".equals(PERMISOS)){
                        //Se llama al JFrame para los usuarios regulares
                        MenuEmpleado menuE = new MenuEmpleado();
                        this.dispose();
                        menuE.setVisible(true);
                        encontrado = true;
                        main.Administrador = false;
                        break;
                    }
                }
            }
            
            //Se cierra todo
            resultset.close();
            statement.close();
            conexion.close();
            
        }catch (Exception e){
            System.out.println(e);
        }

        
        //Si no encuentra el usuario ingresado o la contraseña esta mal muestra el mensaje de error
        if (encontrado==false){
            JOptionPane.showMessageDialog(null, "Usuario o contraseña invalidos, vuelvalo a intentar.");
            txtUsuario.setText("");
            txtContraseña.setText("");
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio_Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio_Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio_Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio_Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio_Sesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbltitulo;
    private javax.swing.JLabel lbltitulo1;
    private javax.swing.JLabel lbltitulo2;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
