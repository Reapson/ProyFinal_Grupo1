/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyfinal_grupo1.JFrame_Forms;

//Imports
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyfinal_grupo1.*;

/**
 *
 * @author josue
 */
public class AdministracionProveedores extends javax.swing.JFrame {

    //Variable para conexion con BD
    private final Conexion conn = new Conexion();
    
    public AdministracionProveedores() {
        initComponents();
        //Se actualiza la tabla por primera vez, trayendose los datos de la bd
        cargarTabla();
    }
    
    //Metodo que creara una conexion a la bd y consultara la misma
    private void cargarTabla(){
        //Se crea el atributo conexion, se le asigna el metodo de conexion a bd ya hecho anteriormente
        Connection conexion = conn.conectarBD();
        //Esta variable almacenara la linea de codigo sql que va a ser ejecutada para sacar el resulset y traerlo al programa
        String sql = "SELECT ID_PROVEEDOR, NOMBRE_PROVEEDOR, APELLIDO_PROVEEDOR, PROVINCIA_PROVEEDOR, CANTON_PROVEEDOR, CORREO_PROVEEDOR, TELEFONO_PROVEEDOR, EMPRESA_PROVEEDOR, PROD_REP_PROVEEDOR from proveedores";
        
        //Se crean las variables que combinen con los atributos de la bd
        Integer ID_PROVEEDOR;
        String NOMBRE_PROVEEDOR;
        String APELLIDO_PROVEEDOR;
        String PROVINCIA_PROVEEDOR;
        String CANTON_PROVEEDOR;
        String CORREO_PROVEEDOR;
        Integer TELEFONO_PROVEEDOR;
        String EMPRESA_PROVEEDOR;
        String PROD_REP_PROVEEDOR;
        
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
            String [] columnas = {"Cedula", "Nombre", "Apellido", "Provincia", "Canton", "Correo", "Telefono", "Empresa", "Producto/Repuesto"};
            //Se crea el modelo de la tabla
            DefaultTableModel modelo = new DefaultTableModel();
            //Se le asignan los headers a la tabla
            modelo.setColumnIdentifiers(columnas);
            
            //Mientras exista un siguiente en el resultset
            while(resultset.next()){
                //Se le asigna los valores de los registros de la base de datos al modelo
                ID_PROVEEDOR = resultset.getInt("ID_PROVEEDOR");
                NOMBRE_PROVEEDOR = resultset.getString("NOMBRE_PROVEEDOR");
                APELLIDO_PROVEEDOR = resultset.getString("APELLIDO_PROVEEDOR");
                PROVINCIA_PROVEEDOR = resultset.getString("PROVINCIA_PROVEEDOR");
                CANTON_PROVEEDOR = resultset.getString("CANTON_PROVEEDOR");
                CORREO_PROVEEDOR = resultset.getString("CORREO_PROVEEDOR");
                TELEFONO_PROVEEDOR = resultset.getInt("TELEFONO_PROVEEDOR");
                EMPRESA_PROVEEDOR = resultset.getString("EMPRESA_PROVEEDOR");
                PROD_REP_PROVEEDOR = resultset.getString("PROD_REP_PROVEEDOR");
                
                //Se agrega al modelo
                modelo.addRow(new Object[]{ID_PROVEEDOR, NOMBRE_PROVEEDOR, APELLIDO_PROVEEDOR, PROVINCIA_PROVEEDOR, CANTON_PROVEEDOR, CORREO_PROVEEDOR, TELEFONO_PROVEEDOR, EMPRESA_PROVEEDOR, PROD_REP_PROVEEDOR});
            }
            //Se cierra todo
            resultset.close();
            statement.close();
            conexion.close();
            
            //Se settea el modelo que se acaba de crear
            tblProveedores.setModel(modelo);
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
            for (int i = 0; i < tblProveedores.getRowCount();i++){
                int row = (int) tblProveedores.getValueAt(i, 0);
                
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
        if("".equals(txtEmpresa.getText()) || "".equals(txtProdReg.getText()) || "".equals(txtCedula.getText()) || "".equals(txtNombre.getText()) || "".equals(txtApellido.getText()) ||
                "".equals(txtProvincia.getText()) || "".equals(txtCanton.getText()) || "".equals(txtCorreo.getText()) || "".equals(txtTelefono.getText())){
            JOptionPane.showMessageDialog(null, "Debe de llenar todas las casillas!");
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
        tblProveedores = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtProvincia = new javax.swing.JTextField();
        txtCanton = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtEmpresa = new javax.swing.JTextField();
        txtProdReg = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnInsertar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administración de Proveedores");
        setBackground(new java.awt.Color(153, 204, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        tblProveedores.setModel(new javax.swing.table.DefaultTableModel(
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
        tblProveedores.setEnabled(false);
        jScrollPane1.setViewportView(tblProveedores);

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Datos");

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Apellido:");

        jLabel5.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Correo:");

        jLabel6.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Cantón:");

        jLabel7.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Provincia:");

        jLabel8.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Producto/Repuesto:");

        jLabel9.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Empresa:");

        jLabel10.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Teléfono:");

        jLabel11.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Cédula:");

        btnInsertar.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        btnInsertar.setText("Insertar Proveedor");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        btnEditar.setText("Editar Proveedor");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        btnEliminar.setText("Eliminar Proveedor");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCanton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProdReg, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnInsertar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(75, 75, 75))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCanton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtProdReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnInsertar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminar)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 1, 36)); // NOI18N
        jLabel2.setText("Administración de Proveedores");

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
                        .addComponent(btnMenu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(300, 300, 300))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 765, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(15, Short.MAX_VALUE))))
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
                    .addComponent(jScrollPane1))
                .addContainerGap(9, Short.MAX_VALUE))
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
                    //Se crean las variables que combinen con los atributos de la bd
                    Proveedor proveedor = new Proveedor(txtEmpresa.getText().trim(), txtProdReg.getText().trim(), Integer.parseInt(txtCedula.getText().trim()), txtNombre.getText().trim(),
                                                        txtApellido.getText().trim(), txtProvincia.getText().trim(), txtCanton.getText().trim(), txtCorreo.getText().trim(), 
                                                        Integer.parseInt(txtTelefono.getText().trim()));
                    //Conexion a bd
                    Connection conexion = conn.conectarBD();
                    //Se crea el statement
                    Statement statement = conexion.createStatement();
                    //Codigo sql a ejecutar
                    String sql = "INSERT INTO proveedores(ID_PROVEEDOR, NOMBRE_PROVEEDOR, APELLIDO_PROVEEDOR, PROVINCIA_PROVEEDOR, CANTON_PROVEEDOR, CORREO_PROVEEDOR, TELEFONO_PROVEEDOR, EMPRESA_PROVEEDOR, PROD_REP_PROVEEDOR)"
                                +"VALUES(" +proveedor.getNumeroCedula()+",'"
                                           +proveedor.getNombre()+"','"
                                           +proveedor.getPrimerApellido()+"','"
                                           +proveedor.getProvincia()+"','"
                                           +proveedor.getCanton()+"','"
                                           +proveedor.getCorreo()+"',"
                                           +proveedor.getNumTelefono()+",'"
                                           +proveedor.getEmpresa()+"','"
                                           +proveedor.getProductoRepuestoQueProvee()+"')";
                    //Se ejecuta el update que es el comando escrito anteriormente
                    statement.executeUpdate(sql);
                    //Se informa si sale bien
                    JOptionPane.showMessageDialog(null, "Registro insertado con exito");
                    //Cargar tabla para que se muestren los reemplazos de la bd de inmediato
                    cargarTabla();

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
                //Se crean las variables que combinen con los atributos de la bd
                Proveedor proveedor = new Proveedor(txtEmpresa.getText().trim(), txtProdReg.getText().trim(), Integer.parseInt(txtCedula.getText().trim()), txtNombre.getText().trim(),
                                                    txtApellido.getText().trim(), txtProvincia.getText().trim(), txtCanton.getText().trim(), txtCorreo.getText().trim(), 
                                                    Integer.parseInt(txtTelefono.getText().trim()));

                //Variable para usar en el script sql al ejecutar
                int id = obtenerCedula();

                try{
                    //Conexion a bd
                    Connection conexion = conn.conectarBD();
                    //Se crea el statement
                    Statement statement = conexion.createStatement();
                    //Codigo sql a ejecutar
                    String sql = "UPDATE proveedores SET "
                               + "ID_PROVEEDOR = "+proveedor.getNumeroCedula()
                               + ",NOMBRE_PROVEEDOR = '"+proveedor.getNombre()
                               + "',APELLIDO_PROVEEDOR = '"+proveedor.getPrimerApellido()
                               + "',PROVINCIA_PROVEEDOR = '"+proveedor.getProvincia()
                               + "',CANTON_PROVEEDOR = '"+proveedor.getCanton()
                               + "',CORREO_PROVEEDOR = '"+proveedor.getCorreo()
                               + "',TELEFONO_PROVEEDOR = "+proveedor.getNumTelefono()
                               + ",EMPRESA_PROVEEDOR = '"+proveedor.getEmpresa()
                               + "',PROD_REP_PROVEEDOR = '"+proveedor.getProductoRepuestoQueProvee()+"' "
                               + "WHERE ID_PROVEEDOR = " + id + "";
                    //Se ejecuta el update que es el comando escrito anteriormente
                    statement.executeUpdate(sql);
                    //Se informa si sale bien
                    if (id == 0){
                    }else{
                        JOptionPane.showMessageDialog(null, "Registro editado con exito");
                    }
                    //Cargar tabla para que se muestren los reemplazos de la bd de inmediato
                    cargarTabla();

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
            String sql = "DELETE FROM proveedores WHERE ID_PROVEEDOR = " + id + "";
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
            java.util.logging.Logger.getLogger(AdministracionProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministracionProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministracionProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministracionProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministracionProveedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProveedores;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCanton;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtEmpresa;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtProdReg;
    private javax.swing.JTextField txtProvincia;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
