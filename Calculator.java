/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.function.BinaryOperator;
import java.util.function.Function;

/**
 *
 * @author hutch
 */
public class Calculator extends javax.swing.JFrame {

   private final StringBuilder compute = new StringBuilder();
   private String answer;
   private double numD;
   private double nextNumD;
   private char operator = 'x';

    public Calculator() {
        
        setTitle("Calculator");
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Screen = new javax.swing.JTextField();
        sevenBTN = new javax.swing.JButton();
        eightBTN = new javax.swing.JButton();
        nineBTN = new javax.swing.JButton();
        fourBTN = new javax.swing.JButton();
        fiveBTN = new javax.swing.JButton();
        sixBTN = new javax.swing.JButton();
        oneBTN = new javax.swing.JButton();
        twoBTN = new javax.swing.JButton();
        threeBTN = new javax.swing.JButton();
        zeroBTN = new javax.swing.JButton();
        dotBTN = new javax.swing.JButton();
        plusBTN = new javax.swing.JButton();
        minusBTN = new javax.swing.JButton();
        divideBTN = new javax.swing.JButton();
        timesBTN = new javax.swing.JButton();
        equalsBTN = new javax.swing.JButton();
        deleteBTN = new javax.swing.JButton();
        clearBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(385, 317));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(233, 233, 233));

        Screen.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Screen.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        sevenBTN.setText("7");
        sevenBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenBTNActionPerformed(evt);
            }
        });

        eightBTN.setText("8");
        eightBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightBTNActionPerformed(evt);
            }
        });

        nineBTN.setText("9");
        nineBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineBTNActionPerformed(evt);
            }
        });

        fourBTN.setText("4");
        fourBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourBTNActionPerformed(evt);
            }
        });

        fiveBTN.setText("5");
        fiveBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveBTNActionPerformed(evt);
            }
        });

        sixBTN.setText("6");
        sixBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixBTNActionPerformed(evt);
            }
        });

        oneBTN.setText("1");
        oneBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneBTNActionPerformed(evt);
            }
        });

        twoBTN.setText("2");
        twoBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoBTNActionPerformed(evt);
            }
        });

        threeBTN.setText("3");
        threeBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeBTNActionPerformed(evt);
            }
        });

        zeroBTN.setText("0");
        zeroBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroBTNActionPerformed(evt);
            }
        });

        dotBTN.setText(".");
        dotBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dotBTNActionPerformed(evt);
            }
        });

        plusBTN.setText("+");
        plusBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusBTNActionPerformed(evt);
            }
        });

        minusBTN.setText("-");
        minusBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusBTNActionPerformed(evt);
            }
        });

        divideBTN.setText("/");
        divideBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideBTNActionPerformed(evt);
            }
        });

        timesBTN.setText("*");
        timesBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timesBTNActionPerformed(evt);
            }
        });

        equalsBTN.setText("=");
        equalsBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalsBTNActionPerformed(evt);
            }
        });

        deleteBTN.setText("DEL");
        deleteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBTNActionPerformed(evt);
            }
        });

        clearBTN.setText("CE");
        clearBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Screen)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(oneBTN)
                                    .addComponent(fourBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(sevenBTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(deleteBTN))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(eightBTN)
                                    .addComponent(fiveBTN)
                                    .addComponent(zeroBTN)
                                    .addComponent(twoBTN))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nineBTN)
                                    .addComponent(sixBTN)
                                    .addComponent(dotBTN)
                                    .addComponent(threeBTN)))
                            .addComponent(clearBTN, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(equalsBTN, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(divideBTN, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(timesBTN, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(minusBTN, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(plusBTN, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {clearBTN, deleteBTN, divideBTN, dotBTN, eightBTN, equalsBTN, fiveBTN, fourBTN, minusBTN, nineBTN, oneBTN, plusBTN, sevenBTN, sixBTN, threeBTN, timesBTN, twoBTN, zeroBTN});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(Screen, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(plusBTN)
                            .addComponent(deleteBTN)
                            .addComponent(clearBTN))
                        .addGap(18, 18, 18)
                        .addComponent(minusBTN)
                        .addGap(18, 18, 18)
                        .addComponent(divideBTN)
                        .addGap(18, 18, 18)
                        .addComponent(timesBTN)
                        .addGap(18, 18, 18)
                        .addComponent(equalsBTN))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sevenBTN)
                            .addComponent(eightBTN)
                            .addComponent(nineBTN))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fourBTN)
                            .addComponent(fiveBTN)
                            .addComponent(sixBTN))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(oneBTN)
                            .addComponent(twoBTN)
                            .addComponent(threeBTN))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(zeroBTN)
                            .addComponent(dotBTN))))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {clearBTN, deleteBTN, divideBTN, dotBTN, eightBTN, equalsBTN, fiveBTN, fourBTN, minusBTN, nineBTN, oneBTN, plusBTN, sevenBTN, sixBTN, threeBTN, timesBTN, twoBTN, zeroBTN});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * zero button
     * @param evt 
     */
    
    private void zeroBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroBTNActionPerformed
        
        if(!compute.toString().isEmpty()) {
            
        compute.append('0');
        
        }
        
        Screen.setText(compute.toString());     
        
    }//GEN-LAST:event_zeroBTNActionPerformed

    /**
     * one button
     * @param evt 
     */
    
    private void oneBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneBTNActionPerformed
        
        compute.append('1');
        Screen.setText(compute.toString()); 
        
    }//GEN-LAST:event_oneBTNActionPerformed

    /**
     * two button
     * @param evt 
     */
    
    private void twoBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoBTNActionPerformed
        
        compute.append('2');
        Screen.setText(compute.toString());
        
    }//GEN-LAST:event_twoBTNActionPerformed

    /**
     * three button
     * @param evt 
     */
    
    private void threeBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeBTNActionPerformed
       
        compute.append('3');
        Screen.setText(compute.toString());  
        
    }//GEN-LAST:event_threeBTNActionPerformed

    /**
     * four button
     * @param evt 
     */
    
    private void fourBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourBTNActionPerformed
       
        compute.append('4');
        Screen.setText(compute.toString());  
        
    }//GEN-LAST:event_fourBTNActionPerformed

    /**
     * five button
     * @param evt 
     */
    
    private void fiveBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveBTNActionPerformed
         
        compute.append('5');
        Screen.setText(compute.toString()); 
        
    }//GEN-LAST:event_fiveBTNActionPerformed

    /**
     * six button
     * @param evt 
     */
    
    private void sixBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixBTNActionPerformed
        
        compute.append('6');
        Screen.setText(compute.toString());
        
    }//GEN-LAST:event_sixBTNActionPerformed

    /**
     * seven button
     * @param evt 
     */
    
    private void sevenBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenBTNActionPerformed
        
        compute.append('7');
        Screen.setText(compute.toString());  
        
    }//GEN-LAST:event_sevenBTNActionPerformed

    /**
     * eight button
     * @param evt 
     */
    
    private void eightBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightBTNActionPerformed
        
        compute.append('8');
        Screen.setText(compute.toString());  
        
    }//GEN-LAST:event_eightBTNActionPerformed

    /**
     * nine button
     * @param evt 
     */
    
    private void nineBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineBTNActionPerformed
        
        compute.append('9');
        Screen.setText(compute.toString()); 
        
    }//GEN-LAST:event_nineBTNActionPerformed

    /**
     * delete single number
     * @param evt 
     */
    
    private void deleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBTNActionPerformed
        
        if(compute.length() > 0) {
            
            compute.deleteCharAt(compute.length() -1);
            Screen.setText(compute.toString()); 
            
        }
        
    }//GEN-LAST:event_deleteBTNActionPerformed

    /**
     * clear all numbers
     * @param evt 
     */
    
    private void clearBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBTNActionPerformed
        
        compute.delete(0, compute.length());
        numD = 0.0;
        nextNumD = 0.0;
        Screen.setText(compute.toString()); 
        
    }//GEN-LAST:event_clearBTNActionPerformed

    /**
     * plus button
     * @param evt 
     */
    
    private void plusBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusBTNActionPerformed
        
        if(numD == 0 && compute.length() > 0) {
            
            numD = Double.parseDouble(compute.toString());
            
        }
      
        compute.delete(0, compute.length());
        Screen.setText(compute.toString()); 

        operator = '+';
        
    }//GEN-LAST:event_plusBTNActionPerformed

    /**
     * minus button
     * @param evt 
     */
    
    private void minusBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusBTNActionPerformed
       
        if(numD == 0 && compute.length() > 0) {
            
            numD = Double.parseDouble(compute.toString());
            
        }
        
        compute.delete(0, compute.length());
        Screen.setText(compute.toString()); 
        
        operator = '-';
        
    }//GEN-LAST:event_minusBTNActionPerformed

    /**
     * divide button
     * @param evt 
     */
    
    private void divideBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideBTNActionPerformed
                      
       if(numD == 0 && compute.length() > 0) {
            
            numD = Double.parseDouble(compute.toString());
            
        }
                
        compute.delete(0, compute.length());
        Screen.setText(compute.toString()); 
        compute.delete(0, compute.length());
        Screen.setText(compute.toString()); 
        
        operator = '/';
        
    }//GEN-LAST:event_divideBTNActionPerformed

    /**
     * multiply button
     * @param evt 
     */
    
    private void timesBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timesBTNActionPerformed
        
        if(numD == 0 && compute.length() > 0) {
            
            numD = Double.parseDouble(compute.toString());
            
        }
        
        compute.delete(0, compute.length());
        Screen.setText(compute.toString()); 
        compute.delete(0, compute.length());
        Screen.setText(compute.toString()); 
        
        operator = '*';
        
    }//GEN-LAST:event_timesBTNActionPerformed

    /**
     * decimal point button
     * @param evt 
     */
    
    private void dotBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dotBTNActionPerformed
       
        if(compute.indexOf(".") == -1) {
               
            compute.append('.');
        }
        
        Screen.setText(compute.toString()); 
        
    }//GEN-LAST:event_dotBTNActionPerformed

    private void equalsBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalsBTNActionPerformed
    
        
        if(operator != 'x' && !Screen.getText().isEmpty())   { 
        
            BinaryOperator<Double> bdPlus = (a, b) -> a + b;
            BinaryOperator<Double> bdMinus = (c, d) -> c - d;
            BinaryOperator<Double> bdDivide = (e, f) -> e / f;
            BinaryOperator<Double> bdMulti = (g, h) -> g * h;

            Function<Double, String> showDub = n -> n.toString();

            nextNumD = Double.valueOf(compute.toString());
            compute.delete(0, compute.length());
            
            //String isWhole = answer.substring(answer.indexOf("'"), answer.length()).contains("00") ? answer.substring(0, answer.indexOf(".")) : answer;

             switch(operator){

                case '+':

                    answer = showDub.apply(bdPlus.apply(numD, nextNumD));
                    Screen.setText(dubToInt(answer));

                    numD = Double.parseDouble(answer);
                    operator = 'x';
                    compute.delete(0, compute.length());

                    break;

                case '-':

                    answer = showDub.apply(bdMinus.apply(numD, nextNumD));
                    Screen.setText(dubToInt(answer));

                    numD = Double.parseDouble(answer);
                    operator = 'x';
                    compute.delete(0, compute.length());

                    break;

                case '/':

                    answer = showDub.apply(bdDivide.apply(numD, nextNumD));
                    Screen.setText(dubToInt(answer));

                    numD = Double.parseDouble(answer);
                    operator = 'x';
                    compute.delete(0, compute.length());

                    break;

                case '*':

                    answer = showDub.apply(bdMulti.apply(numD, nextNumD));
                    Screen.setText(dubToInt(answer));

                    numD = Double.parseDouble(answer);
                    operator = 'x';
                    compute.delete(0, compute.length());

                    break;
            }    
        }
    }//GEN-LAST:event_equalsBTNActionPerformed

    /**
     * changes a blank decimal to integer value
     * @param answer
     * @return 
     */
    
    public String dubToInt(String answer){

        return answer.substring(answer.indexOf("."), answer.length()).contains("0") ? answer.substring(0, answer.indexOf(".")) : answer;

    }
    
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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Screen;
    private javax.swing.JButton clearBTN;
    private javax.swing.JButton deleteBTN;
    private javax.swing.JButton divideBTN;
    private javax.swing.JButton dotBTN;
    private javax.swing.JButton eightBTN;
    private javax.swing.JButton equalsBTN;
    private javax.swing.JButton fiveBTN;
    private javax.swing.JButton fourBTN;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton minusBTN;
    private javax.swing.JButton nineBTN;
    private javax.swing.JButton oneBTN;
    private javax.swing.JButton plusBTN;
    private javax.swing.JButton sevenBTN;
    private javax.swing.JButton sixBTN;
    private javax.swing.JButton threeBTN;
    private javax.swing.JButton timesBTN;
    private javax.swing.JButton twoBTN;
    private javax.swing.JButton zeroBTN;
    // End of variables declaration//GEN-END:variables
}
