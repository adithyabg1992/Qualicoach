package Academy;

import java.io.IOException;

import org.testng.annotations.Test;

public class AdminUser {
	
	
	
	@Test
	
	public void AdminPage() throws IOException, InterruptedException{
		
		pageObjects.AdminPage ap = new pageObjects.AdminPage();
		
		ap.adminLogin();
		ap.addingUser();
		ap.deleteUser();
		ap.createCourse();
		ap.downloadReport();
		
	}

}
