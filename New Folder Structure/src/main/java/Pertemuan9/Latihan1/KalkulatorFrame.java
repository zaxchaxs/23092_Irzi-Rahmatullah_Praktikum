/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pertemuan9.Latihan1;

/**
 *
 * @author Irzi Rhmtllh
 */
public class KalkulatorFrame extends javax.swing.JFrame {
    
    private double firstNum = 0.0, secondNum = 0.0, result = 0.0;
    private String operator;
    private boolean isOperatorClicked;
    
    public KalkulatorFrame() {
        initComponents();
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
        resultField = new javax.swing.JTextField();
        numButton7 = new javax.swing.JButton();
        numButton4 = new javax.swing.JButton();
        numButton1 = new javax.swing.JButton();
        numButtonPoint = new javax.swing.JButton();
        numButton8 = new javax.swing.JButton();
        numButton5 = new javax.swing.JButton();
        numButton2 = new javax.swing.JButton();
        numButton0 = new javax.swing.JButton();
        numButton9 = new javax.swing.JButton();
        numButton6 = new javax.swing.JButton();
        numButton3 = new javax.swing.JButton();
        actionButtonClear = new javax.swing.JButton();
        actionButtonPlus = new javax.swing.JButton();
        actionButtonKali = new javax.swing.JButton();
        actionButtonEqual = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        actionButtonExit = new javax.swing.JButton();
        actionButtonModulus = new javax.swing.JButton();
        actionButtonBagi = new javax.swing.JButton();
        actionButtonMin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        resultField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        resultField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(resultField, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(resultField, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addContainerGap())
        );

        numButton7.setText("7");
        numButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numButton7ActionPerformed(evt);
            }
        });

        numButton4.setText("4");
        numButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numButton4ActionPerformed(evt);
            }
        });

        numButton1.setText("1");
        numButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numButton1ActionPerformed(evt);
            }
        });

        numButtonPoint.setText(".");
        numButtonPoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numButtonPointActionPerformed(evt);
            }
        });

        numButton8.setText("8");
        numButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numButton8ActionPerformed(evt);
            }
        });

        numButton5.setText("5");
        numButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numButton5ActionPerformed(evt);
            }
        });

        numButton2.setText("2");
        numButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numButton2ActionPerformed(evt);
            }
        });

        numButton0.setText("0");
        numButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numButton0ActionPerformed(evt);
            }
        });

        numButton9.setText("9");
        numButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numButton9ActionPerformed(evt);
            }
        });

        numButton6.setText("6");
        numButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numButton6ActionPerformed(evt);
            }
        });

        numButton3.setText("3");
        numButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numButton3ActionPerformed(evt);
            }
        });

        actionButtonClear.setText("C");
        actionButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionButtonClearActionPerformed(evt);
            }
        });

        actionButtonPlus.setText("+");
        actionButtonPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionButtonPlusActionPerformed(evt);
            }
        });

        actionButtonKali.setText("*");
        actionButtonKali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionButtonKaliActionPerformed(evt);
            }
        });

        actionButtonEqual.setText("=");
        actionButtonEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionButtonEqualActionPerformed(evt);
            }
        });

        jButton16.setText("B");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        actionButtonExit.setText("E");
        actionButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionButtonExitActionPerformed(evt);
            }
        });

        actionButtonModulus.setText("%");
        actionButtonModulus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionButtonModulusActionPerformed(evt);
            }
        });

        actionButtonBagi.setText("/");
        actionButtonBagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionButtonBagiActionPerformed(evt);
            }
        });

        actionButtonMin.setText("-");
        actionButtonMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionButtonMinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numButtonPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(actionButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(actionButtonEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(actionButtonKali, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(actionButtonPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(actionButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(actionButtonModulus, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(actionButtonBagi, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(actionButtonMin, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(numButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(numButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(numButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(numButtonPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(numButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(numButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(numButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(numButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(numButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(numButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(numButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(actionButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(actionButtonPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(actionButtonKali, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(actionButtonEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(actionButtonMin, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(actionButtonBagi, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(actionButtonModulus, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(actionButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void operatorButtonClicked(java.awt.event.ActionEvent evt, String op) {
        if(isOperatorClicked) {
            switch (op) {
                case "+":
                    firstNum = firstNum + Double.parseDouble(resultField.getText());
                    break;
                    
                case "-":
                    firstNum = firstNum - Double.parseDouble(resultField.getText());
                    break;
                    
                case "*":
                    firstNum = firstNum * Double.parseDouble(resultField.getText());
                    break;
                    
                case "/":
                    firstNum = firstNum / Double.parseDouble(resultField.getText());
                    break;
                    
                case "%":
                    firstNum = firstNum % Double.parseDouble(resultField.getText());
                    break;
                    
                default:
                    throw new AssertionError();
            }
            operator = op;
            resultField.setText("");
            return;
        }
        firstNum = Double.parseDouble(resultField.getText());
        operator = op;
        isOperatorClicked = true;
        resultField.setText("");
    };
    
    private void actionButtonPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionButtonPlusActionPerformed
        operatorButtonClicked(evt, "+");
//        if(isOperatorClicked) {
//            firstNum = firstNum + Double.parseDouble(resultField.getText());
//            resultField.setText("");
//            return;
//        }
//        firstNum = Double.parseDouble(resultField.getText());
//        isOperatorClicked = true;
//        resultField.setText("");
    }//GEN-LAST:event_actionButtonPlusActionPerformed

    private void numButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numButton1ActionPerformed
        String currText = resultField.getText();
        resultField.setText(currText + evt.getActionCommand());
    }//GEN-LAST:event_numButton1ActionPerformed

    private void numButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numButton5ActionPerformed
        String currText = resultField.getText();
        resultField.setText(currText + evt.getActionCommand());
    }//GEN-LAST:event_numButton5ActionPerformed

    private void numButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numButton7ActionPerformed
        String currText = resultField.getText();
        resultField.setText(currText + evt.getActionCommand());
    }//GEN-LAST:event_numButton7ActionPerformed

    private void numButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numButton2ActionPerformed
        String currText = resultField.getText();
        resultField.setText(currText + evt.getActionCommand());
    }//GEN-LAST:event_numButton2ActionPerformed

    private void numButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numButton3ActionPerformed
        String currText = resultField.getText();
        resultField.setText(currText + evt.getActionCommand());
    }//GEN-LAST:event_numButton3ActionPerformed

    private void numButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numButton4ActionPerformed
        String currText = resultField.getText();
        resultField.setText(currText + evt.getActionCommand());
    }//GEN-LAST:event_numButton4ActionPerformed

    private void numButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numButton6ActionPerformed
        String currText = resultField.getText();
        resultField.setText(currText + evt.getActionCommand());
    }//GEN-LAST:event_numButton6ActionPerformed

    private void numButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numButton8ActionPerformed
        String currText = resultField.getText();
        resultField.setText(currText + evt.getActionCommand());
    }//GEN-LAST:event_numButton8ActionPerformed

    private void numButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numButton9ActionPerformed
        String currText = resultField.getText();
        resultField.setText(currText + evt.getActionCommand());
    }//GEN-LAST:event_numButton9ActionPerformed

    private void numButtonPointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numButtonPointActionPerformed
        String currText = resultField.getText();
        resultField.setText(currText + evt.getActionCommand());
    }//GEN-LAST:event_numButtonPointActionPerformed

    private void resultFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultFieldActionPerformed

    private void actionButtonEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionButtonEqualActionPerformed
        secondNum = Double.parseDouble(resultField.getText());
        switch (operator) {
            case "+":
                result = firstNum + secondNum;
                break;

            case "-":
                result = firstNum - secondNum;
                break;

            case "*":
                result = firstNum * secondNum;
                break;

            case "/":
                result = firstNum / secondNum;
                break;

            case "%":
                result = firstNum % secondNum;
                break;

            default:
                throw new AssertionError();
        }       
        
        resultField.setText(result + "");
        firstNum = 0.0;
        secondNum = 0.0;
        isOperatorClicked = false;
    }//GEN-LAST:event_actionButtonEqualActionPerformed

    private void actionButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionButtonClearActionPerformed
        resultField.setText("");
        firstNum = 0.0;
        secondNum = 0.0;
        result = 0.0;
        isOperatorClicked = false;
    }//GEN-LAST:event_actionButtonClearActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        String currText = resultField.getText();
        if(currText.length() > 0 ) {
            currText = currText.substring(0, currText.length()-1);
        };
        resultField.setText(currText);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void numButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numButton0ActionPerformed
        String currText = resultField.getText();
        resultField.setText(currText + evt.getActionCommand());
    }//GEN-LAST:event_numButton0ActionPerformed

    private void actionButtonMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionButtonMinActionPerformed
        operatorButtonClicked(evt, "-");
    }//GEN-LAST:event_actionButtonMinActionPerformed

    private void actionButtonKaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionButtonKaliActionPerformed
        operatorButtonClicked(evt, "*");
    }//GEN-LAST:event_actionButtonKaliActionPerformed

    private void actionButtonBagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionButtonBagiActionPerformed
        operatorButtonClicked(evt, "/");
    }//GEN-LAST:event_actionButtonBagiActionPerformed

    private void actionButtonModulusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionButtonModulusActionPerformed
        operatorButtonClicked(evt, "%");
    }//GEN-LAST:event_actionButtonModulusActionPerformed

    private void actionButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionButtonExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_actionButtonExitActionPerformed

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
            java.util.logging.Logger.getLogger(KalkulatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KalkulatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KalkulatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KalkulatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KalkulatorFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actionButtonBagi;
    private javax.swing.JButton actionButtonClear;
    private javax.swing.JButton actionButtonEqual;
    private javax.swing.JButton actionButtonExit;
    private javax.swing.JButton actionButtonKali;
    private javax.swing.JButton actionButtonMin;
    private javax.swing.JButton actionButtonModulus;
    private javax.swing.JButton actionButtonPlus;
    private javax.swing.JButton jButton16;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton numButton0;
    private javax.swing.JButton numButton1;
    private javax.swing.JButton numButton2;
    private javax.swing.JButton numButton3;
    private javax.swing.JButton numButton4;
    private javax.swing.JButton numButton5;
    private javax.swing.JButton numButton6;
    private javax.swing.JButton numButton7;
    private javax.swing.JButton numButton8;
    private javax.swing.JButton numButton9;
    private javax.swing.JButton numButtonPoint;
    private javax.swing.JTextField resultField;
    // End of variables declaration//GEN-END:variables
}
