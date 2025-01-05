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

public class DefineLLGAdd {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "https://www.google.com/";
		selenium = new WebDriverBackedSelenium(driver, baseUrl);
	}

	@Test
	public void testDefineLLGAdd() throws Exception {
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
		selenium.click("xpath=//a[@id='PC_HC_IND_HyperLink252']/li");
		selenium.open("http://localhost/BASELTEST_PL/BASEL/Custom/MCParam/Products/BASELLLGDefMakerSmry.aspx?id=M");
		selenium.click("id=PC_MC_btnAdd");
		selenium.open("http://localhost/BASELTEST_PL/BASEL/Custom/MCParam/Products/BASELLLGDefMakerInfo.aspx");
		selenium.click("id=txtLLGNo");
		selenium.type("id=txtLLGNo", "26122024");
		selenium.click("id=txtLLGDesc");
		selenium.type("id=txtLLGDesc", "Test26122024");
		selenium.click("id=ddlFlowtype");
		selenium.select("id=ddlFlowtype", "label=Inflow");
		selenium.click("id=ddlLLGGrpID");
		selenium.select("id=ddlLLGGrpID", "label=1909");
		selenium.click("id=ddlIsMaturity");
		selenium.select("id=ddlIsMaturity", "label=Yes");
		selenium.click("id=ddlIsActive");
		selenium.select("id=ddlIsActive", "label=Yes");
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
		selenium.click("xpath=//a[@id='PC_HC_IND_HyperLink253']/li");
		selenium.open("http://localhost/BASELTEST_PL/BASEL/Custom/MCParam/Products/BASELLLGDefCheckerSmry.aspx");
		selenium.click("id=PC_MC_GV_RecordList_chkboxSelectAllMC");
		selenium.click("id=PC_MC_btnApprove");
		selenium.click("id=PC_HC_RptParm2_lblUserOnPageHeader");
		selenium.click("link=Sign Out");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
