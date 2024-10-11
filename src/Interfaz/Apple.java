/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interfaz;

import Classes.Company;
import javax.swing.JOptionPane;

/**
 *
 * @author Maria Daniela
 */
public class Apple extends javax.swing.JPanel {

    /**
     * Creates new form Apple
     */
    
    public Apple() {
        initComponents();
        this.CantMemoriaRam.setValue(1); // Establece el valor inicial en 1
        this.CantFuenteA.setValue(1); // Establece el valor inicial en 1
        this.CantPlacasBases.setValue(1); // Establece el valor inicial en 1
        this.CantTarjetaGrafica.setValue(1); // Establece el valor inicial en 1
        this.CantCPUS.setValue(1); //Establece el valor inicial en 1
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

        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        CantMemoriaRam = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        CantPlacasBases = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        CantCPUS = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        CantFuenteA = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        CantTarjetaGrafica = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jPanel1.setMinimumSize(new java.awt.Dimension(660, 550));
        jPanel1.setPreferredSize(new java.awt.Dimension(660, 550));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel14.setText("APPLE");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 190, 70));

        CantMemoriaRam.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                CantMemoriaRamStateChanged(evt);
            }
        });
        jPanel1.add(CantMemoriaRam, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 40, 20));

        jLabel9.setText("CPUS");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 60, 40));

        CantPlacasBases.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                CantPlacasBasesStateChanged(evt);
            }
        });
        jPanel1.add(CantPlacasBases, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 40, 20));

        jLabel11.setText("Productores Placas Bases");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 140, 20));

        CantCPUS.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                CantCPUSStateChanged(evt);
            }
        });
        jPanel1.add(CantCPUS, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 40, 20));

        jLabel12.setText("Memoria RAM");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 140, 20));

        CantFuenteA.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                CantFuenteAStateChanged(evt);
            }
        });
        jPanel1.add(CantFuenteA, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 40, 20));

        jLabel13.setText("Fuente de Alimentación");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 140, 20));

        jLabel10.setText("Tarjetas Graficas");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 140, 20));

        CantTarjetaGrafica.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                CantTarjetaGraficaStateChanged(evt);
            }
        });
        jPanel1.add(CantTarjetaGrafica, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 40, 20));

        jLabel1.setText("Drive:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, -1, -1));

        jLabel2.setText("Drive:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, -1, -1));

        jLabel3.setText("0");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 30, -1));

        jLabel4.setText("Drive:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, -1, -1));

        jLabel5.setText("Drive:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, -1, -1));

        jLabel6.setText("Drive:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, -1, -1));

        jLabel7.setText("Gastos: ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner CantCPUS;
    private javax.swing.JSpinner CantFuenteA;
    private javax.swing.JSpinner CantMemoriaRam;
    private javax.swing.JSpinner CantPlacasBases;
    private javax.swing.JSpinner CantTarjetaGrafica;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
