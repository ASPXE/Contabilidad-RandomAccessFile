package com.mycompany.ActualizarLibroDiario;

import com.mycompany.Archivo.Archivo;
import com.mycompany.LibroDiario.LibroDiario;
import javax.swing.JOptionPane;

/**
 *
 * @author aspxe
 */
public class ActualizarLibroDiario extends javax.swing.JFrame {

    /**
     * Creates new form ActtualizarLibroDiario
     */
    public int seleccion = 0;
    public String year = "";

    public ActualizarLibroDiario() {
        initComponents();
        lblDia.setVisible(false);
        lblMes.setVisible(false);
        lblTipoMovimiento.setVisible(false);
        cbDia.setVisible(false);
        cbDia.setEnabled(false);
        cbMes.setVisible(false);
        cbMes.setEnabled(false);
        cbTipoMovimiento.setVisible(false);
        cbTipoMovimiento.setEnabled(false);
        lblNumeroDeCuenta.setVisible(false);
        lblNumeroDeCheque.setVisible(false);
        lblDescripcion.setVisible(false);
        lblCargoOAbono.setVisible(false);
        txtCargoOAbono.setVisible(false);
        txtCargoOAbono.setEnabled(false);
        txtNumeroCuenta.setVisible(false);
        txtNumeroCuenta.setEnabled(false);
        txtNumeroCheque.setVisible(false);
        txtNumeroCheque.setEnabled(false);
        txtDescripcion.setVisible(false);
        txtDescripcion.setEnabled(false);
        btnActualizarInformacion.setVisible(false);
        btnActualizarInformacion.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblYear = new javax.swing.JLabel();
        cbYear = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        lblDia = new javax.swing.JLabel();
        lblMes = new javax.swing.JLabel();
        cbDia = new javax.swing.JComboBox<>();
        cbMes = new javax.swing.JComboBox<>();
        lblNumeroDeCuenta = new javax.swing.JLabel();
        lblNumeroDeCheque = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        txtNumeroCuenta = new javax.swing.JTextField();
        txtNumeroCheque = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        lblTipoMovimiento = new javax.swing.JLabel();
        cbTipoMovimiento = new javax.swing.JComboBox<>();
        btnActualizarInformacion = new javax.swing.JButton();
        lblCargoOAbono = new javax.swing.JLabel();
        txtCargoOAbono = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 600));
        setMinimumSize(new java.awt.Dimension(10, 10));
        setPreferredSize(new java.awt.Dimension(600, 600));
        getContentPane().setLayout(null);

        lblYear.setText("Seleccione el a??o del libro diario");
        getContentPane().add(lblYear);
        lblYear.setBounds(180, 10, 220, 18);

        cbYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2021", "2022", "2023" }));
        getContentPane().add(cbYear);
        cbYear.setBounds(250, 40, 72, 24);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar);
        btnBuscar.setBounds(250, 80, 77, 24);

        lblDia.setText("Dia del movimiento");
        getContentPane().add(lblDia);
        lblDia.setBounds(20, 140, 124, 18);

        lblMes.setText("Mes del movimiento");
        getContentPane().add(lblMes);
        lblMes.setBounds(210, 140, 160, 18);

        cbDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        getContentPane().add(cbDia);
        cbDia.setBounds(50, 170, 72, 24);

        cbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        getContentPane().add(cbMes);
        cbMes.setBounds(220, 170, 111, 24);

        lblNumeroDeCuenta.setText("Numero de cuenta");
        getContentPane().add(lblNumeroDeCuenta);
        lblNumeroDeCuenta.setBounds(20, 240, 160, 18);

        lblNumeroDeCheque.setText("Numero de cheque");
        getContentPane().add(lblNumeroDeCheque);
        lblNumeroDeCheque.setBounds(20, 320, 150, 18);

        lblDescripcion.setText("Descripcion del movimiento");
        getContentPane().add(lblDescripcion);
        lblDescripcion.setBounds(20, 410, 190, 18);
        getContentPane().add(txtNumeroCuenta);
        txtNumeroCuenta.setBounds(20, 270, 180, 24);
        getContentPane().add(txtNumeroCheque);
        txtNumeroCheque.setBounds(20, 360, 180, 24);
        getContentPane().add(txtDescripcion);
        txtDescripcion.setBounds(20, 440, 180, 24);

        lblTipoMovimiento.setText("Tipo de movimiento");
        getContentPane().add(lblTipoMovimiento);
        lblTipoMovimiento.setBounds(410, 140, 140, 18);

        cbTipoMovimiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cargo", "Abono" }));
        getContentPane().add(cbTipoMovimiento);
        cbTipoMovimiento.setBounds(410, 170, 77, 24);

        btnActualizarInformacion.setText("Agregar informacion");
        btnActualizarInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarInformacionActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizarInformacion);
        btnActualizarInformacion.setBounds(310, 340, 190, 30);

        lblCargoOAbono.setText("Monto del movimiento");
        getContentPane().add(lblCargoOAbono);
        lblCargoOAbono.setBounds(310, 240, 150, 18);
        getContentPane().add(txtCargoOAbono);
        txtCargoOAbono.setBounds(310, 270, 180, 24);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        int seleccion = cbYear.getSelectedIndex();
        String year = cbYear.getItemAt(seleccion);

        this.seleccion = seleccion;

        String nombreArchivo = "LibroDiario-" + this.year + ".dat";
        ActualizarLibroDiario ald = new ActualizarLibroDiario();
        ald.setYear(year);
        LibroDiario ld = new LibroDiario();
        boolean libroDiarioExiste = ld.libroDiarioExiste(nombreArchivo, ald);
        if (libroDiarioExiste) {
            JOptionPane.showMessageDialog(rootPane, "Existe uno o varios libros diarios del a??o " + this.year, "Libro diario existe", JOptionPane.INFORMATION_MESSAGE);
            lblDia.setVisible(true);
            lblMes.setVisible(true);
            lblTipoMovimiento.setVisible(true);
            cbDia.setVisible(true);
            cbDia.setEnabled(true);
            cbMes.setVisible(true);
            cbMes.setEnabled(true);
            cbTipoMovimiento.setVisible(true);
            cbTipoMovimiento.setEnabled(true);
            lblNumeroDeCuenta.setVisible(true);
            lblNumeroDeCheque.setVisible(true);
            lblDescripcion.setVisible(true);
            txtNumeroCuenta.setVisible(true);
            txtNumeroCuenta.setEnabled(true);
            txtNumeroCheque.setVisible(true);
            txtNumeroCheque.setEnabled(true);
            txtDescripcion.setVisible(true);
            txtDescripcion.setEnabled(true);
            btnActualizarInformacion.setVisible(true);
            btnActualizarInformacion.setEnabled(true);
            lblCargoOAbono.setVisible(true);
            txtCargoOAbono.setVisible(true);
            txtCargoOAbono.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(rootPane, "No se ha encontrado ninguna concidencia", "Sin coicidencias en los registros", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnActualizarInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarInformacionActionPerformed
        LibroDiario ld = new LibroDiario();
        Archivo arch = new Archivo();

        int seleccionDia = 0, seleccionMes = 0, seleccionYear = 0;
        seleccionDia = cbDia.getSelectedIndex();
        seleccionMes = cbMes.getSelectedIndex();
        seleccionYear = cbYear.getSelectedIndex();

        String dia = "", mes = "", year = "", fecha = "", descripcion = "";
        int numeroCuenta = 0, numeroCheque = 0;
        double cargoOAbono = 0;

        dia = cbDia.getItemAt(seleccionDia);
        mes = cbMes.getItemAt(seleccionMes);
        year = cbYear.getItemAt(seleccionYear);
        
        fecha = dia+"-"+mes+"-"+year;

        if (txtNumeroCuenta.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "No ingreso el numero de cuenta", "Numero de cuenta faltante", JOptionPane.ERROR_MESSAGE);
        } else {
            numeroCuenta = Integer.parseInt(txtNumeroCuenta.getText());
        }

        if (txtNumeroCheque.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "No ingreso el numero de cheque", "Numero de cheque faltante", JOptionPane.ERROR_MESSAGE);
        } else {
            numeroCheque = Integer.parseInt(txtNumeroCheque.getText());
        }

        if (txtDescripcion.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "No ingreso la descripcion", "Descripcion faltante", JOptionPane.ERROR_MESSAGE);
        } else {
            descripcion = txtDescripcion.getText();
        }
        
        if(txtCargoOAbono.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "No ingreso el monto del movimiento", "Monto del movimiento faltante", JOptionPane.ERROR_MESSAGE);
        }else{
            cargoOAbono = Double.parseDouble(txtCargoOAbono.getText());
        }
        
        ld.setCuentaNum(numeroCuenta);
        ld.setChequeNum(numeroCheque);
        ld.setDescripcion(descripcion);
        ld.setFecha(fecha);
        
        

    }//GEN-LAST:event_btnActualizarInformacionActionPerformed

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
            java.util.logging.Logger.getLogger(ActualizarLibroDiario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ActualizarLibroDiario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ActualizarLibroDiario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ActualizarLibroDiario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ActualizarLibroDiario().setVisible(true);
            }
        });
    }

    public int getSeleccion() {
        return this.seleccion;
    }

    public void setSeleccion(int seleccion) {
        this.seleccion = seleccion;
    }

    public String getYear() {
        return this.year;
    }

    public void setYear(String year) {
        this.year = year;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarInformacion;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JComboBox<String> cbDia;
    private javax.swing.JComboBox<String> cbMes;
    private javax.swing.JComboBox<String> cbTipoMovimiento;
    private javax.swing.JComboBox<String> cbYear;
    private javax.swing.JLabel lblCargoOAbono;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblDia;
    private javax.swing.JLabel lblMes;
    private javax.swing.JLabel lblNumeroDeCheque;
    private javax.swing.JLabel lblNumeroDeCuenta;
    private javax.swing.JLabel lblTipoMovimiento;
    private javax.swing.JLabel lblYear;
    private javax.swing.JTextField txtCargoOAbono;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtNumeroCheque;
    private javax.swing.JTextField txtNumeroCuenta;
    // End of variables declaration//GEN-END:variables
}
