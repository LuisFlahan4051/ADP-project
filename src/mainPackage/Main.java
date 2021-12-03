package mainPackage;

//import java.util.logging.Level;
//import java.util.logging.Logger;
import java.awt.Color;
import javax.swing.JFrame;
import panamahitek.Arduino.PanamaHitek_Arduino;

public class Main extends javax.swing.JFrame {

    PanamaHitek_Arduino arduino = new PanamaHitek_Arduino();
    Boolean automaticState = false;
    
    public void disableAll(){
        btnAutomatico.setEnabled(false);
        btnManual.setEnabled(false);
        sliderHab.setEnabled(false);
        sliderBano.setEnabled(false);
        btnVentanaOn.setEnabled(false);
        btnVentanaOff.setEnabled(false);
    }
    
    public void initFrame(){
            
        initFrame.setSize(400,300);
        initFrame.setLocationRelativeTo(null);
        initFrame.setFocusableWindowState(true);
        initFrame.setVisible(true);
        initFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inputSerial.setText("9600");
        
        btnConectar.setBackground(Color.white);
        btnManual.setBackground(Color.white);
        btnAutomatico.setBackground(Color.white);
        btnVentanaOn.setBackground(Color.white);
        btnVentanaOff.setBackground(Color.white);
        
        disableAll();
    }
    
    public void initSlider(){
        sliderHab.setMinimum(0);
        sliderHab.setMajorTickSpacing(1);
        sliderHab.setMaximum(5);
        sliderBano.setMinimum(0);
        sliderBano.setMajorTickSpacing(1);
        sliderBano.setMaximum(5);
    }
    
    public void initEnable(){
        btnAutomatico.setEnabled(true);
        btnManual.setEnabled(true);
    }
    
    
    
    
    
