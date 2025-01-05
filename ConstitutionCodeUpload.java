package com.example;

import com.thoughtworks.selenium.Selenium;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;
import static org.apache.commons.lang3.StringUtils.join;

public class ConstitutionCodeUpload {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "https://www.google.com/";
		selenium = new WebDriverBackedSelenium(driver, baseUrl);
	}

	@Test
	public void testConstitutionCodeUpload() throws Exception {
		selenium.open("http://localhost/BASELTEST_PL/Account/se.aspx?ReturnUrl=%2fBASELTEST_PL%2fBASEL%2fCustom%2fMCParam%2fCustomerConstiCode%2fAxis_tblCustomerConstiCodeMakerSmry.aspx%3fid%3dM&id=M");
		selenium.click("id=MC_myLink");
		selenium.open("http://localhost/BASELTEST_PL/Account/LicenceAlert.aspx");
		selenium.click("link=Log In");
		selenium.open("http://localhost/BASELTEST_PL/Account/Login.aspx");
		selenium.click("id=MC_LoginUser_UserName");
		selenium.type("id=MC_LoginUser_UserName", "RMUSER_M");
		selenium.click("id=MC_LoginUser_Password");
		selenium.type("id=MC_LoginUser_Password", "Surya@123");
		selenium.click("xpath=//form[@id='form1']/div[3]/div");
		selenium.click("id=MC_LoginUser_LoginButton");
		selenium.open("http://localhost/BASELTEST_PL/BASEL/Dashboard/BLR01aDashRpt.aspx");
		selenium.click("id=PC_HC_IND_Li8");
		selenium.click("xpath=//a[@id='PC_HC_IND_HyperLink269']/li");
		selenium.open("http://localhost/BASELTEST_PL/BASEL/Custom/MCParam/CustomerConstiCode/Axis_tblCustomerConstiCodeMakerSmry.aspx?id=M");
		selenium.click("id=PC_MC_btnUpload");
		selenium.open("http://localhost/BASELTEST_PL/BASEL/Custom/MCParam/CustomerConstiCode/UploadAxis_tblCustomerConstiCodeMakerUC.aspx");
		selenium.click("xpath=//form[@id='form1']/div[5]/div[2]/div[2]/contenttemplate/div/table/tbody/tr/td[2]");
		selenium.type("id=PC_MC_txtFromDate", "30-12-2021");
		selenium.click("id=PC_MC_excelFile");
		selenium.type("id=PC_MC_excelFile", "C:\\Users\\priyankav\\Documents\\BASEL\\Customer_ConstiCode_30-12-2021.xlsx");
		selenium.click("id=PC_MC_btnUpload");
		selenium.click("id=PC_HC_RptParm2_lblUserOnPageHeader");
		selenium.click("link=Sign Out");
		selenium.open("http://localhost/BASELTEST_PL/Account/LicenceAlert.aspx");
		selenium.click("link=Log In");
		selenium.open("http://localhost/BASELTEST_PL/Account/Login.aspx");
		selenium.click("id=MC_LoginUser_UserName");
		selenium.type("id=MC_LoginUser_UserName", "RMUSER_C");
		selenium.click("id=MC_LoginUser_Password");
		selenium.type("id=MC_LoginUser_Password", "Surya@123");
		selenium.click("xpath=//form[@id='form1']/div[3]/div");
		selenium.click("id=MC_LoginUser_LoginButton");
		selenium.open("http://localhost/BASELTEST_PL/BASEL/Dashboard/BLR01aDashRpt.aspx");
		selenium.click("id=PC_HC_IND_Li8");
		selenium.click("xpath=//a[@id='PC_HC_IND_HyperLink268']/li");
		selenium.open("http://localhost/BASELTEST_PL/BASEL/Custom/MCParam/CustomerConstiCode/Axis_tblCustomerConstiCodeCheckerSmry.aspx");
		selenium.click("id=PC_MC_GV_RecordList_chkboxSelectAllMC");
		selenium.click("id=PC_MC_btnApprove");
		selenium.click("xpath=//div[@id='PC_HC_RptParm2_UpdatePanel']/div/table/tbody/tr/td[5]");
		selenium.click("id=PC_HC_RptParm2_lblUserOnPageHeader");
		selenium.click("link=Sign Out");
		selenium.open("http://localhost/BASELTEST_PL/Account/LicenceAlert.aspx");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
