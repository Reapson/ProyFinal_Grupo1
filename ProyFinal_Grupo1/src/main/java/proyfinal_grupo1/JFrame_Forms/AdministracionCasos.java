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
public class AdministracionCasos extends javax.swing.JFrame {

    //Variable para conexion con BD
    private final Conexion conn = new Conexion();
    
    public AdministracionCasos() {
        initComponents();
        //Se actualiza la tabla por primera vez, trayendose los datos de la bd
        cargarTabla();
    }
    
    //Metodo que creara una conexion a la bd y consultara la misma
    private void cargarTabla(){
        //Se crea el atributo conexion, se le asigna el metodo de conexion a bd ya hecho anteriormente
        Connection conexion = conn.conectarBD();
        //Esta variable almacenara la linea de codigo sql que va a ser ejecutada para sacar el resulset y traerlo al programa
        String sql = "SELECT NUMERO_CASO, CEDULA_TECNICO, CEDULA_CLIENTE, ID_PRODUCTO_REEMPLAZAR, DESCRIPCION_PROBLEMA, DESCRIPCION_SOLUCION, ESTADO_CASO from casos";
        
        //Se crean las variables que combinen con los atributos de la bd
        Integer NUMERO_CASO;
        Integer CEDULA_TECNICO;
        Integer CEDULA_CLIENTE;
        Integer ID_PRODUCTO_REEMPLAZAR;
        String DESCRIPCION_PROBLEMA;
        String DESCRIPCION_SOLUCION;
        String ESTADO_CASO;
        
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
            String [] columnas = {"Número de caso", "Cédula del técnico", "Cédula del cliente", "ID del producto a reemplazar", "Descripción del problema", "Descripción de la solución", "Estado del caso"};
            //Se crea el modelo de la tabla
            DefaultTableModel modelo = new DefaultTableModel();
            //Se le asignan los headers a la tabla
            modelo.setColumnIdentifiers(columnas);
            
            //Mientras exista un siguiente en el resultset
            while(resultset.next()){
                //Se le asigna los valores de los registros de la base de datos al modelo
                NUMERO_CASO = resultset.getInt("NUMERO_CASO");
                CEDULA_TECNICO = resultset.getInt("CEDULA_TECNICO");
                CEDULA_CLIENTE = resultset.getInt("CEDULA_CLIENTE");
                ID_PRODUCTO_REEMPLAZAR = resultset.getInt("ID_PRODUCTO_REEMPLAZAR");
                DESCRIPCION_PROBLEMA = resultset.getString("DESCRIPCION_PROBLEMA");
                DESCRIPCION_SOLUCION = resultset.getString("DESCRIPCION_SOLUCION");
                ESTADO_CASO = resultset.getString("ESTADO_CASO");
                
                
                //Se agrega al modelo
                modelo.addRow(new Object[]{NUMERO_CASO, CEDULA_TECNICO, CEDULA_CLIENTE, ID_PRODUCTO_REEMPLAZAR, DESCRIPCION_PROBLEMA, DESCRIPCION_SOLUCION, ESTADO_CASO});
            }
            //Se cierra todo
            resultset.close();
            statement.close();
            conexion.close();
            
            //Se settea el modelo que se acaba de crear
            tblCasos.setModel(modelo);
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
            cedula = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de caso del registro que desea afectar"));
            
            //Ciclo que recorre la tabla buscando si el valor ingresado existe en la misma
            for (int i = 0; i < tblCasos.getRowCount();i++){
                int row = (int) tblCasos.getValueAt(i, 0);
                
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
                JOptionPane.showMessageDialog(null, "El número de caso ingresado no existe en la tabla!");
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
        if("".equals(txtnumCaso.getText()) || "".equals(txtcedulaTecnico.getText()) || "".equals(txtcedulaCliente.getText()) ||
                "".equals(txtidProductoReemplazar.getText()) || "".equals(txtdescripcionProblema.getText()) || "".equals(txtdescripcionSolucion.getText()) || "".equals(txtestadoCaso.getText())){
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
        tblCasos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtcedulaTecnico = new javax.swing.JTextField();
        txtcedulaCliente = new javax.swing.JTextField();
        txtidProductoReemplazar = new javax.swing.JTextField();
        txtdescripcionProblema = new javax.swing.JTextField();
        txtdescripcionSolucion = new javax.swing.JTextField();
        txtestadoCaso = new javax.swing.JTextField();
        txtnumCaso = new javax.swing.JTextField();
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

        tblCasos.setModel(new javax.swing.table.DefaultTableModel(
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
        tblCasos.setEnabled(false);
        jScrollPane1.setViewportView(tblCasos);

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Datos");

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Cédula del técnico:");

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Cédula del cliente");

        jLabel5.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Descripción de la solución:");

        jLabel6.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Descripción del problema:");

        jLabel7.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("ID de producto a reemplazar:");

        jLabel10.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Estado del caso:");

        txtnumCaso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumCasoActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Número de caso:");

        btnInsertar.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        btnInsertar.setText("Insertar Caso");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        btnEditar.setText("Editar Caso");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        btnEliminar.setText("Eliminar Caso");
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
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcedulaTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtidProductoReemplazar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdescripcionProblema, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdescripcionSolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtestadoCaso, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnumCaso, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(txtnumCaso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtcedulaTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtcedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtidProductoReemplazar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtdescripcionProblema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtdescripcionSolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtestadoCaso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84)
                .addComponent(btnInsertar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminar)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 1, 36)); // NOI18N
        jLabel2.setText("Administración de Casos");

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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 765, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnMenu)
                        .addGap(300, 300, 300)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            if (Integer.parseInt(txtnumCaso.getText()) <= 0){
                JOptionPane.showMessageDialog(null, "El número de caso no puede ser un valor menor a 1...");
            }else{
                try{
                    //Se crean las variables que combinen con los atributos de la bd
                    Caso caso = new Caso(Integer.parseInt(txtnumCaso.getText().trim()),
                     txtcedulaTecnico.getText().trim(),
                     txtcedulaCliente.getText().trim(),
                     txtidProductoReemplazar.getText().trim(),
                     txtdescripcionProblema.getText().trim(),
                     txtdescripcionSolucion.getText().trim(),
                     txtestadoCaso.getText().trim());

                    //Conexion a bd
                    Connection conexion = conn.conectarBD();
                    //Se crea el statement
                    Statement statement = conexion.createStatement();
                    //Codigo sql a ejecutar
                    String sql = "INSERT INTO casos (NUMERO_CASO, CEDULA_TECNICO, CEDULA_CLIENTE, ID_PRODUCTO_REEMPLAZAR, DESCRIPCION_PROBLEMA, DESCRIPCION_SOLUCION, ESTADO_CASO)"
                                +"VALUES(" +caso.getNumCaso()+",'"
                                           +caso.getCedulaTecnico()+"','"
                                           +caso.getCedulaCliente()+"','"
                                           +caso.getIdProductoReemplazar()+"','"
                                           +caso.getDescripcionProblema()+"','"
                                           +caso.getDescripcionSolucion()+"',"
                                           +caso.getEstadoCaso()+",'";
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
            if (Integer.parseInt(txtnumCaso.getText()) <= 0){
                JOptionPane.showMessageDialog(null, "El número de caso no puede ser un valor menor a 1...");
            }else{
                //Se crean las variables que combinen con los atributos de la bd
                    Caso caso = new Caso(Integer.parseInt(txtnumCaso.getText().trim()),
                     txtcedulaTecnico.getText().trim(),
                     txtcedulaCliente.getText().trim(),
                     txtidProductoReemplazar.getText().trim(),
                     txtdescripcionProblema.getText().trim(),
                     txtdescripcionSolucion.getText().trim(),
                     txtestadoCaso.getText().trim());

                //Variable para usar en el script sql al ejecutar
                int id = obtenerCedula();

                try{
                    //Conexion a bd
                    Connection conexion = conn.conectarBD();
                    //Se crea el statement
                    Statement statement = conexion.createStatement();
                    //Codigo sql a ejecutar
                    String sql = "UPDATE casos SET "
                               + "NUMERO_CASO = "+caso.getNumCaso()
                               + ",CEDULA_TECNICO = '"+caso.getCedulaTecnico()
                               + "',CEDULA_CLIENTE = '"+caso.getCedulaCliente()
                               + "',ID_PRODUCTO_REEMPLAZAR = '"+caso.getIdProductoReemplazar()
                               + "',DESCRIPCION_PROBLEMA = '"+caso.getDescripcionProblema()
                               + "',DESCRIPCION_SOLUCION = '"+caso.getDescripcionSolucion()
                               + "',ESTADO_CASO = "+caso.getEstadoCaso()+"' "
                               + "WHERE NUMERO_CASO = " + id + "";
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
            String sql = "DELETE FROM casos WHERE NUMERO_CASO = " + id + "";
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

    private void txtnumCasoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumCasoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumCasoActionPerformed

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
            java.util.logging.Logger.getLogger(AdministracionCasos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministracionCasos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministracionCasos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministracionCasos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministracionCasos().setVisible(true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCasos;
    private javax.swing.JTextField txtcedulaCliente;
    private javax.swing.JTextField txtcedulaTecnico;
    private javax.swing.JTextField txtdescripcionProblema;
    private javax.swing.JTextField txtdescripcionSolucion;
    private javax.swing.JTextField txtestadoCaso;
    private javax.swing.JTextField txtidProductoReemplazar;
    private javax.swing.JTextField txtnumCaso;
    // End of variables declaration//GEN-END:variables
}
