package stepDefinitions;

import Base.BaseClassMaplogik;
import Pom_Maplogik.AddAssessment;
import Pom_Maplogik.ExcelRead;
import Pom_Maplogik.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;



public class MaplogikDefinitions{
	BaseClassMaplogik basemap=new BaseClassMaplogik();
	LoginPage login=new LoginPage();
	AddAssessment assessment=new AddAssessment();
	ExcelRead readexcel=new ExcelRead();
	

	@Given("Admin enters valid username and password and logged in")
	public void admin_enters_valid_username_and_password_and_logged_in() {
		basemap.depChrome();
		login.login();
		
	    
	}
	@Given("Click skill enhancements and go to All trainings to add new assessment")
	public void click_skill_enhancements_and_go_to_all_trainings_to_add_new_assessment() {
		assessment.addAssessment();
	   
	}
	@Then("Read questions from excel and save assessment")
	public void read_questions_from_excel_and_save_assessment() {
		readexcel.excelRead();
	    
	}




}
