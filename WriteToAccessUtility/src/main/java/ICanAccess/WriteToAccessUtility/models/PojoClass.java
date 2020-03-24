package ICanAccess.WriteToAccessUtility.models;

public class PojoClass {

	String TestScenarioID;
	String Application_ID;
	String Page_ID;
	String Nav_UnloadEvent;
	
	public PojoClass(String testScenarioID, String application_ID, String page_ID, String nav_UnloadEvent) {
		TestScenarioID = testScenarioID;
		Application_ID = application_ID;
		Page_ID = page_ID;
		Nav_UnloadEvent = nav_UnloadEvent;
	}

	public String getTestScenarioID() {
		return TestScenarioID;
	}

	public void setTestScenarioID(String testScenarioID) {
		TestScenarioID = testScenarioID;
	}

	public String getApplication_ID() {
		return Application_ID;
	}

	public void setApplication_ID(String application_ID) {
		Application_ID = application_ID;
	}

	public String getPage_ID() {
		return Page_ID;
	}

	public void setPage_ID(String page_ID) {
		Page_ID = page_ID;
	}

	public String getNav_UnloadEvent() {
		return Nav_UnloadEvent;
	}

	public void setNav_UnloadEvent(String nav_UnloadEvent) {
		Nav_UnloadEvent = nav_UnloadEvent;
	}
	
	
	
}
