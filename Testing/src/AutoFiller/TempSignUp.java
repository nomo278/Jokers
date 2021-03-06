/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AutoFiller;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;  
import java.util.Calendar;
import java.util.Date;
import javax.swing.JFrame;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.Random;
import java.util.logging.Level;       
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.UIManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import static org.openqa.selenium.Keys.SHIFT;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait; 
//import static java.lang.Math.abs;
/**
 *
 * @author Mohammed
 */
public class TempSignUp extends JFrame {

    /**
     * Creates new form SignUp
     */
    public TempSignUp() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        CrestSignUp = new javax.swing.JToggleButton();
        AcimaSignUp = new javax.swing.JToggleButton();
        SnapSignUp = new javax.swing.JToggleButton();
        MerchantSignUp = new javax.swing.JToggleButton();
        OkinusSignUp = new javax.swing.JToggleButton();
        ProgressiveSignUp = new javax.swing.JToggleButton();
        SubmitSignUp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AutoFiller/GFSLOGO.png"))); // NOI18N

        CrestSignUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AutoFiller/Crest.png"))); // NOI18N

        AcimaSignUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AutoFiller/Acimalogo.png"))); // NOI18N
        AcimaSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcimaSignUpActionPerformed(evt);
            }
        });

        SnapSignUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AutoFiller/Snap-150.png"))); // NOI18N
        SnapSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SnapSignUpActionPerformed(evt);
            }
        });

        MerchantSignUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AutoFiller/merchantPreferred.png"))); // NOI18N

        OkinusSignUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AutoFiller/okinus.png"))); // NOI18N

        ProgressiveSignUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AutoFiller/progressive.png"))); // NOI18N
        ProgressiveSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProgressiveSignUpActionPerformed(evt);
            }
        });

        SubmitSignUp.setBackground(new java.awt.Color(0, 255, 0));
        SubmitSignUp.setText("Submit >");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(MerchantSignUp)
                    .addComponent(CrestSignUp))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AcimaSignUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(OkinusSignUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SnapSignUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ProgressiveSignUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SubmitSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SnapSignUp)
                    .addComponent(AcimaSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CrestSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MerchantSignUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(OkinusSignUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ProgressiveSignUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(64, 64, 64)
                .addComponent(SubmitSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void AcimaSignUpActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void SnapSignUpActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void ProgressiveSignUpActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

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
            java.util.logging.Logger.getLogger(TempSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TempSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TempSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TempSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

         try {
            //here you can put the selected theme class name in JTattoo
            UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
 
        }catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TempSignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JToggleButton AcimaSignUp;
    private javax.swing.JToggleButton CrestSignUp;
    private javax.swing.JToggleButton MerchantSignUp;
    private javax.swing.JToggleButton OkinusSignUp;
    private javax.swing.JToggleButton ProgressiveSignUp;
    private javax.swing.JToggleButton SnapSignUp;
    private javax.swing.JButton SubmitSignUp;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration                   
}
