/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Maria Daniela
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
    }
    
    boolean iniciado=true; // (cambiar a verdadero para visualizar) Aqui tengo que poner verdadero para que se elija la cantidad de trabajadores por tipo y si se excede muestre el mensaje 
    int max_apple= 14;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        sidepane = new javax.swing.JPanel();
        btn_apple = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_hp = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_ambos = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        int_apple = new javax.swing.JInternalFrame();
        jLabel8 = new javax.swing.JLabel();
        int_hp = new javax.swing.JInternalFrame();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        CantTarjetaGrafica = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        CantPlacasBases = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        CantCPUS = new javax.swing.JSpinner();
        CantMemoriaRam = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        CantFuenteA = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidepane.setBackground(new java.awt.Color(54, 33, 89));
        sidepane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_apple.setBackground(new java.awt.Color(85, 65, 118));
        btn_apple.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_appleMouseClicked(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/image/Apple Logo_4.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Apple");

        javax.swing.GroupLayout btn_appleLayout = new javax.swing.GroupLayout(btn_apple);
        btn_apple.setLayout(btn_appleLayout);
        btn_appleLayout.setHorizontalGroup(
            btn_appleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_appleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        btn_appleLayout.setVerticalGroup(
            btn_appleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(btn_appleLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        sidepane.add(btn_apple, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 170, 50));

        btn_hp.setBackground(new java.awt.Color(64, 43, 100));
        btn_hp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_hpMouseClicked(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/image/HP.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Hp");

        javax.swing.GroupLayout btn_hpLayout = new javax.swing.GroupLayout(btn_hp);
        btn_hp.setLayout(btn_hpLayout);
        btn_hpLayout.setHorizontalGroup(
            btn_hpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_hpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        btn_hpLayout.setVerticalGroup(
            btn_hpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(btn_hpLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel4)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        sidepane.add(btn_hp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 170, -1));

        btn_ambos.setBackground(new java.awt.Color(64, 43, 100));
        btn_ambos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ambosMouseClicked(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/image/Positive Dynamic.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Apple vs Hp");

        javax.swing.GroupLayout btn_ambosLayout = new javax.swing.GroupLayout(btn_ambos);
        btn_ambos.setLayout(btn_ambosLayout);
        btn_ambosLayout.setHorizontalGroup(
            btn_ambosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_ambosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        btn_ambosLayout.setVerticalGroup(
            btn_ambosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(btn_ambosLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel6)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        sidepane.add(btn_ambos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, -1, -1));

        bg.add(sidepane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 550));

        int_apple.setVisible(true);
        int_apple.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setText("APPLE");
        int_apple.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 37, -1));

        int_hp.setVisible(true);
        int_hp.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setText("hola");
        int_hp.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 37, -1));

        int_apple.getContentPane().add(int_hp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 660, 540));

        jLabel9.setText("CPUS");
        int_apple.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 60, 40));

        CantTarjetaGrafica.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                CantTarjetaGraficaStateChanged(evt);
            }
        });
        int_apple.getContentPane().add(CantTarjetaGrafica, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 40, 20));

        jLabel10.setText("Tarjetas Graficas");
        int_apple.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 140, 20));

        CantPlacasBases.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                CantPlacasBasesStateChanged(evt);
            }
        });
        int_apple.getContentPane().add(CantPlacasBases, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 40, 20));

        jLabel11.setText("Productores Placas Bases");
        int_apple.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 140, 20));

        CantCPUS.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                CantCPUSStateChanged(evt);
            }
        });
        int_apple.getContentPane().add(CantCPUS, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 40, 20));

        CantMemoriaRam.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                CantMemoriaRamStateChanged(evt);
            }
        });
        int_apple.getContentPane().add(CantMemoriaRam, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 40, 20));

        jLabel12.setText("Memoria RAM");
        int_apple.getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 140, 20));

        CantFuenteA.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                CantFuenteAStateChanged(evt);
            }
        });
        int_apple.getContentPane().add(CantFuenteA, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 40, 20));

        jLabel13.setText("Fuente de Alimentación");
        int_apple.getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 140, 20));

        bg.add(int_apple, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 660, 550));

        jPanel1.setBackground(new java.awt.Color(122, 72, 222));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 670, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 832, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void setColor(JPanel panel ){
        panel.setBackground(new Color(85,65,118));
    }
    
    void resetColor(JPanel panel){
        panel.setBackground(new Color(64,43,100));
    }
    
    private void btn_appleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_appleMouseClicked
        // TODO add your handling code here:
        setColor(btn_apple);
        resetColor(btn_hp);
        resetColor(btn_ambos);
        int_apple.setVisible(true); // Asegúrate de que sea visible
        int_hp.setVisible(false);
        try {
            int_apple.setSelected(true); // Seleccionarlo si es necesario
        } catch (java.beans.PropertyVetoException e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_btn_appleMouseClicked

    private void btn_hpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_hpMouseClicked
        // TODO add your handling code here:
        setColor(btn_hp);
        resetColor(btn_apple);
        resetColor(btn_ambos);
        int_apple.setVisible(false);
        int_hp.setVisible(true);
        try {
            int_hp.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_hpMouseClicked

    private void btn_ambosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ambosMouseClicked
        // TODO add your handling code here:
        setColor(btn_ambos);
        resetColor(btn_apple);
        resetColor(btn_hp);
    }//GEN-LAST:event_btn_ambosMouseClicked

    private void CantPlacasBasesStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_CantPlacasBasesStateChanged
        // TODO add your handling code here:
        if (iniciado == true){
            if ((int)this.CantPlacasBases.getValue() <= 0){
                this.CantPlacasBases.setValue(1);
                this.repaint();
            }
            else if((int)this.CantPlacasBases.getValue()+ (int)this.CantCPUS.getValue()+ (int)this.CantMemoriaRam.getValue()+ (int)this.CantFuenteA.getValue()+(int)this.CantTarjetaGrafica.getValue() > max_apple ){
                JOptionPane.showMessageDialog(null, "Numero Maximo de Trabajadores Alcanzado");
                this.CantPlacasBases.setValue((int)this.CantPlacasBases.getValue() -1);
                this.repaint();
            }
            
        }else {
            this.CantPlacasBases.setValue(1);
            this.repaint();
        }
    }//GEN-LAST:event_CantPlacasBasesStateChanged

    private void CantCPUSStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_CantCPUSStateChanged
        // TODO add your handling code here:
        if (iniciado == true){
            if ((int)this.CantCPUS.getValue() <= 0){
                this.CantCPUS.setValue(1);
                this.repaint();
            }
            else if((int)this.CantPlacasBases.getValue()+ (int)this.CantCPUS.getValue()+ (int)this.CantMemoriaRam.getValue()+ (int)this.CantFuenteA.getValue()+(int)this.CantTarjetaGrafica.getValue() > max_apple ){
                JOptionPane.showMessageDialog(null, "Numero Maximo de Trabajadores Alcanzado");
                this.CantCPUS.setValue((int)this.CantCPUS.getValue() -1);
                this.repaint();
            }
            
        }else {
            this.CantCPUS.setValue(1);
            this.repaint();
        }
    }//GEN-LAST:event_CantCPUSStateChanged

    private void CantMemoriaRamStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_CantMemoriaRamStateChanged
        // TODO add your handling code here:
        
        if (iniciado == true){
            if ((int)this.CantMemoriaRam.getValue() <= 0){
                this.CantMemoriaRam.setValue(1);
                this.repaint();
            }
            else if((int)this.CantPlacasBases.getValue()+ (int)this.CantCPUS.getValue()+ (int)this.CantMemoriaRam.getValue()+ (int)this.CantFuenteA.getValue()+(int)this.CantTarjetaGrafica.getValue() > max_apple ){
                JOptionPane.showMessageDialog(null, "Numero Maximo de Trabajadores Alcanzado");
                this.CantMemoriaRam.setValue((int)this.CantMemoriaRam.getValue() -1);
                this.repaint();
            }
            
        }else {
            this.CantMemoriaRam.setValue(1);
            this.repaint();
        }
    }//GEN-LAST:event_CantMemoriaRamStateChanged

    private void CantFuenteAStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_CantFuenteAStateChanged
        // TODO add your handling code here:
        
        if (iniciado == true){
            if ((int)this.CantFuenteA.getValue() <= 0){
                this.CantFuenteA.setValue(1);
                this.repaint();
            }
            else if((int)this.CantPlacasBases.getValue()+ (int)this.CantCPUS.getValue()+ (int)this.CantMemoriaRam.getValue()+ (int)this.CantFuenteA.getValue()+(int)this.CantTarjetaGrafica.getValue() > max_apple ){
                JOptionPane.showMessageDialog(null, "Numero Maximo de Trabajadores Alcanzado");
                this.CantFuenteA.setValue((int)this.CantFuenteA.getValue() -1);
                this.repaint();
            }
            
        }else {
            this.CantFuenteA.setValue(1);
            this.repaint();
        }
        
    }//GEN-LAST:event_CantFuenteAStateChanged

    private void CantTarjetaGraficaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_CantTarjetaGraficaStateChanged
        // TODO add your handling code here:
        if (iniciado == true){
            if ((int)this.CantTarjetaGrafica.getValue() <= 0){
                this.CantTarjetaGrafica.setValue(1);
                this.repaint();
            }
            else if((int)this.CantPlacasBases.getValue()+ (int)this.CantCPUS.getValue()+ (int)this.CantMemoriaRam.getValue()+ (int)this.CantFuenteA.getValue()+(int)this.CantTarjetaGrafica.getValue() > max_apple ){
                JOptionPane.showMessageDialog(null, "Numero Maximo de Trabajadores Alcanzado");
                this.CantTarjetaGrafica.setValue((int)this.CantTarjetaGrafica.getValue() -1);
                this.repaint();
            }
            
        }else {
            this.CantTarjetaGrafica.setValue(1);
            this.repaint();
        }
    }//GEN-LAST:event_CantTarjetaGraficaStateChanged

    
    
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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner CantCPUS;
    private javax.swing.JSpinner CantFuenteA;
    private javax.swing.JSpinner CantMemoriaRam;
    private javax.swing.JSpinner CantPlacasBases;
    private javax.swing.JSpinner CantTarjetaGrafica;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel btn_ambos;
    private javax.swing.JPanel btn_apple;
    private javax.swing.JPanel btn_hp;
    private javax.swing.JInternalFrame int_apple;
    private javax.swing.JInternalFrame int_hp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel sidepane;
    // End of variables declaration//GEN-END:variables
}
