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

public class ConstitutionCodeDownload {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "https://www.google.com/";
		selenium = new WebDriverBackedSelenium(driver, baseUrl);
	}

	@Test
	public void testConstitutionCodeDownload() throws Exception {
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
		selenium.click("id=PC_MC_btnDwnld");
		selenium.open("http://localhost/BASELTEST_PL/BASEL/Custom/MCParam/CustomerConstiCode/Axis_tblCustomerConstiCodeMakerInfo.aspx");
		selenium.click("id=PC_MC_AddEditUC_txtReceivedDate1");
		selenium.type("id=PC_MC_AddEditUC_txtReceivedDate1", "31-01-2021");
		selenium.click("id=PC_MC_AddEditUC_txtReceivedDate2");
		selenium.type("id=PC_MC_AddEditUC_txtReceivedDate2", "31-12-2024");
		selenium.click("id=PC_MC_AddEditUC_ddlCountryID");
		selenium.select("id=PC_MC_AddEditUC_ddlCountryID", "label=INDIA");
		selenium.click("id=PC_MC_AddEditUC_btnSearch");
		selenium.selectWindow("win_ser_local");
		selenium.click("id=PC_MC_AddEditUC_btn_Back");
		selenium.open("http://localhost/BASELTEST_PL/BASEL/Custom/MCParam/CustomerConstiCode/Axis_tblCustomerConstiCodeMakerSmry.aspx?id=M");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
