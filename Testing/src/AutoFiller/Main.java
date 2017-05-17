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
 * @author MohammedPC
 */
public class Main extends javax.swing.JFrame implements Runnable{

 
        
   public static String firstName;    
   public static String middleName;      
   public static String lastName;     
   public static String streetAddress;     
   public static String unitN;     
   public static String cityN;     
   public static String stateN;     
   public static String zipN;    
   public static String addYears;    
   public static String addMonths;    
   public static boolean Rent; 
   public static boolean Own;      
   public static String ssN;
   public static String dOb; 
   public static int dObM; 
   public static int dObD; 
   public static int dObY; 
   public static String stateK; 
   public static int stateKMP; 
   public static String dlN;   
   public static String phoneN1;     
   public static String phoneN2;     
   public static String emailN;    
   public static String routingNumber;     
   public static String accountNumber;     
   public static String bankName;     
   public static String bankCity;     
   public static String bankState;     
   //public static String checkingN;     
   public static String checkingBox;     
   public static String recentOpen;     
   public static String reference1;     
   public static String reference1Last;     
   public static String refPhone1;     
   public static String reference2;    
   public static String reference2Last;     
   public static String refPhone2;     
   public static String employerN;     
   public static String employerPhone;     
   public static String incomeN;     
   public static String hireD;    
   public static String hireDate;
   public static String recentPay;    
   public static String nextPay;    
   public static String Pay;    
   public static int PayMP;    
   public static String employmentPayment;    
   public static String superName;    
   public static String workPhone;    
   public static String postHold;    
   //public static String startDate;  
   public static String yearsAtJob;
   public static String monthsAtJob;
   public static String monthsAtJobCR;
   public static String yearAccountOpen;
   public static String monthAccountOpen;
   public static String cardHolderName;
   public static String expYear;
   public static int expYearMP;
   public static String expMonth;
   public static int expMonthMP;   
   public static String cardNumber;
   public static String Title;
   public static String cardCode;
   public static String CrestChecker;
   public static String RelationRef;
   public static String RelationRef1;
   public static boolean uRent;
   public static boolean uOwn;   
   public static String employerState;
   public static boolean ProgressBar = true;
   
   public static int odd1 = 0;
   public static int odd2 = 0;
   public static int odd3 = 0;
   public static int odd4 = 0;
   public static int odd5 = 0;
   public static int odd6 = 0;
   public static int odd7 = 0;
   public static int odd8 = 0;
   
   public static int year = Calendar.getInstance().get(Calendar.YEAR);
   public static int month = Calendar.getInstance().get(Calendar.MONTH);
   public static int today = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
   public static int todayM = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
   
   public static String CrestLink = "https://dealers.crestfinancial.com/Applicants/CreateApplicant/furniture_place_temple_hills";
   public static String SimpleLink = "https://portal.acimacredit.com/customer/leases/new?location_id=10F13B";//AcimaCredit
   public static String SnapLink = "https://merchant.snapfinance.com/#/dashboard";//https://merchant.snapfinance.com/#/dashboard
   public static String SnapUsername="furnplacebranch";
   public static String SnapPassword="Rayan2014";
   public static String ProgressiveLink = "https://approve.me/s/rayanfurnituremd/56817";//Approve.me
   public static String MerchantsLink = "";
   public static String TempoeLink = "";
   public static String OkinusLink = "";
   public static String WestLink = "";
   

 
   public int toggleLang = 0;
    /**
     * Creates new form Main
     */
    public Main() {
        Login newLogin = new Login();
        initComponents(); 
        this.setVisible(false);
        
        if("".equals(CrestLink) || "".equals(SimpleLink) || "".equals(SnapUsername) || "".equals(SnapPassword) || "".equals(ProgressiveLink) ||  "".equals(MerchantsLink) || "".equals(TempoeLink) ||  "".equals(OkinusLink) || "".equals(WestLink)){
            System.out.print("we made it");
          /*  
           SignUp pageSignUp = new SignUp();
           pageSignUp.setVisible(true); 
           */
        }
        
        if(CrestLink == ""){crestEnabled.setVisible(false);}else{crestEnabled.setVisible(true);}
        if(SimpleLink == ""){simpleEnabled.setVisible(false);}else{simpleEnabled.setVisible(true);}
        if(SnapLink == ""){snapEnabled.setVisible(false);}else{snapEnabled.setVisible(true);}
        if(ProgressiveLink == ""){progressiveEnabled.setVisible(false);}else{progressiveEnabled.setVisible(true);}
        if(OkinusLink == ""){okinusEnabled.setVisible(false);}else{okinusEnabled.setVisible(true);}
        if(MerchantsLink == ""){merchantsEnabled.setVisible(false);}else{merchantsEnabled.setVisible(true);}
        if(WestLink == ""){westEnabled.setVisible(false);}else{westEnabled.setVisible(true);}
        if(TempoeLink == ""){tempoeEnabled.setVisible(false);}else{tempoeEnabled.setVisible(true);}
        
       debugAutoFill.setVisible(true);  
       LangToggle.setVisible(true);  
        
    }

    /** 
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jSeparator3 = new javax.swing.JSeparator();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel7 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel41 = new javax.swing.JLabel();
        employer = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        supername = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        posthold = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        workphone = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        incomeType = new javax.swing.JComboBox<>();
        jLabel42 = new javax.swing.JLabel();
        employerphone = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        hireDateMonth = new javax.swing.JComboBox<>();
        hireDateYear = new javax.swing.JComboBox<>();
        jLabel53 = new javax.swing.JLabel();
        pay = new javax.swing.JComboBox<>();
        jLabel51 = new javax.swing.JLabel();
        lastPaydayMonth = new javax.swing.JComboBox<>();
        lastPaydayDay = new javax.swing.JComboBox<>();
        lastPaydayYear = new javax.swing.JComboBox<>();
        jLabel52 = new javax.swing.JLabel();
        nextPaydayMonth = new javax.swing.JComboBox<>();
        nextPaydayDay = new javax.swing.JComboBox<>();
        nextPaydayYear = new javax.swing.JComboBox<>();
        jLabel44 = new javax.swing.JLabel();
        income = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        debugAutoFill = new javax.swing.JButton();
        clearFields = new javax.swing.JButton();
        tempoeEnabled = new javax.swing.JToggleButton();
        merchantsEnabled = new javax.swing.JToggleButton();
        okinusEnabled = new javax.swing.JToggleButton();
        progressiveEnabled = new javax.swing.JToggleButton();
        snapEnabled = new javax.swing.JToggleButton();
        simpleEnabled = new javax.swing.JToggleButton();
        crestEnabled = new javax.swing.JToggleButton();
        recentopen = new javax.swing.JCheckBox();
        checkingbox = new javax.swing.JCheckBox();
        yearExp = new javax.swing.JComboBox<>();
        jLabel38 = new javax.swing.JLabel();
        monthsaccountopen = new javax.swing.JComboBox<>();
        jLabel36 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        yearsaccountopen = new javax.swing.JComboBox<>();
        jLabel39 = new javax.swing.JLabel();
        monthExp = new javax.swing.JComboBox<>();
        cardnumber = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        cardholdername = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        accountnumber = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        bankstate = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        bankcity = new javax.swing.JTextField();
        bankname = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        routing = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        own = new javax.swing.JRadioButton();
        rent = new javax.swing.JRadioButton();
        addressMonths = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        addressYears = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        city = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        states = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        zip = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        phone1 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        phone2 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        dobMonth = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        dobDay = new javax.swing.JComboBox<>();
        ref4 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        ref5 = new javax.swing.JTextField();
        refphone2 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        refphone1 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        ref3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ref1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        dlstate = new javax.swing.JComboBox<>();
        dobYear = new javax.swing.JComboBox<>();
        dl = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        ssn = new javax.swing.JFormattedTextField();
        jLabel19 = new javax.swing.JLabel();
        unit = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        streetaddress = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        firstname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        middlename = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        lastname = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        title = new javax.swing.JComboBox<>();
        csvCode = new javax.swing.JTextField();
        cardCode1 = new javax.swing.JLabel();
        LangToggle = new javax.swing.JToggleButton();
        westEnabled = new javax.swing.JToggleButton();
        RelationShipComboBox = new javax.swing.JComboBox<>();
        RelationShipComboBox1 = new javax.swing.JComboBox<>();
        dlstate1 = new javax.swing.JComboBox<>();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 945, Short.MAX_VALUE)
                .addContainerGap())
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1067, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jInternalFrame1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AutoFiller/Employement.png"))); // NOI18N

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(201, 174, 30));
        jLabel41.setText("Employer Name");

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(201, 174, 30));
        jLabel46.setText("Supervisor Name");

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(201, 174, 30));
        jLabel47.setText("Position Held");

        posthold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postholdActionPerformed(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(201, 174, 30));
        jLabel45.setText("Work Phone #");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(201, 174, 30));
        jLabel8.setText("Income Type");

        incomeType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Direct Deposit from Employer", "Paychecks from Employer", "Self-Employment", "Social Security", "Long Term Disability", "Military", "Alimony" }));
        incomeType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incomeTypeActionPerformed(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(201, 174, 30));
        jLabel42.setText("Phone (Land Line)");

        employerphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employerphoneActionPerformed(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(201, 174, 30));
        jLabel43.setText("Hire Date");

        hireDateMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        hireDateYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000" }));
        hireDateYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hireDateYearActionPerformed(evt);
            }
        });

        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(201, 174, 30));
        jLabel53.setText("Pay Frequency");

        pay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Weekly", "Bi weekly", "Twice Monthly", "Monthly" }));
        pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payActionPerformed(evt);
            }
        });

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(201, 174, 30));
        jLabel51.setText("Last Payday ");

        lastPaydayMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        lastPaydayMonth.setSelectedIndex(9);
        lastPaydayMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastPaydayMonthActionPerformed(evt);
            }
        });

        lastPaydayDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        lastPaydayYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2017" }));
        lastPaydayYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastPaydayYearActionPerformed(evt);
            }
        });

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(201, 174, 30));
        jLabel52.setText("Next Payday ");

        nextPaydayMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        nextPaydayMonth.setSelectedIndex(10);

        nextPaydayDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        nextPaydayYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2017" }));

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(201, 174, 30));
        jLabel44.setText("Monthly Income");

        income.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incomeActionPerformed(evt);
            }
        });

        submitButton.setBackground(new java.awt.Color(0, 255, 51));
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        debugAutoFill.setBackground(new java.awt.Color(255, 255, 0));
        debugAutoFill.setText("AutoFill");
        debugAutoFill.setMaximumSize(new java.awt.Dimension(65, 23));
        debugAutoFill.setMinimumSize(new java.awt.Dimension(65, 23));
        debugAutoFill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                debugAutoFillActionPerformed(evt);
            }
        });

        clearFields.setBackground(new java.awt.Color(255, 51, 51));
        clearFields.setText("Clear");
        clearFields.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearFieldsActionPerformed(evt);
            }
        });

        tempoeEnabled.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AutoFiller/tempoe_logo-1-150.png"))); // NOI18N
        tempoeEnabled.setMargin(new java.awt.Insets(14, 14, 14, 14));
        tempoeEnabled.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tempoeEnabledActionPerformed(evt);
            }
        });

        merchantsEnabled.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AutoFiller/merchantPreferred.png"))); // NOI18N
        merchantsEnabled.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                merchantsEnabledActionPerformed(evt);
            }
        });

        okinusEnabled.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AutoFiller/okinus.png"))); // NOI18N
        okinusEnabled.setMargin(new java.awt.Insets(14, 14, 14, 14));
        okinusEnabled.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okinusEnabledActionPerformed(evt);
            }
        });

        progressiveEnabled.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AutoFiller/progressive.png"))); // NOI18N
        progressiveEnabled.setMargin(new java.awt.Insets(14, 14, 14, 14));
        progressiveEnabled.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                progressiveEnabledActionPerformed(evt);
            }
        });

        snapEnabled.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AutoFiller/Snap-150.png"))); // NOI18N
        snapEnabled.setMargin(new java.awt.Insets(14, 14, 14, 14));
        snapEnabled.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snapEnabledActionPerformed(evt);
            }
        });

        simpleEnabled.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AutoFiller/Acimalogo.png"))); // NOI18N
        simpleEnabled.setMargin(new java.awt.Insets(14, 14, 14, 14));
        simpleEnabled.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpleEnabledActionPerformed(evt);
            }
        });

        crestEnabled.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AutoFiller/Crest.png"))); // NOI18N
        crestEnabled.setMargin(new java.awt.Insets(14, 14, 14, 14));
        crestEnabled.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crestEnabledActionPerformed(evt);
            }
        });

        recentopen.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        recentopen.setForeground(new java.awt.Color(201, 174, 30));
        recentopen.setText("Open at least 90 days");
        recentopen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recentopenActionPerformed(evt);
            }
        });

        checkingbox.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        checkingbox.setForeground(new java.awt.Color(201, 174, 30));
        checkingbox.setText("Is this a checking account");
        checkingbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkingboxActionPerformed(evt);
            }
        });

        yearExp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));
        yearExp.setSelectedIndex(2);
        yearExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearExpActionPerformed(evt);
            }
        });

        jLabel38.setBackground(new java.awt.Color(0, 0, 0));
        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(201, 174, 30));
        jLabel38.setText("Exp Year ");

        monthsaccountopen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0 ", "1 Mon", "2 Mon", "3 Mon", "4 Mon", "5 Mon", "6 Mon", "7 Mon", "8 Mon", "9 Mon", "10 Mon", "11 Mon" }));
        monthsaccountopen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthsaccountopenActionPerformed(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(201, 174, 30));
        jLabel36.setText("Months Account Open ");

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(201, 174, 30));
        jLabel35.setText("Years Account Open ");

        yearsaccountopen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1 Yr", "2 Yrs", "3 Yrs", "4 Yrs", "5+ Yrs" }));
        yearsaccountopen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearsaccountopenActionPerformed(evt);
            }
        });

        jLabel39.setBackground(new java.awt.Color(0, 0, 0));
        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(201, 174, 30));
        jLabel39.setText("Exp Month ");

        monthExp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }));

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(201, 174, 30));
        jLabel40.setText("Card Number");

        cardholdername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardholdernameActionPerformed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(201, 174, 30));
        jLabel37.setText("Card Holder Name");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(201, 174, 30));
        jLabel30.setText("Account #");

        accountnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountnumberActionPerformed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(201, 174, 30));
        jLabel33.setText("Bank State");

        bankstate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bankstateActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(201, 174, 30));
        jLabel32.setText("Bank City");

        bankcity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bankcityActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(201, 174, 30));
        jLabel31.setText("Bank Name");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(201, 174, 30));
        jLabel29.setText("Routing #");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AutoFiller/checking.png"))); // NOI18N

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(201, 174, 30));
        jLabel25.setText("Email Address");

        buttonGroup1.add(own);
        own.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        own.setForeground(new java.awt.Color(201, 174, 30));
        own.setText("Own");
        own.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ownActionPerformed(evt);
            }
        });

        buttonGroup1.add(rent);
        rent.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rent.setForeground(new java.awt.Color(201, 174, 30));
        rent.setSelected(true);
        rent.setText("Rent");
        rent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentActionPerformed(evt);
            }
        });

        addressMonths.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 Mon", "2 Mon", "3 Mon", "4 Mon", "5 Mon", "6 Mon", "7 Mon", "8 Mon", "9 Mon", "10 Mon", "11 Mon" }));
        addressMonths.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressMonthsActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(201, 174, 30));
        jLabel18.setText("Months ");

        addressYears.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 Yr", "2 Yrs", "3 Yrs", "4 Yrs", "5 Yrs", "6 Yrs", "7 Yrs", "8 Yrs", "9 Yrs", "10+ Yrs" }));
        addressYears.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressYearsActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(201, 174, 30));
        jLabel17.setText("Years ");

        jLabel4.setBackground(new java.awt.Color(204, 204, 0));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(201, 174, 30));
        jLabel4.setText("Time at this address");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(201, 174, 30));
        jLabel14.setText("City");

        states.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AK", "AL", "AR", "AZ", "CA", "CO", "CT", "DC", "DE", "FL", "GA", "HI", "IA", "ID", "IL", "IN", "KS", "KY", "LA", "MA", "MD", "ME", "MI", "MN", "MO", "MS", "MT", "NC", "ND", "NE", "NH", "NJ", "NM", "NV", "NY", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VA", "VT", "WA", "WI", "WV", "WY" }));
        states.setSelectedIndex(10);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(201, 174, 30));
        jLabel15.setText("State");

        zip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zipActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(201, 174, 30));
        jLabel16.setText("Zip");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(201, 174, 30));
        jLabel23.setText("Main Phone");

        phone2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phone2ActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(201, 174, 30));
        jLabel24.setText("Alternate Phone");

        dobMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(201, 174, 30));
        jLabel20.setText("Date of Birth ");

        dobDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        ref4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ref4ActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(201, 174, 30));
        jLabel27.setText("First Name     Last Name");

        ref5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ref5ActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(201, 174, 30));
        jLabel28.setText("Phone #");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(201, 174, 30));
        jLabel26.setText("Phone # ");

        ref3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ref3ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(201, 174, 30));
        jLabel3.setText("First Name     Last Name");

        ref1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ref1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(201, 174, 30));
        jLabel6.setText("Personal References");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AutoFiller/GFSLOGO.png"))); // NOI18N

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(201, 174, 30));
        jLabel21.setText("State");

        dlstate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AK", "AL", "AR", "AZ", "CA", "CO", "CT", "DC", "DE", "FL", "GA", "HI", "IA", "ID", "IL", "IN", "KS", "KY", "LA", "MA", "MD", "ME", "MI", "MN", "MO", "MS", "MT", "NC", "ND", "NE", "NH", "NJ", "NM", "NV", "NY", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VA", "VT", "WA", "WI", "WV", "WY" }));

        dobYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921", "1920", "1919", "1918", "1917", "1916", "1915", "1914", "1913", "1912", "1911", "1910", "1909", "1908", "1907", "1906", "1905", "1904", "1903", "1902", "1901", "1900" }));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(201, 174, 30));
        jLabel22.setText("Driver License Number");

        try {
            ssn.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(201, 174, 30));
        jLabel19.setText("SSN/ITIN ");

        unit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unitActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(201, 174, 30));
        jLabel13.setText("Unit/Apt#");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(201, 174, 30));
        jLabel12.setText("Street Address");

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(201, 174, 30));
        jLabel34.setText("Title");

        firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnameActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(201, 174, 30));
        jLabel9.setText("First Name");

        middlename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                middlenameActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(201, 174, 30));
        jLabel10.setText("Middle Name");

        lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(201, 174, 30));
        jLabel11.setText("Last Name");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AutoFiller/application.png"))); // NOI18N

        title.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mr", "Ms", "Mrs" }));

        csvCode.setText("321");
        csvCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                csvCodeActionPerformed(evt);
            }
        });

        cardCode1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cardCode1.setForeground(new java.awt.Color(201, 174, 30));
        cardCode1.setText("Security Code");

        LangToggle.setText("English");
        LangToggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LangToggleActionPerformed(evt);
            }
        });

        westEnabled.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AutoFiller/wcf_logo-150.png"))); // NOI18N
        westEnabled.setMargin(new java.awt.Insets(14, 14, 14, 14));
        westEnabled.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                westEnabledActionPerformed(evt);
            }
        });

        RelationShipComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aunt", "Uncle", "Brother", "Sister", "Grand Parent", "Parent", "Son", "Daughter", "Wife", "Husband" }));

        RelationShipComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aunt", "Uncle", "Brother", "Sister", "Grand Parent", "Parent", "Son", "Daughter", "Wife", "Husband" }));

        dlstate1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AK", "AL", "AR", "AZ", "CA", "CO", "CT", "DC", "DE", "FL", "GA", "HI", "IA", "ID", "IL", "IN", "KS", "KY", "LA", "MA", "MD", "ME", "MI", "MN", "MO", "MS", "MT", "NC", "ND", "NE", "NH", "NJ", "NM", "NV", "NY", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VA", "VT", "WA", "WI", "WV", "WY" }));

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(201, 174, 30));
        jLabel48.setText("Employer State");

        jLabel49.setForeground(new java.awt.Color(255, 0, 0));
        jLabel49.setText("Need Help? Call:  904-580-4283");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(LangToggle)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(287, 287, 287))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(routing, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(jLabel29)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel30)
                                            .addComponent(accountnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(bankname, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel31))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(bankcity, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel32))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel33)
                                            .addComponent(bankstate, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cardholdername, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel37))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel35)
                                            .addComponent(yearsaccountopen, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(monthsaccountopen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(jLabel36)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cardnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel40))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(monthExp, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel38)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cardCode1))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(yearExp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(csvCode, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(recentopen)
                                    .addComponent(checkingbox)))
                            .addComponent(jSeparator5)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabel41, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(employer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(posthold, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(4, 4, 4)
                                                    .addComponent(jLabel47)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(employerphone, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel42))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel43)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(hireDateMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(hireDateYear, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(income, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(dlstate1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel49)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(supername, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(workphone, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel45))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel8)
                                                        .addComponent(incomeType, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(pay, 0, 1, Short.MAX_VALUE)
                                                        .addComponent(jLabel53))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel51)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(lastPaydayMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(lastPaydayDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(lastPaydayYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel52)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(nextPaydayMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(nextPaydayDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(nextPaydayYear, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(clearFields, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(debugAutoFill, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(streetaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel12))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel13)
                                                        .addComponent(unit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel14)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addGap(156, 156, 156)
                                                            .addComponent(jLabel15)))
                                                    .addGap(65, 65, 65)
                                                    .addComponent(jLabel16))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(24, 24, 24)
                                                    .addComponent(states, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(27, 27, 27)
                                                    .addComponent(zip, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(ssn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel20)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(dobMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(dobDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(dobYear, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(phone1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel23))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel24)
                                                        .addComponent(phone2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel34)
                                                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel9))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(middlename, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel10))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel11)
                                                .addComponent(lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(dl, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel21)
                                                .addComponent(dlstate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel17)
                                                .addComponent(addressYears, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel18)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(addressMonths, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(rent)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(own)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel25)
                                                .addComponent(email))
                                            .addGap(18, 18, 18)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(185, 185, 185)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel3)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(ref1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ref3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel26)
                                            .addComponent(refphone1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(RelationShipComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(RelationShipComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(ref4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(ref5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(jLabel27)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel28)
                                            .addComponent(refphone2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(tempoeEnabled))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(snapEnabled)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(crestEnabled)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(progressiveEnabled)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(westEnabled)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(simpleEnabled)
                                .addComponent(merchantsEnabled))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(okinusEnabled)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(LangToggle, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel2))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel34)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(firstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(middlename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dlstate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel13))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(streetaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(unit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel19)
                                            .addComponent(jLabel20))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(dobMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(dobDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(dobYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(ssn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(1, 1, 1)))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel16))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(zip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(states, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel23)
                                            .addComponent(jLabel24))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(phone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(phone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel17)
                                            .addComponent(jLabel18))
                                        .addGap(1, 1, 1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel4)
                                            .addComponent(rent)
                                            .addComponent(own)
                                            .addComponent(addressMonths, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(addressYears, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel25)
                                        .addGap(1, 1, 1)
                                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel26)
                                        .addGap(10, 10, 10)
                                        .addComponent(refphone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(44, 44, 44))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel3)
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(ref1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ref3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(RelationShipComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel28)
                                        .addGap(10, 10, 10)
                                        .addComponent(refphone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel27)
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(ref4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ref5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(RelationShipComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)))
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(recentopen)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkingbox))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel30)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel29)
                                    .addGap(15, 15, 15)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(routing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(accountnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(10, 10, 10)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel32)
                                            .addComponent(jLabel33))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel40)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cardnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel31)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(bankname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(bankcity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(bankstate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(29, 29, 29)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(cardholdername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(monthsaccountopen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(yearsaccountopen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel37)
                                            .addComponent(jLabel35)
                                            .addComponent(jLabel36)))
                                    .addGap(6, 6, 6)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel39)
                                        .addComponent(jLabel38)
                                        .addComponent(cardCode1))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(yearExp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(monthExp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(csvCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel48)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dlstate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel41)
                                                .addComponent(jLabel47))
                                            .addComponent(jLabel44, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(employer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(posthold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(employerphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(hireDateMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(hireDateYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(income, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel42)
                                        .addComponent(jLabel43)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(supername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel45)
                                                .addComponent(jLabel8)
                                                .addComponent(jLabel46))
                                            .addGap(2, 2, 2)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(workphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(incomeType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel53)
                                                .addComponent(jLabel51)
                                                .addComponent(jLabel52))
                                            .addGap(26, 26, 26))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(pay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nextPaydayMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nextPaydayDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nextPaydayYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lastPaydayMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lastPaydayDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lastPaydayYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(clearFields, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(debugAutoFill, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel49))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(crestEnabled, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(okinusEnabled)
                        .addGap(10, 10, 10)
                        .addComponent(merchantsEnabled)
                        .addGap(10, 10, 10)
                        .addComponent(simpleEnabled, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(progressiveEnabled, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(westEnabled)
                        .addGap(10, 10, 10)
                        .addComponent(snapEnabled, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(tempoeEnabled)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void yearExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearExpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearExpActionPerformed

    private void monthsaccountopenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthsaccountopenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthsaccountopenActionPerformed

    private void yearsaccountopenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearsaccountopenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearsaccountopenActionPerformed

    private void debugAutoFillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_debugAutoFillActionPerformed
        // TODO add your handling code here:
        // ASDF
        // Jack Johnson Bauer
        firstname.setText("Jack");
        middlename.setText("Johnson");
        lastname.setText("Bauer");
        dl.setText(getRandomNumber(9));
        ssn.setText(getRandomNumber(9));
        dobYear.setSelectedIndex(25);
        // dob.setText(getRandomMonth() + getRandomDay() + getRandomYear(true, 70, 90));
        // 10 Beaver Ridge Ave. Roswell, GA 30075
        streetaddress.setText("25 Park Pl");
        city.setText("Atlanta");
        states.setSelectedIndex(10);
        
        
        zip.setText("30303");
        // addyears.setText(getRandomYear());
        // addmonths.setText(getRandomMonth());
        addressYears.setSelectedIndex((int)r.nextInt(6));
        addressMonths.setSelectedIndex((int)r.nextInt(6));
        email.setText("dukotufil@cartelera.org");
        phone1.setText("770" + randInt(300, 900) + getRandomNumber(4));
        phone2.setText("770" + randInt(300, 900) + getRandomNumber(4));
        // Jonah Smith
        ref1.setText("Jonah");
        ref3.setText("Smith");
        refphone1.setText("770" + randInt(300, 900) + getRandomNumber(4));
        ref4.setText("Jill");
        ref5.setText("Smith");
        refphone2.setText("770" + randInt(300, 900) + getRandomNumber(4));
        routing.setText("061000052");
        accountnumber.setText(getRandomNumber(10));
        cardholdername.setText("Jack Johnson");
        // yearaccountopen.setText("0" + getRandomNumber(1));
        // monthsaccountopen.setText("0" + getRandomNumber(1));
        cardnumber.setText("4111111111111111");
        // expmonth.setText("10");
        // expyear.setText("18");
        bankname.setText("Bank of America");
        bankcity.setText("Atlanta");
        bankstate.setText("Georgia");
        employer.setText("SUR");
        posthold.setText("Janitor");
        employerphone.setText("770" + randInt(300, 900) + getRandomNumber(4));
        // hire.setText(getRandomMonth() + "/" + getRandomDay());
        income.setText("2"+getRandomNumber(3));
         yearsaccountopen.setSelectedIndex((int)r.nextInt(6));
         monthsaccountopen.setSelectedIndex((int)r.nextInt(12)); 
         //monthsatjob.setText(getRandomNumber(1));
        supername.setText("Jeb Jackson");
        workphone.setText("770" + randInt(300, 900) + getRandomNumber(4));
        dlstate1.setSelectedIndex(randInt(1,10));
        uRent = true;
        
        Calendar tempDate = Calendar.getInstance(); //getting current date
        //int dayOfYear = Integer.parseInt(getRandomDay());
       // tempDate.set(Calendar.DAY_OF_YEAR, dayOfYear);
        tempDate.set(Calendar.DAY_OF_WEEK, Calendar.FRIDAY);  //getting friday in current week     
        for(int i=0;i<7;i++){    //going back 1 week 
            tempDate.roll(Calendar.DATE, false);
        }        
        //tempDate.set(Calendar.WEEK_OF_YEAR,tempDate.get(Calendar.WEEK_OF_YEAR)-1);
        System.out.println(tempDate.getTime());        
        //int tempDay = (int)r.nextInt(15);
        int tempDay = tempDate.get(Calendar.DAY_OF_MONTH);//getting the day
        int tempDayIndex = tempDay -1;    //setting index for dropdown
        int tempMonthIndex = tempDate.get(Calendar.MONTH);  //getting index for month      
        lastPaydayDay.setSelectedIndex(tempDayIndex);
        lastPaydayMonth.setSelectedIndex(tempMonthIndex);
        lastPaydayYear.setSelectedIndex(0);
        // recentpay.setText("09" + "30" + "2016");(int)r.nextInt(15)+today
//        nextPaydayMonth.setSelectedIndex((int)r.nextInt(2) + month);
        
        Calendar tempDate1 = Calendar.getInstance(); //getting current date
        tempDate1.set(Calendar.DAY_OF_WEEK, Calendar.FRIDAY);//getting friday in current week
        System.out.println(tempDate1.getTime());  
        tempDay = tempDate1.get(Calendar.DAY_OF_MONTH);
        tempDayIndex = tempDay -1;
        tempMonthIndex = tempDate1.get(Calendar.MONTH);  
          nextPaydayMonth.setSelectedIndex(tempMonthIndex);
//        int tempIndex =tempDayIndex+7;
//        if(tempIndex > 30){
//        tempIndex = 15;
//        }
        nextPaydayDay.setSelectedIndex(tempDayIndex);
        nextPaydayYear.setSelectedIndex(0);

/*
        lastPaydayDay.setSelectedIndex((int)r.nextInt(15));
        lastPaydayMonth.setSelectedIndex(9);
        lastPaydayYear.setSelectedIndex(1);
        // recentpay.setText("09" + "30" + "2016");(int)r.nextInt(15)+today
        nextPaydayMonth.setSelectedIndex((int)r.nextInt(2) + month);
        nextPaydayDay.setSelectedIndex((int)r.nextInt(15)+today);
        nextPaydayYear.setSelectedIndex(1);
  */      
        
        
        hireDateMonth.setSelectedIndex((int)r.nextInt(11));
        hireDateYear.setSelectedIndex(1);
// nextpay.setText("10" + "07" + "2016");
        dlstate.setSelectedIndex(r.nextInt(49));
       // Title.set
    }//GEN-LAST:event_debugAutoFillActionPerformed

    private void payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_payActionPerformed

    private void ref5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ref5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ref5ActionPerformed

    private void ref4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ref4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ref4ActionPerformed

    private void ref3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ref3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ref3ActionPerformed
    private String[] stateToFullState = {"Alaska", "Alabama", "Arkansas", "Arizona", "California", "Colorado", "Connecticut", "District of Columbia",  "Delaware", "Florida", "Georgia", "Hawaii", "Iowa", "Idaho", "Illinois", "Indiana",  "Kansas", "Kentucky", "Louisiana", "Massachusetts",  "Maryland", "Maine", "Michigan", "Minnesota", "Missouri",  "Mississippi", "Montana", "North Carolina", "North Dakota", "Nebraska", "New Hampshire", "New Jersey", "New Mexico", "Nevada", "New York", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Virginia", "Vermont", "Washington", "Wisconsin", "West Virginia", "Wyoming"};
    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        
        // TODO add your handling code here:
        firstName = this.firstname.getText();
        middleName = this.middlename.getText();
        lastName = this.lastname.getText();
        streetAddress = this.streetaddress.getText();
        unitN = this.unit.getText();
        cityN = this.city.getText();
        stateN = stateToFullState[states.getSelectedIndex()];
        zipN = this.zip.getText();
        addYears = addressYears.getSelectedIndex() < 9 ? 
                "0" + (addressYears.getSelectedIndex() + 1) : 
                "" + (addressYears.getSelectedIndex() + 1);
        addMonths = addressMonths.getSelectedIndex() < 9 ? 
                "0" + (addressMonths.getSelectedIndex() + 1) : 
                "" + (addressMonths.getSelectedIndex() + 1);
        Rent = this.rent.isSelected();
        Own = this.own.isSelected();
        ssN = this.ssn.getText();
        dOb = dobMonth.getSelectedItem().toString() + 
                dobDay.getSelectedItem().toString() + 
                dobYear.getSelectedItem().toString();
        dObM = dobMonth.getSelectedIndex();
        dObD = dobDay.getSelectedIndex();
        dObY = dobYear.getSelectedIndex();
        
        stateK = stateToFullState[dlstate.getSelectedIndex()];
        stateKMP = this.dlstate.getSelectedIndex();
        
        employerState = stateToFullState[dlstate1.getSelectedIndex()];
        
        dlN = this.dl.getText();
        phoneN1 = this.phone1.getText();
        phoneN2 = this.phone2.getText();
        emailN = this.email.getText();
        routingNumber = this.routing.getText();
        accountNumber = this.accountnumber.getText();
        bankName = this.bankname.getText();
        bankCity = this.bankcity.getText();
        bankState = this.bankstate.getText();
        //Reduent checkingN = this.checking.getText();
        checkingBox = this.checkingbox.getText();
        recentOpen = this.recentopen.getText();
        reference1 = this.ref1.getText();
        reference1Last = this.ref3.getText();
        refPhone1 = this.refphone1.getText();
        reference2 = this.ref4.getText();
        reference2Last = this.ref5.getText();
        refPhone2 = this.refphone2.getText();
        employerN = this.employer.getText();
        employerPhone = this.employerphone.getText();
        incomeN = this.income.getText();
        hireD = hireDateMonth.getSelectedItem().toString() + 
                hireDateYear.getSelectedItem().toString();
        recentPay = lastPaydayMonth.getSelectedItem().toString() +
        lastPaydayDay.getSelectedItem().toString() +
        lastPaydayYear.getSelectedItem().toString();
        nextPay = nextPaydayMonth.getSelectedItem().toString() +
        nextPaydayDay.getSelectedItem().toString() +
        nextPaydayYear.getSelectedItem().toString();
        superName = this.supername.getText();
        workPhone = this.workphone.getText();
        postHold = this.posthold.getText();
        employmentPayment = this.incomeType.getSelectedItem().toString();
        Pay = this.pay.getSelectedItem().toString();
        PayMP = this.pay.getSelectedIndex();
        // This is redudent startDate  = this.startdate.getText();
        yearsAtJob = Integer.toString(year - Integer.parseInt(hireDateYear.getSelectedItem().toString()));//yearAtJob.getSelectedItem().toString();
        
     
        
        monthsAtJob = Integer.toString(month - Integer.parseInt(hireDateMonth.getSelectedItem().toString())); //monthAtJob.getSelectedItem().toString();
        int tempMonths = month - Integer.parseInt(hireDateMonth.getSelectedItem().toString());
           if (tempMonths < 0){
            tempMonths = tempMonths + 12;
        yearsAtJob = Integer.toString(Integer.parseInt(yearsAtJob) - 1);
        System.out.println("This is the current Years " + yearsAtJob);
        //Integer.toString(Math.abs(Integer.parseInt(monthsAtJob))
        monthsAtJobCR = Integer.toString(tempMonths);
        
        System.out.println("This is the current Months at the job " + monthsAtJobCR);
        }
        monthsAtJobCR = Integer.toString(tempMonths);
        yearAccountOpen = this.yearsaccountopen.getSelectedItem().toString().replace(" Yr", "").replace(" Yrs", "").replace("+", "").replaceAll("s", "").replaceAll("\\s", "");
         monthAccountOpen = this.monthsaccountopen.getSelectedItem().toString().replace(" Mon", "");
        cardHolderName = this.cardholdername.getText();
        expYear = yearExp.getSelectedItem().toString().replace(" Yr", "").replace(" Yrs", "");
        expYearMP = yearExp.getSelectedIndex();
        expMonth = monthExp.getSelectedItem().toString().replace(" Mon", "");
        expMonthMP = monthExp.getSelectedIndex();
        cardNumber = this.cardnumber.getText();
        cardCode = csvCode.getText();
        Title = title.getSelectedItem().toString();
        RelationRef =  RelationShipComboBox.getSelectedItem().toString();
        RelationRef1 =  RelationShipComboBox1.getSelectedItem().toString();
        hireDate = hireDateMonth.getSelectedItem().toString() + "01" + hireDateYear.getSelectedItem().toString();
        
        System.out.println("on the button " + firstName);

        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        
           //TODO: Progressive flip
           
        if(ProgressBar){
           this.setVisible(false);
           new Results().setVisible(true);
        }
          
        Results value = new Results();
         
        Main firstThread = new Main();
        //Crest
        
        if(crestEnabled.isSelected()){
            WebDriver driver = new ChromeDriver();
            driver.get(CrestLink);
            value.setValueCR(10);
            firstThread.CrestFinance(driver);
        }
        
        if(simpleEnabled.isSelected()) {
            WebDriver driver1 = new ChromeDriver();
            driver1.get(SimpleLink);
            firstThread.SimpleFinance(driver1);
        } 
         
        if(snapEnabled.isSelected()) {
            WebDriver driver2 = new ChromeDriver();
            driver2.get(SnapLink);
            firstThread.SnapFinance(driver2);
        } 
        
        if(progressiveEnabled.isSelected()) {
            WebDriver driver3 = new ChromeDriver();
            driver3.get(ProgressiveLink);
            firstThread.ProgressFinance(driver3);
        } 
        
        
        if(merchantsEnabled.isSelected()) {
          WebDriver driver4 = new ChromeDriver();
          driver4.get(MerchantsLink);
           firstThread.PerferredFinance(driver4);
        }
        
        if(tempoeEnabled.isSelected()) {
            WebDriver driver5 = new ChromeDriver();
            driver5.get(TempoeLink);
            System.out.println("loading tempoe");
            firstThread.TempoeFinance(driver5);
        }
        
        if(okinusEnabled.isSelected()) {
            WebDriver driver6 = new ChromeDriver();
            driver6.get(OkinusLink);
            System.out.println("loading okinus");
            firstThread.OkinusFinance(driver6);
        }  
        
        if(westEnabled.isSelected()) {
            WebDriver driver7 = new ChromeDriver();
            driver7.get(WestLink);
            System.out.println("loading West Creek...");
            firstThread.WestCreekFinance(driver7);
        } 
        
        if(ProgressBar){
        odd1 = 0;
        odd2 = 0;
        odd3 = 0;
        odd4 = 0;
        odd5 = 0;
        odd6 = 0;
        odd7 = 0;
        odd8 = 0;
        }
        
          
    }//GEN-LAST:event_submitButtonActionPerformed

    private void postholdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postholdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_postholdActionPerformed

    private void incomeTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incomeTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_incomeTypeActionPerformed

    private void incomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_incomeActionPerformed

    private void employerphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employerphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employerphoneActionPerformed

    private void ref1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ref1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ref1ActionPerformed

    private void checkingboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkingboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkingboxActionPerformed

    private void cardholdernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardholdernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardholdernameActionPerformed

    private void bankstateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bankstateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bankstateActionPerformed

    private void bankcityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bankcityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bankcityActionPerformed

    private void accountnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accountnumberActionPerformed

    private void phone2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phone2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phone2ActionPerformed

    private void rentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rentActionPerformed
        // TODO add your handling code here:
        uRent = true;
        uOwn = false;
    }//GEN-LAST:event_rentActionPerformed

    private void zipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zipActionPerformed

    private void unitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unitActionPerformed

    private void lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameActionPerformed

    private void middlenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_middlenameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_middlenameActionPerformed

    private void firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnameActionPerformed

    private void addressMonthsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressMonthsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressMonthsActionPerformed

    private void addressYearsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressYearsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressYearsActionPerformed

    private void clearFieldsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearFieldsActionPerformed

        firstname.setText("");
        middlename.setText("");
        lastname.setText("");
        dl.setText("");
