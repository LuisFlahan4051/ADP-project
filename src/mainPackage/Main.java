package mainPackage;

import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JFrame;
import panamahitek.Arduino.PanamaHitek_Arduino;

public class Main extends javax.swing.JFrame {

    PanamaHitek_Arduino arduino = new PanamaHitek_Arduino();
    Boolean automaticState = false;
    Boolean btnAutomaticState = false;
    Boolean btnVentanaState = false;
    Boolean btnDormirState = false;
    
    public void disableAll(){
        btnAutomatico.setEnabled(false);
        btnDormir.setEnabled(false);
        sliderHab.setEnabled(false);
        sliderBano.setEnabled(false);
        btnVentana.setEnabled(false);
        sliderTime.setEnabled(false);
    }
    
    public void initFrame(){
            
        initFrame.setSize(400,300);
        initFrame.setLocationRelativeTo(null);
        initFrame.setFocusableWindowState(true);
        initFrame.setVisible(true);
        initFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inputSerial.setText("9600");
        initFrame.setIconImage(Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("mainPackage/logo-ipn.png")));
        initFrame.setBackground(Color.white);
        
        btnConectar.setBackground(Color.white);
        btnDormir.setBackground(Color.white);
        btnAutomatico.setBackground(Color.white);
        btnVentana.setBackground(Color.white);
        
