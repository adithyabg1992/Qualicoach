package studentPageObjects;






//import studentPageObjects.Studentlogin;
//import studentPageObjects.CourseEnroll;
//import studentPageObjects.CourseCertficate;
//import studentPageObjects.UserProfile;

import java.io.IOException;

import resources.base;

public class StudentPage extends base {

	public void Studentlogin(String Username, String Password) throws IOException {
		driver = initializerDriver();
		driver.get("https://test.qualicoach.org/login/index.php");
		Studentlogin sl = new Studentlogin(driver);
		sl.studentUsername().sendKeys(Username);
		sl.studentPassword().sendKeys(Password);
		sl.studentLogin().click();

	}

	public void threaddealy_driverclose() throws InterruptedException {
		Thread.sleep(1000);
		driver.close();
	}

	public void validuserlogin() throws IOException, InterruptedException {
		// driver = initializerDriver();
		String sUsername = "scam143";
		String sPassword = "scam143";
		Studentlogin(sUsername, sPassword);
		// threaddealy_driverclose();

	}
	
	public void invalidLogin1() throws IOException, InterruptedException {

		//driver = initializerDriver();
		//driver.get("https://test.qualicoach.org/login/index.php");
		String sIUsername = "admin";
		String sIPassword = "Admin@61";
		Studentlogin(sIUsername, sIPassword);
		//threaddealy_driverclose();
		//driver.quit();

	}


	public void validStudentuserlogin() throws IOException, InterruptedException {

		validuserlogin();
		threaddealy_driverclose();

	}



	public void invalidLogin() throws IOException, InterruptedException {

		//driver = initializerDriver();
		//driver.get("https://test.qualicoach.org/login/index.php");
		//String sIUsername = "admin";
		//String sIPassword = "Admin@61";
		//Studentlogin(sIUsername, sIPassword);
		//threaddealy_driverclose();
		invalidLogin1();
		threaddealy_driverclose();
		//driver.quit();

	}



	public void CourseEnroll() throws IOException, InterruptedException {
		validuserlogin();
		// Thread.sleep(5000);
		CourseEnroll ce = new CourseEnroll(driver);
		// Thread.sleep(1000);
		ce.scroll();
		// Thread.sleep(1000);
		ce.select3();
	//	ce.studentEnroll().click(); //
		
	/*	try
		{
			 ce.studentEnroll().click(); 
		
		}
		catch(org.openqa.selenium.ElementNotInteractableException e)
		{
			
			Assert.assertFalse(false);
		
			
		}*/
		
		threaddealy_driverclose();

	}



	public void StudentQuiz() throws IOException, InterruptedException {

		validuserlogin();
		CourseEnroll ce = new CourseEnroll(driver);
		ce.scroll();
		// Thread.sleep(1000);
		ce.select2();
		// ce.studentEnroll().click();
		ce.studentQuiz().click();
		ce.studentQuizSel().click();
		// ce.studentQuizAttempt().click();
		threaddealy_driverclose();

	}


	public void CourseCertificate() throws IOException, InterruptedException {
		validuserlogin();
		CourseCertficate cc = new CourseCertficate(driver);
		cc.scroll();
		cc.select();
		cc.cert().click();
		cc.cert1().click();
		cc.getCert().click();
		Thread.sleep(2000);
		driver.quit();

	}


	public void badge_survey() throws IOException, InterruptedException {
		validuserlogin();
		CourseCertficate cc = new CourseCertficate(driver);
		cc.scroll();
		cc.select();
		cc.badgeNsurvey().click();
		cc.getBadge().click();
		cc.feedback().click();
		threaddealy_driverclose();
	}



	public void UserProfile() throws IOException, InterruptedException {

		validuserlogin();
		UserProfile up = new UserProfile(driver);
		up.userMenu().click();
		up.userProfile().click();
		up.userEdit().click();
		up.userEditCity().sendKeys("Bangalore");
		up.userUpdate().click();
		threaddealy_driverclose();

	}

}
