package org.Testing.Payloads;

public class POJOSimpleBody {
	
	public static POJOBodyData GetBodyData() {
		
		POJOBodyData data = new POJOBodyData();
		data.setFirstName("Hardik");
		data.setLastName("Satani");
		data.setAge(25);
		data.setProfession("Software-Developer");
		data.setId(1);
		
		return data;
	}

}
