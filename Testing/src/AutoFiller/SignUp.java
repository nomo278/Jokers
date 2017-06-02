/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AutoFiller;

import static AutoFiller.Main.ProgressiveLink;
import static AutoFiller.Main.odd1;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;  
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import javax.swing.JFrame;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.logging.Level;       
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
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
public class SignUp extends javax.swing.JFrame {

   public static int odd1S =0;
   public static int odd2S = 0;
   public static int odd3S = 0;
   public static int odd4S = 0;
   public static int odd5S = 0;
   public static int odd6S = 0;
   public static int odd7S = 0;
   public static int odd8S = 0;
   
   public static String CrestLink = "";
   public static String SimpleLink = "";//AcimaCredit
   public static String SnapLink = "https://merchant.snapfinance.com/#/dashboard";//https://merchant.snapfinance.com/#/dashboard
   public static String SnapUsername="";
   public static String SnapPassword="";
   public static String ProgressiveLink = "";//Approve.me
   public static String MerchantsLink = "";
   public static String TempoeLink = "";
   public static String OkinusLink = "";
   public static String WestLink = "";
   
    /**
     * Creates new form SignUpo
     */
    public SignUp() {
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

        jLabel1 = new javax.swing.JLabel();
        Crest = new javax.swing.JToggleButton();
        Acima = new javax.swing.JToggleButton();
        Snap = new javax.swing.JToggleButton();
        Merchant = new javax.swing.JToggleButton();
        Okinus = new javax.swing.JToggleButton();
        Progressive = new javax.swing.JToggleButton();
        SubmitButton = new javax.swing.JButton();
        westCreek = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AutoFiller/GFSLOGO.png"))); // NOI18N

        Crest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AutoFiller/Crest.png"))); // NOI18N
        Crest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrestActionPerformed(evt);
            }
        });

        Acima.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AutoFiller/Acimalogo.png"))); // NOI18N
        Acima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcimaActionPerformed(evt);
            }
        });

        Snap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AutoFiller/Snap-150.png"))); // NOI18N
        Snap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SnapActionPerformed(evt);
            }
        });

        Merchant.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AutoFiller/merchantPreferred.png"))); // NOI18N
        Merchant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MerchantActionPerformed(evt);
            }
        });

        Okinus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AutoFiller/okinus.png"))); // NOI18N
        Okinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkinusActionPerformed(evt);
            }
        });

        Progressive.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AutoFiller/progressive.png"))); // NOI18N
        Progressive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProgressiveActionPerformed(evt);
            }
        });

        SubmitButton.setBackground(new java.awt.Color(51, 255, 0));
        SubmitButton.setText("Submit >");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        westCreek.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AutoFiller/wcf_logo-150.png"))); // NOI18N
        westCreek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                westCreekActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Crest)
                    .addComponent(Merchant))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(westCreek)
                                    .addComponent(Okinus))
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(SubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(16, 16, 16))
                                    .addComponent(Progressive, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addComponent(Acima)
                                .addGap(60, 60, 60)
                                .addComponent(Snap)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Acima, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Snap)
                    .addComponent(Crest, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Okinus, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Progressive)
                    .addComponent(Merchant, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(SubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(westCreek)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CrestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrestActionPerformed
        // TODO add your handling code here:
          if(odd1S == 0){
            Crest.setBackground(Color.green);
            odd1S ++;
        } else if(odd1S == 1){

            Crest.setBackground(Color.LIGHT_GRAY);
            odd1S --;
        }
    }//GEN-LAST:event_CrestActionPerformed

    private void AcimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcimaActionPerformed
        // TODO add your handling code here:
        if(odd2S == 0){
            Acima.setBackground(Color.green);
            odd2S ++;
        } else if(odd2S == 1){ 
            Acima.setBackground(Color.LIGHT_GRAY);
            odd2S --;
        }
    }//GEN-LAST:event_AcimaActionPerformed

    private void SnapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SnapActionPerformed
        // TODO add your handling code here:
        if(odd3S == 0){
            Snap.setBackground(Color.green);
            odd3S ++;
        } else if(odd3S == 1){ 
            Snap.setBackground(Color.LIGHT_GRAY);
            odd3S --;
        }
    }//GEN-LAST:event_SnapActionPerformed

    private void MerchantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MerchantActionPerformed
        // TODO add your handling code here:
        if(odd4S == 0){
            Merchant.setBackground(Color.green);
            odd4S ++;
        } else if(odd4S == 1){ 
            Merchant.setBackground(Color.LIGHT_GRAY);
            odd4S --;
        }
    }//GEN-LAST:event_MerchantActionPerformed

    private void OkinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkinusActionPerformed
        // TODO add your handling code here:
        if(odd5S == 0){
            Okinus.setBackground(Color.green);
            odd5S ++;
        } else if(odd5S == 1){ 
            Okinus.setBackground(Color.LIGHT_GRAY);
            odd5S --;
        }
    }//GEN-LAST:event_OkinusActionPerformed

    private void ProgressiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProgressiveActionPerformed
        // TODO add your handling code here:
        if(odd6S == 0){
            Progressive.setBackground(Color.green);
            odd6S ++;
        } else if(odd6S == 1){ 
            Progressive.setBackground(Color.LIGHT_GRAY);
            odd6S --;
        }
    }//GEN-LAST:event_ProgressiveActionPerformed

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
        // TODO add your handling code here:
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        
        this.setVisible(false);
         SignUp firstThread = new SignUp();
        if(odd1S == 1){
            try{
           WebDriver driver1 = new ChromeDriver();
            driver1.get("https://dealers.crestfinancial.com/Login?ReturnUrl=%2f");
            firstThread.CrestGetLink(driver1);
            driver1.close();
            }catch (Exception ex) { 
            System.out.println("Exception occured1");
        }
        }if(odd2S == 1){
            try{
            WebDriver driver2 = new ChromeDriver();
            driver2.get("https://portal.acimacredit.com/merchant_login");
            firstThread.AcimaGetLink(driver2);
            driver2.close();
            }catch (Exception ex) { 
            System.out.println("Exception occured2");
        }
        }if(odd3S == 1){
            try{
            WebDriver driver3 = new ChromeDriver();
            driver3.get("https://merchant.snapfinance.com/#/login");
            firstThread.SnapGetLink(driver3);
            driver3.close();
            }catch (Exception ex) { 
            System.out.println("Exception occured3");
        }
        }if(odd4S == 1){
            try{
            WebDriver driver4 = new ChromeDriver();
            driver4.get("https://directlink.mplease.com/Accessible/Login.aspx?ReturnUrl=%2f");
            firstThread.MerchantGetLink(driver4);
            driver4.close();
            }catch (Exception ex) { 
            System.out.println("Exception occured4");
        }
        }if(odd5S == 1){
            try{
            WebDriver driver5 = new ChromeDriver();
            driver5.get("https://portal.okinus.com");
            firstThread.OkinusGetLink(driver5); 
            driver5.close();
            }catch (Exception ex) { 
            System.out.println("Exception occured5");
        }
        }if(odd6S == 1){
            try{
            //WebDriver driver6 = new ChromeDriver();
            //driver6.get("https://www.progressivelp.com/rtocp/Login.aspx");
            firstThread.ProgressiveGetLink(); 
            }catch (Exception ex) { 
            System.out.println("Exception occured6");
        }
        }if(odd7S == 1){
         try{
            WebDriver driver7 = new ChromeDriver();
            driver7.get("https://sb7.compass-technologies.com:8158/kwik/kdlogin.pgm?task=logout&clid=122");
            firstThread.WestCreekGetLink(driver7); 
            driver7.close();
         }catch (Exception ex) { 
            System.out.println("Exception occured7");
        }
         
        }
        
        java.net.URL connectURL;
          try {
              //name="+ user + "&pass=" + pass
              String tempString = "";
              if(CrestLink != ""){
              tempString += "crest=" + CrestLink;
              }
              if(SimpleLink != ""){
              tempString += "&simple=" + SimpleLink;
              }
              if(SnapUsername != ""){
              tempString += "&snapUser=" + SnapUsername;
              }
              if(SnapPassword != ""){
              tempString += "&snapPass=" + SnapPassword;
              }
              if(ProgressiveLink != ""){
              tempString += "&progressive=" + ProgressiveLink;
              }
              if(MerchantsLink != ""){
              tempString += "&merchants=" + MerchantsLink;
              }
              if(OkinusLink != ""){
              tempString += "&okinus=" + OkinusLink;
              }
              if(WestLink != ""){
              tempString += "&west=" + WestLink;
              } 
              if(CrestLink == "" && SimpleLink == "" && SnapUsername == "" && SnapPassword == "" && ProgressiveLink == "" && MerchantsLink == "" && OkinusLink == "" && WestLink  == ""){
               tempString = null;
                  new SignUp().setVisible(true);
              }
              Properties prop = new Properties();
	InputStream input = null;
          
              	String filename = "config.properties";
    		input = SignUp.class.getClassLoader().getResourceAsStream(filename);
    		if(input==null){
    	              System.out.println("Sorry, unable to find " + filename + "at " + input );
    		  
    		    return;
    		}
		// load a properties file
		prop.load(input);

		// get the property value and print it out
		String tempUsername = prop.getProperty("username");
		 
              
            connectURL = new URL("https://www.surconsultinggroup.com/finance/getlinks.php?"+ tempString + "&username=" + tempUsername );
            System.out.println(connectURL); 
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Exception occured0");
        }
        
                new Main().setVisible(true);
    }//GEN-LAST:event_SubmitButtonActionPerformed

    private void westCreekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_westCreekActionPerformed
        // TODO add your handling code here:
         // TODO add your handling code here:
        if(odd7S == 0){
            westCreek.setBackground(Color.green);
            odd7S ++;
        } else if(odd7S == 1){ 
            westCreek.setBackground(Color.LIGHT_GRAY);
            odd7S --;
        }
    }//GEN-LAST:event_westCreekActionPerformed

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JToggleButton Acima;
    public javax.swing.JToggleButton Crest;
    public javax.swing.JToggleButton Merchant;
    public javax.swing.JToggleButton Okinus;
    public javax.swing.JToggleButton Progressive;
    public javax.swing.JToggleButton Snap;
    public javax.swing.JButton SubmitButton;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JToggleButton westCreek;
    // End of variables declaration//GEN-END:variables

    private void CrestGetLink(WebDriver driver1) {
        
        //samawad
        try{
        //WebElement CrestLogin = (new WebDriverWait(driver1, 10000)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"incomeInfo\"]/div[2]/div[3]/div/div/form/div[1]/div[1]/select")));
         WebElement CrestLogin = (new WebDriverWait(driver1, 1000)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Image144\"]")));
         driver1.findElement(By.xpath("//*[@id=\"Image144\"]")).click();
         Thread.sleep(1000); 
        
        //Todo username: aboutlastnight pass:123456$
        
        
        CrestLink = driver1.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div/span")).getText();
        System.out.println(CrestLink);
        }catch (InterruptedException ex) {
         Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void AcimaGetLink(WebDriver driver2) {
       
       try {
            WebElement AcimaLink = (new WebDriverWait(driver2, 1000)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main_nav_collapse\"]/ul[1]/li[6]/a/span")));
            Thread.sleep(1000);
            driver2.findElement(By.xpath("//*[@id=\"main_nav_collapse\"]/ul[1]/li[6]/a/span")).click();
            
            WebElement AcimaLink1 = (new WebDriverWait(driver2, 1000)).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[1]")));
            
                                                       
            if(driver2.findElements(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[2]/div/div/div[2]/table/tbody/tr[2]/td[1]")).size() > 0){
                //Try to see if there is more then one store, if there is more then one store ask user. If there isn't more then on select the first box
            //Just make a lot of boxes in case they have a bunch of stores
            
            String[] options =  new String[11];
             int i=1; 
            for(i = 1; i < 10; i++){
                
                System.out.println(driver2.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[2]/div/div/div[2]/table/tbody/tr["+i+"]/td[1]")).getText());
                  options[i] = driver2.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[2]/div/div/div[2]/table/tbody/tr["+i+"]/td[1]")).getText();
                 //   if(driver2.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[2]/div/div/div[2]/table/tbody/tr["+i+"]/td[1]")).getText()==)
                 
                 System.out.println(driver2.findElements(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[2]/div/div/div[2]/table/tbody/tr["+(i+1)+"]/td[1]")).size() > 0);
                 if(!(driver2.findElements(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[2]/div/div/div[2]/table/tbody/tr["+(i+1)+"]/td[1]")).size() > 0)){
                 break;
                 }
                 
                }
            
         
            //Ask user
         
        ImageIcon icon = new ImageIcon("AutoFiller/Acimalogo.png"); 
        // simpleEnabled.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AutoFiller/Acimalogo.png"))); // NOI18N
        String n = (String)JOptionPane.showInputDialog(null, "Which store is this?","Trying to find this?", JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
        System.out.println(n); 
        
        for(i = 1; i < 10; i++){
         if(options[i]== n){
          SimpleLink = driver2.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[2]/div/div/div[2]/table/tbody/tr["+i+"]/td[3]/a[3]")).getAttribute("href");
             System.out.println(SimpleLink);
         }
        } 
        
            }else{
             SimpleLink = driver2.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[3]/a[3]")).getAttribute("href");
             
             System.out.println(SimpleLink);
            }
           
       } catch (InterruptedException ex) {
           Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
       }
         
    }

    private void SnapGetLink(WebDriver driver3) {
       // WebElement SnapLogin = (new WebDriverWait(driver3, 10000)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"incomeInfo\"]/div[2]/div[3]/div/div/form/div[1]/div[1]/select")));
       
       System.out.println("This is the snap logins :" + SnapUsername + " :" + SnapPassword );
         new WebDriverWait(driver3,1000).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"login\"]/div/div/div/div/div/div/div[2]/div/div[1]/form/div[1]/input")));
      
       
        SnapUsername = driver3.findElement(By.xpath("//*[@id=\"login\"]/div/div/div/div/div/div/div[2]/div/div[1]/form/div[1]/input")).getAttribute("value");
        SnapPassword = driver3.findElement(By.xpath("//*[@id=\"login\"]/div/div/div/div/div/div/div[2]/div/div[1]/form/div[2]/input")).getAttribute("value");
       new WebDriverWait(driver3,10000).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"login\"]/div/div/div/div/div/div/div[2]/div/div[1]/div/img")));
        
        System.out.println("This is the snap logins :" + SnapUsername + " :" + SnapPassword );
        if(SnapUsername == "" || SnapPassword == ""){
        SnapGetLink(driver3);
        
        }
        
    }

    private void MerchantGetLink(WebDriver driver4) {
        
       try { 
        WebElement MerchantLinkElement = new WebDriverWait(driver4,1000).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ManageLinkLi\"]/a")));
       
           Thread.sleep(1000);
        if(driver4.findElement(By.xpath("//*[@id=\"sidebar_main_toggle\"]")).isDisplayed()){
            Thread.sleep(500);
        driver4.findElement(By.xpath("//*[@id=\"sidebar_main_toggle\"]")).click();
        }
        //*[@id="sidebar_main_toggle"]
        //*[@id="ManageLinkLi"]/a
        Thread.sleep(500);
        driver4.findElement(By.xpath("//*[@id=\"ManageLinkLi\"]/a")).click(); 
      Thread.sleep(500);
      driver4.findElement(By.xpath("//*[@id=\"GenerateWebsiteLinkLink\"]")).click();
      Thread.sleep(500);
      driver4.findElement(By.xpath("//*[@id=\"ManageLinkLi\"]/a")).click();  
      
         MerchantsLink = driver4.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_LinkDiv\"]")).getAttribute("value");
         
      System.out.println("!!@# ");   
      System.out.println(MerchantsLink);
       } catch (InterruptedException ex) {
           Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
       }
        
        
    }

    private void OkinusGetLink(WebDriver driver5) {
        
          //Ask user
         
        //ImageIcon icon = new ImageIcon("AutoFiller/Acimalogo.png"); 
        // simpleEnabled.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AutoFiller/Acimalogo.png"))); // NOI18N
        String O = (String)JOptionPane.showInputDialog(null, "<html> What is the<b> Okinus </b> link?","Trying to find this?", JOptionPane.QUESTION_MESSAGE);
        System.out.println(O); 
        
        OkinusLink = O;
         
    }

    private void ProgressiveGetLink() {
        //jokersaudiocorp
        //leasing1
         
            //Ask user
         
        //ImageIcon icon = new ImageIcon("AutoFiller/Acimalogo.png"); 
        // simpleEnabled.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AutoFiller/Acimalogo.png"))); // NOI18N
        String n = (String)JOptionPane.showInputDialog(null, "<html> What is the Progressive <b> approve me link </b>?</html>","Trying to find this?", JOptionPane.QUESTION_MESSAGE);
        System.out.println(n); 
        
        ProgressiveLink = n;
        
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    private void WestCreekGetLink(WebDriver driver7) {
        //navRedir('WCF_APP.PGM?clid=122&pdno=abfgreenville&return=kdlnlist.pgm&fromkdlr=Y','nav3');
        //https://sb7.compass-technologies.com:8158/kwik/KDMAIN.pgm#
        //https://sb7.compass-technologies.com:8158/kwik/WCF_APP.PGM?clid=122&pdno=abfgreenville&return=kdlnlist.pgm&fromkdlr=Y
        //https://sb7.compass-technologies.com:8158/kwik/wcf_app.pgm?fromweb=y&wdlr=abfgreenville&mdlrl=1
        String firstHalfLink = "https://sb7.compass-technologies.com:8158/kwik/";
      try {
        WebElement WestCreekLink = (new WebDriverWait(driver7, 1000)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"nav3\"]")));
    
           Thread.sleep(1000);
         
        WestLink = driver7.findElement(By.xpath("//*[@id=\"nav3\"]")).getAttribute("onclick");
        String[] result = WestLink.split("'");
        
        WestLink = firstHalfLink + result[1];
        
           System.out.println(WestLink);
       } catch (InterruptedException ex) {
           Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
       } 
    }
}
