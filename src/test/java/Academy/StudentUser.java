package Academy;

import java.io.IOException;

import org.testng.annotations.Test;

public class StudentUser {
	
@Test
	
	public void StudentPage() throws IOException, InterruptedException{
	
	studentPageObjects.StudentPage sp = new studentPageObjects.StudentPage();
	sp.validStudentuserlogin();
	sp.invalidLogin();
	sp.CourseEnroll();
	sp.StudentQuiz();
	sp.CourseCertificate();
	sp.badge_survey();
	sp.UserProfile();
	
}
}
