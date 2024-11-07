
package Sesion36FragosoED_cola1;

import javax.swing.JOptionPane;


public class TestOperacionesColas extends javax.swing.JFrame {
    OperacionesColas cola = new OperacionesColas(5);

    public TestOperacionesColas() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        btnElementosAgregarEDcola = new javax.swing.JButton();
        btnImpimirEDCola = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setText("Operaciones ED colas Fragoso");

        btnElementosAgregarEDcola.setText("Realizar cola elementos en ED");
        btnElementosAgregarEDcola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElementosAgregarEDcolaActionPerformed(evt);
            }
        });

        btnImpimirEDCola.setText("Imprimir elementos en ED Cola");
        btnImpimirEDCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImpimirEDColaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(lblTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnImpimirEDCola, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnElementosAgregarEDcola, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(lblTitulo)
                .addGap(28, 28, 28)
                .addComponent(btnElementosAgregarEDcola)
                .addGap(18, 18, 18)
                .addComponent(btnImpimirEDCola)
                .addContainerGap(146, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnElementosAgregarEDcolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElementosAgregarEDcolaActionPerformed
        for (int i = 0; i <= 5; i++) {
            try {
                cola.insertar(i);
                JOptionPane.showMessageDialog(null, "Llenando valores \n"+(i+1));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error Al insertar los datos verificados\n " +e);
            }
        }
    }//GEN-LAST:event_btnElementosAgregarEDcolaActionPerformed

    private void btnImpimirEDColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImpimirEDColaActionPerformed
          cola.imprimir();
      JOptionPane.showMessageDialog(null, "Cola llena de valores \n Espacio Maximo es: \n "+cola.tamMax());
    }//GEN-LAST:event_btnImpimirEDColaActionPerformed

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
            java.util.logging.Logger.getLogger(TestOperacionesColas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestOperacionesColas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestOperacionesColas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestOperacionesColas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestOperacionesColas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnElementosAgregarEDcola;
    private javax.swing.JButton btnImpimirEDCola;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
