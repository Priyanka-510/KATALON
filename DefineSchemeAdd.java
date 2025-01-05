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

public class DefineSchemeAdd {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "https://www.google.com/";
		selenium = new WebDriverBackedSelenium(driver, baseUrl);
	}

	@Test
	public void testDefineSchemeAdd() throws Exception {
		selenium.open("http://localhost/BASELTEST_PL/Account/LicenceAlert.aspx");
		selenium.click("link=Log In");
		selenium.open("http://localhost/BASELTEST_PL/Account/Login.aspx");
		selenium.click("id=MC_LoginUser_UserName");
		selenium.type("id=MC_LoginUser_UserName", "RMUSER_M");
		selenium.click("id=MC_LoginUser_Password");
		selenium.type("id=MC_LoginUser_Password", "Surya@123");
		selenium.click("xpath=//form[@id='form1']/div[3]/div/div/div[3]/div");
		selenium.click("id=MC_LoginUser_LoginButton");
		selenium.open("http://localhost/BASELTEST_PL/BASEL/Dashboard/BLR01aDashRpt.aspx");
		selenium.click("id=PC_HC_IND_Li8");
		selenium.click("xpath=//a[@id='PC_HC_IND_HyperLink310']/li");
		selenium.open("http://localhost/BASELTEST_PL/BASEL/Custom/MCParam/MatSchemeDefMakerSmry.aspx?id=M");
		selenium.click("id=PC_MC_btnAdd");
		selenium.open("http://localhost/BASELTEST_PL/BASEL/Custom/MCParam/MatSchemeDefMakerInfo.aspx");
		selenium.click("id=txtBktSchemeID");
		selenium.type("id=txtBktSchemeID", "Test3112");
		selenium.click("id=txtBktSchemeName");
		selenium.type("id=txtBktSchemeName", "Test3112");
		selenium.click("id=ctl00_ctl00_PC_MC_AddEditUC_TCMain_TPNewData_rptEditBuckets_ctl01_txtBktDesc");
		selenium.click("id=ctl00_ctl00_PC_MC_AddEditUC_TCMain_TPNewData_rptEditBuckets_ctl01_txtBktDesc");
		selenium.type("id=ctl00_ctl00_PC_MC_AddEditUC_TCMain_TPNewData_rptEditBuckets_ctl01_txtBktDesc", "1 month");
		selenium.click("id=PC_MC_AddEditUC_btn_Save");
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
		selenium.click("xpath=//a[@id='PC_HC_IND_HyperLink311']/li");
		selenium.open("http://localhost/BASELTEST_PL/BASEL/Custom/MCParam/MatSchemeDefCheckerSmry.aspx");
		selenium.click("id=PC_MC_GV_RecordList_chkboxSelectAllMC");
		selenium.click("id=PC_MC_btnApprove");
		selenium.click("id=PC_HC_RptParm2_lblUserOnPageHeader");
		selenium.click("link=Sign Out");
		selenium.open("http://localhost/BASELTEST_PL/Account/LicenceAlert.aspx");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
