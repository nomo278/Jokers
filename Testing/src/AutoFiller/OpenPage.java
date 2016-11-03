package AutoFiller;

import java.awt.Desktop;
import java.net.URI;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
 


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */ 
 
public class OpenPage {
     
    public static void main(String args[]) throws Exception{        
   //     Main form = new Main();
  //     form.setVisible(true);
     
        
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        
        System.out.println("I started");
                  
        WebDriver driver = new ChromeDriver();
        driver.get("https://dealers.crestfinancial.com/Applicants/CreateApplicant/1337");
        
         WebDriver driver1 = new ChromeDriver();
        driver1.get("https://portal.gosimplefinance.com/customer/leases/new?merchant_id=42E9B5");
        
        
         WebDriver driver2 = new ChromeDriver();
        driver2.get("https://merchant.snapfinance.com/#/dashboard");
               
        
        
        
        
        
         try{
        driver1.findElement(By.id("lease_location_id_5788")).click();
        driver1.findElement(By.id("lease_applicant_attributes_first_name")).sendKeys("Mohammed");
        driver1.findElement(By.id("lease_applicant_attributes_middle_name")).sendKeys("Kamal");
        driver1.findElement(By.id("lease_applicant_attributes_last_name")).sendKeys("Awad");
        driver1.findElement(By.id("lease_applicant_attributes_address_1")).sendKeys("5884 Old Town Pl.");
        driver1.findElement(By.id("lease_applicant_attributes_city")).sendKeys("Norcross");
        driver1.findElement(By.id("lease_applicant_attributes_state")).sendKeys("GA");
        driver1.findElement(By.id("lease_applicant_attributes_zip")).sendKeys("30093");
        driver1.findElement(By.id("lease_applicant_attributes_ssn")).sendKeys("259-93-0448");
        driver1.findElement(By.id("lease_applicant_attributes_dob")).sendKeys("04-08-1993");
        driver1.findElement(By.id("lease_applicant_attributes_dl_number")).sendKeys("40");
        driver1.findElement(By.id("lease_applicant_attributes_dl_state")).sendKeys("GA");
        driver1.findElement(By.id("lease_applicant_attributes_main_phone")).sendKeys("4047919415");
        driver1.findElement(By.id("lease_applicant_attributes_alt_phone")).sendKeys("4047919416");
        driver1.findElement(By.id("lease_applicant_attributes_email")).sendKeys("kjjungle0@gmail.com");
        driver1.findElement(By.id("lease_applicant_attributes_routing_number")).sendKeys("061000052");
        driver1.findElement(By.id("lease_applicant_attributes_account_number")).sendKeys("50151321560");
        driver1.findElement(By.id("lease_applicant_attributes_bank_name")).sendKeys("");
        driver1.findElement(By.id("lease_applicant_attributes_account_type_checking")).click();
        driver1.findElement(By.id("lease_applicant_attributes_checking_account_open_at_least_required_days_yes")).click();
        driver1.findElement(By.id("lease_applicant_attributes_reference_1_name")).sendKeys("Bill Gates");
        driver1.findElement(By.id("lease_applicant_attributes_reference_1_phone")).sendKeys("678-250-3193");
        driver1.findElement(By.id("lease_applicant_attributes_reference_2_name")).sendKeys("Smart Ass Joe");
        driver1.findElement(By.id("lease_applicant_attributes_reference_2_phone")).sendKeys("770-979-8287");
        driver1.findElement(By.id("lease_applicant_attributes_employer_name")).sendKeys("Sur Consulting");
        driver1.findElement(By.id("lease_applicant_attributes_employer_phone")).sendKeys("770-931-1546");
        driver1.findElement(By.id("lease_applicant_attributes_employment_net_monthly_income")).sendKeys("2200");
        driver1.findElement(By.id("lease_applicant_attributes_hired_on")).sendKeys("05-2018");
        driver1.findElement(By.id("lease_applicant_attributes_pay_frequency")).sendKeys("Every Other Week");
        driver1.findElement(By.id("lease_applicant_attributes_last_payday_on")).click();
        //TODO: NEEDS TO BE ABLE TO FIND THE DATE
        driver1.findElement(By.id("lease_applicant_attributes_next_payday_on")).click(); 
        //TODO: NEEDS TO BE ABLE TO FIND THE DATE
        driver1.findElement(By.className("btn-group")).click(); 
        
      //  Select dropdown - new Select(driver1.findElement(By.className("dropdown-menu")));
        //dropdown.selectByIndex(1);
        
        
       // driver1.findElement(By.className("submit_button")).click();
         }
        catch(Exception e){
        System.out.println("Element not Found on second page");
        }
         
         
          try{
        driver2.findElement(By.name("username")).sendKeys("jokersaudio");
        driver2.findElement(By.name("password")).sendKeys("Awadsquad1");
       // driver2.findElement(By.id("btn-login")).click();
           }
        catch(Exception e){
        System.out.println("Element not Found on third page");
        }
         
        System.out.println("I Finished");
    }
    
    
    public void CrestFinance(){//CrestFinace(list of varables,in array)
        
        System.out.println("I started Crest");
     WebDriver driver = new ChromeDriver();
        driver.get("https://dealers.crestfinancial.com/Applicants/CreateApplicant/1337");
        
        try{
        driver.findElement(By.id("FirstName")).sendKeys("Patrick");
        driver.findElement(By.id("LastName")).sendKeys("Penner");
        driver.findElement(By.id("DateOfBirth")).sendKeys("06061988");
        driver.findElement(By.id("SocialSecurityNumber")).sendKeys("372-06-4342");
        driver.findElement(By.id("PrimaryPhone")).sendKeys("586-746-8780");
        driver.findElement(By.id("SecondaryPhone")).sendKeys("586-746-8318");
        driver.findElement(By.id("EmailAddress")).sendKeys("beastisboss@gmail.com");
        driver.findElement(By.id("EmailAddressConfirm")).sendKeys("beastisboss@gmail.com");
        driver.findElement(By.id("StreetLine1")).sendKeys("Pine Club NW LOT 3A");
        driver.findElement(By.id("StreetLine2")).sendKeys("");
        driver.findElement(By.id("City")).sendKeys("Kennesaw");
        driver.findElement(By.id("StateID")).sendKeys("Georgia");
        driver.findElement(By.id("PostalCode")).sendKeys("30152");
        driver.findElement(By.id("DriversLicenseNumber")).sendKeys("059039816");
        driver.findElement(By.id("DriversLicenseState")).sendKeys("Georgia");
        driver.findElement(By.id("EmployerName")).sendKeys("Sur Consulting");
        driver.findElement(By.id("EmployerPhone")).sendKeys("404-791-9415");
        driver.findElement(By.id("MonthlyIncome")).sendKeys("3000");
        driver.findElement(By.id("YearsAtJob")).sendKeys("2");
        driver.findElement(By.id("MonthsAtJob")).sendKeys("6");
        //value="1" Every week, 2 every two weeks, 3 twice a month, 4 Once a month
        Select dropdown = new Select(driver.findElement(By.id("PayPeriodTypeID")));
        dropdown.selectByIndex(1);
        //driver.findElement(By.id("LastPayDate")).sendKeys("");
        driver.findElement(By.id("NextPayDate")).sendKeys("08/19/2016");
        Thread.sleep(5000);
        driver.findElement(By.id("RoutingNumber")).sendKeys("061000227");
        driver.findElement(By.id("AccountNumberEntry")).sendKeys("2998405514");
        driver.findElement(By.id("BankName")).sendKeys("");
        driver.findElement(By.id("AccountType")).sendKeys("Checking");
        driver.findElement(By.id("YearsAccountOpen")).sendKeys("3");
        driver.findElement(By.id("MonthsAccountOpen")).sendKeys("2");
        driver.findElement(By.id("CardholderName")).sendKeys("Patrick Penner");
        driver.findElement(By.id("CardNumberEntry")).sendKeys("4737023945075335");
        driver.findElement(By.id("ExpirationMonth")).sendKeys("07");
        driver.findElement(By.id("ExpirationYear")).sendKeys("2019");
        driver.findElement(By.id("Reference1Name")).sendKeys("Shawn Chandler");
        driver.findElement(By.id("Reference1PhoneNumber")).sendKeys("586-359-5936");
        //driver.findElement(By.id("Reference2Name")).sendKeys("Ryan Holloway");
        //driver.findElement(By.id("Reference2PhoneNumber")).sendKeys("734-756-8422");
        driver.findElement(By.id("CellPhone")).sendKeys("586-746-8780");
        driver.findElement(By.id("HomePhone")).sendKeys("586-746-8318");
        driver.findElement(By.id("PrintedName")).sendKeys("Patrick Penner");
        
        //driver.findElement(By.id("form-submit")).sendKeys(Keys.RETURN);
        
        System.out.println("I Typed 1");
        }catch(Exception e){
        System.out.println("Element not Found");
        }
    
        
    
    }

}