//        dlstate.setSelectedIndex(0);
        ssn.setText("");
        streetaddress.setText("");
        city.setText("");
        zip.setText("");
        email.setText("");
        phone1.setText("");
        phone2.setText("");
        ref1.setText("");
        ref3.setText("");
        refphone1.setText("");
        ref4.setText("");
        ref5.setText("");
        refphone2.setText("");
        routing.setText("");
        accountnumber.setText("");
        cardholdername.setText("");
        cardnumber.setText("");
        bankname.setText("");
        bankcity.setText("");
        bankstate.setText("");
        employer.setText("");
        posthold.setText("");
        employerphone.setText("");
        income.setText("");
        supername.setText("");
        workphone.setText("");
        dobYear.setSelectedIndex(0);
        dobMonth.setSelectedIndex(0);
        dobDay.setSelectedIndex(0);
        addressYears.setSelectedIndex(0);
        addressMonths.setSelectedIndex(0);
        yearsaccountopen.setSelectedIndex(0);
        monthsaccountopen.setSelectedIndex(0);
        monthExp.setSelectedIndex(0);
        yearExp.setSelectedIndex(0);
        hireDateMonth.setSelectedIndex(0);
        hireDateYear.setSelectedIndex(0);
        lastPaydayYear.setSelectedIndex(0);
        lastPaydayMonth.setSelectedIndex(0);
        lastPaydayDay.setSelectedIndex(0);
        nextPaydayYear.setSelectedIndex(0);
        nextPaydayMonth.setSelectedIndex(0);
        nextPaydayDay.setSelectedIndex(0);  
        dlstate1.setSelectedIndex(0);
        rent.setSelected(false);
                
    }//GEN-LAST:event_clearFieldsActionPerformed

    private void progressiveEnabledActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_progressiveEnabledActionPerformed
        // TODO add your handling code here:
        if(odd4 == 0){
        progressiveEnabled.setBackground(Color.green);
        odd4 ++; 
        } else if(odd4 == 1){
        progressiveEnabled.setBackground(Color.LIGHT_GRAY);
        odd4 --;
        } 
    }//GEN-LAST:event_progressiveEnabledActionPerformed

    private void hireDateYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hireDateYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hireDateYearActionPerformed

    private void recentopenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recentopenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_recentopenActionPerformed

    private void csvCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_csvCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_csvCodeActionPerformed

    private void lastPaydayMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastPaydayMonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastPaydayMonthActionPerformed

    private void LangToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LangToggleActionPerformed
        // TODO add your handling code here:
         // TODO add your handling code here:
        if(toggleLang == 0){
            LangToggle.setText("Spanish");
            jLabel9.setText("Nombre De Pila");
            jLabel10.setText("Segundo Nombre");
            jLabel11.setText("Apellido");
            jLabel22.setText("Número de Licencia de Conducir");
            jLabel21.setText("Estado");
            jLabel6.setText("Referencias personales");
            jLabel26.setText("Teléfono #");
            jLabel3.setText("Primer apellido");
            jLabel28.setText("Teléfono #");
            jLabel27.setText("Primer apellido");
            jLabel12.setText("Dirección");
            jLabel13.setText("Unidad / Apt #");
            jLabel19.setText("SSN / ITIN");
            jLabel20.setText("Fecha de nacimiento");
            jLabel14.setText("Ciudad");
            jLabel15.setText("Estado");
            jLabel16.setText("Cremallera");
            jLabel23.setText("Teléfono principal");
            jLabel24.setText("Teléfono alternativo");
            jLabel4.setText("Hora en esta dirección");
            jLabel17.setText("Años");
            jLabel18.setText("Meses");
            rent.setText("alquilar");
            own.setText("propio");
            jLabel25.setText("correo electrónico");
            jLabel29.setText("Enrutamiento #");
            jLabel30.setText("Cuenta #");
            jLabel37.setText("Nombre del titular de la tarjeta");
            jLabel35.setText("Años Cuenta Abierta");
            jLabel36.setText("Meses Cuenta abierta");
            jLabel31.setText("Nombre del banco");
            jLabel32.setText("ciudad del banco");
            jLabel33.setText("Estado del banco");
            jLabel40.setText("Número de tarjeta");
            jLabel39.setText("mes de exp");
            jLabel38.setText("Año de Exp");
            cardCode1.setText("Código de seguridad");
            recentopen.setText("Abierto por lo menos 90 días");
            checkingbox.setText("Es una cuenta de cheques");
            jLabel41.setText("Nombre del Empleador");
            jLabel47.setText("Cargo que ocupa");
            jLabel42.setText("Teléfono fijo");
            jLabel43.setText("Fecha de contratación");
            jLabel44.setText("Ingreso mensual");
            jLabel46.setText("Nombre del supervisor");
            jLabel45.setText("Teléfono del trabajo #");
            jLabel8.setText("Tipo de ingreso");
            jLabel53.setText("Frecuencia de pago");
            jLabel51.setText("Último día de pago");
            jLabel52.setText("Próximo día de pago"); 
            
            
        toggleLang ++; 
        } else if(toggleLang == 1){
              LangToggle.setText("English");
            jLabel9.setText("First Name");
            jLabel10.setText("Middle Name");
            jLabel11.setText("Last Name");
            jLabel22.setText("Driver License Number");
            jLabel21.setText("State");
            jLabel6.setText("Personal References");
            jLabel26.setText("Phone #");
            jLabel3.setText("First & Last Name");
            jLabel28.setText("Phone #");
            jLabel27.setText("First & Last Name");
            jLabel12.setText("Street Address");
            jLabel13.setText("Unit/Apt#");
            jLabel19.setText("SSN / ITIN");
            jLabel20.setText("Date of Birth");
            jLabel14.setText("City");
            jLabel15.setText("State");
            jLabel16.setText("Zip");
            jLabel23.setText("Main Phone");
            jLabel24.setText("Alternate Phone");
            jLabel4.setText("Time at this address");
            jLabel17.setText("Years");
            jLabel18.setText("Months");
            rent.setText("Rent");
            own.setText("Own"); 
            jLabel25.setText("Email Address");
            jLabel29.setText("Routing #");
            jLabel30.setText("Account #");
            jLabel37.setText("Card Holder Name");
            jLabel35.setText("Years Account Open");
            jLabel36.setText("Months Account Open");
            jLabel31.setText("Bank Name");
            jLabel32.setText("Bank City");
            jLabel33.setText("Bank State");
            jLabel40.setText("Card Number");
            jLabel39.setText("Exp Month");
            jLabel38.setText("Exp Year ");
            cardCode1.setText("Security Code");
            recentopen.setText("Open at least 90 days");
            checkingbox.setText("Is this a checking account");
            jLabel41.setText("Employer Name");
            jLabel47.setText("Position Held");
            jLabel42.setText("Phone (Land Line)");
            jLabel43.setText("Hire Date");
            jLabel44.setText("Monthly Income");
            jLabel46.setText("Supervisor Name");
            jLabel45.setText("Work Phone #");
            jLabel8.setText("Income Type");
            jLabel53.setText("Pay Frequency");
            jLabel51.setText("Last Payday");
            jLabel52.setText("Next Payday "); 
            
        toggleLang --;
        } 
    }//GEN-LAST:event_LangToggleActionPerformed

    private void simpleEnabledActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpleEnabledActionPerformed
        // TODO add your handling code here:

        if(odd2 == 0){
            simpleEnabled.setBackground(Color.green);
            odd2 ++;
        } else if(odd2 == 1){

            simpleEnabled.setBackground(Color.LIGHT_GRAY);
            odd2 --;
        }
    }//GEN-LAST:event_simpleEnabledActionPerformed

    private void westEnabledActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_westEnabledActionPerformed
        // TODO add your handling code here:
         if(odd8 == 0){
            westEnabled.setBackground(Color.green);
            odd8 ++;
        } else if(odd8 == 1){

            westEnabled.setBackground(Color.LIGHT_GRAY);
            odd8 --;
        }
    }//GEN-LAST:event_westEnabledActionPerformed

    private void snapEnabledActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snapEnabledActionPerformed
        // TODO add your handling code here:
        if(odd3 == 0){
            snapEnabled.setBackground(Color.green);
            odd3 ++;
        } else if(odd3 == 1){

            snapEnabled.setBackground(Color.LIGHT_GRAY);
            odd3 --;
        }
    }//GEN-LAST:event_snapEnabledActionPerformed

    private void merchantsEnabledActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_merchantsEnabledActionPerformed
        // TODO add your handling code here:
        if(odd6 == 0){
            merchantsEnabled.setBackground(Color.green);
            odd6 ++;
        } else if(odd6 == 1){
            merchantsEnabled.setBackground(Color.LIGHT_GRAY);
            odd6 --;
        }
    }//GEN-LAST:event_merchantsEnabledActionPerformed

    private void okinusEnabledActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okinusEnabledActionPerformed
        // TODO add your handling code here:
        if(odd5 == 0){
            okinusEnabled.setBackground(Color.green);
            odd5 ++;
        } else if(odd5 == 1){

            okinusEnabled.setBackground(Color.LIGHT_GRAY);
            odd5 --;
        }
    }//GEN-LAST:event_okinusEnabledActionPerformed

    private void tempoeEnabledActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tempoeEnabledActionPerformed
        // TODO add your handling code here:
        if(odd7 == 0){
            tempoeEnabled.setBackground(Color.green);
            odd7 ++;
        } else if(odd7 == 1){
            tempoeEnabled.setBackground(Color.LIGHT_GRAY);
            odd7 --;
        }
    }//GEN-LAST:event_tempoeEnabledActionPerformed

    private void crestEnabledActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crestEnabledActionPerformed
        // TODO add your handling code here:
        if(odd1 == 0){
            crestEnabled.setBackground(Color.green);
            odd1 ++;
        } else if(odd1 == 1){

            crestEnabled.setBackground(Color.LIGHT_GRAY);
            odd1 --;
        }

    }//GEN-LAST:event_crestEnabledActionPerformed

    private void lastPaydayYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastPaydayYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastPaydayYearActionPerformed

    private void ownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ownActionPerformed
        // TODO add your handling code here:
        uOwn = true;
        uRent = false;
    }//GEN-LAST:event_ownActionPerformed
    
    Random r = new Random();
    
    private String getRandomNumber(int length) {
        String output = "";
        // 7 digit max
        for(int i = 0; i < length; i++) {
            output += (1 + r.nextInt(9));
        }
        return output;
    }
    
    private String getRandomMonth() {
        String output = "";
        int n = randInt(1,12);
        if(n < 10)
            output += "0";
        output += n;
        return output;
    }
        
    private String getRandomDay() {
        String output = "";
        int n = randInt(1,27);
        if(n < 10)
            output += "0";
        output += n;
        return output;
    }
    
    private String getRandomYear(boolean before2000, int yearMin, int yearMax) {
        String output = "";
        if(before2000)
            output += "19";
        else
            output += "20";
        output += randInt(yearMin, yearMax);
        return output;
    }
    
    private String getRandomYear() {
        String output = "";
        int n = randInt(1,15);
        if(n < 10)
            output += "0";
        output += n;
        return output;
    }
    
    private int randInt(int min, int max) {
        return r.nextInt((max - min) + 1) + min;
    }
    
    private int monthToNum(String month, String format) {
        try {
            Date date = new SimpleDateFormat(format).parse(month);
            int month_num = 0;
            Calendar cal = Calendar.getInstance(); 
            cal.setTime(date);
            month_num = cal.get(Calendar.MONTH);
            return month_num;
        } catch (ParseException e) {
                return 0;
        }
    }
    
    private String numToMonth(int month) {
        try {
            Date date = new SimpleDateFormat("MM").parse("" + month);
            return new SimpleDateFormat("MMMM").format(date);
        } catch (ParseException e) {
            return "January";
        }
    }
    
    private void sfSetLastPayDay(WebDriver driver1) throws InterruptedException{
            String lp_month = recentPay.substring(0,2);
               // lastPaydayMonth.getSelectedItem().toString();
        //int lp_month_num = monthToNum(lp_month, "MM");
        int lp_month_num = Integer.parseInt(lp_month);
        String lp_month_name = numToMonth(lp_month_num);
        String lp_day = recentPay.substring(2,4);
                //"" + (lastPaydayDay.getSelectedIndex() + 1); 04 041993
        String lp_year = recentPay.substring(6,8);
                //recentPay.substring(2);lastPaydayYear.getSelectedItem().toString();
            System.out.println(lp_month + "/"+ lp_day + "/"+ lp_year);
        // Click to open calendar
        String lp_mo_button_xpath = "//*[@id='lease_applicant_attributes_last_payday_on']";
        driver1.findElement(By.xpath(lp_mo_button_xpath)).click();
        Thread.sleep(500);
        
        // Parse the month on the page html/body/div[7]/div[1]/table/thead/tr[1]/th[2]
        String lp_mo_xpath = "html/body/div[7]/div[1]/table/thead/tr[1]/th[2]";
        String month_on_page = driver1.findElement(By.xpath(lp_mo_xpath)).getText().split(" ")[0];
        
        // Get the month numbers and compare to last payday
        int month_on_page_num1 = monthToNum(month_on_page, "MMMM");
        int month_on_page_num = month_on_page_num1 +1;

        // Go backwards if date is ahead
        if(lp_month_num < month_on_page_num) {
            while(month_on_page_num > 0) {
                String lp_prev_xpath = "/html/body/div[7]/div[1]/table/thead/tr[1]/th[1]";
                driver1.findElement(By.xpath(lp_prev_xpath)).click();
                Thread.sleep(100);
                System.out.println("going back happened");
                month_on_page = driver1.findElement(By.xpath(lp_mo_xpath)).getText().split(" ")[0];
                month_on_page_num1 = monthToNum(month_on_page, "MMMM");
                month_on_page_num = month_on_page_num1 +1;
                System.out.println("DURING month_on_page_num: " + month_on_page_num + ", lp_month_num: " + lp_month_num);
                if(month_on_page_num == lp_month_num)
                    break;
            }
        // Go forwards if date is ahead
        } else if(lp_month_num > month_on_page_num) {
            while(month_on_page_num < 13) { //Dont know what this 13 is for CHECKPOINT
                String lp_next_xpath = "/html/body/div[7]/div[1]/table/thead/tr[1]/th[3]";
                driver1.findElement(By.xpath(lp_next_xpath)).click();
                Thread.sleep(100);
                month_on_page = driver1.findElement(By.xpath(lp_mo_xpath)).getText().split(" ")[0];
                month_on_page_num = monthToNum(month_on_page, "MMMM");
                System.out.println("DURING month_on_page_num: " + month_on_page_num + ", lp_month_num: " + lp_month_num);
                if(month_on_page_num == lp_month_num)
                    break;
            }
        }
        // Default values if fail to find date
        /*if(lp_month_num != month_on_page_num) {
            lp_month_num = month_on_page_num;
            lp_day = "15";
        }*/
        // On current month, loop through and find date thing
        if(month_on_page_num == lp_month_num) {
            boolean found_date = false;
            for(int i=1;i <= 6; i++){
                for(int j=1;j <= 7; j++){  
                    String xPathString = "/html/body/div[7]/div[1]/table/tbody/tr["+ i +"]/td["+ j +"]";
                    System.out.println("I looking for the date " + xPathString); 

                    if(Integer.parseInt(driver1.findElement(By.xpath(xPathString)).getText()) == Integer.parseInt(lp_day)){
                       driver1.findElement(By.xpath(xPathString)).click();
                       System.out.println("I clicked the date ");
                       found_date = true;
                       break;
                    }
                }
                if(found_date) {
                       
                    break;
                }
            }
        }
    }
    
    private void sfSetNextPayDay(WebDriver driver1) throws InterruptedException{
        String lp_month = nextPay.substring(0,2);
                //nextPaydayMonth.getSelectedItem().toString();
        int lp_month_num = Integer.parseInt(lp_month);
        String lp_month_name = numToMonth(lp_month_num);
        String lp_day = nextPay.substring(2,4);
                //"" + (nextPaydayDay.getSelectedIndex() + 1);
        String lp_year = nextPay.substring(6,8);
                //nextPaydayYear.getSelectedItem().toString();
            System.out.println(lp_month + "/"+ lp_day + "/"+ lp_year);                     
        // Click to open calendar
        String lp_mo_button_xpath = "//*[@id=\"lease_applicant_attributes_next_payday_on\"]";
        driver1.findElement(By.xpath(lp_mo_button_xpath)).click();
        Thread.sleep(500);          
        
        // Parse the month on the page
        String lp_mo_xpath = "/html/body/div[7]/div[1]/table/thead/tr[1]/th[2]";
        String month_on_page = driver1.findElement(By.xpath(lp_mo_xpath)).getText().split(" ")[0];
        
        // Get the month numbers and compare to last payday
        int month_on_page_num1 = monthToNum(month_on_page, "MMMM");
        int month_on_page_num = month_on_page_num1 +1;       

        // Go backwards if date is ahead
        if(lp_month_num < month_on_page_num) {
            while(month_on_page_num > 0) {
                String lp_prev_xpath = "/html/body/div[7]/div[1]/table/thead/tr[1]/th[1]";
                driver1.findElement(By.xpath(lp_prev_xpath)).click();
                Thread.sleep(100);
                month_on_page = driver1.findElement(By.xpath(lp_mo_xpath)).getText().split(" ")[0];
                month_on_page_num = monthToNum(month_on_page, "MMMM");
                if(month_on_page_num == lp_month_num)
                    break;
            }
        // Go forwards if date is ahead
        } else if(lp_month_num > month_on_page_num) {
            while(month_on_page_num < 13) {
                String lp_next_xpath = "/html/body/div[7]/div[1]/table/thead/tr[1]/th[3]";
                driver1.findElement(By.xpath(lp_next_xpath)).click();
                Thread.sleep(100);
                month_on_page = driver1.findElement(By.xpath(lp_mo_xpath)).getText().split(" ")[0];
                month_on_page_num = monthToNum(month_on_page, "MMMM");
                if(month_on_page_num == lp_month_num)
                    break;
            }
        }
        // Default values if fail to find date
        if(lp_month_num != month_on_page_num) {
            lp_month_num = month_on_page_num;
            lp_day = "15";
        }
        // On current month, loop through and find date thing
        if(month_on_page_num == lp_month_num) {
            boolean found_date = false;
            for(int i=1;i <= 6; i++){
                for(int j=1;j <= 7; j++){  
                    String xPathString = "/html/body/div[7]/div[1]/table/tbody/tr["+ i +"]/td["+ j +"]";
                    System.out.println("I looking for the date " + xPathString); 

                    if(Integer.parseInt(driver1.findElement(By.xpath(xPathString)).getText()) == Integer.parseInt(lp_day)){
                       System.out.println("I clicked the date ");
                       driver1.findElement(By.xpath(xPathString)).click();
                       found_date = true;
                       break;
                    }
                }
                if(found_date) {
                    break;
                }
            }
        }
    }
         
    public static void openErrorCS(WebDriver driver){
     
       // Main.openErrorCS();
        //new Main().setVisible(true);
       
       driver.manage().window().maximize();
//       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      
    }
    
    
    /**
     * @param args the command line arguments
     */ 
    public static void main(String args[]) {
        
        Main obj = new Main();
        Thread tobj = new Thread(obj);
        tobj.start();
        
       // Thread tobj1 = new Thread(obj);
       // tobj1.start();
//        tobj.CrestFinance(driver);
       // new Thread((Runnable) new Main()).start();
       // Main firstThread = new Main();
     //   firstThread.StartCrest(driver);
       // firstThread.CrestFinance(driver);
       //  Main secondThread = new Main();
       // secondThread.SimpleFinance(driver1);
     
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            //here you can put the selected theme class name in JTattoo
            UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
 
        }catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>.  
  /* Create and display the form */
  
   java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {                
            System.out.println("Running RUN()");
         
            new Main().setVisible(true);
           // new Main().setVisible(true);
           //     new NewJFrame().setVisible(true);
            }
        });
   
    }
  
   
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JToggleButton LangToggle;
    public javax.swing.JComboBox<String> RelationShipComboBox;
    public javax.swing.JComboBox<String> RelationShipComboBox1;
    public javax.swing.JTextField accountnumber;
    private javax.swing.JComboBox<String> addressMonths;
    private javax.swing.JComboBox<String> addressYears;
    public javax.swing.JTextField bankcity;
    public javax.swing.JTextField bankname;
    public javax.swing.JTextField bankstate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    public javax.swing.JLabel cardCode1;
    private javax.swing.JTextField cardholdername;
    private javax.swing.JTextField cardnumber;
    public javax.swing.JCheckBox checkingbox;
    public javax.swing.JTextField city;
    private javax.swing.JButton clearFields;
    public javax.swing.JToggleButton crestEnabled;
    private javax.swing.JTextField csvCode;
    private javax.swing.JButton debugAutoFill;
    public javax.swing.JTextField dl;
    private javax.swing.JComboBox<String> dlstate;
    private javax.swing.JComboBox<String> dlstate1;
    private javax.swing.JComboBox<String> dobDay;
    private javax.swing.JComboBox<String> dobMonth;
    private javax.swing.JComboBox<String> dobYear;
    public javax.swing.JTextField email;
    public javax.swing.JTextField employer;
    public javax.swing.JTextField employerphone;
    public javax.swing.JTextField firstname;
    private javax.swing.JComboBox<String> hireDateMonth;
    private javax.swing.JComboBox<String> hireDateYear;
    public javax.swing.JTextField income;
    private javax.swing.JComboBox<String> incomeType;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JComboBox<String> lastPaydayDay;
    private javax.swing.JComboBox<String> lastPaydayMonth;
    private javax.swing.JComboBox<String> lastPaydayYear;
    public javax.swing.JTextField lastname;
    public javax.swing.JToggleButton merchantsEnabled;
    public javax.swing.JTextField middlename;
    private javax.swing.JComboBox<String> monthExp;
    private javax.swing.JComboBox<String> monthsaccountopen;
    private javax.swing.JComboBox<String> nextPaydayDay;
    private javax.swing.JComboBox<String> nextPaydayMonth;
    private javax.swing.JComboBox<String> nextPaydayYear;
    public javax.swing.JToggleButton okinusEnabled;
    public javax.swing.JRadioButton own;
    private javax.swing.JComboBox<String> pay;
    public javax.swing.JTextField phone1;
    public javax.swing.JTextField phone2;
    public javax.swing.JTextField posthold;
    public javax.swing.JToggleButton progressiveEnabled;
    public javax.swing.JCheckBox recentopen;
    public javax.swing.JTextField ref1;
    public javax.swing.JTextField ref3;
    public javax.swing.JTextField ref4;
    public javax.swing.JTextField ref5;
    public javax.swing.JTextField refphone1;
    public javax.swing.JTextField refphone2;
    public javax.swing.JRadioButton rent;
    public javax.swing.JTextField routing;
    public javax.swing.JToggleButton simpleEnabled;
    public javax.swing.JToggleButton snapEnabled;
    private javax.swing.JFormattedTextField ssn;
    public javax.swing.JComboBox<String> states;
    public javax.swing.JTextField streetaddress;
    private javax.swing.JButton submitButton;
    public javax.swing.JTextField supername;
    public javax.swing.JToggleButton tempoeEnabled;
    public javax.swing.JComboBox<String> title;
    public javax.swing.JTextField unit;
    public javax.swing.JToggleButton westEnabled;
    public javax.swing.JTextField workphone;
    private javax.swing.JComboBox<String> yearExp;
    private javax.swing.JComboBox<String> yearsaccountopen;
    public javax.swing.JTextField zip;
    // End of variables declaration//GEN-END:variables
    
    
    
    
    /*
 class RunnableDemo implements Runnable {
   private Thread t;
   private String threadName;
   
   
        
   
   RunnableDemo( String name){
       threadName = name;
       System.out.println("Creating " +  threadName );
   }
   
   */
     
   public void CrestFinance(WebDriver driver){//CrestFinace(list of varables,in array)
        System.out.println("I started Crest");
        
        try{
           // if(ProgressBar){
           driver.manage().window().setPosition(new Point(-2000, 0));
          //  }
        Select dropdown = null;
        driver.findElement(By.id("FirstName")).sendKeys(firstName);
        driver.findElement(By.id("LastName")).sendKeys(lastName);
        Thread.sleep(100);
        //driver.findElement(By.id("DateOfBirth")).sendKeys(dOb);
        SetText(driver,"//*[@id='DateOfBirth']",dOb,true);
         if(!driver.findElement(By.xpath("//*[@id='DateOfBirth']")).getText().equals(dOb)){
           driver.findElement(By.xpath("//*[@id='DateOfBirth']")).clear();
           System.out.println("Trying again");
           Thread.sleep(100);
           driver.findElement(By.xpath("//*[@id='DateOfBirth']")).sendKeys(dOb);
        }
        //driver.findElement(By.id("SocialSecurityNumber")).sendKeys(ssN);
        SetText(driver,"//*[@id='SocialSecurityNumber']",ssN,true);
        //driver.findElement(By.id("PrimaryPhone")).sendKeys(phoneN1);
        SetText(driver,"//*[@id='PrimaryPhone']",phoneN1,true);
        //driver.findElement(By.id("SecondaryPhone")).sendKeys(phoneN2);
        SetText(driver,"//*[@id='SecondaryPhone']",phoneN2,true);
        driver.findElement(By.id("EmailAddress")).sendKeys(emailN);
        driver.findElement(By.id("EmailAddressConfirm")).sendKeys(emailN);
        driver.findElement(By.id("StreetLine1")).sendKeys(streetAddress);
        driver.findElement(By.id("StreetLine2")).sendKeys(unitN);
        driver.findElement(By.id("City")).sendKeys(cityN);
        driver.findElement(By.id("StateID")).sendKeys(stateN);
        driver.findElement(By.id("PostalCode")).sendKeys(zipN);
         if(!driver.findElement(By.id("PostalCode")).getText().equals(zipN)){
           driver.findElement(By.id("PostalCode")).clear();
           System.out.println("Trying again");
           Thread.sleep(100);
           driver.findElement(By.id("PostalCode")).sendKeys(zipN);
        }
        SetText(driver,"//*[@id='PostalCode']",zipN,true);
        
        //driver.findElement(By.id("DriversLicenseNumber")).sendKeys(dlN);
        SetText(driver,"//*[@id='DriversLicenseNumber']",dlN,true);
        driver.findElement(By.id("DriversLicenseState")).sendKeys(stateK);

         System.out.println(Main.Rent + "This is where we are at ");
     /*
       if(Rent){ 
        driver.findElement(By.id("OwnershipTypeID")).sendKeys("Rent");
       } else if(Own){
       driver.findElement(By.id("OwnershipTypeID")).sendKeys("Own");
       }
        */
        //driver.findElement(By.id("EmployerName")).sendKeys(employerN);
        SetText(driver,"//*[@id=\"EmployerName\"]",employerN,true);
        
        //driver.findElement(By.id("EmployerPhone")).sendKeys(employerPhone);
        SetText(driver,"//*[@id='EmployerPhone']",employerPhone,true);
        //driver.findElement(By.id("MonthlyIncome")).sendKeys(incomeN);
        
        String tempincomeN = incomeN;
        
         dropdown = new Select(driver.findElement(By.id("PayPeriodTypeID"))); //TODO: Make if statment
        if(Pay == "Weekly"){
         dropdown.selectByIndex(0);
         tempincomeN = Integer.toString(Integer.valueOf(incomeN) / 4);
         System.out.println(Pay);
         System.out.println(tempincomeN);
         }else if(Pay == "Bi weekly"){
         dropdown.selectByIndex(1); 
         tempincomeN = Integer.toString(Integer.valueOf(incomeN) / 2);
         System.out.println(Pay);
         }else if(Pay == "Twice Monthly"){
         dropdown.selectByIndex(2);
         System.out.println(Pay);  
              Thread.sleep(500);
      if(driver.findElements(By.id("LastPayDateDiv")).size() != 0){
        driver.findElement(By.id("LastPayDate")).sendKeys(recentPay);
      }
      
       // driver.findElement(By.id("YearsAtJob")).sendKeys(yearsAtJob); 
       // dropdown = new Select(driver.findElement(By.id("YearsAtJob")));
       // dropdown.selectByIndex(yearAtJob.getSelectedIndex() + 1);
        // driver.findElement(By.id("MonthsAtJob")).sendKeys(monthsAtJobCR); //TODO MAKE FIELD ON FORM
        
        //dropdown = new Select(driver.findElement(By.id("MonthsAtJob")));
        //dropdown.selectByIndex(yearAtJob.getSelectedIndex() + 1);
        //value="1" Every week, 2 every two weeks, 3 twice a month, 4 Once a month
        
       
         //Needs to show last pay date
   
         if(!driver.findElement(By.id("LastPayDate")).getText().equals(recentPay)){
           driver.findElement(By.id("LastPayDate")).clear();
           System.out.println("Trying again");
           Thread.sleep(100);
           driver.findElement(By.id("LastPayDate")).sendKeys(recentPay);
        //}
         }
         }else if(Pay == "Monthly"){
         dropdown.selectByIndex(3);
         System.out.println(Pay);
         }
        
      //  if(driver.findElements(By.id("LastPayDate")).size() != 0){
        //driver.findElement(By.id("LastPayDate")).sendKeys(Main.recentPay); 
//TODO: if weekly or every two weeks or once a month lastpaydate goes away
       // }
        Thread.sleep(100);
        driver.findElement(By.id("NextPayDate")).sendKeys(nextPay);
        if(!driver.findElement(By.id("NextPayDate")).getText().equals(nextPay)){
           driver.findElement(By.id("NextPayDate")).clear();
           System.out.println("Trying again");
           Thread.sleep(100);
           driver.findElement(By.id("NextPayDate")).sendKeys(nextPay);
        }
        Thread.sleep(100);
        /*
        driver.findElement(By.id("RoutingNumber")).sendKeys(routingNumber); 
        if(!driver.findElement(By.id("RoutingNumber")).getText().equals(routingNumber)){
           driver.findElement(By.id("RoutingNumber")).clear();
           System.out.println("Trying again");
           Thread.sleep(100);
           driver.findElement(By.id("RoutingNumber")).sendKeys(routingNumber);
        }
        */
        
      
        SetText(driver,"//*[@id=\"LastPaycheck\"]",tempincomeN,true);
        SetText(driver,"//*[@id=\"RoutingNumber\"]",routingNumber,true);
        
        //driver.findElement(By.id("AccountNumberEntry")).sendKeys(accountNumber);
        
        SetText(driver,"//*[@id=\"AccountNumberEntry\"]",accountNumber,true);
        driver.findElement(By.id("BankName")).sendKeys("");//TODO CHECK IF IT IS EMPTY THEN FILL IT OR REDO ROUTING
      //  driver.findElement(By.id("AccountType")).sendKeys("Checking");// is a toggle from checkingbox
        System.out.println(yearAccountOpen);
        // driver.findElement(By.id("YearsAccountOpen")).sendKeys(yearAccountOpen);// TODO: MAKE FIELD ON FORM
       //  driver.findElement(By.id("MonthsAccountOpen")).sendKeys(monthAccountOpen + 1);// TODO: MAKE FIELD ON FORM
        /*
         dropdown = new Select(driver.findElement(By.id("YearsAccountOpen")));
        //dropdown.selectByIndex(yearsaccountopen.getSelectedIndex() + 1);
        Thread.sleep(100); 
       dropdown = new Select(driver.findElement(By.id("MonthsAccountOpen")));
        dropdown.selectByIndex(monthsaccountopen.getSelectedIndex() + 1);
         */
        Thread.sleep(100);
        
        //driver.findElement(By.id("CardholderName")).sendKeys(cardHolderName);  // TODO: MAKE FIELD ON FORM
         //SetText(driver,"//*[@id=\"CardholderName\"]",cardHolderName,true);
       // SetText(driver,"//*[@id=\"CardNumberEntry\"]",cardNumber,true);
        //driver.findElement(By.id("CardNumberEntry")).sendKeys(cardNumber); // TODO: MAKE FIELD ON FORM
        // driver.findElement(By.id("ExpirationMonth")).sendKeys(expMonth); // TODO: MAKE FIELD ON FORM
       // Thread.sleep(100);
        // driver.findElement(By.id("ExpirationYear")).sendKeys(expYear); // TODO: MAKE FIELD ON FORM
        /*
         dropdown = new Select(driver.findElement(By.id("ExpirationMonth")));
        dropdown.selectByIndex(expMonth);
        
        dropdown = new Select(driver.findElement(By.id("ExpirationYear")));
        dropdown.selectByIndex(yearExp.getSelectedIndex());
        */
        Thread.sleep(100);
        driver.findElement(By.id("Reference1Name")).sendKeys(reference1 + " " + reference1Last); 
        SetText(driver,"//*[@id=\"Reference1PhoneNumber\"]",refPhone1,true);
        /*
        driver.findElement(By.id("Reference1PhoneNumber")).sendKeys(refPhone1);
        
         if(!driver.findElement(By.id("Reference1PhoneNumber")).getText().equals(refPhone1)){
           driver.findElement(By.id("Reference1PhoneNumber")).clear();
           System.out.println("Trying again");
           Thread.sleep(100);
           driver.findElement(By.id("Reference1PhoneNumber")).sendKeys(refPhone1);
        }*/
        
        Thread.sleep(1000);
        
        
        //driver.findElement(By.id("CellPhone")).sendKeys(phoneN1);
        SetText(driver,"//*[@id='CellPhone']",phoneN1,true);
        Thread.sleep(500);

        
        if(!driver.findElement(By.id("CellPhone")).getText().equals(phoneN1)){
           driver.findElement(By.id("CellPhone")).clear();
           System.out.println("Trying again");
           Thread.sleep(100);
           driver.findElement(By.id("CellPhone")).sendKeys(phoneN1);
           driver.findElement(By.id("CellPhone")).sendKeys(Keys.END);
           driver.findElement(By.id("CellPhone")).sendKeys(Keys.BACK_SPACE);
           driver.findElement(By.id("CellPhone")).sendKeys(Keys.BACK_SPACE);
           driver.findElement(By.id("CellPhone")).sendKeys(Keys.BACK_SPACE);
           driver.findElement(By.id("CellPhone")).sendKeys(Keys.BACK_SPACE);
           driver.findElement(By.id("CellPhone")).sendKeys(Keys.BACK_SPACE);
        } 
        
        //driver.findElement(By.id("HomePhone")).sendKeys(phoneN2);
        SetText(driver,"//*[@id='HomePhone']",phoneN2,true);
        Thread.sleep(100);
        
        if(!driver.findElement(By.id("HomePhone")).getText().equals(phoneN2)){
           driver.findElement(By.id("HomePhone")).clear();
           System.out.println("Trying again");
           Thread.sleep(100);
           driver.findElement(By.id("HomePhone")).sendKeys(phoneN2);
           
           driver.findElement(By.id("HomePhone")).sendKeys(Keys.END);
           driver.findElement(By.id("HomePhone")).sendKeys(Keys.BACK_SPACE);
           driver.findElement(By.id("HomePhone")).sendKeys(Keys.BACK_SPACE);
           driver.findElement(By.id("HomePhone")).sendKeys(Keys.BACK_SPACE);
           driver.findElement(By.id("HomePhone")).sendKeys(Keys.BACK_SPACE);
           driver.findElement(By.id("HomePhone")).sendKeys(Keys.BACK_SPACE);
        } 


        driver.findElement(By.id("PrintedName")).sendKeys(firstName + " " + lastName);
        
        if(driver.findElements(By.id("Reference2Name")).contains("")){
        System.out.println("Crest finance doesnt have the second reference because you are making too much money");
        }else if (driver.findElements(By.id("Reference2Name")).size() != 0){
            System.out.println("Crest finance DOES have the second reference");
        driver.findElement(By.id("Reference2Name")).sendKeys(reference2 + " " + reference2Last);
        
        SetText(driver,"//*[@id=\"Reference2PhoneNumber\"]",refPhone2,true);
        /*
        driver.findElement(By.id("Reference2PhoneNumber")).sendKeys(refPhone2);
           
        if(!driver.findElement(By.id("Reference2PhoneNumber")).getText().equals(refPhone2)){
           driver.findElement(By.id("Reference2PhoneNumber")).clear();
           System.out.println("Trying again");
           Thread.sleep(100);
           driver.findElement(By.id("Reference2PhoneNumber")).sendKeys(refPhone2);
        }*/
        
        }else{
        //do nothing
        }
        
        //driver.findElement(By.id("form-submit")).sendKeys(Keys.RETURN);
        

        
        System.out.println("I Typed 1");
        }catch(Exception e){
        System.out.println("Element not Found in Crest Financial: " + e.getMessage());
        
       // Results temp = new Results();
       /* 
        if(ProgressBar){
        temp.setValueCR(10);
        openErrorCS(driver);
        }*/
        }
        
    }

   
   public void SimpleFinance(WebDriver driver1){
 
         try{
             if(ProgressBar){
           driver1.manage().window().setPosition(new Point(-2000, 0));
            }
       Thread.sleep(2500);
       System.out.println("I started Simple");
       //driver1.findElement(By.id("lease_location_id_4710")).click();
                
        driver1.findElement(By.id("lease_applicant_attributes_first_name")).sendKeys(firstName);
        driver1.findElement(By.id("lease_applicant_attributes_middle_name")).sendKeys(middleName);
        driver1.findElement(By.id("lease_applicant_attributes_last_name")).sendKeys(lastName);
        driver1.findElement(By.id("lease_applicant_attributes_address_1")).sendKeys(streetAddress);
        driver1.findElement(By.id("lease_applicant_attributes_address_2")).sendKeys(unitN);
        driver1.findElement(By.id("lease_applicant_attributes_city")).sendKeys(cityN);
         Select dropdownState = new Select(driver1.findElement(By.id("lease_applicant_attributes_state")));
        ClickStateSimple(driver1, stateN);
        System.out.println(stateK);
        driver1.findElement(By.id("lease_applicant_attributes_zip")).sendKeys(zipN);
        Thread.sleep(100); 
        driver1.findElement(By.id("lease_applicant_attributes_ssn")).sendKeys(ssN);
        driver1.findElement(By.id("lease_applicant_attributes_dob")).sendKeys(dOb);
        driver1.findElement(By.id("lease_applicant_attributes_dl_number")).sendKeys(dlN);
         Select dropdownDLState = new Select(driver1.findElement(By.id("lease_applicant_attributes_dl_state")));
        ClickStateDLSimple(driver1, stateK);
        //driver1.findElement(By.id("lease_applicant_attributes_dl_state")).sendKeys(stateK);
        
        driver1.findElement(By.id("lease_applicant_attributes_main_phone")).sendKeys(phoneN1);
        driver1.findElement(By.id("lease_applicant_attributes_alt_phone")).sendKeys(phoneN2);
        driver1.findElement(By.id("lease_applicant_attributes_email")).sendKeys(emailN);
        driver1.findElement(By.id("lease_applicant_attributes_routing_number")).sendKeys(routingNumber);
        driver1.findElement(By.id("lease_applicant_attributes_account_number")).sendKeys(accountNumber);
        driver1.findElement(By.id("lease_applicant_attributes_bank_name")).sendKeys(bankName);
        //TODO: Open in the last 90 days and is checking
        driver1.findElement(By.id("lease_applicant_attributes_account_type_checking")).click();
        driver1.findElement(By.id("lease_applicant_attributes_checking_account_open_at_least_required_days_yes")).click();
        driver1.findElement(By.id("lease_applicant_attributes_reference_1_name")).sendKeys(reference1 + " " + Main.reference1Last);
        driver1.findElement(By.id("lease_applicant_attributes_reference_1_phone")).sendKeys(refPhone1);
        driver1.findElement(By.id("lease_applicant_attributes_reference_2_name")).sendKeys(reference2 + " " + Main.reference2Last);
        driver1.findElement(By.id("lease_applicant_attributes_reference_2_phone")).sendKeys(refPhone2);
        driver1.findElement(By.id("lease_applicant_attributes_employer_name")).sendKeys(employerN);
        driver1.findElement(By.id("lease_applicant_attributes_employer_phone")).sendKeys(employerPhone);
        driver1.findElement(By.id("lease_applicant_attributes_employment_net_monthly_income")).sendKeys(incomeN);
        driver1.findElement(By.id("lease_applicant_attributes_hired_on")).sendKeys(hireD); //TODO: change format to fit 
         Select dropdown = new Select(driver1.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_pay_frequency\"]"))); 
         //dropdown.selectByValue(Pay);
         if(Pay == "Weekly"){
         dropdown.selectByIndex(1);
         System.out.println(Pay);
         }else if(Pay == "Bi weekly"){
         dropdown.selectByIndex(2);
         System.out.println(Pay);
         }else if(Pay == "Twice Monthly"){
         dropdown.selectByIndex(3);
         System.out.println(Pay);
         }else if(Pay == "Monthly"){
         dropdown.selectByIndex(4);
         System.out.println(Pay);
         }
        driver1.findElement(By.id("lease_applicant_attributes_last_payday_on")).click();
        sfSetLastPayDay(driver1);
        driver1.findElement(By.id("lease_applicant_attributes_next_payday_on")).click();
        sfSetNextPayDay(driver1);
        
        driver1.findElement(By.xpath("//*[@id=\"lease_form\"]/div/div[2]/div[4]/fieldset/div[3]/div[4]/div/div/button")).click();
        
        if(employmentPayment == "Direct Deposit from Employer"){  
        driver1.findElement(By.xpath("//*[@id=\"lease_form\"]/div/div[2]/div[4]/fieldset/div[3]/div[4]/div/div/ul/li[1]/a/label/input")).click();
        }else if(employmentPayment == "Paychecks from Employer"){
        driver1.findElement(By.xpath("//*[@id=\"lease_form\"]/div/div[2]/div[4]/fieldset/div[3]/div[4]/div/div/ul/li[2]/a/label/input")).click();
        }else if(employmentPayment == "Self-Employment"){
        driver1.findElement(By.xpath("//*[@id=\"lease_form\"]/div/div[2]/div[4]/fieldset/div[3]/div[4]/div/div/ul/li[3]/a/label/input")).click();
        }else if(employmentPayment == "Social Security"){
        driver1.findElement(By.xpath("//*[@id=\"lease_form\"]/div/div[2]/div[4]/fieldset/div[3]/div[4]/div/div/ul/li[4]/a/label/input")).click();
        }else if(employmentPayment == "Long Term Disability"){
        driver1.findElement(By.xpath("//*[@id=\"lease_form\"]/div/div[2]/div[4]/fieldset/div[3]/div[4]/div/div/ul/li[5]/a/label/input")).click();
        }else if(employmentPayment == "Military"){
        driver1.findElement(By.xpath("//*[@id=\"lease_form\"]/div/div[2]/div[4]/fieldset/div[3]/div[4]/div/div/ul/li[6]/a/label/input")).click();
        }else if(employmentPayment == "Alimony"){
        driver1.findElement(By.xpath("//*[@id=\"lease_form\"]/div/div[2]/div[4]/fieldset/div[3]/div[4]/div/div/ul/li[7]/a/label/input")).click();
        }else if(employmentPayment == "Retirement"){//TODO: no retirement dropdown on employmentPayment
        driver1.findElement(By.xpath("//*[@id=\"lease_form\"]/div/div[2]/div[4]/fieldset/div[3]/div[4]/div/div/ul/li[8]/a/label/input")).click();
        }
        
        driver1.findElement(By.xpath("//*[@id=\"lease_form\"]/div/div[2]/div[7]/fieldset/div/div/p")).click();
        //Direct Deposit from Employer, Paychecks from Employer, Self-Employment, Social Security, Long Term Disability, Military, Alimony

        //driver1.findElement(By.className("submit_button")).click();
        }
        catch(Exception e){
        System.out.println("Element not Found on second page" + e);
        }  

   }
    
   public void SnapFinance(WebDriver driver2){
    
//               driver2.manage().window().maximize(); 
          try{ 
              if(ProgressBar){
           driver2.manage().window().setPosition(new Point(-2000, 0));
            }
               Thread.sleep(500);    
        driver2.findElement(By.name("username")).sendKeys(SnapUsername);
        driver2.findElement(By.name("password")).sendKeys(SnapPassword);
        driver2.findElement(By.id("btn-login")).click();
        
        WebElement FirstPageSnap = (new WebDriverWait(driver2, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"merchPortal\"]/a[3]")));
                
        driver2.findElement(By.cssSelector("a.btn.btn-success.pull-right.toolbtns")).click();
        
        WebElement SecondPageSnap = (new WebDriverWait(driver2, 100)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"selectSalesPerson\"]/div[2]/div/form/div[2]/div/div[1]/input")));
          
               Thread.sleep(1000);
         Select dropdown = new Select(driver2.findElement(By.xpath("//*[@id=\"selectSalesPerson\"]/div[2]/div/form/div[1]/div/select"))); 
         dropdown.selectByIndex(1); 
         driver2.findElement(By.name("ssn")).sendKeys(ssN); 
         driver2.findElement(By.name("birthdate")).sendKeys(dOb); 
         
         driver2.findElement(By.cssSelector("button.btn.btn-success.btn-lg")).click();
         System.out.println("We logged in");
           Thread.sleep(1000);
         WebElement ThirdPageSnap = (new WebDriverWait(driver2, 1000)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"personalInfo\"]/div[2]/form/div[2]/div[1]/div[1]/input")));
         //driver2.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/form/div[2]/div[3]/div[3]/div/input")).sendKeys("jokersaudio");
         
         driver2.findElement(By.xpath("//*[@id=\"personalInfo\"]/div[2]/form/div[2]/div[1]/div[1]/input")).sendKeys(firstName);
         driver2.findElement(By.xpath("//*[@id=\"personalInfo\"]/div[2]/form/div[2]/div[1]/div[2]/input")).sendKeys(middleName);
         driver2.findElement(By.xpath("//*[@id=\"personalInfo\"]/div[2]/form/div[2]/div[2]/input")).sendKeys(lastName);
         driver2.findElement(By.xpath("//*[@id=\"personalInfo\"]/div[2]/form/div[2]/div[3]/div[1]/div/input")).sendKeys(phoneN1);
         driver2.findElement(By.xpath("//*[@id=\"personalInfo\"]/div[2]/form/div[2]/div[3]/div[2]/div/input")).sendKeys(phoneN2);
         driver2.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(emailN);
         //Todo Select english
         driver2.findElement(By.xpath("//*[@id=\"personalInfo\"]/div[2]/form/div[2]/div[4]/div[1]/input")).sendKeys(ssN);
         driver2.findElement(By.xpath("//*[@id=\"personalInfo\"]/div[2]/form/div[2]/div[4]/div[2]/input")).sendKeys(ssN);
         driver2.findElement(By.xpath("//*[@id=\"personalInfo\"]/div[2]/form/div[2]/div[5]/div[1]/input")).sendKeys(streetAddress);
         driver2.findElement(By.xpath("//*[@id=\"addressUnit\"]")).sendKeys(unitN);
         driver2.findElement(By.xpath("//*[@id=\"personalInfo\"]/div[2]/form/div[2]/div[6]/div[1]/input")).sendKeys(cityN);
         //TODO: Select State
          driver2.findElement(By.xpath("//*[@id=\"personalInfo\"]/div[2]/form/div[2]/div[6]/div[2]/select")).sendKeys(stateN);
         
         driver2.findElement(By.xpath("//*[@id=\"personalInfo\"]/div[2]/form/div[2]/div[6]/div[3]/input")).sendKeys(zipN);
         //TODO: Select Years dropdown
         // driver2.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/form/div[2]/div[7]/div/div[1]/div[2]/div[1]/select")).sendKeys(addYears);
        dropdown = new Select(driver2.findElement(By.xpath("//*[@id=\"personalInfo\"]/div[2]/form/div[2]/div[7]/div/div[1]/div[2]/div[1]/select")));
        System.out.println("This is the amount of years " + addressYears.getSelectedItem().toString() + "/" + addYears);
        int selectedIndexOfYear = Integer.parseInt(addYears);
        if(selectedIndexOfYear > 5){
            dropdown.selectByIndex(7);
            System.out.println("Snap years more 7");
        }else{
            dropdown.selectByIndex(selectedIndexOfYear+1);
        }
        
         dropdown = new Select(driver2.findElement(By.xpath("//*[@id=\"personalInfo\"]/div[2]/form/div[2]/div[7]/div/div[1]/div[2]/div[2]/select")));
        int selectedIndexOfMonth = Integer.parseInt(addMonths);
        dropdown.selectByIndex(selectedIndexOfMonth+1); 
        //dropdown.selectByIndex(tempAddressYears); //TODO addressYears.getSelectedIndex()
         // driver2.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/form/div[2]/div[7]/div/div[1]/div[2]/div[2]/select")).sendKeys(addMonths);
        //dropdown = new Select(driver2.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/form/div[2]/div[7]/div/div[1]/div[2]/div[2]/select")));
        //dropdown.selectByIndex(3);
         //TODO: Rent or own addressStatus  addressMonths.getSelectedIndex()
         if(Rent){         
         Select dropdown30 = new Select(driver2.findElement(By.name("addressStatus"))); 
        dropdown30.selectByIndex(1);
        
         }else if(Own){
           Select dropdown30 = new Select(driver2.findElement(By.name("addressStatus"))); 
        dropdown30.selectByIndex(2);
        
         }
         
         driver2.findElement(By.xpath("//*[@id=\"personalInfo\"]/div[2]/form/div[2]/div[8]/div[2]/input")).sendKeys(dlN);
         //TODO: Driver License State Dropdown
         driver2.findElement(By.name("dLicenseState")).sendKeys(stateK);
         driver2.findElement(By.xpath("//*[@id=\"personalInfo\"]/div[2]/form/div[2]/div[9]/div[2]/div[1]/input")).sendKeys(reference1);
         driver2.findElement(By.xpath("//*[@id=\"personalInfo\"]/div[2]/form/div[2]/div[9]/div[2]/div[2]/input")).sendKeys(reference1Last);
         driver2.findElement(By.xpath("//*[@id=\"personalInfo\"]/div[2]/form/div[2]/div[9]/div[2]/div[3]/input")).sendKeys(refPhone1);
         driver2.findElement(By.xpath("//*[@id=\"personalInfo\"]/div[2]/form/div[2]/div[9]/div[2]/div[5]/input")).sendKeys(reference2);
         driver2.findElement(By.xpath("//*[@id=\"personalInfo\"]/div[2]/form/div[2]/div[9]/div[2]/div[6]/input")).sendKeys(reference2Last);
         //TODO: LAST NAME REFERENCES  /html/body/div[2]/div[2]/div/div[2]/form/div[2]/div[9]/div[2]/div[7]/input
         driver2.findElement(By.xpath("//*[@id=\"personalInfo\"]/div[2]/form/div[2]/div[9]/div[2]/div[7]/input")).sendKeys(refPhone2);
         
         driver2.findElement(By.xpath("//*[@id=\"personalInfo\"]/div[2]/form/div[2]/div[11]/div/div/label[1]")).click();
         driver2.findElement(By.xpath("//*[@id=\"personalInfo\"]/div[2]/form/div[2]/div[12]/button")).click();
         
           Thread.sleep(4500);
         driver2.findElement(By.xpath("//*[@id=\"bankNumbers\"]/div/div[1]/div/input")).sendKeys(routingNumber);
         driver2.findElement(By.xpath("//*[@id=\"bankNumbers\"]/div/div[2]/input")).sendKeys(accountNumber);
         driver2.findElement(By.xpath("//*[@id=\"bankNumbers\"]/div/div[3]/input")).sendKeys(accountNumber);
         //driver2.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/form/div[2]/div[1]/div[2]/input")).sendKeys(bankName);
         // driver2.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/form/div[2]/div[1]/div[3]/input")).sendKeys(bankCity);
         //TODO: State dropdown
         // driver2.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/form/div[2]/div[1]/div[2]/input")).sendKeys(bankState);
         
         Thread.sleep(700);
         driver2.findElement(By.xpath("//*[@id=\"bankInfo\"]/div[2]/form/div[2]/div[2]/div[1]/label[2]/input")).click();
         System.out.println("Snap page two");
         
         driver2.findElement(By.xpath("//*[@id=\"bankInfo\"]/div[2]/form/div[2]/div[2]/div[2]/div[2]/button")).click();
          
        Thread.sleep(500);
         //Click on next page
         WebElement FourthPageSnap = (new WebDriverWait(driver2, 1000)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"incomeInfo\"]/div[2]/div[3]/div/div/form/div[1]/div[1]/select")));
        
         Thread.sleep(800);
          
        Select dropdown3 = new Select(driver2.findElement(By.name("incomeType"))); //TODO: Make if statment
        if(employmentPayment == "Direct Deposit from Employer" || employmentPayment == "Paychecks from Employer" ){
        dropdown3.selectByIndex(1);
        SnapSelectWeek(driver2);
        
        
         driver2.findElement(By.xpath("//*[@id=\"incomeInfo\"]/div[2]/div[3]/div/div/form/div[3]/div[1]/div[2]/div/div/input")).sendKeys(incomeN);
         driver2.findElement(By.xpath("//*[@id=\"incomeInfo\"]/div[2]/div[3]/div/div/form/div[3]/div[2]/div/div[1]/input")).sendKeys(employerN);
         driver2.findElement(By.xpath("//*[@id=\"incomeInfo\"]/div[2]/div[3]/div/div/form/div[3]/div[2]/div/div[2]/input")).sendKeys(superName);
         driver2.findElement(By.xpath("//*[@id=\"incomeInfo\"]/div[2]/div[3]/div/div/form/div[3]/div[2]/div/div[3]/input")).sendKeys(postHold);
         driver2.findElement(By.xpath("//*[@id=\"incomeInfo\"]/div[2]/div[3]/div/div/form/div[3]/div[2]/div/div[4]/input")).sendKeys(workPhone);
         
        
         
         System.out.println("hireDate: " + hireDate);
         driver2.findElement(By.xpath("//*[@id=\"incomeInfo\"]/div[2]/div[3]/div/div/form/div[3]/div[2]/div/div[5]/div/input")).sendKeys(hireDate);
         
        }else if(employmentPayment == "Self-Employment"){
        dropdown3.selectByIndex(3);
        SnapSelectWeek(driver2);
        
        driver2.findElement(By.xpath("//*[@id=\"incomeInfo\"]/div[2]/div[3]/div/div/form/div[3]/div[2]/div/div[1]/input")).sendKeys(employerN);
        driver2.findElement(By.xpath("//*[@id=\"incomeInfo\"]/div[2]/div[3]/div/div/form/div[3]/div[2]/div/div[1]/input")).sendKeys(postHold);
        driver2.findElement(By.xpath("//*[@id=\"incomeInfo\"]/div[2]/div[3]/div/div/form/div[3]/div[3]/div/div[4]/div/div[1]/input")).sendKeys(yearsAtJob); 
        driver2.findElement(By.xpath("//*[@id=\"incomeInfo\"]/div[2]/div[3]/div/div/form/div[3]/div[3]/div/div[4]/div/div[2]/input")).sendKeys(monthsAtJob);
        //*[@id="incomeInfo"]/div[2]/div[3]/div/div/form/div[3]/div[3]/div/div[4]/div/div[1]/input years
        //*[@id="incomeInfo"]/div[2]/div[3]/div/div/form/div[3]/div[3]/div/div[4]/div/div[2]/input  months
        
        
        }else if(employmentPayment == "Social Security"){
        dropdown3.selectByIndex(4);
        SnapSelectWeek(driver2);
        }else{
        dropdown3.selectByIndex(5);
        SnapSelectWeek(driver2);
        }
        
        
        
        
        
         Thread.sleep(500);
         //TODO PUT THE OTHER VERIATION OF INCOME TYPES
         
        //driver2.findElement(By.xpath("//*[@id=\"incomeInfo\"]/div[2]/div[3]/div/div/form/div[3]/div[1]/div[1]/div[1]/div/div[2]/a[1]")).click();
         
         
         Thread.sleep(500);
         driver2.findElement(By.xpath("//*[@id=\"incomeInfo\"]/div[2]/div[3]/div/div/form/div[3]/div[6]/div[2]/button[1]")).click();
         System.out.println("Finished page three snap ");
         Thread.sleep(2500);
        // if(0 != driver2.FindElements(By.cssSelector("a.btn.btn-success.btn-mega")).Count){
        driver2.findElement(By.xpath("//*[@id=\"submitInfo\"]/div[2]/form/div[2]/label[1]/input")).click();
       driver2.findElement(By.xpath("//*[@id=\"submitInfo\"]/div[2]/form/div[2]/label[2]/input")).click();
           
           }
        catch(Exception e){
        System.out.println("Element not Found on third page" + e );
        }
   
       
        System.out.println("I Finished the last one");
   
   
   }
   
   public void ProgressFinance(WebDriver driver3){
    
          try{
              if(ProgressBar){
           driver3.manage().window().setPosition(new Point(-2000, 0));
            }
               Thread.sleep(500);
        driver3.findElement(By.id("btn-content-apply")).click();
        driver3.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/form/section/div[2]/div/label/span")).click();
        driver3.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/form/section/div[3]/div[1]/button")).click();
               Thread.sleep(1500);
        driver3.findElement(By.name("Customer_FirstName")).sendKeys(firstName);
        driver3.findElement(By.name("Customer_LastName")).sendKeys(lastName);
        driver3.findElement(By.name("Customer_DateOfBirth")).sendKeys(dOb);
        driver3.findElement(By.name("Customer_SSN")).sendKeys(ssN);
        driver3.findElement(By.id("MoveNext")).click();
        //Thread.sleep(2000);
        
        WebElement secondPageProgressive = (new WebDriverWait(driver3, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Customer_Email\"]")));
        
        
        SetText(driver3,"//*[@id=\"Customer_Email\"]",emailN,true);
        //driver3.findElement(By.name("Customer_Email")).sendKeys(emailN);
        
        Select dropdown41 = new Select(driver3.findElement(By.name("PrimaryPhone_Type"))); //TODO: Make if statment
        dropdown41.selectByIndex(1);
        
        driver3.findElement(By.name("PrimaryPhone_Number")).sendKeys(phoneN1);
        
        Select dropdown42 = new Select(driver3.findElement(By.name("AdditionalPhone_Type"))); //TODO: Make if statment
        dropdown42.selectByIndex(1);
        
        driver3.findElement(By.id("AdditionalPhone_Number")).sendKeys(phoneN2);
                
        driver3.findElement(By.id("MoveNext")).click();
        Thread.sleep(2000);
        //About you two
        
        driver3.findElement(By.id("Address_Line1")).sendKeys(streetAddress);
        driver3.findElement(By.id("Address_Line2")).sendKeys(unitN);
        driver3.findElement(By.id("Address_City")).sendKeys(cityN);
        driver3.findElement(By.id("Address_State")).sendKeys(stateN);
        driver3.findElement(By.id("Address_Zip")).sendKeys(zipN);
        driver3.findElement(By.id("Residence_YearsAtAddress")).sendKeys(addYears);
        driver3.findElement(By.id("Residence_MonthsAtAddress")).sendKeys(addMonths);
       
        System.out.println("Filled in the address"); 
        driver3.findElement(By.id("Residence_MonthsAtAddress")).sendKeys(Keys.TAB);
        WebElement tempProgressive = driver3.findElement(By.id("Residence_MonthsAtAddress"));
        tempProgressive.sendKeys(Keys.TAB);
        tempProgressive.sendKeys(Keys.ENTER);
        Thread.sleep(500);
        //driver3.findElement(By.xpath("//*[@id='MoveNext']")).click();
        //    Thread.sleep(2000);
        //Rent or Own
        if(Rent){
          driver3.findElement(By.id("Residence_HousingStatus_Rent")).click();
        }
        else if(Own){
        driver3.findElement(By.id("Residence_HousingStatus_Own")).click();
        }
            Thread.sleep(2000);
                 
        Select dropdown43 = new Select(driver3.findElement(By.id("Identification_IdentificationType"))); //TODO: Make if statment
        dropdown43.selectByIndex(1); 
        
        driver3.findElement(By.id("Identification_Number")).sendKeys(dlN);
        driver3.findElement(By.id("Identification_State")).sendKeys(stateK);
               
        driver3.findElement(By.id("MoveNext")).click();
            Thread.sleep(2000);
           
            //Checkpoint
           
         if(employmentPayment == "Direct Deposit from Employer" || employmentPayment == "Paychecks from Employer" ){
         driver3.findElement(By.id("IncomeSource_IncomeType")).sendKeys("Employed Full-Time");
         
          driver3.findElement(By.id("MoveNext")).click();
            Thread.sleep(2000);
                    
        driver3.findElement(By.id("IncomeSource_EmployerLookup")).sendKeys(employerN);
        driver3.findElement(By.id("MoveNext")).click();
            Thread.sleep(2000);
                    
        driver3.findElement(By.id("IncomeSource_EmployerName")).sendKeys(superName); 
        driver3.findElement(By.id("IncomeSource_EmployerPhone")).sendKeys(workPhone); 
        driver3.findElement(By.id("IncomeSource_Zip")).sendKeys(zipN); 
        driver3.findElement(By.id("MoveNext")).click();
        Thread.sleep(2000);   
        }else if(employmentPayment == "Self-Employment"){
         driver3.findElement(By.id("IncomeSource_IncomeType")).sendKeys("Self-Employed");
         
              driver3.findElement(By.id("MoveNext")).click();
            Thread.sleep(2000);
                    
        driver3.findElement(By.id("IncomeSource_EmployerLookup")).sendKeys(employerN);
        driver3.findElement(By.id("MoveNext")).click();
            Thread.sleep(2000);
                    
        driver3.findElement(By.id("IncomeSource_EmployerName")).sendKeys(superName); 
        driver3.findElement(By.id("IncomeSource_EmployerPhone")).sendKeys(workPhone); 
        driver3.findElement(By.id("IncomeSource_Zip")).sendKeys(zipN); 
        driver3.findElement(By.id("MoveNext")).click();
        Thread.sleep(2000); 
        }else if(employmentPayment == "Social Security"){ 
            driver3.findElement(By.id("IncomeSource_IncomeType")).sendKeys("Social Security");
            
                 driver3.findElement(By.id("MoveNext")).click();
            Thread.sleep(2000);
                     
        }else{ 
            driver3.findElement(By.id("IncomeSource_IncomeType")).sendKeys("Other");
            
                 driver3.findElement(By.id("MoveNext")).click();
            Thread.sleep(2000); 
        }
             
       
        
        
        driver3.findElement(By.id("IncomeSource_EmployedYears")).sendKeys(yearsAtJob); 
        driver3.findElement(By.id("IncomeSource_EmployedMonths")).sendKeys(monthsAtJob); 
        
              
        driver3.findElement(By.id("IncomeSource_MonthlyIncome")).sendKeys(incomeN); 
        driver3.findElement(By.id("MoveNext")).click();
        Thread.sleep(2000); 
        
        //TODO: Weekly, or ByWeekly
        //dropdown.selectByValue(Pay);
         if(Pay == "Weekly"){
         driver3.findElement(By.id("IncomeSource_PayFrequencyType")).sendKeys("Weekly");
         driver3.findElement(By.id("IncomeSource_PreviousPayDate")).sendKeys(recentPay);
         System.out.println(Pay);
         }else if(Pay == "Bi weekly"){
         driver3.findElement(By.id("IncomeSource_PayFrequencyType")).sendKeys("Every Other Week");
         driver3.findElement(By.id("IncomeSource_PreviousPayDate")).sendKeys(recentPay);
         System.out.println(Pay);
         }else if(Pay == "Twice Monthly"){
         driver3.findElement(By.id("IncomeSource_PayFrequencyType")).sendKeys("Twice Per Month");
         driver3.findElement(By.id("IncomeSource_PreviousPayDate")).sendKeys(recentPay);
         driver3.findElement(By.id("IncomeSource_NextPayDate")).sendKeys(nextPay);
         System.out.println(Pay);
         }else if(Pay == "Monthly"){
         driver3.findElement(By.id("IncomeSource_PayFrequencyType")).sendKeys("Monthly");
         driver3.findElement(By.id("IncomeSource_PreviousPayDate")).sendKeys(recentPay);
         driver3.findElement(By.id("IncomeSource_NextPayDate")).sendKeys(nextPay);
         System.out.println(Pay);
         }
 
         
        driver3.findElement(By.id("MoveNext")).click();
        Thread.sleep(2000); 
            
        
        driver3.findElement(By.id("BankAccount_RoutingNumber")).sendKeys(routingNumber); 
        driver3.findElement(By.id("BankAccount_AccountNumber")).sendKeys(accountNumber); 
        driver3.findElement(By.id("BankAccount_OpenYear")).sendKeys(yearAccountOpen); 
        driver3.findElement(By.id("BankAccount_OpenMonth")).sendKeys(monthAccountOpen); 
        Thread.sleep(1000);
        driver3.findElement(By.id("MoveNext")).click();
        Thread.sleep(2000); 
        
        driver3.findElement(By.id("IncomeSource_IsDirectDeposit_Yes")).click();
        Thread.sleep(2000); 
        
        driver3.findElement(By.id("PaymentCard_CardNumber")).sendKeys(cardNumber); 
        // driver3.findElement(By.id("PaymentCard_ExpirationMonth")).sendKeys(expMonth); 
        // #PaymentCard_ExpirationMonth
        Select dropdown = new Select(driver3.findElement(By.id("PaymentCard_ExpirationMonth")));
        dropdown.selectByIndex(monthExp.getSelectedIndex() + 1);
        driver3.findElement(By.id("PaymentCard_ExpirationYear")).sendKeys(expYear);  
        driver3.findElement(By.id("MoveNext")).click();
        Thread.sleep(2000);    
               
        driver3.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/form/div/div[1]/section/div[1]/div/label/span")).click();                 
        //Six next buttons
        WebElement tempProgressive1 = driver3.findElement(By.id("PaymentCard_Zip"));
         tempProgressive1.sendKeys(Keys.TAB);
        
        tempProgressive1.sendKeys(Keys.ENTER);
        Thread.sleep(500);
        //driver3.findElement(By.id("MoveNext")).click();
        Thread.sleep(2000); 
         
        driver3.findElement(By.xpath("//*[@id=\"edit-review-btn\"]")).click(); 
        
        /*
        WebElement tempProg = driver3.findElement(By.xpath("//*[@id=\"edit-review-btn\"]"));
        //*[@id="edit-review-btn"]
        tempProg.sendKeys(Keys.TAB);
        tempProg.sendKeys(Keys.SPACE);
        */
       driver3.findElement(By.name("span")).click();                 
       
                  ///driver3.findElement(By.id("submit-app")).click();
          }    catch(Exception e){
        System.out.println("Element not Found on 4th page(Progressive)" + e);
        } 
    }
   
    
    public void PerferredFinance(WebDriver driver4){
        try{
            if(ProgressBar){
           driver4.manage().window().setPosition(new Point(-2000, 0));
            }
            //Thread.sleep(2000);
            //Select company
            WebElement firstpageMP = (new WebDriverWait(driver4, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/div[5]/div/div[5]/div/div/div/div/div[2]/div/div[2]/div/div/fieldset[2]/div/div/div[8]/div/div/div[2]/span/span/input[1]")));
            
            
            //*[@id="dealerGrid"]/div[2]/table/tbody/tr[1]/td[1]/label
            driver4.findElement(By.xpath("//*[@id=\"dealerGrid\"]/div[2]/table/tbody/tr[1]/td[1]/label")).click();
            
            //SetText(driver4, "/html/body/form/div[5]/div/div[5]/div/div/div/divdiv[2]/div/div[2]/div/div/fieldset[2]/div/div/div[8]/div/div/div[2]/span/span/input", addYears, true);
           
            //SetText(driver4, "/html/body/form/div[5]/div/div[5]/div/div/div/div/div[2]/div/div[2]/div/div/fieldset[2]/div/div/div[8]/div/div/div[3]/span/span/input", addMonths, true);
            WebElement firstpageMP1 = (new WebDriverWait(driver4, 100)).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/div[5]/div/div[5]/div/div/div/div/div[2]/div/div[2]/div/div/fieldset[2]/div/div/div[8]/div/div/div[2]/span/span/input"))); 
            
            driver4.findElement(By.xpath("/html/body/form/div[5]/div/div[5]/div/div/div/div/div[2]/div/div[2]/div/div/fieldset[2]/div/div/div[8]/div/div/div[2]/span/span/input")).sendKeys(addYears);
             Thread.sleep(500);
            driver4.findElement(By.xpath("/html/body/form/div[5]/div/div[5]/div/div/div/div/div[2]/div/div[2]/div/div/fieldset[2]/div/div/div[8]/div/div/div[3]/span/span/input")).sendKeys(addMonths);
            
            driver4.findElement(By.xpath("/html/body/form/div[5]/div/div[5]/div/div/div/div/div[2]/div/div[2]/div/div/fieldset[2]/div/div/div[1]/div/div[1]/div/div/input")).sendKeys(firstName);
            driver4.findElement(By.xpath("/html/body/form/div[5]/div/div[5]/div/div/div/div/div[2]/div/div[2]/div/div/fieldset[2]/div/div/div[1]/div/div[2]/div/div/input")).sendKeys(lastName);
            
            SetText(driver4, "/html/body/form/div[5]/div/div[5]/div/div/div/div/div[2]/div/div[2]/div/div/fieldset[2]/div/div/div[2]/div/div[1]/div/div/input", ssN,true);
            
            //Pasing DOB to have 04/08/1982
            //Might not need to be here
            //String s = dOb; 
            //System.out.println(java.util.Arrays.toString(s.split("(?<=\\G..)")));
            //String[] tokens = s.split("(?<=\\G..)");
            //System.out.println(tokens[0]);
            //System.out.println(tokens[1]);
            //System.out.println(tokens[2]+tokens[3]);            

            //driver4.findElement(By.xpath("/html/body/form/div[5]/div/div[5]/div/div/div/div/div[2]/div/div[2]/div/div/fieldset[2]/div/div/div[2]/div/div[2]/div/span[1]/span/input")).sendKeys(tokens[0] + "/" + tokens[1] + "/" +tokens[2]+tokens[3]);
//Figure out new MP Select DOB Checkpoint
                                             
            driver4.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_Step1RadPageView\"]/div/fieldset[2]/div/div/div[2]/div/div[2]/div/span[1]/span/span[2]/span")).click();
            //Click on month
            Thread.sleep(500);
            driver4.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_UC_Step1_pDobMMSelect_listbox\"]/li["+(dObM+1)+"]")).click();
            
            driver4.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_Step1RadPageView\"]/div/fieldset[2]/div/div/div[2]/div/div[2]/div/span[3]/span/span[2]/span")).click();
            //Click on Day
            
            Thread.sleep(500);
            driver4.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_UC_Step1_pDobDDSelect_listbox\"]/li["+(dObD+1)+"]")).click();
            
            driver4.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_Step1RadPageView\"]/div/fieldset[2]/div/div/div[2]/div/div[2]/div/span[5]/span/span[2]/span")).click();
            //Click on 
            Thread.sleep(500);
            driver4.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_UC_Step1_pDobYYYYSelect_listbox\"]/li["+(dObY+1)+"]")).click();
            
            
            driver4.findElement(By.id("ContentPlaceHolder1_UC_Step1_pLicenseTextBox")).sendKeys(dlN);
            
            String license_state_click_xpath = "//div[@id='ContentPlaceHolder1_Step1RadPageView']/div/fieldset[2]/div/div/div[3]/div/div[2]/div/span/span/span";
            driver4.findElement(By.xpath(license_state_click_xpath)).click();
            
            Thread.sleep(500);
            
            String license_state_xpath = "//*[@id=\"ContentPlaceHolder1_UC_Step1_pLicenseStateSelect_listbox\"]/li[" + (stateKMP + 1) + "]";
            driver4.findElement(By.xpath(license_state_xpath)).click();
            
            
            
            //TODO:Fix stated
            //driver4.findElement(By.xpath("/html/body/form/div[5]/div/2div[5]/div/div/div/div/div[2]/div/div[2]/div/div/fieldset[2]/div/div/div[3]/div/div[2]/div/span[1]/span/span[2]/span")).click();
            //Thread.sleep(1000);

            //driver4.findElement(By.xpath("/html/body/form/div[5]/div/div[5]/div/div/div/div/div[2]/div/div[2]/div/div/fieldset[2]/div/div/div[3]/div/div[2]/div/span[1]/span/span[1]")).sendKeys("GA");
            //driver4.findElement(By.xpath("/html/body/form/div[5]/div/div[5]/div/div/div/div/div[2]/div/div[2]/div/div/fieldset[2]/div/div/div[3]/div/div[2]/div/span[1]/span/span[1]")).sendKeys("GA");
            //Thread.sleep(1000);
            driver4.findElement(By.xpath("/html/body/form/div[5]/div/div[5]/div/div/div/div/div[2]/div/div[2]/div/div/fieldset[2]/div/div/div[4]/div/div/div/div/input")).sendKeys(streetAddress);
            driver4.findElement(By.xpath("/html/body/form/div[5]/div/div[5]/div/div/div/div/div[2]/div/div[2]/div/div/fieldset[2]/div/div/div[5]/div/div[1]/div/div/input")).sendKeys(unitN);
            
            
            String zip_xpath = "//*[@id=\"ContentPlaceHolder1_UC_Step1_pZipTextBox\"]";
            SetText(driver4, zip_xpath, zipN, true);
            
            Thread.sleep(500);
            String phone_xpath = "//*[@id=\"ContentPlaceHolder1_UC_Step1_pMobileTextBox\"]";
            SetText(driver4, phone_xpath, phoneN1, true); 
            
            String phone_alt_xpath = "//*[@id=\"ContentPlaceHolder1_UC_Step1_pOtherPhoneTextBox\"]";
            SetText(driver4, phone_alt_xpath, phoneN2, true);

            //String res_years_xpath = "//*[@id=\"ContentPlaceHolder1_UC_Step1_pResidenceYearsTextBox\"]";
            // driver4.findElement(By.xpath(res_years_xpath)).sendKeys(addYears);
            //while(driver4.findElement(By.xpath(res_years_xpath)).getText().length() < 1)
            //    driver4.findElement(By.xpath(res_years_xpath)).sendKeys(addYears);

            //Thread.sleep(500);
            //String res_months_xpath = "//*[@id=\"ContentPlaceHolder1_UC_Step1_pResidenceMonthsTextBox\"]";
            //while(driver4.findElement(By.xpath(res_months_xpath)).getText().length() < 1)
              //  driver4.findElement(By.xpath(res_months_xpath)).sendKeys(addMonths);
            
            //Thread.sleep(1500);
            String rent_xpath = "//div[@id='pOwnStatusDiv']/label";
            String own_xpath = "//div[@id='pOwnStatusDiv']/label[2]";
            String rent_own_choice_xpath = rent.isSelected() ? rent_xpath : own_xpath;
            driver4.findElement(By.xpath(rent_own_choice_xpath)).click();
            System.out.println("maybe here?");
            
            Thread.sleep(500);
            String email_xpath = "//input[@id='ContentPlaceHolder1_UC_Step1_pEmailTextBox']";
            driver4.findElement(By.xpath(email_xpath)).sendKeys(emailN);
            
            Thread.sleep(500);
            String accept_xpath = "//div[@id='ContentPlaceHolder1_UC_Step1_DeclarationDiv']/label";
            driver4.findElement(By.xpath(accept_xpath)).click();
            
            driver4.findElement(By.id("ContentPlaceHolder1_UC_Step1_AcceptContinueButtonSpan")).click();
             
            
            WebElement secondPage = (new WebDriverWait(driver4, 10)).until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_UC_Step2_pRoutingNumTextBox")));
            //*[@id="ContentPlaceHolder1_UC_Step2_pReRoutingNumTextBox"]
         
            SetText(driver4,"//*[@id=\"ContentPlaceHolder1_UC_Step2_pRoutingNumTextBox\"]",routingNumber,true); 
            SetText(driver4,"//*[@id=\"ContentPlaceHolder1_UC_Step2_pReRoutingNumTextBox\"]",routingNumber,true); 
            SetText(driver4,"//*[@id=\"ContentPlaceHolder1_UC_Step2_pAccountNumTextBox\"]",accountNumber,true); 
            SetText(driver4,"//*[@id=\"ContentPlaceHolder1_UC_Step2_pReAccountNumTextBox\"]",accountNumber,true); 
            
            driver4.findElement(By.id("ContentPlaceHolder1_UC_Step2_pBankNameTextBox")).sendKeys(bankName);
            driver4.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_Step2RadPageView\"]/div/fieldset/div/div/div[4]/div/div[1]/div/span[1]/span/span[2]")).click();
            Thread.sleep(150);
            driver4.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_UC_Step2_pAccountTypeSelect_listbox\"]/li[1]")).click();
            Thread.sleep(150);
            
              //TODO: Make if statment

              //Submit button
            driver4.findElement(By.id("ContentPlaceHolder1_UC_Step2_AcceptContinueButton")).click();
 
        System.out.println("Checking the last page");
        
        WebElement lastPage = (new WebDriverWait(driver4, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='ContentPlaceHolder1_UC_Step3_pEmploymentTypeRepeater_pEmploymentTypeCheckBoxLabel_0']")));
        
        
        
            System.out.println("Checkpoint");
            //driver4.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_UC_Step3_step3Div\"]/fieldset[1]/div/div[2]/div[2]/div/div[2]/div/span[1]")).sendKeys(yearsAtJob);
            ((JavascriptExecutor) driver4).executeScript("document.getElementsByName('ctl00$ContentPlaceHolder1$UC_Step3$pEmpYearsTextBox')[0].value = '"+ yearsAtJob +"' "); 
            ((JavascriptExecutor) driver4).executeScript("document.getElementsByName('ctl00$ContentPlaceHolder1$UC_Step3$pEmpMonthsTextBox')[0].value = '"+ monthsAtJob +"' "); 
            ((JavascriptExecutor) driver4).executeScript("document.getElementsByName('ctl00$ContentPlaceHolder1$UC_Step3$pGmiTextBox')[0].value = '"+ incomeN +"' "); 
            System.out.println("Checkpoint1");
            
        
            driver4.findElement(By.xpath("//*[@id='ContentPlaceHolder1_UC_Step3_pEmploymentTypeRepeater_pEmploymentTypeCheckBoxLabel_0']")).click();
            driver4.findElement(By.id("ContentPlaceHolder1_UC_Step3_pTitleTextBox")).sendKeys(postHold);
            driver4.findElement(By.id("ContentPlaceHolder1_UC_Step3_pEmployerTextBox")).sendKeys(employerN);
            driver4.findElement(By.id("ContentPlaceHolder1_UC_Step3_pEmpPhoneTextBox")).sendKeys(employerPhone);
            
          
           // driver4.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_UC_Step3_step3Div\"]/fieldset[1]/div/div[2]/div[2]/div/div[2]/div/span[1]/span/input[1]")).sendKeys(yearsAtJob);
        
           // Thread.sleep(2000); 
            /*
            WebElement tempMerchant = driver4.findElement(By.id("ContentPlaceHolder1_UC_Step3_pEmpPhoneTextBox"));
          //*[@id="edit-review-btn"]
        tempMerchant.sendKeys(Keys.TAB);
        tempMerchant.sendKeys(monthsAtJob);
        tempMerchant.sendKeys(Keys.TAB);
        tempMerchant.sendKeys(incomeN);
            */
           // driver4.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_UC_Step3_step3Div\"]/fieldset[1]/div/div[2]/div[4]/div/div/div/span[1]/span/span[2]/span")).click();
            //*[@id="pDirectDipositDiv"]/label[1]
            
            System.out.println(employmentPayment);
           if(employmentPayment == "Direct Deposit from Employer"){
               driver4.findElement(By.xpath("//*[@id=\"pDirectDipositDiv\"]/label[1]")).click();
           }else if(employmentPayment == "Social Security"){
               driver4.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_UC_Step3_pEmploymentTypeRepeater_pEmploymentTypeCheckBoxLabel_1\"]")).click();
           } else if(employmentPayment == "Self-Employment"){
               driver4.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_UC_Step3_pEmploymentTypeRepeater_pEmploymentTypeCheckBoxLabel_3\"]")).click();
           }else{// Other
               driver4.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_UC_Step3_pEmploymentTypeRepeater_pEmploymentTypeCheckBoxLabel_4\"]")).click();
           }
            //else if(employmentPayment == "Direct Deposit from Employer"){//Retired
            //   driver4.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_UC_Step3_pEmploymentTypeRepeater_pEmploymentTypeCheckBoxLabel_2\"]")).click();
           //} 
              
            driver4.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_UC_Step3_step3Div\"]/fieldset[1]/div/div[2]/div[7]/div/div/div/span[1]/span/span[2]/span")).click();
            Thread.sleep(900); 
            driver4.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_UC_Step3_PreferredLangSelect_listbox\"]/li["+toggleLang+ 1+"]")).click();
 
            String s1 = Main.nextPay; 
            System.out.println(java.util.Arrays.toString(s1.split("(?<=\\G..)")));
            String[] tokens1 = s1.split("(?<=\\G..)");
            System.out.println(tokens1[0]);
            System.out.println(tokens1[1]);
            System.out.println(tokens1[2]+tokens1[3]);            


            driver4.findElement(By.id("ContentPlaceHolder1_UC_Step3_pNextPayDateTextBox")).sendKeys(tokens1[0] + "/" + tokens1[1] + "/" + tokens1[2] + tokens1[3]);
            
            
            driver4.findElement(By.id("ContentPlaceHolder1_UC_Step3_CcNumberTextBox")).sendKeys(cardNumber);
            driver4.findElement(By.id("ContentPlaceHolder1_UC_Step3_CcCvvTextBox")).sendKeys(cardCode);
            
            
            driver4.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_UC_Step3_TwelveTermRadioLabel\"]")).click();
            
            //Checkpoint Put card finder here
            //Decode Card Type by number
           //  VISA("^4[0-9]{12}(?:[0-9]{3})?$"),
            //MASTERCARD("^5[1-5][0-9]{14}$"),
            //AMERICAN_EXPRESS("^3[47][0-9]{13}$"),
     
            // DISCOVER("^6(?:011|5[0-9]{2})[0-9]{12}$"),
       
            
            driver4.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_UC_Step3_step3Div\"]/div[1]/div[1]/div[2]/div/div/div/span[1]/span/span[2]/span")).click();
           Thread.sleep(500);
            if (cardNumber.startsWith("4")){          
           driver4.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_UC_Step3_CcTypeSelect_listbox\"]/li[4]")).click();
            }
                    else if (cardNumber.startsWith("5")){
           driver4.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_UC_Step3_CcTypeSelect_listbox\"]/li[3]")).click();
            } 
                    else if (cardNumber.startsWith("6")){                    
           driver4.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_UC_Step3_CcTypeSelect_listbox\"]/li[2]")).click();} 
                    else if (cardNumber.startsWith("3")){                    
           driver4.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_UC_Step3_CcTypeSelect_listbox\"]/li[1]")).click();
           }  
             //Same as physical address
             driver4.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_UC_Step3_Fieldset1\"]/div[1]/div/div/label[1]")).click();
            //*[@id="ContentPlaceHolder1_UC_Step3_step3Div"]/div[1]/div[1]/div[3]/div/div[1]/div/span[1]/span/span[2]/span
            driver4.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_UC_Step3_step3Div\"]/div[1]/div[1]/div[3]/div/div[1]/div/span[1]/span/span[2]/span")).click();
            Thread.sleep(500);
            System.out.println("We are trying to find the month" + expMonthMP);
            driver4.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_UC_Step3_CcExpMonthSelect_listbox\"]/li["+(expMonthMP+1)+"]")).click();
            driver4.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_UC_Step3_step3Div\"]/div[1]/div[1]/div[3]/div/div[1]/div/span[3]/span/span[2]/span")).click();
            Thread.sleep(500);
           driver4.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_UC_Step3_CcExpYearSelect_listbox\"]/li["+(expYearMP+1)+"]")).click();
