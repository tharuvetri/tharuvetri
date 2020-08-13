package com.testcase;

import java.io.IOException;

public class callwrapper {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		wrappermethod wm = new wrappermethod();
		wm.insertapp("https://opensource-demo.orangehrmlive.com/");
		wm.enterbyid("txtUsername", "Admin");
		wm.enterbyid("txtPassword", "admin123");
		wm.clickbyxpath("//*[@id=\"btnLogin\"]");
		wm.takesnap("src/test/resources/screenshot/sample2.png");
		wm.closeapp();

	}

}
