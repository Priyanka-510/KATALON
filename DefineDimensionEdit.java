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

public class DefineDimensionEdit {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "https://www.google.com/";
		selenium = new WebDriverBackedSelenium(driver, baseUrl);
	}

	@Test
	public void testDefineDimensionEdit() throws Exception {
		selenium.open("http://localhost/BASELTEST_PL/Account/se.aspx?ReturnUrl=%2fBASELTEST_PL%2fBASEL%2fCustom%2fMCParam%2fProducts%2fBASELRptDimDefMakerSmry.aspx%3fid%3dM&id=M");
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
		selenium.click("xpath=//a[@id='PC_HC_IND_HyperLink265']/li");
		selenium.open("http://localhost/BASELTEST_PL/BASEL/Custom/MCParam/Products/BASELRptDimDefMakerSmry.aspx?id=M");
		selenium.click("id=PC_MC_txtRptDimName");
		selenium.type("id=PC_MC_txtRptDimName", "Test2612");
		selenium.click("id=PC_MC_btnSearch");
		selenium.click("id=PC_MC_GV_RecordList_btnEdit_0");
		selenium.open("http://localhost/BASELTEST_PL/BASEL/Custom/MCParam/Products/BASELRptDimDefMakerInfo.aspx");
		selenium.click("id=DimItemTable");
		selenium.click("id=PC_MC_AddEditUC_TCMain_TPNewData_rptEditdimItem_txtRptDimItemName_1");
		selenium.type("id=PC_MC_AddEditUC_TCMain_TPNewData_rptEditdimItem_txtRptDimItemName_1", "2 months");
		selenium.click("id=PC_MC_AddEditUC_lnkRptBtnAdd");
		selenium.click("xpath=//tr[@id='PC_MC_AddEditUC_TCMain_TPNewData_rptEditdimItem_divtr1_2']/td[2]");
		selenium.click("id=PC_MC_AddEditUC_TCMain_TPNewData_rptEditdimItem_txtRptDimItemName_2");
		selenium.type("id=PC_MC_AddEditUC_TCMain_TPNewData_rptEditdimItem_txtRptDimItemName_2", "3 months");
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
		selenium.click("xpath=//a[@id='PC_HC_IND_HyperLink266']/li");
		selenium.open("http://localhost/BASELTEST_PL/BASEL/Custom/MCParam/Products/BASELRptDimDefCheckerSmry.aspx");
		selenium.click("id=PC_MC_GV_RecordList_chkboxSelectAllMC");
		selenium.click("id=PC_MC_btnApprove");
		selenium.click("xpath=//div[@id='dvAccount']/span/div");
		selenium.click("link=Sign Out");
		selenium.open("http://localhost/BASELTEST_PL/Account/LicenceAlert.aspx");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
