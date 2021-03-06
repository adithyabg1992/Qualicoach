package pageObjects;




import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//import pageObjects.AddingUsers;
//import pageObjects.AdminLoginPage;
//import pageObjects.CreateCourse;
//import pageObjects.CreateReport;
//import pageObjects.DeleteUser;
//import pageObjects.ScrollPage;
import resources.base;

public class AdminPage extends base {
	
	public static Logger log =	LogManager.getLogger(base.class.getName());

	public void AdminLoginPage(String Username, String Password) throws IOException {
		driver = initializerDriver();
		log.info("driver initilized");
		driver.get("https://test.qualicoach.org/admin/search.php");
		AdminLoginPage alp = new AdminLoginPage(driver);
		alp.getEmail().sendKeys(Username);
		alp.getPassword().sendKeys(Password);
		alp.getLogin().click();
		log.info(" admin login successful");

	}

	public void threaddealy_driverclose() throws InterruptedException {
		Thread.sleep(1000);
		driver.close();
	}

	/*
	 * @BeforeTest public void initialize() throws IOException {
	 * 
	 * 
	 * }
	 */
	
	public void adminLogin() throws IOException, InterruptedException {
		String username = "admin55";
		String pass = "Admin@6155";
		AdminLoginPage(username, pass);
		
		threaddealy_driverclose();
	}
	
//------------------------addingUser test case-------------------------------------------//

	public void addingUser() throws IOException, InterruptedException {

		String username = "admin55";
		String pass = "Admin@6155";
		AdminLoginPage(username, pass);

		AddingUsers au = new AddingUsers(driver);
		au.userNavigate().click();
		au.adduser().click();
		au.username().sendKeys("admin5555");
		au.passwordClick().click();
		au.newPassword().sendKeys("Admin@6155ll");
		au.firstName().sendKeys("adi");
		au.lastNAme().sendKeys("anan");
		au.Email().sendKeys("user@xyz.com");
		ScrollPage scrl = new ScrollPage(driver);
		scrl.scroll(0, 2000);
		au.adminUpdate().click();
		log.info(" adding user successful");
		threaddealy_driverclose();
	}

//------------------------deleteUser test case------------------------------------------------//
	
	public void deleteUser() throws IOException, InterruptedException {

		String username = "admin55";
		String pass = "Admin@6155";
		AdminLoginPage(username, pass);
		DeleteUser dus = new DeleteUser(driver);
		dus.userNavigate().click();
		dus.BrowseListOfUsers().click();
		dus.searchBar().sendKeys("adi anan");
		dus.addFilter().click();
		dus.deleteUser().click();
		dus.confirmUser().click();
		log.info(" delete user successful");
		threaddealy_driverclose();

	}

//---------------------------------createCourse test case--------------------------------------------//	


	public void createCourse() throws IOException, InterruptedException {
		String username = "admin55";
		String pass = "Admin@6155";
		AdminLoginPage(username, pass);
		CreateCourse cc = new CreateCourse(driver);
		cc.course().click();
		cc.manageCourse().click();
		cc.create().click();
		cc.name().sendKeys("ad_quali");
		cc.subBtn().click();
		cc.find().click();
		cc.create1().click();
		cc.courseName().sendKeys("adfn");
		cc.shortName().sendKeys("adsn");
		cc.submit().click();
		log.info(" create course successful");
		threaddealy_driverclose();

	}

//----------------------------downloadReport test case------------------------------------------------//


	public void downloadReport() throws IOException, InterruptedException {
		driver = initializerDriver();
		driver.get("https://test.qualicoach.org/my/");
		String username = "admin55";
		String pass = "Admin@6155";
		AdminLoginPage alp = new AdminLoginPage(driver);
		alp.getEmail().sendKeys(username);
		alp.getPassword().sendKeys(pass);
		alp.getLogin().click();
		CreateReport cr = new CreateReport(driver);
		cr.manageReports().click();
		cr.Sel().click();
		// ScrollPage scrl = new ScrollPage(driver);
		// scrl.scroll(0,6000);
		cr.downloadReport().click();
		log.info(" download report successful");
		threaddealy_driverclose();

	}

	/*
	 * @AfterTest public void teardown() { drive
	 */
}