// driver4.findElement(By.id("ContentPlaceHolder1_UC_Step3_CcSameAsPRadio")).click();
            
            driver4.findElement(By.id("ContentPlaceHolder1_UC_Step3_Ref1FnameTextBox")).sendKeys(reference1);
            driver4.findElement(By.id("ContentPlaceHolder1_UC_Step3_Ref1LnameTextBox")).sendKeys(reference1Last);
            //driver4.findElement(By.id("ContentPlaceHolder1_UC_Step3_Ref1PhoneTextBox")).sendKeys(refPhone1);
            
            SetText(driver4,"//*[@id=\"ContentPlaceHolder1_UC_Step3_Ref1PhoneTextBox\"]",refPhone1,true);
            
            driver4.findElement(By.id("ContentPlaceHolder1_UC_Step3_Ref2FnameTextBox")).sendKeys(reference2);
            driver4.findElement(By.id("ContentPlaceHolder1_UC_Step3_Ref2LnameTextBox")).sendKeys(reference2Last);
            //driver4.findElement(By.id("ContentPlaceHolder1_UC_Step3_Ref2PhoneTextBox")).sendKeys(refPhone2);
            driver4.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_UC_Step3_Fieldset2\"]/div/div/div[3]/div/span[1]/span/span[2]")).click();
            Thread.sleep(500);
            if(RelationRef == "Aunt" || RelationRef == "Uncle"){
            driver4.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_UC_Step3_Ref1RelationshipSelect_listbox\"]/li[1]")).click();
            }else if(RelationRef == "Brother" || RelationRef == "Sister" || RelationRef == "Wife" || RelationRef == "Husband" ){
            driver4.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_UC_Step3_Ref1RelationshipSelect_listbox\"]/li[2]")).click();
            }else if(RelationRef == "Grand Parent"){
            driver4.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_UC_Step3_Ref1RelationshipSelect_listbox\"]/li[3]")).click();
            }else if(RelationRef == "Parent"){
            driver4.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_UC_Step3_Ref1RelationshipSelect_listbox\"]/li[4]")).click();
            }else if(RelationRef == "Son" || RelationRef == "Daughter"  ){
            driver4.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_UC_Step3_Ref1RelationshipSelect_listbox\"]/li[5]")).click();
            }
             Thread.sleep(500);
             
            driver4.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_UC_Step3_Fieldset3\"]/div/div/div[3]/div/span[1]/span/span[2]")).click();
            Thread.sleep(500);
            if(RelationRef1 == "Aunt" || RelationRef1 == "Uncle"  ){
            driver4.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_UC_Step3_Ref2RelationshipSelect_listbox\"]/li[1]")).click();
            }else if(RelationRef1 == "Brother" || RelationRef1 == "Sister" || RelationRef1 == "Wife" || RelationRef1 == "Husband"){
            driver4.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_UC_Step3_Ref2RelationshipSelect_listbox\"]/li[2]")).click();
            }else if(RelationRef1 == "Grand Parent"){
            driver4.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_UC_Step3_Ref2RelationshipSelect_listbox\"]/li[3]")).click();
            }else if(RelationRef1 == "Parent"){
            driver4.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_UC_Step3_Ref2RelationshipSelect_listbox\"]/li[4]")).click();
            }else if(RelationRef1 == "Son" || RelationRef1 == "Daughter"  ){
            driver4.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_UC_Step3_Ref2RelationshipSelect_listbox\"]/li[5]")).click();
            }
             Thread.sleep(500);
            
        SetText(driver4,"//*[@id=\"ContentPlaceHolder1_UC_Step3_Ref2PhoneTextBox\"]",refPhone2,true);
            
             
        /* 
             WebElement tempMerchant = driver4.findElement(By.id("ContentPlaceHolder1_UC_Step3_pNextPayDateTextBox"));
        tempMerchant.sendKeys(Keys.chord(Keys.TAB, Keys.SHIFT)); 
        tempMerchant.sendKeys(Keys.chord(Keys.TAB, Keys.SHIFT));
        tempMerchant.sendKeys(incomeN);
        tempMerchant.sendKeys(Keys.chord(Keys.TAB, Keys.SHIFT));
        tempMerchant.sendKeys(monthsAtJob);
          */   //*[@id="ContentPlaceHolder1_UC_Step3_step3Div"]/fieldset[1]/div/div[2]/div[2]/div/div[2]/div/span[1]/span/span/span[2]/span