    public Main() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        initFrame();
        initSlider();   
    }
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        initFrame = new javax.swing.JFrame();
        btnConectar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        inputSerial = new javax.swing.JTextField();
        inputPort = new javax.swing.JComboBox<>();
        btnManual = new javax.swing.JButton();
        btnAutomatico = new javax.swing.JButton();
        sliderHab = new javax.swing.JSlider();
        labelHab = new javax.swing.JLabel();
        labelBano = new javax.swing.JLabel();
        sliderBano = new javax.swing.JSlider();
        labelVentana = new javax.swing.JLabel();
        btnVentanaOn = new javax.swing.JButton();
        btnVentanaOff = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        initFrame.setResizable(false);

        btnConectar.setText("Conectar");
        btnConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConectarActionPerformed(evt);
            }
        });

        jLabel2.setText("Serial:");

        inputPort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "COM1", "COM2", "COM3", "COM4", "COM5" }));

        javax.swing.GroupLayout initFrameLayout = new javax.swing.GroupLayout(initFrame.getContentPane());
        initFrame.getContentPane().setLayout(initFrameLayout);
        initFrameLayout.setHorizontalGroup(
            initFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(initFrameLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addGroup(initFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConectar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(initFrameLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(41, 41, 41)
                        .addGroup(initFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputPort, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputSerial, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        initFrameLayout.setVerticalGroup(
            initFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(initFrameLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(initFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(inputSerial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(inputPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnConectar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(182, 182, 182));
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        btnManual.setText("Manual");
        btnManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManualActionPerformed(evt);
            }
        });

        btnAutomatico.setText("Automático");
        btnAutomatico.setToolTipText("");
        btnAutomatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutomaticoActionPerformed(evt);
            }
        });

        sliderHab.setPaintLabels(true);
        sliderHab.setPaintTicks(true);
        sliderHab.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderHabStateChanged(evt);
            }
        });

        labelHab.setText("Habitación Principal");

        labelBano.setText("Baño");

        sliderBano.setPaintLabels(true);
        sliderBano.setPaintTicks(true);
        sliderBano.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderBanoStateChanged(evt);
            }
        });

        labelVentana.setText("Ventana");

        btnVentanaOn.setText("l");
        btnVentanaOn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentanaOnActionPerformed(evt);
            }
        });

        btnVentanaOff.setText("O");
        btnVentanaOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentanaOffActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainPackage/Grupo 2.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sliderBano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelBano)
                            .addComponent(labelHab)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAutomatico, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnManual, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(sliderHab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(labelVentana))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnVentanaOn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnVentanaOff, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAutomatico, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnManual, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(labelHab)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sliderHab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelBano)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sliderBano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(labelVentana)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnVentanaOff, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVentanaOn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAutomaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutomaticoActionPerformed
        sliderHab.setEnabled(false);
        sliderBano.setEnabled(false);
        automaticState = false;
        btnManual.setBackground(Color.white);
        btnAutomatico.setBackground(Color.cyan);
        btnVentanaOn.setEnabled(false);
        btnVentanaOff.setEnabled(false);
        
        try {
            arduino.sendData("0");
            arduino.sendData("6");
        } catch (Exception ex) {
            //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAutomaticoActionPerformed

    private void btnManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManualActionPerformed
        sliderHab.setEnabled(true);
        sliderHab.setValue(3);
        sliderBano.setEnabled(true);
        sliderBano.setValue(3);
        automaticState = true;
        btnManual.setBackground(Color.cyan);
        btnAutomatico.setBackground(Color.white);
        btnVentanaOn.setEnabled(true);
        btnVentanaOff.setEnabled(true);
        
        try {
            arduino.sendData("3");
            arduino.sendData("9");
        } catch (Exception ex) {
            //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnManualActionPerformed

    private void sliderHabStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderHabStateChanged
        if(automaticState == true){
            switch(sliderHab.getValue()){
            case 0: 
                try {
                    arduino.sendData("0");
                } catch (Exception ex) {
                    //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 1:
                try {
                    arduino.sendData("1");
                } catch (Exception ex) {
                    //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 2:
                try {
                    arduino.sendData("2");
                } catch (Exception ex) {
                    //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 3:
                try {
                    arduino.sendData("3");
                } catch (Exception ex) {
                    //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 4:
                try {
                    arduino.sendData("4");
                } catch (Exception ex) {
                    //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 5:
                try {
                    arduino.sendData("5");
                } catch (Exception ex) {
                    //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            default:
                break;
        }
        }
        
        
    }//GEN-LAST:event_sliderHabStateChanged

    private void btnConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConectarActionPerformed
        try {
            arduino.arduinoTX(inputPort.getSelectedItem().toString(), Integer.parseInt(inputSerial.getText()));
            initEnable();
            initFrame.setVisible(false);
            this.toFront();
        } catch (Exception ex) {
            //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnConectarActionPerformed

    private void sliderBanoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderBanoStateChanged
        if(automaticState == true){
        switch(sliderBano.getValue()){
            case 0: 
                try {
                    arduino.sendData("6");
                } catch (Exception ex) {
                    //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 1:
                try {
                    arduino.sendData("7");
                } catch (Exception ex) {
                    //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 2:
                try {
                    arduino.sendData("8");
                } catch (Exception ex) {
                    //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 3:
                try {
                    arduino.sendData("9");
                } catch (Exception ex) {
                    //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 4:
                try {
                    arduino.sendData("a");
                } catch (Exception ex) {
                    //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 5:
                try {
                    arduino.sendData("A");
                } catch (Exception ex) {
                    //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            default:
                break;
        }
        }
    }//GEN-LAST:event_sliderBanoStateChanged

    private void btnVentanaOnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentanaOnActionPerformed
        btnVentanaOn.setBackground(Color.cyan);
        btnVentanaOff.setBackground(Color.white);
    }//GEN-LAST:event_btnVentanaOnActionPerformed

    private void btnVentanaOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentanaOffActionPerformed
        btnVentanaOn.setBackground(Color.white);
        btnVentanaOff.setBackground(Color.cyan);
    }//GEN-LAST:event_btnVentanaOffActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAutomatico;
    private javax.swing.JButton btnConectar;
    private javax.swing.JButton btnManual;
    private javax.swing.JButton btnVentanaOff;
    private javax.swing.JButton btnVentanaOn;
    private javax.swing.JFrame initFrame;
    private javax.swing.JComboBox<String> inputPort;
    private javax.swing.JTextField inputSerial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelBano;
    private javax.swing.JLabel labelHab;
    private javax.swing.JLabel labelVentana;
    private javax.swing.JSlider sliderBano;
    private javax.swing.JSlider sliderHab;
    // End of variables declaration//GEN-END:variables
}