        disableAll();
    }
    
    public void initSlider(){
        sliderHab.setMinimum(0);
        sliderHab.setMajorTickSpacing(1);
        sliderHab.setMaximum(5);
        sliderBano.setMinimum(0);
        sliderBano.setMajorTickSpacing(1);
        sliderBano.setMaximum(5);
        sliderTime.setMinimum(6);
        sliderTime.setMaximum(24);
        sliderTime.setMajorTickSpacing(6);
        sliderTime.setValue(12);
        sliderBano.setValue(0);
        sliderHab.setValue(0);
    }
    
    public void initEnable(){
        btnAutomatico.setEnabled(true);
        btnDormir.setEnabled(true);
    }
    
    
    
    
    
    public Main() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        initFrame();
        initSlider();
        setIconImage(Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("mainPackage/logo-ipn.png")));
    }
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        initFrame = new javax.swing.JFrame();
        btnConectar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        inputSerial = new javax.swing.JTextField();
        inputPort = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        btnDormir = new javax.swing.JButton();
        btnAutomatico = new javax.swing.JButton();
        sliderHab = new javax.swing.JSlider();
        sliderBano = new javax.swing.JSlider();
        btnVentana = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        sliderTime = new javax.swing.JSlider();
        jPanel1 = new javax.swing.JPanel();
        labelVentana = new javax.swing.JLabel();
        labelBano = new javax.swing.JLabel();
        labelHab = new javax.swing.JLabel();
        labelHoras = new javax.swing.JLabel();

        initFrame.setBackground(new java.awt.Color(255, 255, 255));
        initFrame.setResizable(false);
        initFrame.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnConectar.setBackground(new java.awt.Color(255, 255, 255));
        btnConectar.setText("Conectar");
        btnConectar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConectarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConectarMouseExited(evt);
            }
        });
        btnConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConectarActionPerformed(evt);
            }
        });
        initFrame.getContentPane().add(btnConectar, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 156, 147, 34));

        jLabel2.setText("Serial:");
        initFrame.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 62, -1, -1));
        initFrame.getContentPane().add(inputSerial, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 60, 76, -1));

        inputPort.setBackground(new java.awt.Color(255, 255, 255));
        inputPort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "COM1", "COM2", "COM3", "COM4", "COM5" }));
        initFrame.getContentPane().add(inputPort, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 97, 76, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        initFrame.getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDormir.setText("Dormir");
        btnDormir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDormirActionPerformed(evt);
            }
        });
        getContentPane().add(btnDormir, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 11, 89, 44));

        btnAutomatico.setText("Automático");
        btnAutomatico.setToolTipText("");
        btnAutomatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutomaticoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAutomatico, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 11, 89, 44));

        sliderHab.setPaintLabels(true);
        sliderHab.setPaintTicks(true);
        sliderHab.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderHabStateChanged(evt);
            }
        });
        getContentPane().add(sliderHab, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 94, -1, -1));

        sliderBano.setPaintLabels(true);
        sliderBano.setPaintTicks(true);
        sliderBano.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderBanoStateChanged(evt);
            }
        });
        getContentPane().add(sliderBano, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 154, -1, -1));

        btnVentana.setText("Abrir");
        btnVentana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentanaActionPerformed(evt);
            }
        });
        getContentPane().add(btnVentana, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 226, 90, 37));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainPackage/Grupo 2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 28, 220, 323));

        sliderTime.setPaintLabels(true);
        sliderTime.setPaintTicks(true);
        sliderTime.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderTimeStateChanged(evt);
            }
        });
        getContentPane().add(sliderTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 295, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelVentana.setText("Ventana");
        jPanel1.add(labelVentana, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

        labelBano.setText("Baño");
        jPanel1.add(labelBano, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        labelHab.setText("Habitación Principal");
        jPanel1.add(labelHab, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        labelHoras.setText("Horas del día (Simulación)");
        jPanel1.add(labelHoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAutomaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutomaticoActionPerformed
        if(btnAutomaticState == false){
            sliderHab.setEnabled(false);
            sliderBano.setEnabled(false);
            sliderTime.setEnabled(true);
            btnVentana.setEnabled(false);
            btnVentana.setForeground(Color.gray);

            automaticState = true;
            btnAutomaticState = true;
            btnAutomatico.setBackground(new Color(76,16,45));
            btnAutomatico.setForeground(Color.white);

            
            try {
                arduino.sendData("D");// manda señal de modo automático 
                //arduino.sendData("0");// Apaga el foco principal
                //arduino.sendData("6");// Apaga el foco del baño
            } catch (Exception ex) {}
            
        }else{
            sliderHab.setEnabled(true);
            sliderBano.setEnabled(true);
            sliderTime.setEnabled(false);
            btnVentana.setEnabled(true);
            btnVentana.setForeground(Color.black);

            
            automaticState = false;
            btnAutomaticState = false;
            btnAutomatico.setBackground(Color.white);
            btnAutomatico.setForeground(Color.black);

            

            try {
                arduino.sendData("d");// manda señal de modo manual
                //arduino.sendData("3");// Enciende el foco principal a nivel intermedio
                //arduino.sendData("9");// Enciende el foco del baño a nivel intermedio
            } catch (Exception ex) {}
        }
        
        
    }//GEN-LAST:event_btnAutomaticoActionPerformed

    private void btnDormirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDormirActionPerformed
        if(btnDormirState == false){
            sliderHab.setEnabled(false);
            sliderBano.setEnabled(false);
            sliderTime.setEnabled(false);
            btnVentana.setEnabled(false);
            
            btnAutomatico.setEnabled(false);
            

            
            automaticState = false;
            
            btnDormirState = true;
            btnDormir.setBackground(new Color(76,16,45));
            btnDormir.setForeground(Color.white);
            
            btnAutomaticState = false;
            btnAutomatico.setBackground(Color.white);
            btnAutomatico.setForeground(Color.gray);

            btnVentanaState = false;
            btnVentana.setBackground(Color.white);
            btnVentana.setForeground(Color.gray);
            
            try {
                arduino.sendData("f");// manda señal de modo dormir
            } catch (Exception ex) {}
            
        }else{
            sliderHab.setEnabled(false);
            sliderBano.setEnabled(false);
            sliderTime.setEnabled(true);
            btnAutomatico.setEnabled(true);
            
            
            btnAutomaticState = true;
            automaticState = true;
            btnAutomatico.setBackground(new Color(76,16,45));
            btnAutomatico.setForeground(Color.white);
            
            btnDormirState = false;
            btnDormir.setBackground(Color.white);
            btnDormir.setForeground(Color.black);
            
            try {
                arduino.sendData("F");// manda señal de apagar modo dormir
            } catch (Exception ex) {}
        }
    }//GEN-LAST:event_btnDormirActionPerformed

    private void sliderHabStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderHabStateChanged
        if(automaticState == false && sliderHab.isEnabled()){
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
        if(automaticState == false && sliderBano.isEnabled()){
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

    private void btnVentanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentanaActionPerformed
        if(btnVentanaState == false){
            btnVentana.setBackground(new Color(76,16,45));
            btnVentana.setForeground(Color.white);
            btnVentanaState = true;
            try{
                arduino.sendData("e");
            }catch(Exception ex){}
        }else{
            btnVentana.setBackground(Color.white);
            btnVentana.setForeground(Color.black);
            btnVentanaState = false;
            try{
                arduino.sendData("E");
            }catch(Exception ex){}
        }
        
        
    }//GEN-LAST:event_btnVentanaActionPerformed

    private void btnConectarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConectarMouseEntered
        btnConectar.setBackground(new Color(76,16,45));
        btnConectar.setForeground(Color.white);
    }//GEN-LAST:event_btnConectarMouseEntered

    private void btnConectarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConectarMouseExited
        btnConectar.setBackground(Color.white);
        btnConectar.setForeground(Color.black);
    }//GEN-LAST:event_btnConectarMouseExited

    private void sliderTimeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderTimeStateChanged
        if(automaticState == true && sliderTime.isEnabled()){
        switch(sliderTime.getValue()){
            case 6: 
                try {
                    arduino.sendData("b");
                } catch (Exception ex) {
                    //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 12:
                try {
                    arduino.sendData("B");
                } catch (Exception ex) {
                    //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 18:
                try {
                    arduino.sendData("c");
                } catch (Exception ex) {
                    //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 24:
                try {
                    arduino.sendData("C");
                } catch (Exception ex) {
                    //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            default:
                break;
        }
        }
    }//GEN-LAST:event_sliderTimeStateChanged

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
    private javax.swing.JButton btnDormir;
    private javax.swing.JButton btnVentana;
    private javax.swing.JFrame initFrame;
    private javax.swing.JComboBox<String> inputPort;
    private javax.swing.JTextField inputSerial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelBano;
    private javax.swing.JLabel labelHab;
    private javax.swing.JLabel labelHoras;
    private javax.swing.JLabel labelVentana;
    private javax.swing.JSlider sliderBano;
    private javax.swing.JSlider sliderHab;
    private javax.swing.JSlider sliderTime;
    // End of variables declaration//GEN-END:variables
}