//*[@id="ContentPlaceHolder1_UC_Step3_step3Div"]/fieldset[1]/div/div[2]/div[2]/div/div[2]/div/span[1]/span/input[1]

driver4.findElement(By.name("ctl00$ContentPlaceHolder1$UC_Step3$pEmpYearsTextBox")).sendKeys(yearsAtJob);
driver4.findElement(By.name("ctl00$ContentPlaceHolder1$UC_Step3$pEmpMonthsTextBox")).sendKeys(monthsAtJobCR);          

          System.out.println("Clicking last things to make adjustments");
             driver4.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_UC_Step3_step3Div\"]/fieldset[1]/div/div[2]/div[2]/div/div[2]/div/span[1]/span/span/span[1]/span")).click();
             driver4.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_UC_Step3_step3Div\"]/fieldset[1]/div/div[2]/div[2]/div/div[2]/div/span[1]/span/span/span[2]/span")).click();
             System.out.println("Clicking last things to make adjustments1");
             
             driver4.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_UC_Step3_step3Div\"]/fieldset[1]/div/div[2]/div[3]/div/div[1]/div/span[1]/span/span/span[1]/span")).click();
             driver4.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_UC_Step3_step3Div\"]/fieldset[1]/div/div[2]/div[3]/div/div[1]/div/span[1]/span/span/span[2]/span")).click();
             System.out.println("Clicking last things to make adjustments2");
             
              
             driver4.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_UC_Step3_step3Div\"]/fieldset[1]/div/div[2]/div[3]/div/div[2]/div/span[1]/span/span/span[1]/span")).click();
             driver4.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_UC_Step3_step3Div\"]/fieldset[1]/div/div[2]/div[3]/div/div[2]/div/span[1]/span/span/span[2]/span")).click();
             System.out.println("Clicking last things to make adjustments3");
             
             
              
            Thread.sleep(500);
            //if(Integer.parseInt(Pay) == 0){
             
                driver4.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_UC_Step3_step3Div\"]/fieldset[1]/div/div[2]/div[4]/div/div/div/span[1]/span/span[2]")).click();
                
                System.out.println("This is the payment time " + Pay + " Something" + PayMP );
                Thread.sleep(1000);
            if(PayMP == 0){
                    System.out.println("Click on weekly");
              //  WebElement weeklywait = (new WebDriverWait(driver4, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ContentPlaceHolder1_UC_Step3_pPayFreqSelect_listbox\"]/li[2]")));
                
            
            driver4.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_UC_Step3_pPayFreqSelect_listbox\"]/li[2]")).click();       
            System.out.println("we click on weekly");
            }else if(PayMP == 1){//*[@id="ContentPlaceHolder1_UC_Step3_pPayFreqSelect_listbox"]/li[2]
                 //  WebElement buWeeklyWait = (new WebDriverWait(driver4, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ContentPlaceHolder1_UC_Step3_pPayFreqSelect_listbox\"]/li[1]")));
            
            driver4.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_UC_Step3_pPayFreqSelect_listbox\"]/li[1]")).click();            
            }else if(PayMP == 2){//*[@id="ContentPlaceHolder1_UC_Step3_pPayFreqSelect_listbox"]/li[1]
              //  WebElement MonthlyWait = (new WebDriverWait(driver4, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ContentPlaceHolder1_UC_Step3_pPayFreqSelect_listbox\"]/li[3]")));
            driver4.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_UC_Step3_pPayFreqSelect_listbox\"]/li[3]")).click();            
            }else if(PayMP == 3){
              //  WebElement MonthlyWait1 = (new WebDriverWait(driver4, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ContentPlaceHolder1_UC_Step3_pPayFreqSelect_listbox\"]/li[3]")));
            driver4.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_UC_Step3_pPayFreqSelect_listbox\"]/li[3]")).click();  
            
            }
             
             
             
            System.out.println("Finished Merchants Preferred");
       
        } catch(Exception e){
            System.out.println("Element not Found on 5th page (Perferred)" +  e);
      }
    }


    public void TempoeFinance(WebDriver driver5){
           try{
               driver5.manage().window().maximize(); 
               
               if(ProgressBar){
           driver5.manage().window().setPosition(new Point(-2000, 0));
            }
            Thread.sleep(2500);
            //Select company
             
            System.out.println("Started Tempo");
            
            driver5.findElement(By.xpath("//*[@id=\"txtConsumerFirstName\"]")).sendKeys(firstName);
            driver5.findElement(By.xpath("//*[@id=\"txtConsumerFirstName\"]")).sendKeys(lastName);
            driver5.findElement(By.id("txtConsumerMiddleInitial")).sendKeys(middleName);
            
            
            driver5.findElement(By.id("txtConsumerEmail")).sendKeys(emailN);
            driver5.findElement(By.id("txtConsumerEmailValidate")).sendKeys(emailN);
            
                    
            driver5.findElement(By.id("txtPrimaryPhone")).sendKeys(phoneN1);
            driver5.findElement(By.id("txtSecondaryPhone")).sendKeys(phoneN2);
         
            driver5.findElement(By.id("txtPositiveIdNumber")).sendKeys(dlN);
            
            driver5.findElement(By.id("ddlPositiveIdIssuanceLocation")).sendKeys(stateK);
            
            driver5.findElement(By.id("txtConsumerSSN")).sendKeys(ssN);
            driver5.findElement(By.id("txtConsumerSSNValidate")).sendKeys(ssN);
            driver5.findElement(By.id("txtConsumerDOB")).click();
                                
            //Pasing DOB to have 04/08/1982
            String s = dOb; 
            System.out.println(java.util.Arrays.toString(s.split("(?<=\\G..)")));
            String[] tokens = s.split("(?<=\\G..)");
            System.out.println(tokens[0]);
            System.out.println(tokens[1]);
            System.out.println(tokens[2]+tokens[3]);            

            //driver5.findElement(By.id("ddlMonthModal")).sendKeys(tokens[0] + "/" + tokens[1] + "/" +tokens[2]+tokens[3]);
            Select dropdown51 = new Select(driver5.findElement(By.id("ddlMonthModal")));
            dropdown51.selectByIndex(4);
            
            driver5.findElement(By.id("ddlDayModal")).sendKeys(tokens[1]);
            driver5.findElement(By.id("ddlYearModal")).sendKeys(tokens[2]+ tokens[3]);
            
            driver5.findElement(By.cssSelector("#pnlDataInputModal > div > div > div > div:nth-child(4) > div:nth-child(2) > a")).click();
            driver5.findElement(By.id("txtConsumerAddress1")).sendKeys(streetAddress);
            
            driver5.findElement(By.id("txtConsumerAddress2")).sendKeys(unitN);
             driver5.findElement(By.id("txtConsumerZipCode")).sendKeys(zipN);
              driver5.findElement(By.id("txtConsumerCity")).sendKeys(cityN);
               driver5.findElement(By.id("ddlConsumerState")).sendKeys(stateN);
                driver5.findElement(By.id("txtConsumerEmployerName")).sendKeys(employerN);
            driver5.findElement(By.id("txtTotalAnnualIncome")).sendKeys(incomeN);
            
            Thread.sleep(2000);

        } catch(Exception e){
            System.out.println("Element not Found on 6th page (Tempo)"+ e);
      }
    }
    
    private void OkinusFinance(WebDriver driver6) {
       try {
           
       
           if(ProgressBar){
                System.out.println("Element 123123 "); 
           driver6.manage().window().setPosition(new Point(-2000, 0));
           System.out.println("Element 321321 ");
           }
           int tempIncome = 0;           
           
            // driver6.manage().window().maximize();
                    
           Thread.sleep(1000);
           try{
               
        System.out.println("Element not Found in Okinus Financial: ");
           driver6.findElement(By.xpath("//*[@id=\"chkHaveRead\"]")).click();
           driver6.findElement(By.xpath("//*[@id=\"MainContent_btnSubmit\"]")).click();
           }catch(Exception e){
        System.out.println("Element not Found in Okinus Financial two ");
        
           }
           Thread.sleep(500);  
             
           WebElement FirstPageOkinus = (new WebDriverWait(driver6, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='offerFormConsol']/section[2]/div/div[1]/div[1]/div[1]/a/span[2]")));
           
           driver6.findElement(By.xpath("//*[@id=\"off-app-open-yes\"]")).click();
           //2017-1998
           int tempBOD = year - dObY;
           if(tempBOD <= 18){
           driver6.findElement(By.xpath("//*[@id=\"off-app-open-no\"]")).click();
           }
           System.out.println("TempBOD " + tempBOD);
           driver6.findElement(By.xpath("//*[@id='offerFormConsol']/section[2]/div/div[1]/div[1]/div[1]/a/span[2]")).click();
           if(Title == "Mr"){
          
           driver6.findElement(By.xpath("/html/body/ul[1]/li[2]/a")).click();
           //dropdown60.selectByValue("Mr.");
           }else if (Title == "Ms"){
           driver6.findElement(By.xpath("/html/body/ul[1]/li[3]/a")).click();
           //dropdown60.selectByValue("Ms.");
           }else if (Title == "Mrs"){
           driver6.findElement(By.xpath("/html/body/ul[1]/li[4]/a")).click();
           //dropdown60.selectByValue("Mrs.");
           }
           
           driver6.findElement(By.xpath("//*[@id='offerFormConsol']/section[2]/div/div[1]/div[1]/div[1]/a/span[1]")).click();
           driver6.findElement(By.xpath("//*[@id='off-app-personal-fname']")).sendKeys(firstName);
           driver6.findElement(By.xpath("//*[@id='off-app-personal-mid-ini']")).sendKeys(middleName);
           driver6.findElement(By.xpath("//*[@id='off-app-personal-lname']")).sendKeys(lastName);
           driver6.findElement(By.xpath("//*[@id='off-app-personal-street']")).sendKeys(streetAddress);
           driver6.findElement(By.xpath("//*[@id='off-app-personal-apt']")).sendKeys(unitN);
           driver6.findElement(By.xpath("//*[@id='off-app-personal-city']")).sendKeys(cityN);
           try{
           //State
            driver6.findElement(By.xpath("//*[@id='offerFormConsol']/section[2]/div/div[1]/div[2]/div[4]/a/span[2]")).click();
            ClickState(driver6 ,stateN);
            }catch(Exception e){
        System.out.println("Element not Found on Okinus  page" + "\n" + e);
        }
           driver6.findElement(By.xpath("//*[@id='off-app-personal-zip']")).sendKeys(zipN);
           driver6.findElement(By.xpath("//*[@id='off-app-personal-social-sec']")).sendKeys(ssN);
           driver6.findElement(By.xpath("//*[@id='off-app-personal-birthdate']")).sendKeys(dOb);
           
           driver6.findElement(By.xpath("//*[@id='off-app-personal-social-sec']")).click();
           Thread.sleep(200);
           driver6.findElement(By.xpath("//*[@id='off-app-personal-driver-lic']")).sendKeys(dlN);
           
           
               try{
           //State
            driver6.findElement(By.xpath("//*[@id=\"offerFormConsol\"]/section[2]/div/div[2]/div[2]/div[2]/a/span[2]")).click();
            ClickState1(driver6 ,stateN);
            
             }catch(Exception e){
             System.out.println("Element not Found in Crest Financial: " + e.getMessage());
        
           }   
          
           driver6.findElement(By.xpath("//*[@id='off-app-personal-home-phone']")).sendKeys(phoneN1);
           driver6.findElement(By.xpath("//*[@id='off-app-personal-cell-phone']")).sendKeys(phoneN2);
           driver6.findElement(By.xpath("//*[@id='off-app-personal-email']")).sendKeys(emailN);
           driver6.findElement(By.xpath("//*[@id='off-app-personal-email-confirm']")).sendKeys(emailN);
            
           try{
           driver6.findElement(By.xpath("//*[@id=\"tos_accept\"]")).click(); //Dont know what this is on Okinus
           }catch(Exception e){
        System.out.println("Element not Found in Crest Financial: " + e.getMessage());
        
           }       
           driver6.findElement(By.xpath("//*[@id=\"off-app-prim-income-yes\"]")).click();
           
           driver6.findElement(By.xpath("//*[@id=\"offerFormConsol\"]/section[4]/div/div[1]/div[1]/a/span[2]")).click();
           
           //Select dropdown60 = new Select(driver6.findElement(By.id("off-app-prim-income-pay-type")));
           //TODO Different types of income Direct Deposit from Employer, Paychecks from Employer, Self-Employment, Social Security, Long Term Disability, Military, Alimony
           Thread.sleep(200);
           System.out.println("Started"); 
           //driver6.findElement(By.xpath("//*[@id=\"offerFormConsol\"]/section[4]/div/div[1]/div[1]/a/span[2]")).click();
           if(employmentPayment == "Direct Deposit from Employer"){
          //     dropdown60.selectByIndex(1);
           driver6.findElement(By.xpath("/html/body/ul[4]/li[2]/a")).click();
           System.out.println("Clicked Direct Deposit");
           }else if(employmentPayment == "Social Security"){ 
               //  dropdown60.selectByIndex(2);
           driver6.findElement(By.xpath("html/body/ul[4]/li[3]/a")).click();
           }else if(employmentPayment == "Long Term Disability"){ 
             //    dropdown60.selectByIndex(3);
           driver6.findElement(By.xpath("html/body/ul[4]/li[4]/a")).click();
           }else if(employmentPayment == "Self-Employment"){ 
            //     dropdown60.selectByIndex(6);
           driver6.findElement(By.xpath("html/body/ul[4]/li[7]/a")).click();
           }
           
           driver6.findElement(By.xpath("//*[@id='off-app-personal-emp-name']")).sendKeys(employerN);
           driver6.findElement(By.xpath("//*[@id='off-app-prim-income-employer-phone']")).sendKeys(employerPhone);
           //TODO: Pay time frame Weekly, Bi weekly, Twice Monthly, Monthly
           //*[@id="offerFormConsol"]/section[4]/div/div[1]/div[4]/a/span[2]
           driver6.findElement(By.xpath("//*[@id=\"offerFormConsol\"]/section[4]/div/div[1]/div[4]/a/span[2]")).click();
           if(Pay == "Weekly"){
           driver6.findElement(By.xpath("/html/body/ul[5]/li[2]/a")).click();
           
           System.out.println(Integer.valueOf(incomeN) / 4);
           tempIncome = Integer.valueOf(incomeN) / 4;
           System.out.println(tempIncome);
           }else if(Pay == "Bi weekly"){
           driver6.findElement(By.xpath("/html/body/ul[5]/li[3]/a")).click();
           
           tempIncome = Integer.valueOf(incomeN) / 2;
           }else if(Pay == "Twice Monthly"){
           driver6.findElement(By.xpath("/html/body/ul[5]/li[4]/a")).click();
           
           tempIncome = Integer.valueOf(incomeN) / 2;
           }else if(Pay == "Monthly"){
           driver6.findElement(By.xpath("/html/body/ul[5]/li[5]/a")).click();
           tempIncome = Integer.valueOf(incomeN);
           }
           
          
           String tempIncomeString = String.valueOf(tempIncome);
         //  driver6.findElement(By.xpath("//*[@id='offerFormConsol']/section[4]/div/div[1]/div[4]/a/span[1]")).sendKeys(Pay);
         
           driver6.findElement(By.xpath("//*[@id='off-app-prim-income-base-pay']")).sendKeys(tempIncomeString);
           driver6.findElement(By.xpath("//*[@id='off-app-prim-income-last-pay']")).sendKeys(recentPay);
           driver6.findElement(By.xpath("//*[@id='off-app-prim-income-yes']")).click();
           driver6.findElement(By.xpath("//*[@id='off-app-personal-routing']")).sendKeys(routingNumber); 
           driver6.findElement(By.xpath("//*[@id='off-app-personal-bank-name']")).sendKeys(bankName);
           driver6.findElement(By.xpath("//*[@id='off-app-personal-checking-account']")).sendKeys(accountNumber);
          // Date today = new Date();
           String tempMonthS = "01";
           String tempDayS = "01"; 
           String tempYearS = "2016";
           
           System.out.println("Checkpoint :" + yearAccountOpen + " " + monthAccountOpen );
           int tempYear = year - Integer.parseInt(yearAccountOpen);
           int tempMonth = month - Integer.parseInt(monthAccountOpen);
           System.out.println("Checkpoint 1: " + tempYear + " " + tempMonth);
            
          if(tempMonth < 0){
          tempYear = -- year ;
          tempMonth = 12 + tempMonth ;
          }          
          if(tempMonth < 10){
          tempMonthS = "0" + tempMonth;
          }          
          if(tempMonth == 0){
          tempMonthS = "12";
          } 
          if(todayM < 10){
          tempDayS = "0" + todayM;
          } 
          tempDayS = Integer.toString(todayM);
          tempYearS = String.valueOf(tempYear); 
          
           String tempDate =  tempMonthS + tempDayS + tempYearS;
           System.out.println(tempDate);
           driver6.findElement(By.id("off-app-personal-date-opened")).sendKeys(tempDate);
           driver6.findElement(By.xpath("//*[@id='off-app-personal-debit-card-number']")).sendKeys(cardNumber);
           driver6.findElement(By.xpath("//*[@id='off-app-online-yes']")).click();
           Thread.sleep(400);
           driver6.findElement(By.xpath("//*[@id='off-app-personal-debit-bank-name']")).sendKeys(bankName);
           
           //Decode Card Type by number
           //  VISA("^4[0-9]{12}(?:[0-9]{3})?$"),
            //MASTERCARD("^5[1-5][0-9]{14}$"),
            //AMERICAN_EXPRESS("^3[47][0-9]{13}$"),
     
            // DISCOVER("^6(?:011|5[0-9]{2})[0-9]{12}$"), 
            driver6.findElement(By.xpath("//*[@id=\"offerFormConsol\"]/section[5]/div/div[2]/div[3]/a/span[2]")).click();
            if (cardNumber.startsWith("4")){          
           driver6.findElement(By.xpath("/html/body/ul[6]/li[2]/a")).click();
            }
                    else if (cardNumber.startsWith("5")){
           driver6.findElement(By.xpath("html/body/ul[6]/li[3]/a")).click();
            } 
                    else if (cardNumber.startsWith("6")){                    
           driver6.findElement(By.xpath("html/body/ul[6]/li[5]/a")).click();} 
                    else if (cardNumber.startsWith("37")){                    
           driver6.findElement(By.xpath("html/body/ul[6]/li[4]/a")).click();
           }  
            
           driver6.findElement(By.xpath("//*[@id='off-app-personal-debit-expire-date']")).sendKeys(editExpMonth(expMonth) + "/" + editExpYear(expYear));
           driver6.findElement(By.xpath("//*[@id='off-app-personal-debit-card-code']")).sendKeys(cardCode);
           
           
           //driver6.findElement(By.xpath("//*[@id=\"submitButton\"]")).click();
          
           
       } catch(Exception e){
        System.out.println("Element not Found on Okinus  page" + "\n" + e);
        }
    }
    
      private void WestCreekFinance(WebDriver driver7) {
       try {
             if(ProgressBar){
           driver7.manage().window().setPosition(new Point(-2000, 0));
            }
           /*
           driver7.findElement(By.xpath("//*[@id=\"PDNO\"]")).sendKeys("abfgreenville");
           driver7.findElement(By.xpath("//*[@id=\"userid\"]")).sendKeys("abfgreenville");
           driver7.findElement(By.xpath("//*[@id=\"wrapper\"]/form/div[2]/table/tbody/tr[3]/td[2]/input")).sendKeys("abfgreenville1");
            
           driver7.findElement(By.xpath("//*[@id=\"sbBtn\"]")).click();
           */
           
           //driver7.findElement(By.xpath("//*[@id='off-app-online-yes']")).click();
           //*[@id="nav3i"]
           //Finding new App page
           Thread.sleep(2000);
            
           driver7.findElement(By.id("WPFNAME")).sendKeys(firstName);
           driver7.findElement(By.xpath("//*[@id='WPMNAME']")).sendKeys(middleName.substring(0, 1));
           driver7.findElement(By.id("WPLNAME")).sendKeys(lastName);
           driver7.findElement(By.xpath("//*[@id=\"WPTIN\"]")).sendKeys(ssN);
           driver7.findElement(By.xpath("//*[@id=\"WPBDATE\"]")).sendKeys(dOb);
           driver7.findElement(By.xpath("//*[@id=\"WPADDR1\"]")).sendKeys(streetAddress);
           driver7.findElement(By.xpath("//*[@id=\"WPADDR2\"]")).sendKeys(unitN);
           driver7.findElement(By.xpath("//*[@id=\"WPCITY\"]")).sendKeys(cityN);
           driver7.findElement(By.xpath("//*[@id=\"WPSTATE\"]")).sendKeys(stateN);
           driver7.findElement(By.xpath("//*[@id=\"WPZIP\"]")).sendKeys(zipN);
           driver7.findElement(By.xpath("//*[@id=\"WPHPHON\"]")).sendKeys(phoneN1);
           driver7.findElement(By.xpath("//*[@id=\"WPCPHON\"]")).sendKeys(phoneN2);
           driver7.findElement(By.xpath("//*[@id=\"WPDLNO\"]")).sendKeys(dlN);
           driver7.findElement(By.xpath("//*[@id=\"WPDLST\"]")).sendKeys(stateK);
           driver7.findElement(By.xpath("//*[@id=\"WPEMAIL\"]")).sendKeys(emailN);
           //TODO:RENT OR OWN
           //CheckpointRent
           //*[@id="WPHOMEO"]
           Select dropdown71 = new Select(driver7.findElement(By.xpath("//*[@id=\"WPHOMEO\"]"))); 
         
           if(uRent){
           
         dropdown71.selectByIndex(1);
           }else if (uOwn){
         dropdown71.selectByIndex(2);  
           }else{
         dropdown71.selectByIndex(3);    
           }
           
           
           driver7.findElement(By.xpath("//*[@id=\"CEENA1\"]")).sendKeys(employerN);
           
           
           
           
           
           driver7.findElement(By.xpath("//*[@id=\"CETITLE\"]")).sendKeys(postHold);
           driver7.findElement(By.xpath("//*[@id=\"CEDATE\"]")).sendKeys(hireDate);
           driver7.findElement(By.xpath("//*[@id=\"CENET\"]")).sendKeys(incomeN);
        // Employer state dropdown /\
           driver7.findElement(By.xpath("//*[@id=\"CEEST\"]")).sendKeys(employerState);
           driver7.findElement(By.xpath("//*[@id=\"CEPHONE\"]")).sendKeys(workPhone);
           
            Select dropdown72 = new Select(driver7.findElement(By.xpath("//*[@id=\"CEPMTTYPE\"]")));
            if(employmentPayment == "Direct Deposit from Employer"){
            dropdown72.selectByIndex(1);
            }else {
            dropdown72.selectByIndex(2);
            }
           //TODO: How are you paid
           
           
           Select dropdown73 = new Select(driver7.findElement(By.name("CEPMTFREQ")));
             
           if(PayMP == 0){ 
            dropdown73.selectByIndex(1);
            }else if(PayMP == 1){
            dropdown73.selectByIndex(2);
            }else if(PayMP == 2){
            dropdown73.selectByIndex(3);
            }else if(PayMP == 3){
            dropdown73.selectByIndex(4);
            }
           
            Select dropdown74 = new Select(driver7.findElement(By.name("CEOCCU")));
            
            if(employmentPayment == "Direct Deposit from Employer" || employmentPayment == "Paychecks from Employer" ){
             dropdown74.selectByIndex(2);
            }else if(employmentPayment == "Self-Employment" ){
             dropdown74.selectByIndex(3);
            }else if(employmentPayment == "Social Security" ){
             dropdown74.selectByIndex(4);
            }else if(employmentPayment == "Long Term Disability" ){
             dropdown74.selectByIndex(8);
            }else if(employmentPayment == "Alimony" ){
             dropdown74.selectByIndex(5);
            }
            
           
           
           driver7.findElement(By.xpath("//*[@id=\"WPAPPD1\"]")).sendKeys(recentPay);
           driver7.findElement(By.xpath("//*[@id=\"WPAPPD2\"]")).sendKeys(nextPay);
           
           
            //TODO: Reference Relationship
           
           driver7.findElement(By.xpath("//*[@id=\"1CRNAME\"]")).sendKeys(reference1 + " " + reference1Last);
           driver7.findElement(By.xpath("//*[@id=\"1CRPHONE\"]")).sendKeys(refPhone1);
           driver7.findElement(By.xpath("//*[@id=\"1CRRELAT\"]")).sendKeys(RelationRef);
                   
           
           //TODO: Reference Relationship
           
           //driver7.findElement(By.xpath("//*[@id=\"WPAPPD2\"]")).sendKeys(nextPay);
           driver7.findElement(By.xpath("//*[@id=\"2CRNAME\"]")).sendKeys(reference2 + " " + reference2Last);
           driver7.findElement(By.xpath("//*[@id=\"2CRPHONE\"]")).sendKeys(refPhone2);
           driver7.findElement(By.xpath("//*[@id=\"2CRRELAT\"]")).sendKeys(RelationRef1);
           
           driver7.findElement(By.xpath("//*[@id=\"WPACHBANK\"]")).sendKeys(bankName);
           driver7.findElement(By.xpath("//*[@id=\"WPACHACCT\"]")).sendKeys(accountNumber);
           driver7.findElement(By.xpath("//*[@id=\"WPACHABA\"]")).sendKeys(routingNumber);
           
           //TODO: Date Account open - year and months open
           
           String tempDayS = "01";
           String tempMonthS = "01";
           String tempYearS = "01";
           
           System.out.println("Checkpoint :" + yearAccountOpen + " " + monthAccountOpen);
           int tempYear = year - Integer.parseInt(yearAccountOpen);
           int tempMonth = month - Integer.parseInt(monthAccountOpen);
           System.out.println("Checkpoint 1; " + tempYear + " " + tempMonth);
           
           if(tempMonth < 10){
           tempMonthS = "0" + tempMonth;
           }
           if(tempMonth < 0){
           tempYear = -- year ;
           }
           if(today < 10){
           tempDayS = "0" + today;
           }
           
           String tempDate = tempMonthS + tempDayS + tempYear;
           System.out.println("Temp Date: " + tempDate);
           
           driver7.findElement(By.xpath("//*[@id=\"DOPEN\"]")).sendKeys(tempDate);
            
           //WebElement tempWestCreek = driver7.findElement(By.xpath("//*[@id=\"WPACHABA\"]"));
           //tempWestCreek.sendKeys(Keys.TAB);
           //tempWestCreek.sendKeys(tempDate);
           
           
           
           driver7.findElement(By.xpath("//*[@id=\"WPCCCACCT\"]")).sendKeys(cardNumber);
           driver7.findElement(By.xpath("//*[@id=\"EXPDAT\"]")).sendKeys( "02" + "/" + expYear );
                       
           driver7.findElement(By.xpath("//*[@id=\"WPAPPA3\"]")).sendKeys(firstName);
           driver7.findElement(By.xpath("//*[@id=\"WPAPPA4\"]")).sendKeys(middleName.substring(0, 1));
           driver7.findElement(By.xpath("//*[@id=\"WPAPPA5\"]")).sendKeys(lastName);
           
           //*[@id="WPAPPA1"]
           driver7.findElement(By.xpath("//*[@id=\"WPAPPA1\"]")).sendKeys(streetAddress);
           driver7.findElement(By.xpath("//*[@id=\"WPAPPA2\"]")).sendKeys(cityN);
           driver7.findElement(By.xpath("//*[@id=\"WPAPPA11\"]")).sendKeys(stateN);
           driver7.findElement(By.xpath("//*[@id=\"WPAPPN1\"]")).sendKeys(zipN);
           
            
         }
        catch(Exception e){
        System.out.println("Element not Found on Westcreek  page" + "\n" + e);
        }
         
    }

    public int editExpMonth(String expMonth){
        if(expMonth == "Jan"){ return 01; 
        }else if(expMonth == "Feb"){ return 02; 
        }else if(expMonth == "Mar"){ return 03; 
        }else if(expMonth == "Apr"){ return 04; 
        }else if(expMonth == "May"){ return 05; 
        }else if(expMonth == "Jun"){ return 06; 
        }else if(expMonth == "Jul"){ return 07;
        }else if(expMonth == "Aug"){ return 8;
        }else if(expMonth == "Sep"){ return 9;
        }else if(expMonth == "Oct"){ return 10;
        }else if(expMonth == "Nov"){ return 11; 
        }else if(expMonth == "Dec"){ return 12; }        
        return 01;
    }
            
    public String editExpYear(String expYear){
        String s = expYear; 
            System.out.println(java.util.Arrays.toString(s.split("(?<=\\G..)")));
            String[] tokens = s.split("(?<=\\G..)");
            System.out.println(tokens[0]);
            System.out.println(tokens[1]); 
            return tokens[1];
    }
    
    public void ClickState(WebDriver driver,String stateN){
       if(stateN == "Alabama"){
       driver.findElement(By.xpath("html/body/ul[2]/li[2]/a")).click();
       }else if(stateN == "Alaska"){
       driver.findElement(By.xpath("html/body/ul[2]/li[3]/a")).click();
       }else if(stateN == "Arizona"){
       driver.findElement(By.xpath("html/body/ul[2]/li[4]/a")).click();
       }else if(stateN == "Arkansas"){
       driver.findElement(By.xpath("html/body/ul[2]/li[5]/a")).click();
       }else if(stateN == "California"){
       driver.findElement(By.xpath("html/body/ul[2]/li[6]/a")).click();
       }else if(stateN == "Colorado"){
       driver.findElement(By.xpath("html/body/ul[2]/li[7]/a")).click();
       }else if(stateN == "Connecticut"){
       driver.findElement(By.xpath("html/body/ul[2]/li[8]/a")).click();
       }else if(stateN == "Delaware"){
       driver.findElement(By.xpath("html/body/ul[2]/li[9]/a")).click();
       }else if(stateN == "D.C."){
       //driver.findElement(By.xpath("html/body/ul[2]/li[10]/a")).click();
       }else if(stateN == "Florida"){
       driver.findElement(By.xpath("html/body/ul[2]/li[11]/a")).click();
       }else if(stateN == "Georgia"){
       driver.findElement(By.xpath("html/body/ul[2]/li[12]/a")).click();
       }else if(stateN == "Hawaii"){
       driver.findElement(By.xpath("html/body/ul[2]/li[13]/a")).click();
       }else if(stateN == "Idaho"){
       driver.findElement(By.xpath("html/body/ul[2]/li[14]/a")).click();
       }else if(stateN == "Illinois"){
       driver.findElement(By.xpath("html/body/ul[2]/li[15]/a")).click();
       }else if(stateN == "Indiana"){
       driver.findElement(By.xpath("html/body/ul[2]/li[16]/a")).click();
       }else if(stateN == "Iowa"){
       driver.findElement(By.xpath("html/body/ul[2]/li[17]/a")).click();
       }else if(stateN == "Kansas"){
       driver.findElement(By.xpath("html/body/ul[2]/li[18]/a")).click();
       }else if(stateN == "Kentucky"){
       driver.findElement(By.xpath("html/body/ul[2]/li[19]/a")).click();
       }else if(stateN == "Louisiana"){
       driver.findElement(By.xpath("html/body/ul[2]/li[20]/a")).click();
       }else if(stateN == "Maine"){
       driver.findElement(By.xpath("html/body/ul[2]/li[21]/a")).click();
       }else if(stateN == "Maryland"){
       driver.findElement(By.xpath("html/body/ul[2]/li[22]/a")).click();
       }else if(stateN == "Massachusetts"){
       driver.findElement(By.xpath("html/body/ul[2]/li[23]/a")).click();
       }else if(stateN == "Michigan"){
       driver.findElement(By.xpath("html/body/ul[2]/li[24]/a")).click();
       }else if(stateN == "Minnesota"){
       driver.findElement(By.xpath("html/body/ul[2]/li[25]/a")).click();
       }else if(stateN == "Mississippi"){
       driver.findElement(By.xpath("html/body/ul[2]/li[26]/a")).click();
       }else if(stateN == "Missouri"){
       driver.findElement(By.xpath("html/body/ul[2]/li[27]/a")).click();
       }else if(stateN == "Montana"){
       driver.findElement(By.xpath("html/body/ul[2]/li[28]/a")).click();
       }else if(stateN == "Nebraska"){
       driver.findElement(By.xpath("html/body/ul[2]/li[29]/a")).click();
       }else if(stateN == "Nevada"){
       driver.findElement(By.xpath("html/body/ul[2]/li[30]/a")).click();
       }else if(stateN == "New Hampshire"){
       driver.findElement(By.xpath("html/body/ul[2]/li[31]/a")).click();
       }else if(stateN == "New Jersey"){
       driver.findElement(By.xpath("html/body/ul[2]/li[32]/a")).click();
       }else if(stateN == "New Mexico"){
       driver.findElement(By.xpath("html/body/ul[2]/li[33]/a")).click();
       }else if(stateN == "New York"){
       driver.findElement(By.xpath("html/body/ul[2]/li[34]/a")).click();
       }else if(stateN == "North Carolina"){
       driver.findElement(By.xpath("html/body/ul[2]/li[35]/a")).click();
       }else if(stateN == "North Dakota"){
       driver.findElement(By.xpath("html/body/ul[2]/li[36]/a")).click();
       }else if(stateN == "Ohio"){
       driver.findElement(By.xpath("html/body/ul[2]/li[37]/a")).click();
       }else if(stateN == "Oklahoma"){
       driver.findElement(By.xpath("html/body/ul[2]/li[38]/a")).click();
       }else if(stateN == "Oregon"){
       driver.findElement(By.xpath("html/body/ul[2]/li[39]/a")).click();
       }else if(stateN == "Pennsylvania"){
       driver.findElement(By.xpath("html/body/ul[2]/li[40]/a")).click();
       }else if(stateN == "Puerto Rico"){
       driver.findElement(By.xpath("html/body/ul[2]/li[41]/a")).click();
       }else if(stateN == "Rhode Island"){
       driver.findElement(By.xpath("html/body/ul[2]/li[42]/a")).click();
       }else if(stateN == "South Carolina"){
       driver.findElement(By.xpath("html/body/ul[2]/li[43]/a")).click();
       }else if(stateN == "South Dakota"){
       driver.findElement(By.xpath("html/body/ul[2]/li[44]/a")).click();
       }else if(stateN == "Tennessee"){
       driver.findElement(By.xpath("html/body/ul[2]/li[45]/a")).click();
       }else if(stateN == "Texas"){
       driver.findElement(By.xpath("html/body/ul[2]/li[46]/a")).click();
       }else if(stateN == "Utah"){
       driver.findElement(By.xpath("html/body/ul[2]/li[47]/a")).click();
       }else if(stateN == "Vermont"){
       driver.findElement(By.xpath("html/body/ul[2]/li[48]/a")).click();
       }else if(stateN == "Virginia"){
       driver.findElement(By.xpath("html/body/ul[2]/li[49]/a")).click();
       }else if(stateN == "Washington"){
       driver.findElement(By.xpath("html/body/ul[2]/li[50]/a")).click();
       }else if(stateN == "West Virginia"){
       driver.findElement(By.xpath("html/body/ul[2]/li[51]/a")).click();
       }else if(stateN == "Wisconsin"){
       driver.findElement(By.xpath("html/body/ul[2]/li[52]/a")).click();
       }else if(stateN == "Wyoming"){
       driver.findElement(By.xpath("html/body/ul[2]/li[53]/a")).click();
       }else if(stateN == "Virgin Islands"){
       driver.findElement(By.xpath("html/body/ul[2]/li[54]/a")).click();
       }        
    }
    
    public void ClickState1(WebDriver driver,String stateK){
       if(stateK == "Alabama"){
       driver.findElement(By.xpath("/html/body/ul[3]/li[5]/a")).click();
       }else if(stateK == "Alaska"){
       driver.findElement(By.xpath("html/body/ul[3]/li[6]/a")).click();
       }else if(stateK == "Arizona"){
       driver.findElement(By.xpath("html/body/ul[3]/li[7]/a")).click();
       }else if(stateK == "Arkansas"){
       driver.findElement(By.xpath("html/body/ul[3]/li[8]/a")).click();
       }else if(stateK == "California"){
       driver.findElement(By.xpath("html/body/ul[3]/li[9]/a")).click();
       }else if(stateK == "Colorado"){
       driver.findElement(By.xpath("html/body/ul[3]/li[10]/a")).click();
       }else if(stateK == "Connecticut"){
       driver.findElement(By.xpath("html/body/ul[3]/li[11]/a")).click();
       }else if(stateK == "Delaware"){
       driver.findElement(By.xpath("html/body/ul[3]/li[12]/a")).click();
       }else if(stateK == "District of Columbia"){
       driver.findElement(By.xpath("html/body/ul[3]/li[13]/a")).click();
       }else if(stateK == "Florida"){
       driver.findElement(By.xpath("html/body/ul[3]/li[14]/a")).click();
       }else if(stateK == "Georgia"){
       driver.findElement(By.xpath("html/body/ul[3]/li[15]/a")).click();
       }else if(stateK == "Hawaii"){
       driver.findElement(By.xpath("html/body/ul[3]/li[16]/a")).click();
       }else if(stateK == "Idaho"){
       driver.findElement(By.xpath("html/body/ul[3]/li[17]/a")).click();
       }else if(stateK == "Illinois"){
       driver.findElement(By.xpath("html/body/ul[3]/li[18]/a")).click();
       }else if(stateK == "Indiana"){
       driver.findElement(By.xpath("html/body/ul[3]/li[19]/a")).click();
       }else if(stateK == "Iowa"){
       driver.findElement(By.xpath("html/body/ul[3]/li[20]/a")).click();
       }else if(stateK == "Kansas"){
       driver.findElement(By.xpath("html/body/ul[3]/li[21]/a")).click();
       }else if(stateK == "Kentucky"){
       driver.findElement(By.xpath("html/body/ul[3]/li[22]/a")).click();
       }else if(stateK == "Louisiana"){
       driver.findElement(By.xpath("html/body/ul[3]/li[23]/a")).click();
       }else if(stateK == "Maine"){
       driver.findElement(By.xpath("html/body/ul[3]/li[24]/a")).click();
       }else if(stateK == "Maryland"){
       driver.findElement(By.xpath("html/body/ul[3]/li[25]/a")).click();
       }else if(stateK == "Massachusetts"){
       driver.findElement(By.xpath("html/body/ul[3]/li[26]/a")).click();
       }else if(stateK == "Michigan"){
       driver.findElement(By.xpath("html/body/ul[3]/li[27]/a")).click();
       }else if(stateK == "Minnesota"){
       driver.findElement(By.xpath("html/body/ul[3]/li[28]/a")).click();
       }else if(stateK == "Massachusetts"){
       driver.findElement(By.xpath("html/body/ul[3]/li[29]/a")).click();
       }else if(stateK == "Missouri"){
       driver.findElement(By.xpath("html/body/ul[3]/li[30]/a")).click();
       }else if(stateK == "Montana"){
       driver.findElement(By.xpath("html/body/ul[3]/li[31]/a")).click();
       }else if(stateK == "Nebraska"){
       driver.findElement(By.xpath("html/body/ul[3]/li[32]/a")).click();
       }else if(stateK == "Nevada"){
       driver.findElement(By.xpath("html/body/ul[3]/li[33]/a")).click();
       }else if(stateK == "New Hampshire"){
       driver.findElement(By.xpath("html/body/ul[3]/li[34]/a")).click();
       }else if(stateK == "New Jersey"){
       driver.findElement(By.xpath("html/body/ul[3]/li[35]/a")).click();
       }else if(stateK == "New Mexico"){
       driver.findElement(By.xpath("html/body/ul[3]/li[36]/a")).click();
       }else if(stateK == "New York"){
       driver.findElement(By.xpath("html/body/ul[3]/li[37]/a")).click();
       }else if(stateK == "North Carolina"){
       driver.findElement(By.xpath("html/body/ul[3]/li[38]/a")).click();
       }else if(stateK == "North Dakota"){
       driver.findElement(By.xpath("html/body/ul[3]/li[39]/a")).click();
       }else if(stateK == "Ohio"){
       driver.findElement(By.xpath("html/body/ul[3]/li[40]/a")).click();
       }else if(stateK == "Oklahoma"){
       driver.findElement(By.xpath("html/body/ul[3]/li[41]/a")).click();
       }else if(stateK == "Oregon"){
       driver.findElement(By.xpath("html/body/ul[3]/li[42]/a")).click();
       }else if(stateK == "Pennsylvania"){
       driver.findElement(By.xpath("html/body/ul[3]/li[43]/a")).click();
       }/*else if(stateK == "PR"){
       driver.findElement(By.xpath("html/body/ul[3]/li[44]/a")).click();
       }*/else if(stateK == "Rhode Island"){
       driver.findElement(By.xpath("html/body/ul[3]/li[45]/a")).click();
       }else if(stateK == "South Carolina"){
       driver.findElement(By.xpath("html/body/ul[3]/li[46]/a")).click();
       }else if(stateK == "South Dakota"){
       driver.findElement(By.xpath("html/body/ul[3]/li[47]/a")).click();
       }else if(stateK == "Tennessee"){
       driver.findElement(By.xpath("html/body/ul[3]/li[48]/a")).click();
       }else if(stateK == "Texas"){
       driver.findElement(By.xpath("html/body/ul[3]/li[49]/a")).click();
       }else if(stateK == "Utah"){
       driver.findElement(By.xpath("html/body/ul[3]/li[50]/a")).click();
       }else if(stateK == "Vermont"){
       driver.findElement(By.xpath("html/body/ul[3]/li[51]/a")).click();
       }else if(stateK == "Virginia"){
       driver.findElement(By.xpath("html/body/ul[3]/li[52]/a")).click();
       }else if(stateK == "Washington"){
       driver.findElement(By.xpath("html/body/ul[3]/li[53]/a")).click();
       }else if(stateK == "West Virginia"){
       driver.findElement(By.xpath("html/body/ul[3]/li[54]/a")).click();
       }else if(stateK == "Wisconsin"){
       driver.findElement(By.xpath("html/body/ul[3]/li[55]/a")).click();
       }else if(stateK == "Wyoming"){
       driver.findElement(By.xpath("html/body/ul[3]/li[56]/a")).click();
       }/*else if(stateK == "VI"){
       driver.findElement(By.xpath("html/body/ul[3]/li[57]/a")).click();
       } */else{
       driver.findElement(By.xpath("html/body/ul[3]/li[15]/a")).click();
       }        
    }
    
    public void ClickStateSimple(WebDriver driver,String stateN){
       if(stateN == "Alabama"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_state\"]/option[2]")).click();
       }else if(stateN == "Alaska"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_state\"]/option[3]")).click();
       }else if(stateN == "Arizona"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_state\"]/option[4]")).click();
       }else if(stateN == "Arkansas"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_state\"]/option[5]")).click();
       }else if(stateN == "California"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_state\"]/option[6]")).click();
       }else if(stateN == "Colorado"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_state\"]/option[7]")).click();
       }else if(stateN == "Connecticut"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_state\"]/option[8]")).click();
       }else if(stateN == "Delaware"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_state\"]/option[9]")).click();
       }else if(stateN == "D.C."){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_state\"]/option[10]")).click();
       }else if(stateN == "Florida"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_state\"]/option[11]")).click();
       }else if(stateN == "Georgia"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_state\"]/option[12]")).click();
       }else if(stateN == "Hawaii"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_state\"]/option[13]")).click();
       }else if(stateN == "Idaho"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_state\"]/option[14]")).click();
       }else if(stateN == "Illinois"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_state\"]/option[15]")).click();
       }else if(stateN == "Indiana"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_state\"]/option[16]")).click();
       }else if(stateN == "Iowa"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_state\"]/option[17]")).click();
       }else if(stateN == "Kansas"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_state\"]/option[18]")).click();
       }else if(stateN == "Kentucky"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_state\"]/option[19]")).click();
       }else if(stateN == "Louisiana"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_state\"]/option[20]")).click();
       }else if(stateN == "Maine"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_state\"]/option[21]")).click();
       }else if(stateN == "Maryland"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_state\"]/option[22]")).click();
       }else if(stateN == "Massachusetts"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_state\"]/option[23]")).click();
       }else if(stateN == "Michigan"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_state\"]/option[24]")).click();
       }else if(stateN == "Minnesota"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_state\"]/option[24]")).click();
       }else if(stateN == "Mississippi"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_state\"]/option[25]")).click();
       }else if(stateN == "Missouri"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_state\"]/option[26]")).click();
       }else if(stateN == "Montana"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_state\"]/option[27]")).click();
       }else if(stateN == "Nebraska"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_state\"]/option[28]")).click();
       }else if(stateN == "Nevada"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_state\"]/option[29]")).click();
       }else if(stateN == "New Hampshire"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_state\"]/option[30]")).click();
       }else if(stateN == "New Jersey"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_state\"]/option[32]")).click();
       }else if(stateN == "New Mexico"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_state\"]/option[31]")).click();
       }else if(stateN == "New York"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_state\"]/option[32]")).click();
       }else if(stateN == "North Carolina"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_state\"]/option[33]")).click();
       }else if(stateN == "North Dakota"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_state\"]/option[34]")).click();
       }else if(stateN == "Ohio"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_state\"]/option[35]")).click();
       }else if(stateN == "Oklahoma"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_state\"]/option[36]")).click();
       }else if(stateN == "Oregon"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_state\"]/option[37]")).click();
       }else if(stateN == "Pennsylvania"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_state\"]/option[38]")).click();
       }else if(stateN == "Puerto Rico"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_state\"]/option[11]")).click();
       }else if(stateN == "Rhode Island"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_state\"]/option[39]")).click();
       }else if(stateN == "South Carolina"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_state\"]/option[40]")).click();
       }else if(stateN == "South Dakota"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_state\"]/option[41]")).click();
       }else if(stateN == "Tennessee"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_state\"]/option[42]")).click();
       }else if(stateN == "Texas"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_state\"]/option[43]")).click();
       }else if(stateN == "Utah"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_state\"]/option[44]")).click();
       }else if(stateN == "Vermont"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_state\"]/option[45]")).click();
       }else if(stateN == "Virginia"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_state\"]/option[46]")).click();
       }else if(stateN == "Washington"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_state\"]/option[47]")).click();
       }else if(stateN == "West Virginia"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_state\"]/option[48]")).click();
       }else if(stateN == "Wisconsin"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_state\"]/option[24]")).click();
       }else if(stateN == "Wyoming"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_state\"]/option[49]")).click();
       }else if(stateN == "Virgin Islands"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_state\"]/option[11]")).click();
       }        
    }
    
    public void ClickStateDLSimple(WebDriver driver,String stateK){
       if(stateK == "Alabama"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_dl_state\"]/option[2]")).click();
       }else if(stateK == "Alaska"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_dl_state\"]/option[3]")).click();
       }else if(stateK == "Arizona"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_dl_state\"]/option[4]")).click();
       }else if(stateK == "Arkansas"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_dl_state\"]/option[5]")).click();
       }else if(stateK == "California"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_dl_state\"]/option[6]")).click();
       }else if(stateK == "Colorado"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_dl_state\"]/option[7]")).click();
       }else if(stateK == "Connecticut"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_dl_state\"]/option[8]")).click();
       }else if(stateK == "Delaware"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_dl_state\"]/option[9]")).click();
       }else if(stateK == "D.C."){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_dl_state\"]/option[10]")).click();
       }else if(stateK == "Florida"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_dl_state\"]/option[11]")).click();
       }else if(stateK == "Georgia"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_dl_state\"]/option[12]")).click();
       }else if(stateK == "Hawaii"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_dl_state\"]/option[13]")).click();
       }else if(stateK == "Idaho"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_dl_state\"]/option[14]")).click();
       }else if(stateK == "Illinois"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_dl_state\"]/option[15]")).click();
       }else if(stateK == "Indiana"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_dl_state\"]/option[16]")).click();
       }else if(stateK == "Iowa"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_dl_state\"]/option[17]")).click();
       }else if(stateK == "Kansas"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_dl_state\"]/option[18]")).click();
       }else if(stateK == "Kentucky"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_dl_state\"]/option[19]")).click();
       }else if(stateK == "Louisiana"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_dl_state\"]/option[20]")).click();
       }else if(stateK == "Maine"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_dl_state\"]/option[21]")).click();
       }else if(stateK == "Maryland"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_dl_state\"]/option[22]")).click();
       }else if(stateK == "Massachusetts"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_dl_state\"]/option[23]")).click();
       }else if(stateK == "Michigan"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_dl_state\"]/option[24]")).click();
       }else if(stateK == "Minnesota"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_dl_state\"]/option[25]")).click();
       }else if(stateK == "Mississippi"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_dl_state\"]/option[26]")).click();
       }else if(stateK == "Missouri"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_dl_state\"]/option[27]")).click();
       }else if(stateK == "Montana"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_dl_state\"]/option[28]")).click();
       }else if(stateK == "Nebraska"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_dl_state\"]/option[29]")).click();
       }else if(stateK == "Nevada"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_dl_state\"]/option[30]")).click();
       }else if(stateK == "New Hampshire"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_dl_state\"]/option[31]")).click();
       }else if(stateK == "New Jersey"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_dl_state\"]/option[32]")).click();
       }else if(stateK == "New Mexico"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_dl_state\"]/option[33]")).click();
       }else if(stateK == "New York"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_dl_state\"]/option[34]")).click();
       }else if(stateK == "North Carolina"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_dl_state\"]/option[35]")).click();
       }else if(stateK == "North Dakota"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_dl_state\"]/option[36]")).click();
       }else if(stateK == "Ohio"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_dl_state\"]/option[37]")).click();
       }else if(stateK == "Oklahoma"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_dl_state\"]/option[38]")).click();
       }else if(stateK == "Oregon"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_dl_state\"]/option[39]")).click();
       }else if(stateK == "Pennsylvania"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_dl_state\"]/option[40]")).click();
       }else if(stateK == "Puerto Rico"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_dl_state\"]/option[40]")).click();
       }else if(stateK == "Rhode Island"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_dl_state\"]/option[41]")).click();
       }else if(stateK == "South Carolina"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_dl_state\"]/option[42]")).click();
       }else if(stateK == "South Dakota"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_dl_state\"]/option[43]")).click();
       }else if(stateK == "Tennessee"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_dl_state\"]/option[44]")).click();
       }else if(stateK == "Texas"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_dl_state\"]/option[45]")).click();
       }else if(stateK == "Utah"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_dl_state\"]/option[46]")).click();
       }else if(stateK == "Vermont"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_dl_state\"]/option[47]")).click();
       }else if(stateK == "Virginia"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_dl_state\"]/option[48]")).click();
       }else if(stateK == "Washington"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_dl_state\"]/option[49]")).click();
       }else if(stateK == "West Virginia"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_dl_state\"]/option[50]")).click();
       }else if(stateK == "Wisconsin"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_dl_state\"]/option[51]")).click();
       }else if(stateK == "Wyoming"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_dl_state\"]/option[52]")).click();
       }else if(stateK == "Virgin Islands"){
       driver.findElement(By.xpath("//*[@id=\"lease_applicant_attributes_dl_state\"]/option[52]")).click();
       }        
    }
    
    
    private void SetText(WebDriver driver, String xpath, String value) throws InterruptedException {
        WebElement element = driver.findElement(By.xpath(xpath));
        element.sendKeys(value);
    }
    
    private void SetText(WebDriver driver, String xpatha, String value, boolean sendTwice) throws InterruptedException {
        WebElement element = driver.findElement(By.xpath(xpatha));
        element.sendKeys(value);
        if(!driver.findElement(By.xpath(xpatha)).getText().equals(value)) {
            element.clear();
            Thread.sleep(100);
            element.sendKeys(value);
        }
        if(!driver.findElement(By.xpath(xpatha)).getText().equals(value)) {
            element.clear();
            Thread.sleep(100);
            element.sendKeys(value);
        }
    }
    
     private void SetTextById(WebDriver driver, String id, String value, boolean sendTwice) throws InterruptedException {
        WebElement element = driver.findElement(By.xpath(id));
        element.sendKeys(value);
        if(!driver.findElement(By.id(id)).getText().equals(value)) {
            element.clear();
            Thread.sleep(100);
            element.sendKeys(value);
        }
        if(!driver.findElement(By.id(id)).getText().equals(value)) {
            element.clear();
            Thread.sleep(100);
            element.sendKeys(value);
        }
        if(!driver.findElement(By.id(id)).getText().equals(value)) {
            element.clear();
            Thread.sleep(100);
            element.sendKeys(value);
        }
        
    }
    
    private void SnapSelectWeek(WebDriver driver2){
     Select dropdown4 = new Select(driver2.findElement(By.xpath("//*[@id=\"incomeInfo\"]/div[2]/div[3]/div/div/form/div[3]/div[1]/div[1]/div[1]/select")));
     if(Pay == "Weekly"){ 
     dropdown4.selectByIndex(1);
     }else if(Pay == "Bi weekly"){
     dropdown4.selectByIndex(2);
     }else if(Pay == "Twice Monthly"){
     dropdown4.selectByIndex(3);
     }else if(Pay == "Monthly"){
     dropdown4.selectByIndex(4);
     } 
     
     try {
     driver2.findElement(By.xpath("//*[@id=\"incomeInfo\"]/div[2]/div[3]/div/div/form/div[3]/div[1]/div[1]/div[2]/div/div[1]/div/input")).sendKeys(recentPay);
       
           Thread.sleep(250);
      
     driver2.findElement(By.xpath("//*[@id=\"incomeInfo\"]/div[2]/div[3]/div/div/form/div[3]/div[1]/div[1]/div[2]/div/div[2]/div/input")).sendKeys(nextPay);
      } catch (InterruptedException ex) {
           Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    
    

    @Override
    public void run() {
        JOptionPane.showMessageDialog(null, "Username or Password incorrect. Please try again!!"); 
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}