

package vista;

import javax.swing.*;
import javax.swing.Timer;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Baner extends javax.swing.JFrame {

    
    
    public Baner() {
        initComponents();
        this.setLocationRelativeTo(null);//centra ventana 
        ProgressBarIniciado();//llamada a cargar a barra de progreso 
    }

    private void ProgressBarIniciado(){//nicia
        
        Timer mTimer = new Timer(45, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            pbCarga.setValue(pbCarga.getValue() + 1);
            pbCarga.setStringPainted(true);
           
            pbCarga.setString("Loading..." + pbCarga.getValue() + "%");

            // Detiene el temporizador cuando se llega al 100%
            if (pbCarga.getValue() >= 100) {
                pbCarga.setBackground(Color.RED);
                ((Timer)e.getSource()).stop();
               
                // Cierra la ventana de carga y abre la segunda ventana
                cerrarVentanaCarga();
                abrirNuevaVentana();
            }
        }
    });

    mTimer.start();
        
        
    }//termina
    
    // Método para cerrar la ventana de carga
private void cerrarVentanaCarga() {
    this.dispose(); // Cierra la ventana actual
}

// Método para abrir una nueva ventana
private void abrirNuevaVentana() {
    // Aquí debes colocar el código para abrir la nueva ventana
    // Por ejemplo:
    Login ventana = new Login();
    ventana.setVisible(true);
}

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panFondo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblmgLogo = new javax.swing.JLabel();
        pbCarga = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Interactivo ED Fragoso");

        panFondo.setBackground(new java.awt.Color(102, 102, 102));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitulo.setText("Bienvenido a sistemas ED Fragoso");

        lblmgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo.png"))); // NOI18N

        javax.swing.GroupLayout panFondoLayout = new javax.swing.GroupLayout(panFondo);
        panFondo.setLayout(panFondoLayout);
        panFondoLayout.setHorizontalGroup(
            panFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panFondoLayout.createSequentialGroup()
                .addGroup(panFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panFondoLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(lblTitulo))
                    .addGroup(panFondoLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(pbCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panFondoLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(lblmgLogo)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        panFondoLayout.setVerticalGroup(
            panFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panFondoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addComponent(lblmgLogo)
                .addGap(47, 47, 47)
                .addComponent(pbCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(panFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(panFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Baner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Baner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Baner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Baner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Baner().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblmgLogo;
    private javax.swing.JPanel panFondo;
    private javax.swing.JProgressBar pbCarga;
    // End of variables declaration//GEN-END:variables
}
