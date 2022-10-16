
package conversordinero;

import javax.swing.JOptionPane;

public class Conversor extends javax.swing.JFrame {

    public Conversor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnStart = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Conversor de pesos colombianos a distintas monedas");

        btnStart.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btnStart.setText("INICIAR CONVERSIÓN");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(btnStart)))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addComponent(btnStart)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        
        try{
            String cantidad_string = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir");
            
            double cantidad_inicial = Double.parseDouble(cantidad_string);
            JOptionPane.showMessageDialog(null, cantidad_inicial);

            String[] choices = { "De Soles a Dolares", "De Soles a Euros", "De Soles a Libras", 
                "De Soles a Yenes", "De Soles a Wones Coreanos", "De Dolares a Soles", "De Euros a Soles",
                "De Libras a Soles", "De Yenes a Soles", "De Wones Coreanos a Soles" };

            String divisas = (String) JOptionPane.showInputDialog(null, "¿De que manera deseas convertirlo?",
                "Escoger divisa", JOptionPane.QUESTION_MESSAGE, null, choices, choices[0]);
            
            //Cálculo de la conversión de la divisa
            double cantidad_final = 0;

            switch (divisas) {
                case "De Soles a Dolares" -> cantidad_final = cantidad_inicial / 3.96;
                case "De Soles a Euros" -> cantidad_final = cantidad_inicial / 3.85;
                case "De Soles a Libras" -> cantidad_final = cantidad_inicial / 4.42;
                case "De Soles a Yenes" -> cantidad_final = cantidad_inicial / 0.027;
                case "De Soles a Wones Coreanos" -> cantidad_final = cantidad_inicial / 0.0027;
                case "De Dolares a Soles" -> cantidad_final = cantidad_inicial * 3.96;
                case "De Euros a Soles" -> cantidad_final = cantidad_inicial * 3.85;
                case "De Libras a Soles" -> cantidad_final = cantidad_inicial * 4.42;
                case "De Yenes a Soles" -> cantidad_final = cantidad_inicial * 0.027;
                case "De Wones Coreanos a Soles" -> cantidad_final = cantidad_inicial * 0.0027;
            }

            JOptionPane.showMessageDialog(null, "La conversión de " + cantidad_inicial + " " + divisas + " es de " + cantidad_final);
            
            //Seguir utilizando el programa
            int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar utilizando el programa?",
                "YES_NO_OPTION", JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE);
            
            if(respuesta == 1){
               JOptionPane.showMessageDialog(null, "El programa ha finalizado");
               System.exit(0);
            } 
            
        }catch(NumberFormatException e){
            e.printStackTrace();
            
            JOptionPane.showMessageDialog(null, "Hubo un error! Inténtelo nuevamente");
        }
    }//GEN-LAST:event_btnStartActionPerformed

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
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Conversor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStart;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
